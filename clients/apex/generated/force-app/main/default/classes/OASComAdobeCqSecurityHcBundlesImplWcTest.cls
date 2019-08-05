@isTest
private class OASComAdobeCqSecurityHcBundlesImplWcTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1 = OASComAdobeCqSecurityHcBundlesImplWc.getExample();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2 = comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1;
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3 = new OASComAdobeCqSecurityHcBundlesImplWc();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties4 = comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3;

        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties4));
        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties4.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3));
        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1 = OASComAdobeCqSecurityHcBundlesImplWc.getExample();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2 = OASComAdobeCqSecurityHcBundlesImplWc.getExample();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3 = new OASComAdobeCqSecurityHcBundlesImplWc();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties4 = new OASComAdobeCqSecurityHcBundlesImplWc();

        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties4));
        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties4.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1 = OASComAdobeCqSecurityHcBundlesImplWc.getExample();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2 = new OASComAdobeCqSecurityHcBundlesImplWc();

        System.assertEquals(false, comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1 = OASComAdobeCqSecurityHcBundlesImplWc.getExample();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2 = new OASComAdobeCqSecurityHcBundlesImplWc();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3;

        System.assertEquals(false, comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3));
        System.assertEquals(false, comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1 = OASComAdobeCqSecurityHcBundlesImplWc.getExample();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2 = new OASComAdobeCqSecurityHcBundlesImplWc();

        System.assertEquals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1.hashCode(), comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2.hashCode(), comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1 = OASComAdobeCqSecurityHcBundlesImplWc.getExample();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2 = OASComAdobeCqSecurityHcBundlesImplWc.getExample();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3 = new OASComAdobeCqSecurityHcBundlesImplWc();
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties4 = new OASComAdobeCqSecurityHcBundlesImplWc();

        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3.equals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties4));
        System.assertEquals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties1.hashCode(), comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties3.hashCode(), comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSecurityHcBundlesImplWc comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties = new OASComAdobeCqSecurityHcBundlesImplWc();
        Map<String, String> propertyMappings = comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
