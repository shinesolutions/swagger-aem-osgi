@isTest
private class OASComDayCqDamCoreImplCacheCQBuffereTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1 = OASComDayCqDamCoreImplCacheCQBuffere.getExample();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2 = comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1;
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3 = new OASComDayCqDamCoreImplCacheCQBuffere();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties4 = comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3;

        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2));
        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1));
        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1));
        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties4));
        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties4.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3));
        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1 = OASComDayCqDamCoreImplCacheCQBuffere.getExample();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2 = OASComDayCqDamCoreImplCacheCQBuffere.getExample();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3 = new OASComDayCqDamCoreImplCacheCQBuffere();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties4 = new OASComDayCqDamCoreImplCacheCQBuffere();

        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2));
        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1));
        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties4));
        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties4.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1 = OASComDayCqDamCoreImplCacheCQBuffere.getExample();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2 = new OASComDayCqDamCoreImplCacheCQBuffere();

        System.assertEquals(false, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1 = OASComDayCqDamCoreImplCacheCQBuffere.getExample();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2 = new OASComDayCqDamCoreImplCacheCQBuffere();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3;

        System.assertEquals(false, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3));
        System.assertEquals(false, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1 = OASComDayCqDamCoreImplCacheCQBuffere.getExample();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2 = new OASComDayCqDamCoreImplCacheCQBuffere();

        System.assertEquals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1.hashCode(), comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2.hashCode(), comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1 = OASComDayCqDamCoreImplCacheCQBuffere.getExample();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2 = OASComDayCqDamCoreImplCacheCQBuffere.getExample();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3 = new OASComDayCqDamCoreImplCacheCQBuffere();
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties4 = new OASComDayCqDamCoreImplCacheCQBuffere();

        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2));
        System.assert(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3.equals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties4));
        System.assertEquals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties1.hashCode(), comDayCqDamCoreImplCacheCQBufferedImageCacheProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplCacheCQBufferedImageCacheProperties3.hashCode(), comDayCqDamCoreImplCacheCQBufferedImageCacheProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplCacheCQBuffere comDayCqDamCoreImplCacheCQBufferedImageCacheProperties = new OASComDayCqDamCoreImplCacheCQBuffere();
        Map<String, String> propertyMappings = comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.getPropertyMappings();
        System.assertEquals('cqDamImageCacheMaxMemory', propertyMappings.get('cq.dam.image.cache.max.memory'));
        System.assertEquals('cqDamImageCacheMaxAge', propertyMappings.get('cq.dam.image.cache.max.age'));
        System.assertEquals('cqDamImageCacheMaxDimension', propertyMappings.get('cq.dam.image.cache.max.dimension'));
    }
}
