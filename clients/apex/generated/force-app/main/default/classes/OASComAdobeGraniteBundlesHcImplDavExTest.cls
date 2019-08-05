@isTest
private class OASComAdobeGraniteBundlesHcImplDavExTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplDavEx.getExample();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2 = comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1;
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplDavEx();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties4 = comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3;

        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3));
        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplDavEx.getExample();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplDavEx.getExample();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplDavEx();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplDavEx();

        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplDavEx.getExample();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplDavEx();

        System.assertEquals(false, comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplDavEx.getExample();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplDavEx();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplDavEx.getExample();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplDavEx();

        System.assertEquals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2.hashCode(), comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplDavEx.getExample();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplDavEx.getExample();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplDavEx();
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplDavEx();

        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties3.hashCode(), comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteBundlesHcImplDavEx comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties = new OASComAdobeGraniteBundlesHcImplDavEx();
        Map<String, String> propertyMappings = comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
