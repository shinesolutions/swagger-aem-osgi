@isTest
private class OASComAdobeGraniteBundlesHcImplCodeCTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCodeC.getExample();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2 = comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1;
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplCodeC();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties4 = comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3;

        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3));
        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCodeC.getExample();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplCodeC.getExample();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplCodeC();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplCodeC();

        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCodeC.getExample();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplCodeC();

        System.assertEquals(false, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCodeC.getExample();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplCodeC();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCodeC.getExample();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplCodeC();

        System.assertEquals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2.hashCode(), comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCodeC.getExample();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplCodeC.getExample();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplCodeC();
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplCodeC();

        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties3.hashCode(), comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteBundlesHcImplCodeC comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties = new OASComAdobeGraniteBundlesHcImplCodeC();
        Map<String, String> propertyMappings = comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('minimumCodeCacheSize', propertyMappings.get('minimum.code.cache.size'));
    }
}
