package com.hello;

import com.season.config.Constants;
import com.season.core.ActionKey;
import com.season.core.Controller;
import com.season.core.ControllerKey;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/2 0002.
 */
@ControllerKey("hello")
public class HelloController extends Controller{
public  void  seasion(){
    renderText("hello world!");
}

    @ActionKey("test2")
    public void test() {
        renderText("此方法是一个action");
    }
    public void show(){
        ArrayList<String> list=new ArrayList<String>();
        for (int i=0;i<10;i++){
           list.add(i,"1"+i);
        }
        renderJson(list);
        System.out.print(getPara());
    }
    public void configConstant(Constants me){
        me.setBaseViewPath("sss");
    }

     public void ht() {
         render("a.html");
     }
}
