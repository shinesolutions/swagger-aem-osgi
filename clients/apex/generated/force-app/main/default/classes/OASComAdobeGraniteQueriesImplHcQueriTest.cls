@isTest
private class OASComAdobeGraniteQueriesImplHcQueriTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQueri.getExample();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2 = comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1;
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcQueri();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties4 = comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3;

        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties4));
        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties4.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3));
        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQueri.getExample();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2 = OASComAdobeGraniteQueriesImplHcQueri.getExample();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcQueri();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties4 = new OASComAdobeGraniteQueriesImplHcQueri();

        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties4));
        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties4.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQueri.getExample();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcQueri();

        System.assertEquals(false, comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQueri.getExample();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcQueri();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQueri.getExample();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcQueri();

        System.assertEquals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1.hashCode(), comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2.hashCode(), comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQueri.getExample();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2 = OASComAdobeGraniteQueriesImplHcQueri.getExample();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcQueri();
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties4 = new OASComAdobeGraniteQueriesImplHcQueri();

        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties1.hashCode(), comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties3.hashCode(), comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteQueriesImplHcQueri comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties = new OASComAdobeGraniteQueriesImplHcQueri();
        Map<String, String> propertyMappings = comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
