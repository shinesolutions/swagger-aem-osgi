@isTest
private class OASComDayCqDamCoreImplServletAssetDoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties1 = OASComDayCqDamCoreImplServletAssetDo.getExample();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties2 = comDayCqDamCoreImplServletAssetDownloadServletProperties1;
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties3 = new OASComDayCqDamCoreImplServletAssetDo();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties4 = comDayCqDamCoreImplServletAssetDownloadServletProperties3;

        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties1.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties2));
        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties2.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties1));
        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties1.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties1));
        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties3.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties4));
        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties4.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties3));
        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties3.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties1 = OASComDayCqDamCoreImplServletAssetDo.getExample();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties2 = OASComDayCqDamCoreImplServletAssetDo.getExample();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties3 = new OASComDayCqDamCoreImplServletAssetDo();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties4 = new OASComDayCqDamCoreImplServletAssetDo();

        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties1.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties2));
        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties2.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties1));
        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties3.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties4));
        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties4.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties1 = OASComDayCqDamCoreImplServletAssetDo.getExample();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties2 = new OASComDayCqDamCoreImplServletAssetDo();

        System.assertEquals(false, comDayCqDamCoreImplServletAssetDownloadServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletAssetDownloadServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties1 = OASComDayCqDamCoreImplServletAssetDo.getExample();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties2 = new OASComDayCqDamCoreImplServletAssetDo();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletAssetDownloadServletProperties1.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletAssetDownloadServletProperties2.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties1 = OASComDayCqDamCoreImplServletAssetDo.getExample();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties2 = new OASComDayCqDamCoreImplServletAssetDo();

        System.assertEquals(comDayCqDamCoreImplServletAssetDownloadServletProperties1.hashCode(), comDayCqDamCoreImplServletAssetDownloadServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletAssetDownloadServletProperties2.hashCode(), comDayCqDamCoreImplServletAssetDownloadServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties1 = OASComDayCqDamCoreImplServletAssetDo.getExample();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties2 = OASComDayCqDamCoreImplServletAssetDo.getExample();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties3 = new OASComDayCqDamCoreImplServletAssetDo();
        OASComDayCqDamCoreImplServletAssetDo comDayCqDamCoreImplServletAssetDownloadServletProperties4 = new OASComDayCqDamCoreImplServletAssetDo();

        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties1.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties2));
        System.assert(comDayCqDamCoreImplServletAssetDownloadServletProperties3.equals(comDayCqDamCoreImplServletAssetDownloadServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletAssetDownloadServletProperties1.hashCode(), comDayCqDamCoreImplServletAssetDownloadServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletAssetDownloadServletProperties3.hashCode(), comDayCqDamCoreImplServletAssetDownloadServletProperties4.hashCode());
    }
}
