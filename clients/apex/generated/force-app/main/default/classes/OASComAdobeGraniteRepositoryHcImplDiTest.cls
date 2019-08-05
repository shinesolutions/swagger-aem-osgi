@isTest
private class OASComAdobeGraniteRepositoryHcImplDiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDi.getExample();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2 = comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1;
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplDi();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties4 = comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3;

        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3));
        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDi.getExample();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplDi.getExample();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplDi();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplDi();

        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDi.getExample();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplDi();

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDi.getExample();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplDi();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDi.getExample();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplDi();

        System.assertEquals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2.hashCode(), comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDi.getExample();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplDi.getExample();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplDi();
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplDi();

        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties3.hashCode(), comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRepositoryHcImplDi comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties = new OASComAdobeGraniteRepositoryHcImplDi();
        Map<String, String> propertyMappings = comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('diskSpaceWarnThreshold', propertyMappings.get('disk.space.warn.threshold'));
        System.assertEquals('diskSpaceErrorThreshold', propertyMappings.get('disk.space.error.threshold'));
    }
}
