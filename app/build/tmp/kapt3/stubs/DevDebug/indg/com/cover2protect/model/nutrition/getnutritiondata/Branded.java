package indg.com.cover2protect.model.nutrition.getnutritiondata;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0001H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0001H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0001H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\fH\u00c6\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012\u00a8\u00063"}, d2 = {"Lindg/com/cover2protect/model/nutrition/getnutritiondata/Branded;", "", "brand_name", "", "brand_name_item_name", "brand_type", "food_name", "locale", "nf_calories", "nix_brand_id", "nix_item_id", "photo", "Lindg/com/cover2protect/model/nutrition/getnutritiondata/Photo;", "region", "serving_qty", "serving_unit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lindg/com/cover2protect/model/nutrition/getnutritiondata/Photo;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getBrand_name", "()Ljava/lang/String;", "getBrand_name_item_name", "getBrand_type", "()Ljava/lang/Object;", "getFood_name", "getLocale", "getNf_calories", "getNix_brand_id", "getNix_item_id", "getPhoto", "()Lindg/com/cover2protect/model/nutrition/getnutritiondata/Photo;", "getRegion", "getServing_qty", "getServing_unit", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_DevDebug"})
public final class Branded {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String brand_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String brand_name_item_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object brand_type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String food_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String locale = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object nf_calories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nix_brand_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nix_item_id = null;
    @org.jetbrains.annotations.NotNull()
    private final indg.com.cover2protect.model.nutrition.getnutritiondata.Photo photo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object region = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object serving_qty = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String serving_unit = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBrand_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBrand_name_item_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBrand_type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFood_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getNf_calories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNix_brand_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNix_item_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.model.nutrition.getnutritiondata.Photo getPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getServing_qty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServing_unit() {
        return null;
    }
    
    public Branded(@org.jetbrains.annotations.NotNull()
    java.lang.String brand_name, @org.jetbrains.annotations.NotNull()
    java.lang.String brand_name_item_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object brand_type, @org.jetbrains.annotations.NotNull()
    java.lang.String food_name, @org.jetbrains.annotations.NotNull()
    java.lang.String locale, @org.jetbrains.annotations.NotNull()
    java.lang.Object nf_calories, @org.jetbrains.annotations.NotNull()
    java.lang.String nix_brand_id, @org.jetbrains.annotations.NotNull()
    java.lang.String nix_item_id, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.model.nutrition.getnutritiondata.Photo photo, @org.jetbrains.annotations.NotNull()
    java.lang.Object region, @org.jetbrains.annotations.NotNull()
    java.lang.Object serving_qty, @org.jetbrains.annotations.NotNull()
    java.lang.String serving_unit) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.model.nutrition.getnutritiondata.Photo component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.model.nutrition.getnutritiondata.Branded copy(@org.jetbrains.annotations.NotNull()
    java.lang.String brand_name, @org.jetbrains.annotations.NotNull()
    java.lang.String brand_name_item_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object brand_type, @org.jetbrains.annotations.NotNull()
    java.lang.String food_name, @org.jetbrains.annotations.NotNull()
    java.lang.String locale, @org.jetbrains.annotations.NotNull()
    java.lang.Object nf_calories, @org.jetbrains.annotations.NotNull()
    java.lang.String nix_brand_id, @org.jetbrains.annotations.NotNull()
    java.lang.String nix_item_id, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.model.nutrition.getnutritiondata.Photo photo, @org.jetbrains.annotations.NotNull()
    java.lang.Object region, @org.jetbrains.annotations.NotNull()
    java.lang.Object serving_qty, @org.jetbrains.annotations.NotNull()
    java.lang.String serving_unit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}