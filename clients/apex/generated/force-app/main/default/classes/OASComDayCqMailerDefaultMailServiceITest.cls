@isTest
private class OASComDayCqMailerDefaultMailServiceITest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo1 = OASComDayCqMailerDefaultMailServiceI.getExample();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo2 = comDayCqMailerDefaultMailServiceInfo1;
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo3 = new OASComDayCqMailerDefaultMailServiceI();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo4 = comDayCqMailerDefaultMailServiceInfo3;

        System.assert(comDayCqMailerDefaultMailServiceInfo1.equals(comDayCqMailerDefaultMailServiceInfo2));
        System.assert(comDayCqMailerDefaultMailServiceInfo2.equals(comDayCqMailerDefaultMailServiceInfo1));
        System.assert(comDayCqMailerDefaultMailServiceInfo1.equals(comDayCqMailerDefaultMailServiceInfo1));
        System.assert(comDayCqMailerDefaultMailServiceInfo3.equals(comDayCqMailerDefaultMailServiceInfo4));
        System.assert(comDayCqMailerDefaultMailServiceInfo4.equals(comDayCqMailerDefaultMailServiceInfo3));
        System.assert(comDayCqMailerDefaultMailServiceInfo3.equals(comDayCqMailerDefaultMailServiceInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo1 = OASComDayCqMailerDefaultMailServiceI.getExample();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo2 = OASComDayCqMailerDefaultMailServiceI.getExample();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo3 = new OASComDayCqMailerDefaultMailServiceI();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo4 = new OASComDayCqMailerDefaultMailServiceI();

        System.assert(comDayCqMailerDefaultMailServiceInfo1.equals(comDayCqMailerDefaultMailServiceInfo2));
        System.assert(comDayCqMailerDefaultMailServiceInfo2.equals(comDayCqMailerDefaultMailServiceInfo1));
        System.assert(comDayCqMailerDefaultMailServiceInfo3.equals(comDayCqMailerDefaultMailServiceInfo4));
        System.assert(comDayCqMailerDefaultMailServiceInfo4.equals(comDayCqMailerDefaultMailServiceInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo1 = OASComDayCqMailerDefaultMailServiceI.getExample();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo2 = new OASComDayCqMailerDefaultMailServiceI();

        System.assertEquals(false, comDayCqMailerDefaultMailServiceInfo1.equals('foo'));
        System.assertEquals(false, comDayCqMailerDefaultMailServiceInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo1 = OASComDayCqMailerDefaultMailServiceI.getExample();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo2 = new OASComDayCqMailerDefaultMailServiceI();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo3;

        System.assertEquals(false, comDayCqMailerDefaultMailServiceInfo1.equals(comDayCqMailerDefaultMailServiceInfo3));
        System.assertEquals(false, comDayCqMailerDefaultMailServiceInfo2.equals(comDayCqMailerDefaultMailServiceInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo1 = OASComDayCqMailerDefaultMailServiceI.getExample();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo2 = new OASComDayCqMailerDefaultMailServiceI();

        System.assertEquals(comDayCqMailerDefaultMailServiceInfo1.hashCode(), comDayCqMailerDefaultMailServiceInfo1.hashCode());
        System.assertEquals(comDayCqMailerDefaultMailServiceInfo2.hashCode(), comDayCqMailerDefaultMailServiceInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo1 = OASComDayCqMailerDefaultMailServiceI.getExample();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo2 = OASComDayCqMailerDefaultMailServiceI.getExample();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo3 = new OASComDayCqMailerDefaultMailServiceI();
        OASComDayCqMailerDefaultMailServiceI comDayCqMailerDefaultMailServiceInfo4 = new OASComDayCqMailerDefaultMailServiceI();

        System.assert(comDayCqMailerDefaultMailServiceInfo1.equals(comDayCqMailerDefaultMailServiceInfo2));
        System.assert(comDayCqMailerDefaultMailServiceInfo3.equals(comDayCqMailerDefaultMailServiceInfo4));
        System.assertEquals(comDayCqMailerDefaultMailServiceInfo1.hashCode(), comDayCqMailerDefaultMailServiceInfo2.hashCode());
        System.assertEquals(comDayCqMailerDefaultMailServiceInfo3.hashCode(), comDayCqMailerDefaultMailServiceInfo4.hashCode());
    }
}
