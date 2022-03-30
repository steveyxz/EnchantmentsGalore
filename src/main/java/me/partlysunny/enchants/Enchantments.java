package me.partlysunny.enchants;

import me.partlysunny.enchants.movement.Speedy;

public enum Enchantments {

    SPEEDY("speedy", Speedy.class)
    ;

    private final String id;
    private final Class<? extends Enchant> clazz;

    Enchantments(String id, Class<? extends Enchant> clazz) {
        this.id = id;
        this.clazz = clazz;
    }

    public String id() {
        return id;
    }

    public Class<? extends Enchant> clazz() {
        return clazz;
    }
}
