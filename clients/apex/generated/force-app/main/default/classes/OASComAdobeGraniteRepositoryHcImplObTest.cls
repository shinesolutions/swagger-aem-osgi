@isTest
private class OASComAdobeGraniteRepositoryHcImplObTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplOb.getExample();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2 = comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1;
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplOb();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties4 = comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3;

        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3));
        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplOb.getExample();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplOb.getExample();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplOb();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplOb();

        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplOb.getExample();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplOb();

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplOb.getExample();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplOb();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplOb.getExample();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplOb();

        System.assertEquals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2.hashCode(), comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplOb.getExample();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplOb.getExample();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplOb();
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplOb();

        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties3.hashCode(), comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRepositoryHcImplOb comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties = new OASComAdobeGraniteRepositoryHcImplOb();
        Map<String, String> propertyMappings = comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
