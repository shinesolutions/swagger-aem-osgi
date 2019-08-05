@isTest
private class OASComDayCqReportingImplCacheCacheImTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties1 = OASComDayCqReportingImplCacheCacheIm.getExample();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties2 = comDayCqReportingImplCacheCacheImplProperties1;
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties3 = new OASComDayCqReportingImplCacheCacheIm();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties4 = comDayCqReportingImplCacheCacheImplProperties3;

        System.assert(comDayCqReportingImplCacheCacheImplProperties1.equals(comDayCqReportingImplCacheCacheImplProperties2));
        System.assert(comDayCqReportingImplCacheCacheImplProperties2.equals(comDayCqReportingImplCacheCacheImplProperties1));
        System.assert(comDayCqReportingImplCacheCacheImplProperties1.equals(comDayCqReportingImplCacheCacheImplProperties1));
        System.assert(comDayCqReportingImplCacheCacheImplProperties3.equals(comDayCqReportingImplCacheCacheImplProperties4));
        System.assert(comDayCqReportingImplCacheCacheImplProperties4.equals(comDayCqReportingImplCacheCacheImplProperties3));
        System.assert(comDayCqReportingImplCacheCacheImplProperties3.equals(comDayCqReportingImplCacheCacheImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties1 = OASComDayCqReportingImplCacheCacheIm.getExample();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties2 = OASComDayCqReportingImplCacheCacheIm.getExample();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties3 = new OASComDayCqReportingImplCacheCacheIm();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties4 = new OASComDayCqReportingImplCacheCacheIm();

        System.assert(comDayCqReportingImplCacheCacheImplProperties1.equals(comDayCqReportingImplCacheCacheImplProperties2));
        System.assert(comDayCqReportingImplCacheCacheImplProperties2.equals(comDayCqReportingImplCacheCacheImplProperties1));
        System.assert(comDayCqReportingImplCacheCacheImplProperties3.equals(comDayCqReportingImplCacheCacheImplProperties4));
        System.assert(comDayCqReportingImplCacheCacheImplProperties4.equals(comDayCqReportingImplCacheCacheImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties1 = OASComDayCqReportingImplCacheCacheIm.getExample();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties2 = new OASComDayCqReportingImplCacheCacheIm();

        System.assertEquals(false, comDayCqReportingImplCacheCacheImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReportingImplCacheCacheImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties1 = OASComDayCqReportingImplCacheCacheIm.getExample();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties2 = new OASComDayCqReportingImplCacheCacheIm();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties3;

        System.assertEquals(false, comDayCqReportingImplCacheCacheImplProperties1.equals(comDayCqReportingImplCacheCacheImplProperties3));
        System.assertEquals(false, comDayCqReportingImplCacheCacheImplProperties2.equals(comDayCqReportingImplCacheCacheImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties1 = OASComDayCqReportingImplCacheCacheIm.getExample();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties2 = new OASComDayCqReportingImplCacheCacheIm();

        System.assertEquals(comDayCqReportingImplCacheCacheImplProperties1.hashCode(), comDayCqReportingImplCacheCacheImplProperties1.hashCode());
        System.assertEquals(comDayCqReportingImplCacheCacheImplProperties2.hashCode(), comDayCqReportingImplCacheCacheImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties1 = OASComDayCqReportingImplCacheCacheIm.getExample();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties2 = OASComDayCqReportingImplCacheCacheIm.getExample();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties3 = new OASComDayCqReportingImplCacheCacheIm();
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties4 = new OASComDayCqReportingImplCacheCacheIm();

        System.assert(comDayCqReportingImplCacheCacheImplProperties1.equals(comDayCqReportingImplCacheCacheImplProperties2));
        System.assert(comDayCqReportingImplCacheCacheImplProperties3.equals(comDayCqReportingImplCacheCacheImplProperties4));
        System.assertEquals(comDayCqReportingImplCacheCacheImplProperties1.hashCode(), comDayCqReportingImplCacheCacheImplProperties2.hashCode());
        System.assertEquals(comDayCqReportingImplCacheCacheImplProperties3.hashCode(), comDayCqReportingImplCacheCacheImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReportingImplCacheCacheIm comDayCqReportingImplCacheCacheImplProperties = new OASComDayCqReportingImplCacheCacheIm();
        Map<String, String> propertyMappings = comDayCqReportingImplCacheCacheImplProperties.getPropertyMappings();
        System.assertEquals('repcacheEnable', propertyMappings.get('repcache.enable'));
        System.assertEquals('repcacheTtl', propertyMappings.get('repcache.ttl'));
        System.assertEquals('repcacheMax', propertyMappings.get('repcache.max'));
    }
}
