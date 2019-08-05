@isTest
private class OASComAdobeGraniteRequestsLoggingImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1 = OASComAdobeGraniteRequestsLoggingImp.getExample();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2 = comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1;
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3 = new OASComAdobeGraniteRequestsLoggingImp();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties4 = comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3;

        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2));
        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1));
        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1));
        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties4));
        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties4.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3));
        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1 = OASComAdobeGraniteRequestsLoggingImp.getExample();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2 = OASComAdobeGraniteRequestsLoggingImp.getExample();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3 = new OASComAdobeGraniteRequestsLoggingImp();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties4 = new OASComAdobeGraniteRequestsLoggingImp();

        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2));
        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1));
        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties4));
        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties4.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1 = OASComAdobeGraniteRequestsLoggingImp.getExample();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2 = new OASComAdobeGraniteRequestsLoggingImp();

        System.assertEquals(false, comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1 = OASComAdobeGraniteRequestsLoggingImp.getExample();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2 = new OASComAdobeGraniteRequestsLoggingImp();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3;

        System.assertEquals(false, comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3));
        System.assertEquals(false, comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1 = OASComAdobeGraniteRequestsLoggingImp.getExample();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2 = new OASComAdobeGraniteRequestsLoggingImp();

        System.assertEquals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1.hashCode(), comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2.hashCode(), comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1 = OASComAdobeGraniteRequestsLoggingImp.getExample();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2 = OASComAdobeGraniteRequestsLoggingImp.getExample();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3 = new OASComAdobeGraniteRequestsLoggingImp();
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties4 = new OASComAdobeGraniteRequestsLoggingImp();

        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2));
        System.assert(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3.equals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties4));
        System.assertEquals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties1.hashCode(), comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties3.hashCode(), comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRequestsLoggingImp comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties = new OASComAdobeGraniteRequestsLoggingImp();
        Map<String, String> propertyMappings = comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
