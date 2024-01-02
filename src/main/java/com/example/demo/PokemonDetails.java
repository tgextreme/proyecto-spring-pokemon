package com.example.demo;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetails {
    private String name;
    private int id;
    private int baseExperience;
    private int height;
    private int weight;
    private List<PokemonType> types;
    private List<PokemonMove> moves;
    private List<PokemonAbility> abilities;
    private List<PokemonStat> stats;
   // private Map<String, String> sprites;
    private Sprites sprites;

    public void setSprites(Sprites sprites) {
		this.sprites = sprites;
	}

	// Constructor vacío
    public PokemonDetails() {
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }

    public List<PokemonMove> getMoves() {
        return moves;
    }

    public void setMoves(List<PokemonMove> moves) {
        this.moves = moves;
    }

    public List<PokemonAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    public List<PokemonStat> getStats() {
        return stats;
    }

    public void setStats(List<PokemonStat> stats) {
        this.stats = stats;
    }
/*
    public Map<String, String> getSprites() {
        return sprites;
    }

    public void setSprites(Map<String, String> sprites) {
        this.sprites = sprites;
    }*/

    // Clases internas
    public static class PokemonType {
        private String name;

        // Constructor, getters y setters
        public PokemonType() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class PokemonMove {
        private String name;

        // Constructor, getters y setters
        public PokemonMove() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class PokemonAbility {
        private String name;

        // Constructor, getters y setters
        public PokemonAbility() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class PokemonStat {
        private String name;
        private int baseStat;

        // Constructor, getters y setters
        public PokemonStat() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBaseStat() {
            return baseStat;
        }

        public void setBaseStat(int baseStat) {
            this.baseStat = baseStat;
        }
    }
    public static class Sprites {
        private String front_default;
        private String back_default;
        // otros campos según la API de Pokémon

        // Getters y setters
        public String getFront_default() {
            return front_default;
        }

        public void setFront_default(String front_default) {
            this.front_default = front_default;
        }
}
}


