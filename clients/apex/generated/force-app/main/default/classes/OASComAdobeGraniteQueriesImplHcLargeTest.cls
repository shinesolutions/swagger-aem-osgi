@isTest
private class OASComAdobeGraniteQueriesImplHcLargeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcLarge.getExample();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2 = comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1;
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcLarge();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties4 = comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3;

        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties4));
        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties4.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3));
        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcLarge.getExample();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2 = OASComAdobeGraniteQueriesImplHcLarge.getExample();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcLarge();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties4 = new OASComAdobeGraniteQueriesImplHcLarge();

        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties4));
        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties4.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcLarge.getExample();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcLarge();

        System.assertEquals(false, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcLarge.getExample();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcLarge();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcLarge.getExample();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcLarge();

        System.assertEquals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1.hashCode(), comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2.hashCode(), comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcLarge.getExample();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2 = OASComAdobeGraniteQueriesImplHcLarge.getExample();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcLarge();
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties4 = new OASComAdobeGraniteQueriesImplHcLarge();

        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties1.hashCode(), comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties3.hashCode(), comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteQueriesImplHcLarge comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties = new OASComAdobeGraniteQueriesImplHcLarge();
        Map<String, String> propertyMappings = comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.getPropertyMappings();
        System.assertEquals('largeIndexCriticalThreshold', propertyMappings.get('large.index.critical.threshold'));
        System.assertEquals('largeIndexWarnThreshold', propertyMappings.get('large.index.warn.threshold'));
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
