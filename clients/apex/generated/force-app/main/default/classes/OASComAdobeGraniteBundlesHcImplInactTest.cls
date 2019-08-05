@isTest
private class OASComAdobeGraniteBundlesHcImplInactTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplInact.getExample();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2 = comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1;
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplInact();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties4 = comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3;

        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3));
        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplInact.getExample();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplInact.getExample();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplInact();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplInact();

        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplInact.getExample();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplInact();

        System.assertEquals(false, comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplInact.getExample();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplInact();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplInact.getExample();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplInact();

        System.assertEquals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2.hashCode(), comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplInact.getExample();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplInact.getExample();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplInact();
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplInact();

        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties3.hashCode(), comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteBundlesHcImplInact comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties = new OASComAdobeGraniteBundlesHcImplInact();
        Map<String, String> propertyMappings = comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('ignoredBundles', propertyMappings.get('ignored.bundles'));
    }
}
