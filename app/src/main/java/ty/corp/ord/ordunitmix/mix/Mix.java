package ty.corp.ord.ordunitmix.mix;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.TabHost;

import ty.corp.ord.ordunitmix.R;

public class Mix extends TabActivity{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mix);

        Resources  res = this.getResources() ;
        TabHost  tabhost  = this.getTabHost() ;
        TabHost.TabSpec  spec ;
        Intent  intent  = null ;

        intent  = new  Intent( ).setClass(this, Hidden.class) ;
        spec=tabhost.newTabSpec("Hidden").setIndicator("히든").setContent(intent) ;
        tabhost.addTab(spec) ;

        intent  = new  Intent( ).setClass(this, Transcendence.class) ;
        spec=tabhost.newTabSpec("Transcendence").setIndicator("초월").setContent(intent) ;
        tabhost.addTab(spec) ;

        intent  = new  Intent( ).setClass(this, Immortal.class) ;
        spec=tabhost.newTabSpec("Immortal").setIndicator("불멸").setContent(intent) ;
        tabhost.addTab(spec) ;

        intent  = new  Intent( ).setClass(this, Eternity.class) ;
        spec=tabhost.newTabSpec("Eternity").setIndicator("영원").setContent(intent) ;
        tabhost.addTab(spec) ;

        intent  = new  Intent( ).setClass(this, Limit.class) ;
        spec=tabhost.newTabSpec("Limit").setIndicator("제한").setContent(intent) ;
        tabhost.addTab(spec) ;

        tabhost.setCurrentTab(0) ;
    }
// , res.getDrawable(R.drawable.tip) , res.getDrawable(R.drawable.info)
}

