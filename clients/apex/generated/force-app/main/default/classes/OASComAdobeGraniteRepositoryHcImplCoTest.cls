@isTest
private class OASComAdobeGraniteRepositoryHcImplCoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplCo.getExample();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2 = comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1;
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplCo();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties4 = comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3;

        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3));
        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplCo.getExample();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplCo.getExample();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplCo();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplCo();

        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplCo.getExample();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplCo();

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplCo.getExample();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplCo();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplCo.getExample();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplCo();

        System.assertEquals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2.hashCode(), comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplCo.getExample();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplCo.getExample();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplCo();
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplCo();

        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties3.hashCode(), comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRepositoryHcImplCo comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties = new OASComAdobeGraniteRepositoryHcImplCo();
        Map<String, String> propertyMappings = comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
