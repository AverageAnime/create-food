package net.averageanime.createfood.item;

import net.fabricmc.fabric.impl.tag.convention.TagRegistration;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

@SuppressWarnings("unused")
public class ModTags {
    public static final TagKey<Item> BRIEF_COMFORT = TagRegistration.ITEM_TAG_REGISTRATION.registerCommon("brief_comfort");
    public static final TagKey<Item> SHORT_COMFORT = TagRegistration.ITEM_TAG_REGISTRATION.registerCommon("short_comfort");
    public static final TagKey<Item> MEDIUM_COMFORT = TagRegistration.ITEM_TAG_REGISTRATION.registerCommon("medium_comfort");
    public static final TagKey<Item> LONG_COMFORT = TagRegistration.ITEM_TAG_REGISTRATION.registerCommon("long_comfort");

    public static final TagKey<Item> BRIEF_NOURISHMENT = TagRegistration.ITEM_TAG_REGISTRATION.registerCommon("brief_nourishment");
    public static final TagKey<Item> SHORT_NOURISHMENT = TagRegistration.ITEM_TAG_REGISTRATION.registerCommon("short_nourishment");
    public static final TagKey<Item> MEDIUM_NOURISHMENT = TagRegistration.ITEM_TAG_REGISTRATION.registerCommon("medium_nourishment");
    public static final TagKey<Item> LONG_NOURISHMENT = TagRegistration.ITEM_TAG_REGISTRATION.registerCommon("long_nourishment");

}
