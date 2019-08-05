@isTest
private class OASComAdobeGraniteHttpcacheImplOuterTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1 = OASComAdobeGraniteHttpcacheImplOuter.getExample();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2 = comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1;
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3 = new OASComAdobeGraniteHttpcacheImplOuter();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties4 = comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3;

        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2));
        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1));
        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1));
        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties4));
        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties4.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3));
        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1 = OASComAdobeGraniteHttpcacheImplOuter.getExample();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2 = OASComAdobeGraniteHttpcacheImplOuter.getExample();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3 = new OASComAdobeGraniteHttpcacheImplOuter();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties4 = new OASComAdobeGraniteHttpcacheImplOuter();

        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2));
        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1));
        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties4));
        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties4.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1 = OASComAdobeGraniteHttpcacheImplOuter.getExample();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2 = new OASComAdobeGraniteHttpcacheImplOuter();

        System.assertEquals(false, comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1 = OASComAdobeGraniteHttpcacheImplOuter.getExample();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2 = new OASComAdobeGraniteHttpcacheImplOuter();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3;

        System.assertEquals(false, comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3));
        System.assertEquals(false, comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1 = OASComAdobeGraniteHttpcacheImplOuter.getExample();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2 = new OASComAdobeGraniteHttpcacheImplOuter();

        System.assertEquals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1.hashCode(), comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1.hashCode());
        System.assertEquals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2.hashCode(), comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1 = OASComAdobeGraniteHttpcacheImplOuter.getExample();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2 = OASComAdobeGraniteHttpcacheImplOuter.getExample();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3 = new OASComAdobeGraniteHttpcacheImplOuter();
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties4 = new OASComAdobeGraniteHttpcacheImplOuter();

        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2));
        System.assert(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3.equals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties4));
        System.assertEquals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties1.hashCode(), comAdobeGraniteHttpcacheImplOuterCacheFilterProperties2.hashCode());
        System.assertEquals(comAdobeGraniteHttpcacheImplOuterCacheFilterProperties3.hashCode(), comAdobeGraniteHttpcacheImplOuterCacheFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteHttpcacheImplOuter comAdobeGraniteHttpcacheImplOuterCacheFilterProperties = new OASComAdobeGraniteHttpcacheImplOuter();
        Map<String, String> propertyMappings = comAdobeGraniteHttpcacheImplOuterCacheFilterProperties.getPropertyMappings();
        System.assertEquals('comAdobeGraniteHttpcacheUrlPaths', propertyMappings.get('com.adobe.granite.httpcache.url.paths'));
    }
}
