@isTest
private class OASComAdobeGraniteBundlesHcImplCrxdeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCrxde.getExample();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2 = comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1;
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplCrxde();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties4 = comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3;

        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3));
        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCrxde.getExample();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplCrxde.getExample();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplCrxde();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplCrxde();

        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCrxde.getExample();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplCrxde();

        System.assertEquals(false, comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCrxde.getExample();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplCrxde();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCrxde.getExample();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplCrxde();

        System.assertEquals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2.hashCode(), comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplCrxde.getExample();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplCrxde.getExample();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplCrxde();
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplCrxde();

        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties3.hashCode(), comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteBundlesHcImplCrxde comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties = new OASComAdobeGraniteBundlesHcImplCrxde();
        Map<String, String> propertyMappings = comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
