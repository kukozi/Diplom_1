package org.praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {

    private final String name = "Ржаная со льном";
    private final float price = 0.021F;
    Bun bun = new Bun(name, price);
    @Test
    public void getNameTest(){
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void getPriceTest(){
        Assert.assertEquals(price, bun.getPrice(), 0);
    }
}