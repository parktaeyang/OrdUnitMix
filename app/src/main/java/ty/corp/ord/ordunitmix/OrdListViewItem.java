package ty.corp.ord.ordunitmix;

import android.graphics.drawable.Drawable;

public class OrdListViewItem {
    private Drawable iconDrawable ;
    private Drawable iconButtonDrawable ;
    private String titleStr ;
    private String descStr ;

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setIconButtonDrawable(Drawable iconButton) {iconButtonDrawable = iconButton ; }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setDesc(String desc) {
        descStr = desc ;
    }

    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public Drawable getIconButtonDrawable() { return  this.iconButtonDrawable ; }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() {
        return this.descStr ;
    }
}
