@isTest
private class OASComAdobeGraniteBundlesHcImplSlingTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplSling.getExample();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2 = comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1;
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplSling();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties4 = comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3;

        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3));
        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplSling.getExample();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplSling.getExample();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplSling();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplSling();

        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplSling.getExample();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplSling();

        System.assertEquals(false, comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplSling.getExample();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplSling();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplSling.getExample();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplSling();

        System.assertEquals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2.hashCode(), comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplSling.getExample();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplSling.getExample();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplSling();
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplSling();

        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties3.hashCode(), comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteBundlesHcImplSling comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties = new OASComAdobeGraniteBundlesHcImplSling();
        Map<String, String> propertyMappings = comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
