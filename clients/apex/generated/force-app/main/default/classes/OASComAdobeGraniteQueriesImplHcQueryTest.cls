@isTest
private class OASComAdobeGraniteQueriesImplHcQueryTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQuery.getExample();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2 = comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1;
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcQuery();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties4 = comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3;

        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties4));
        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties4.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3));
        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQuery.getExample();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2 = OASComAdobeGraniteQueriesImplHcQuery.getExample();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcQuery();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties4 = new OASComAdobeGraniteQueriesImplHcQuery();

        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1));
        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties4));
        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties4.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQuery.getExample();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcQuery();

        System.assertEquals(false, comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQuery.getExample();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcQuery();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQuery.getExample();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2 = new OASComAdobeGraniteQueriesImplHcQuery();

        System.assertEquals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1.hashCode(), comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2.hashCode(), comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1 = OASComAdobeGraniteQueriesImplHcQuery.getExample();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2 = OASComAdobeGraniteQueriesImplHcQuery.getExample();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3 = new OASComAdobeGraniteQueriesImplHcQuery();
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties4 = new OASComAdobeGraniteQueriesImplHcQuery();

        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2));
        System.assert(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3.equals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties1.hashCode(), comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties3.hashCode(), comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteQueriesImplHcQuery comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties = new OASComAdobeGraniteQueriesImplHcQuery();
        Map<String, String> propertyMappings = comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
