package com.mongodb;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringWriter;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by Allen on 1/10/17.
 */
public class HelloWorldFreemarkerStyle {
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.setClassForTemplateLoading(HelloWorldFreemarkerStyle.class,"/");
        try {
            Template helloTemplate=configuration.getTemplate("hello.ftl");
            StringWriter writer=new StringWriter();
            Map<String, Object> helloMap=new HashMap<String, Object>();
            helloMap.put("name", "Freemarker");
            helloTemplate.process(helloMap,writer);
            System.out.println(writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
