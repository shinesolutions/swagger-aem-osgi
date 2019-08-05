@isTest
private class OASComAdobeGraniteBundlesHcImplWebDaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplWebDa.getExample();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2 = comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1;
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplWebDa();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties4 = comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3;

        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3));
        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplWebDa.getExample();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplWebDa.getExample();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplWebDa();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplWebDa();

        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplWebDa.getExample();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplWebDa();

        System.assertEquals(false, comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplWebDa.getExample();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplWebDa();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplWebDa.getExample();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplWebDa();

        System.assertEquals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2.hashCode(), comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplWebDa.getExample();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplWebDa.getExample();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplWebDa();
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplWebDa();

        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties3.hashCode(), comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteBundlesHcImplWebDa comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties = new OASComAdobeGraniteBundlesHcImplWebDa();
        Map<String, String> propertyMappings = comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
