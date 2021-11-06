package indg.com.cover2protect.model.nutrition;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bz\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010\'\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001a\u0010]\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001a\u0010`\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001a\u0010f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001a\u0010l\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001a\u0010o\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001a\u0010r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001a\u0010u\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR\u001a\u0010x\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\bR\u001a\u0010{\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0006\"\u0004\b}\u0010\b\u00a8\u0006~"}, d2 = {"Lindg/com/cover2protect/model/nutrition/Fields;", "Ljava/io/Serializable;", "()V", "allergen_contains_eggs", "", "getAllergen_contains_eggs", "()Ljava/lang/String;", "setAllergen_contains_eggs", "(Ljava/lang/String;)V", "allergen_contains_fish", "getAllergen_contains_fish", "setAllergen_contains_fish", "allergen_contains_gluten", "getAllergen_contains_gluten", "setAllergen_contains_gluten", "allergen_contains_milk", "getAllergen_contains_milk", "setAllergen_contains_milk", "allergen_contains_peanuts", "getAllergen_contains_peanuts", "setAllergen_contains_peanuts", "allergen_contains_shellfish", "getAllergen_contains_shellfish", "setAllergen_contains_shellfish", "allergen_contains_soybeans", "getAllergen_contains_soybeans", "setAllergen_contains_soybeans", "allergen_contains_tree_nuts", "getAllergen_contains_tree_nuts", "setAllergen_contains_tree_nuts", "allergen_contains_wheat", "getAllergen_contains_wheat", "setAllergen_contains_wheat", "brand_id", "getBrand_id", "setBrand_id", "brand_name", "getBrand_name", "setBrand_name", "item_description", "getItem_description", "setItem_description", "item_id", "getItem_id", "setItem_id", "item_name", "getItem_name", "setItem_name", "nf_calcium_dv", "getNf_calcium_dv", "setNf_calcium_dv", "nf_calories", "getNf_calories", "setNf_calories", "nf_calories_from_fat", "getNf_calories_from_fat", "setNf_calories_from_fat", "nf_cholesterol", "getNf_cholesterol", "setNf_cholesterol", "nf_dietary_fiber", "getNf_dietary_fiber", "setNf_dietary_fiber", "nf_ingredient_statement", "getNf_ingredient_statement", "setNf_ingredient_statement", "nf_iron_dv", "getNf_iron_dv", "setNf_iron_dv", "nf_monounsaturated_fat", "getNf_monounsaturated_fat", "setNf_monounsaturated_fat", "nf_polyunsaturated_fat", "getNf_polyunsaturated_fat", "setNf_polyunsaturated_fat", "nf_protein", "getNf_protein", "setNf_protein", "nf_refuse_pct", "getNf_refuse_pct", "setNf_refuse_pct", "nf_saturated_fat", "getNf_saturated_fat", "setNf_saturated_fat", "nf_serving_size_qty", "getNf_serving_size_qty", "setNf_serving_size_qty", "nf_serving_size_unit", "getNf_serving_size_unit", "setNf_serving_size_unit", "nf_serving_weight_grams", "getNf_serving_weight_grams", "setNf_serving_weight_grams", "nf_servings_per_container", "getNf_servings_per_container", "setNf_servings_per_container", "nf_sodium", "getNf_sodium", "setNf_sodium", "nf_sugars", "getNf_sugars", "setNf_sugars", "nf_total_carbohydrate", "getNf_total_carbohydrate", "setNf_total_carbohydrate", "nf_total_fat", "getNf_total_fat", "setNf_total_fat", "nf_trans_fatty_acid", "getNf_trans_fatty_acid", "setNf_trans_fatty_acid", "nf_vitamin_a_dv", "getNf_vitamin_a_dv", "setNf_vitamin_a_dv", "nf_vitamin_c_dv", "getNf_vitamin_c_dv", "setNf_vitamin_c_dv", "nf_water_grams", "getNf_water_grams", "setNf_water_grams", "old_api_id", "getOld_api_id", "setOld_api_id", "updated_at", "getUpdated_at", "setUpdated_at", "app_DevDebug"})
public final class Fields implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allergen_contains_eggs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allergen_contains_fish;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allergen_contains_gluten;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allergen_contains_milk;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allergen_contains_peanuts;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allergen_contains_shellfish;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allergen_contains_soybeans;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allergen_contains_tree_nuts;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String allergen_contains_wheat;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String brand_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String brand_name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String item_description;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String item_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String item_name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_calcium_dv;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_calories;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_calories_from_fat;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_cholesterol;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_dietary_fiber;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_ingredient_statement;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_iron_dv;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_monounsaturated_fat;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_polyunsaturated_fat;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_protein;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_refuse_pct;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_saturated_fat;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_serving_size_qty;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_serving_size_unit;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_serving_weight_grams;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_servings_per_container;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_sodium;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_sugars;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_total_carbohydrate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_total_fat;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_trans_fatty_acid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_vitamin_a_dv;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_vitamin_c_dv;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nf_water_grams;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String old_api_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String updated_at;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllergen_contains_eggs() {
        return null;
    }
    
    public final void setAllergen_contains_eggs(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllergen_contains_fish() {
        return null;
    }
    
    public final void setAllergen_contains_fish(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllergen_contains_gluten() {
        return null;
    }
    
    public final void setAllergen_contains_gluten(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllergen_contains_milk() {
        return null;
    }
    
    public final void setAllergen_contains_milk(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllergen_contains_peanuts() {
        return null;
    }
    
    public final void setAllergen_contains_peanuts(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllergen_contains_shellfish() {
        return null;
    }
    
    public final void setAllergen_contains_shellfish(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllergen_contains_soybeans() {
        return null;
    }
    
    public final void setAllergen_contains_soybeans(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllergen_contains_tree_nuts() {
        return null;
    }
    
    public final void setAllergen_contains_tree_nuts(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllergen_contains_wheat() {
        return null;
    }
    
    public final void setAllergen_contains_wheat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBrand_id() {
        return null;
    }
    
    public final void setBrand_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBrand_name() {
        return null;
    }
    
    public final void setBrand_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItem_description() {
        return null;
    }
    
    public final void setItem_description(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItem_id() {
        return null;
    }
    
    public final void setItem_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItem_name() {
        return null;
    }
    
    public final void setItem_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_calcium_dv() {
        return null;
    }
    
    public final void setNf_calcium_dv(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_calories() {
        return null;
    }
    
    public final void setNf_calories(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_calories_from_fat() {
        return null;
    }
    
    public final void setNf_calories_from_fat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_cholesterol() {
        return null;
    }
    
    public final void setNf_cholesterol(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_dietary_fiber() {
        return null;
    }
    
    public final void setNf_dietary_fiber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_ingredient_statement() {
        return null;
    }
    
    public final void setNf_ingredient_statement(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_iron_dv() {
        return null;
    }
    
    public final void setNf_iron_dv(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_monounsaturated_fat() {
        return null;
    }
    
    public final void setNf_monounsaturated_fat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_polyunsaturated_fat() {
        return null;
    }
    
    public final void setNf_polyunsaturated_fat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_protein() {
        return null;
    }
    
    public final void setNf_protein(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_refuse_pct() {
        return null;
    }
    
    public final void setNf_refuse_pct(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_saturated_fat() {
        return null;
    }
    
    public final void setNf_saturated_fat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_serving_size_qty() {
        return null;
    }
    
    public final void setNf_serving_size_qty(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_serving_size_unit() {
        return null;
    }
    
    public final void setNf_serving_size_unit(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_serving_weight_grams() {
        return null;
    }
    
    public final void setNf_serving_weight_grams(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_servings_per_container() {
        return null;
    }
    
    public final void setNf_servings_per_container(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_sodium() {
        return null;
    }
    
    public final void setNf_sodium(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_sugars() {
        return null;
    }
    
    public final void setNf_sugars(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_total_carbohydrate() {
        return null;
    }
    
    public final void setNf_total_carbohydrate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_total_fat() {
        return null;
    }
    
    public final void setNf_total_fat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_trans_fatty_acid() {
        return null;
    }
    
    public final void setNf_trans_fatty_acid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_vitamin_a_dv() {
        return null;
    }
    
    public final void setNf_vitamin_a_dv(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_vitamin_c_dv() {
        return null;
    }
    
    public final void setNf_vitamin_c_dv(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNf_water_grams() {
        return null;
    }
    
    public final void setNf_water_grams(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOld_api_id() {
        return null;
    }
    
    public final void setOld_api_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    public final void setUpdated_at(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Fields() {
        super();
    }
}