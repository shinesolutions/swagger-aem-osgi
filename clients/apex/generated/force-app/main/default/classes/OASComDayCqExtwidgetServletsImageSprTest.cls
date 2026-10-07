@isTest
private class OASComDayCqExtwidgetServletsImageSprTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties1 = OASComDayCqExtwidgetServletsImageSpr.getExample();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties2 = comDayCqExtwidgetServletsImageSpriteServletProperties1;
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties3 = new OASComDayCqExtwidgetServletsImageSpr();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties4 = comDayCqExtwidgetServletsImageSpriteServletProperties3;

        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties1.equals(comDayCqExtwidgetServletsImageSpriteServletProperties2));
        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties2.equals(comDayCqExtwidgetServletsImageSpriteServletProperties1));
        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties1.equals(comDayCqExtwidgetServletsImageSpriteServletProperties1));
        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties3.equals(comDayCqExtwidgetServletsImageSpriteServletProperties4));
        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties4.equals(comDayCqExtwidgetServletsImageSpriteServletProperties3));
        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties3.equals(comDayCqExtwidgetServletsImageSpriteServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties1 = OASComDayCqExtwidgetServletsImageSpr.getExample();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties2 = OASComDayCqExtwidgetServletsImageSpr.getExample();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties3 = new OASComDayCqExtwidgetServletsImageSpr();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties4 = new OASComDayCqExtwidgetServletsImageSpr();

        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties1.equals(comDayCqExtwidgetServletsImageSpriteServletProperties2));
        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties2.equals(comDayCqExtwidgetServletsImageSpriteServletProperties1));
        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties3.equals(comDayCqExtwidgetServletsImageSpriteServletProperties4));
        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties4.equals(comDayCqExtwidgetServletsImageSpriteServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties1 = OASComDayCqExtwidgetServletsImageSpr.getExample();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties2 = new OASComDayCqExtwidgetServletsImageSpr();

        System.assertEquals(false, comDayCqExtwidgetServletsImageSpriteServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqExtwidgetServletsImageSpriteServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties1 = OASComDayCqExtwidgetServletsImageSpr.getExample();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties2 = new OASComDayCqExtwidgetServletsImageSpr();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties3;

        System.assertEquals(false, comDayCqExtwidgetServletsImageSpriteServletProperties1.equals(comDayCqExtwidgetServletsImageSpriteServletProperties3));
        System.assertEquals(false, comDayCqExtwidgetServletsImageSpriteServletProperties2.equals(comDayCqExtwidgetServletsImageSpriteServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties1 = OASComDayCqExtwidgetServletsImageSpr.getExample();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties2 = new OASComDayCqExtwidgetServletsImageSpr();

        System.assertEquals(comDayCqExtwidgetServletsImageSpriteServletProperties1.hashCode(), comDayCqExtwidgetServletsImageSpriteServletProperties1.hashCode());
        System.assertEquals(comDayCqExtwidgetServletsImageSpriteServletProperties2.hashCode(), comDayCqExtwidgetServletsImageSpriteServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties1 = OASComDayCqExtwidgetServletsImageSpr.getExample();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties2 = OASComDayCqExtwidgetServletsImageSpr.getExample();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties3 = new OASComDayCqExtwidgetServletsImageSpr();
        OASComDayCqExtwidgetServletsImageSpr comDayCqExtwidgetServletsImageSpriteServletProperties4 = new OASComDayCqExtwidgetServletsImageSpr();

        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties1.equals(comDayCqExtwidgetServletsImageSpriteServletProperties2));
        System.assert(comDayCqExtwidgetServletsImageSpriteServletProperties3.equals(comDayCqExtwidgetServletsImageSpriteServletProperties4));
        System.assertEquals(comDayCqExtwidgetServletsImageSpriteServletProperties1.hashCode(), comDayCqExtwidgetServletsImageSpriteServletProperties2.hashCode());
        System.assertEquals(comDayCqExtwidgetServletsImageSpriteServletProperties3.hashCode(), comDayCqExtwidgetServletsImageSpriteServletProperties4.hashCode());
    }
}
