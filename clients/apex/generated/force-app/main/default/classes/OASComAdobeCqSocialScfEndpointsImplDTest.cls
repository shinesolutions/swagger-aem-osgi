@isTest
private class OASComAdobeCqSocialScfEndpointsImplDTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1 = OASComAdobeCqSocialScfEndpointsImplD.getExample();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2 = comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1;
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3 = new OASComAdobeCqSocialScfEndpointsImplD();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties4 = comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3;

        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2));
        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1));
        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1));
        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties4));
        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties4.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3));
        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1 = OASComAdobeCqSocialScfEndpointsImplD.getExample();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2 = OASComAdobeCqSocialScfEndpointsImplD.getExample();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3 = new OASComAdobeCqSocialScfEndpointsImplD();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties4 = new OASComAdobeCqSocialScfEndpointsImplD();

        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2));
        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1));
        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties4));
        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties4.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1 = OASComAdobeCqSocialScfEndpointsImplD.getExample();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2 = new OASComAdobeCqSocialScfEndpointsImplD();

        System.assertEquals(false, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1 = OASComAdobeCqSocialScfEndpointsImplD.getExample();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2 = new OASComAdobeCqSocialScfEndpointsImplD();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3;

        System.assertEquals(false, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3));
        System.assertEquals(false, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1 = OASComAdobeCqSocialScfEndpointsImplD.getExample();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2 = new OASComAdobeCqSocialScfEndpointsImplD();

        System.assertEquals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1.hashCode(), comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2.hashCode(), comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1 = OASComAdobeCqSocialScfEndpointsImplD.getExample();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2 = OASComAdobeCqSocialScfEndpointsImplD.getExample();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3 = new OASComAdobeCqSocialScfEndpointsImplD();
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties4 = new OASComAdobeCqSocialScfEndpointsImplD();

        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2));
        System.assert(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3.equals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties4));
        System.assertEquals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties1.hashCode(), comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties3.hashCode(), comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialScfEndpointsImplD comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties = new OASComAdobeCqSocialScfEndpointsImplD();
        Map<String, String> propertyMappings = comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.getPropertyMappings();
        System.assertEquals('slingServletSelectors', propertyMappings.get('sling.servlet.selectors'));
        System.assertEquals('slingServletExtensions', propertyMappings.get('sling.servlet.extensions'));
    }
}
