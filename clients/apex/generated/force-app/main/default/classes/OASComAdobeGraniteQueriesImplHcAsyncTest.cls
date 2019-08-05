@isTest
private class OASComAdobeGraniteQueriesImplHcAsyncTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcAsync.getExample();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2 = comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1;
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcAsync();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties4 = comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3;

        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties4));
        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties4.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3));
        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcAsync.getExample();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2 = OASComAdobeGraniteQueriesImplHcAsync.getExample();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcAsync();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties4 = new OASComAdobeGraniteQueriesImplHcAsync();

        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties4));
        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties4.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcAsync.getExample();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcAsync();

        System.assertEquals(false, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcAsync.getExample();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcAsync();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcAsync.getExample();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcAsync();

        System.assertEquals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1.hashCode(), comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2.hashCode(), comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcAsync.getExample();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2 = OASComAdobeGraniteQueriesImplHcAsync.getExample();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcAsync();
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties4 = new OASComAdobeGraniteQueriesImplHcAsync();

        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties1.hashCode(), comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties3.hashCode(), comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteQueriesImplHcAsync comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties = new OASComAdobeGraniteQueriesImplHcAsync();
        Map<String, String> propertyMappings = comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.getPropertyMappings();
        System.assertEquals('indexingCriticalThreshold', propertyMappings.get('indexing.critical.threshold'));
        System.assertEquals('indexingWarnThreshold', propertyMappings.get('indexing.warn.threshold'));
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
