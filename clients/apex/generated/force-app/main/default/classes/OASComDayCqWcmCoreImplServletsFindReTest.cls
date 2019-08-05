@isTest
private class OASComDayCqWcmCoreImplServletsFindReTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties1 = OASComDayCqWcmCoreImplServletsFindRe.getExample();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties2 = comDayCqWcmCoreImplServletsFindReplaceServletProperties1;
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties3 = new OASComDayCqWcmCoreImplServletsFindRe();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties4 = comDayCqWcmCoreImplServletsFindReplaceServletProperties3;

        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties1.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties2));
        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties2.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties1));
        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties1.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties1));
        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties3.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties4));
        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties4.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties3));
        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties3.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties1 = OASComDayCqWcmCoreImplServletsFindRe.getExample();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties2 = OASComDayCqWcmCoreImplServletsFindRe.getExample();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties3 = new OASComDayCqWcmCoreImplServletsFindRe();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties4 = new OASComDayCqWcmCoreImplServletsFindRe();

        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties1.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties2));
        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties2.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties1));
        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties3.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties4));
        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties4.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties1 = OASComDayCqWcmCoreImplServletsFindRe.getExample();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties2 = new OASComDayCqWcmCoreImplServletsFindRe();

        System.assertEquals(false, comDayCqWcmCoreImplServletsFindReplaceServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplServletsFindReplaceServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties1 = OASComDayCqWcmCoreImplServletsFindRe.getExample();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties2 = new OASComDayCqWcmCoreImplServletsFindRe();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplServletsFindReplaceServletProperties1.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplServletsFindReplaceServletProperties2.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties1 = OASComDayCqWcmCoreImplServletsFindRe.getExample();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties2 = new OASComDayCqWcmCoreImplServletsFindRe();

        System.assertEquals(comDayCqWcmCoreImplServletsFindReplaceServletProperties1.hashCode(), comDayCqWcmCoreImplServletsFindReplaceServletProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplServletsFindReplaceServletProperties2.hashCode(), comDayCqWcmCoreImplServletsFindReplaceServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties1 = OASComDayCqWcmCoreImplServletsFindRe.getExample();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties2 = OASComDayCqWcmCoreImplServletsFindRe.getExample();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties3 = new OASComDayCqWcmCoreImplServletsFindRe();
        OASComDayCqWcmCoreImplServletsFindRe comDayCqWcmCoreImplServletsFindReplaceServletProperties4 = new OASComDayCqWcmCoreImplServletsFindRe();

        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties1.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties2));
        System.assert(comDayCqWcmCoreImplServletsFindReplaceServletProperties3.equals(comDayCqWcmCoreImplServletsFindReplaceServletProperties4));
        System.assertEquals(comDayCqWcmCoreImplServletsFindReplaceServletProperties1.hashCode(), comDayCqWcmCoreImplServletsFindReplaceServletProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplServletsFindReplaceServletProperties3.hashCode(), comDayCqWcmCoreImplServletsFindReplaceServletProperties4.hashCode());
    }
}
