package me.partlysunny.items;

import me.partlysunny.items.cores.EnchantCoreTOne;

public enum CustomItem {

    CORE_T1("core_t1", EnchantCoreTOne.class)
    ;

    private final String id;
    private final Class<? extends CustomItemBuilder> builder;

    CustomItem(String id, Class<? extends CustomItemBuilder> builder) {
        this.id = id;
        this.builder = builder;
    }

    public String id() {
        return id;
    }

    public Class<? extends CustomItemBuilder> builder() {
        return builder;
    }
}
