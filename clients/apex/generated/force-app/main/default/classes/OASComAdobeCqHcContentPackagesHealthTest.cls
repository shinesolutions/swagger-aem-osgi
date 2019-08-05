@isTest
private class OASComAdobeCqHcContentPackagesHealthTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties1 = OASComAdobeCqHcContentPackagesHealth.getExample();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties2 = comAdobeCqHcContentPackagesHealthCheckProperties1;
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties3 = new OASComAdobeCqHcContentPackagesHealth();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties4 = comAdobeCqHcContentPackagesHealthCheckProperties3;

        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties1.equals(comAdobeCqHcContentPackagesHealthCheckProperties2));
        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties2.equals(comAdobeCqHcContentPackagesHealthCheckProperties1));
        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties1.equals(comAdobeCqHcContentPackagesHealthCheckProperties1));
        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties3.equals(comAdobeCqHcContentPackagesHealthCheckProperties4));
        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties4.equals(comAdobeCqHcContentPackagesHealthCheckProperties3));
        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties3.equals(comAdobeCqHcContentPackagesHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties1 = OASComAdobeCqHcContentPackagesHealth.getExample();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties2 = OASComAdobeCqHcContentPackagesHealth.getExample();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties3 = new OASComAdobeCqHcContentPackagesHealth();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties4 = new OASComAdobeCqHcContentPackagesHealth();

        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties1.equals(comAdobeCqHcContentPackagesHealthCheckProperties2));
        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties2.equals(comAdobeCqHcContentPackagesHealthCheckProperties1));
        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties3.equals(comAdobeCqHcContentPackagesHealthCheckProperties4));
        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties4.equals(comAdobeCqHcContentPackagesHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties1 = OASComAdobeCqHcContentPackagesHealth.getExample();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties2 = new OASComAdobeCqHcContentPackagesHealth();

        System.assertEquals(false, comAdobeCqHcContentPackagesHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqHcContentPackagesHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties1 = OASComAdobeCqHcContentPackagesHealth.getExample();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties2 = new OASComAdobeCqHcContentPackagesHealth();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties3;

        System.assertEquals(false, comAdobeCqHcContentPackagesHealthCheckProperties1.equals(comAdobeCqHcContentPackagesHealthCheckProperties3));
        System.assertEquals(false, comAdobeCqHcContentPackagesHealthCheckProperties2.equals(comAdobeCqHcContentPackagesHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties1 = OASComAdobeCqHcContentPackagesHealth.getExample();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties2 = new OASComAdobeCqHcContentPackagesHealth();

        System.assertEquals(comAdobeCqHcContentPackagesHealthCheckProperties1.hashCode(), comAdobeCqHcContentPackagesHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeCqHcContentPackagesHealthCheckProperties2.hashCode(), comAdobeCqHcContentPackagesHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties1 = OASComAdobeCqHcContentPackagesHealth.getExample();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties2 = OASComAdobeCqHcContentPackagesHealth.getExample();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties3 = new OASComAdobeCqHcContentPackagesHealth();
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties4 = new OASComAdobeCqHcContentPackagesHealth();

        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties1.equals(comAdobeCqHcContentPackagesHealthCheckProperties2));
        System.assert(comAdobeCqHcContentPackagesHealthCheckProperties3.equals(comAdobeCqHcContentPackagesHealthCheckProperties4));
        System.assertEquals(comAdobeCqHcContentPackagesHealthCheckProperties1.hashCode(), comAdobeCqHcContentPackagesHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeCqHcContentPackagesHealthCheckProperties3.hashCode(), comAdobeCqHcContentPackagesHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqHcContentPackagesHealth comAdobeCqHcContentPackagesHealthCheckProperties = new OASComAdobeCqHcContentPackagesHealth();
        Map<String, String> propertyMappings = comAdobeCqHcContentPackagesHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcName', propertyMappings.get('hc.name'));
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('hcMbeanName', propertyMappings.get('hc.mbean.name'));
        System.assertEquals('packageNames', propertyMappings.get('package.names'));
    }
}
