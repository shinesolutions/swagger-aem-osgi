@isTest
private class OASComDayCqDamCommonsUtilImplAssetCaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties1 = OASComDayCqDamCommonsUtilImplAssetCa.getExample();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties2 = comDayCqDamCommonsUtilImplAssetCacheImplProperties1;
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties3 = new OASComDayCqDamCommonsUtilImplAssetCa();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties4 = comDayCqDamCommonsUtilImplAssetCacheImplProperties3;

        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties1.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties2));
        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties2.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties1));
        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties1.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties1));
        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties3.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties4));
        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties4.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties3));
        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties3.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties1 = OASComDayCqDamCommonsUtilImplAssetCa.getExample();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties2 = OASComDayCqDamCommonsUtilImplAssetCa.getExample();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties3 = new OASComDayCqDamCommonsUtilImplAssetCa();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties4 = new OASComDayCqDamCommonsUtilImplAssetCa();

        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties1.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties2));
        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties2.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties1));
        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties3.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties4));
        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties4.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties1 = OASComDayCqDamCommonsUtilImplAssetCa.getExample();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties2 = new OASComDayCqDamCommonsUtilImplAssetCa();

        System.assertEquals(false, comDayCqDamCommonsUtilImplAssetCacheImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCommonsUtilImplAssetCacheImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties1 = OASComDayCqDamCommonsUtilImplAssetCa.getExample();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties2 = new OASComDayCqDamCommonsUtilImplAssetCa();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties3;

        System.assertEquals(false, comDayCqDamCommonsUtilImplAssetCacheImplProperties1.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties3));
        System.assertEquals(false, comDayCqDamCommonsUtilImplAssetCacheImplProperties2.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties1 = OASComDayCqDamCommonsUtilImplAssetCa.getExample();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties2 = new OASComDayCqDamCommonsUtilImplAssetCa();

        System.assertEquals(comDayCqDamCommonsUtilImplAssetCacheImplProperties1.hashCode(), comDayCqDamCommonsUtilImplAssetCacheImplProperties1.hashCode());
        System.assertEquals(comDayCqDamCommonsUtilImplAssetCacheImplProperties2.hashCode(), comDayCqDamCommonsUtilImplAssetCacheImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties1 = OASComDayCqDamCommonsUtilImplAssetCa.getExample();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties2 = OASComDayCqDamCommonsUtilImplAssetCa.getExample();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties3 = new OASComDayCqDamCommonsUtilImplAssetCa();
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties4 = new OASComDayCqDamCommonsUtilImplAssetCa();

        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties1.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties2));
        System.assert(comDayCqDamCommonsUtilImplAssetCacheImplProperties3.equals(comDayCqDamCommonsUtilImplAssetCacheImplProperties4));
        System.assertEquals(comDayCqDamCommonsUtilImplAssetCacheImplProperties1.hashCode(), comDayCqDamCommonsUtilImplAssetCacheImplProperties2.hashCode());
        System.assertEquals(comDayCqDamCommonsUtilImplAssetCacheImplProperties3.hashCode(), comDayCqDamCommonsUtilImplAssetCacheImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCommonsUtilImplAssetCa comDayCqDamCommonsUtilImplAssetCacheImplProperties = new OASComDayCqDamCommonsUtilImplAssetCa();
        Map<String, String> propertyMappings = comDayCqDamCommonsUtilImplAssetCacheImplProperties.getPropertyMappings();
        System.assertEquals('largeFileMin', propertyMappings.get('large.file.min'));
        System.assertEquals('cacheApply', propertyMappings.get('cache.apply'));
        System.assertEquals('mimeTypes', propertyMappings.get('mime.types'));
    }
}
