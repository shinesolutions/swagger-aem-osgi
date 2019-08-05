@isTest
private class OASComAdobeGraniteRepositoryHcImplAuTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplAu.getExample();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2 = comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1;
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplAu();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties4 = comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3;

        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3));
        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplAu.getExample();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplAu.getExample();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplAu();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplAu();

        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplAu.getExample();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplAu();

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplAu.getExample();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplAu();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplAu.getExample();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplAu();

        System.assertEquals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2.hashCode(), comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplAu.getExample();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplAu.getExample();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplAu();
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplAu();

        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties3.hashCode(), comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRepositoryHcImplAu comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties = new OASComAdobeGraniteRepositoryHcImplAu();
        Map<String, String> propertyMappings = comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
