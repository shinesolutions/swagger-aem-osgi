@isTest
private class OASComDayCqWcmCoreImplServletsThumbnTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties1 = OASComDayCqWcmCoreImplServletsThumbn.getExample();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties2 = comDayCqWcmCoreImplServletsThumbnailServletProperties1;
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties3 = new OASComDayCqWcmCoreImplServletsThumbn();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties4 = comDayCqWcmCoreImplServletsThumbnailServletProperties3;

        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties1.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties2));
        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties2.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties1));
        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties1.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties1));
        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties3.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties4));
        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties4.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties3));
        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties3.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties1 = OASComDayCqWcmCoreImplServletsThumbn.getExample();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties2 = OASComDayCqWcmCoreImplServletsThumbn.getExample();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties3 = new OASComDayCqWcmCoreImplServletsThumbn();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties4 = new OASComDayCqWcmCoreImplServletsThumbn();

        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties1.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties2));
        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties2.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties1));
        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties3.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties4));
        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties4.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties1 = OASComDayCqWcmCoreImplServletsThumbn.getExample();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties2 = new OASComDayCqWcmCoreImplServletsThumbn();

        System.assertEquals(false, comDayCqWcmCoreImplServletsThumbnailServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplServletsThumbnailServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties1 = OASComDayCqWcmCoreImplServletsThumbn.getExample();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties2 = new OASComDayCqWcmCoreImplServletsThumbn();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplServletsThumbnailServletProperties1.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplServletsThumbnailServletProperties2.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties1 = OASComDayCqWcmCoreImplServletsThumbn.getExample();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties2 = new OASComDayCqWcmCoreImplServletsThumbn();

        System.assertEquals(comDayCqWcmCoreImplServletsThumbnailServletProperties1.hashCode(), comDayCqWcmCoreImplServletsThumbnailServletProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplServletsThumbnailServletProperties2.hashCode(), comDayCqWcmCoreImplServletsThumbnailServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties1 = OASComDayCqWcmCoreImplServletsThumbn.getExample();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties2 = OASComDayCqWcmCoreImplServletsThumbn.getExample();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties3 = new OASComDayCqWcmCoreImplServletsThumbn();
        OASComDayCqWcmCoreImplServletsThumbn comDayCqWcmCoreImplServletsThumbnailServletProperties4 = new OASComDayCqWcmCoreImplServletsThumbn();

        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties1.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties2));
        System.assert(comDayCqWcmCoreImplServletsThumbnailServletProperties3.equals(comDayCqWcmCoreImplServletsThumbnailServletProperties4));
        System.assertEquals(comDayCqWcmCoreImplServletsThumbnailServletProperties1.hashCode(), comDayCqWcmCoreImplServletsThumbnailServletProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplServletsThumbnailServletProperties3.hashCode(), comDayCqWcmCoreImplServletsThumbnailServletProperties4.hashCode());
    }
}
