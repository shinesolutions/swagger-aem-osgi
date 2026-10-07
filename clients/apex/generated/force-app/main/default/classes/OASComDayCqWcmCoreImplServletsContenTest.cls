@isTest
private class OASComDayCqWcmCoreImplServletsContenTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1 = OASComDayCqWcmCoreImplServletsConten.getExample();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2 = comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1;
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3 = new OASComDayCqWcmCoreImplServletsConten();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties4 = comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3;

        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2));
        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1));
        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1));
        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties4));
        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties4.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3));
        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1 = OASComDayCqWcmCoreImplServletsConten.getExample();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2 = OASComDayCqWcmCoreImplServletsConten.getExample();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3 = new OASComDayCqWcmCoreImplServletsConten();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties4 = new OASComDayCqWcmCoreImplServletsConten();

        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2));
        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1));
        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties4));
        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties4.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1 = OASComDayCqWcmCoreImplServletsConten.getExample();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2 = new OASComDayCqWcmCoreImplServletsConten();

        System.assertEquals(false, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1 = OASComDayCqWcmCoreImplServletsConten.getExample();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2 = new OASComDayCqWcmCoreImplServletsConten();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1 = OASComDayCqWcmCoreImplServletsConten.getExample();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2 = new OASComDayCqWcmCoreImplServletsConten();

        System.assertEquals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1.hashCode(), comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2.hashCode(), comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1 = OASComDayCqWcmCoreImplServletsConten.getExample();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2 = OASComDayCqWcmCoreImplServletsConten.getExample();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3 = new OASComDayCqWcmCoreImplServletsConten();
        OASComDayCqWcmCoreImplServletsConten comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties4 = new OASComDayCqWcmCoreImplServletsConten();

        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2));
        System.assert(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3.equals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties4));
        System.assertEquals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties1.hashCode(), comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties3.hashCode(), comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties4.hashCode());
    }
}
