@isTest
private class OASComAdobeCqSocialUserEndpointsImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1 = OASComAdobeCqSocialUserEndpointsImpl.getExample();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2 = comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1;
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3 = new OASComAdobeCqSocialUserEndpointsImpl();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties4 = comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3;

        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2));
        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1));
        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1));
        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties4));
        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties4.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3));
        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1 = OASComAdobeCqSocialUserEndpointsImpl.getExample();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2 = OASComAdobeCqSocialUserEndpointsImpl.getExample();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3 = new OASComAdobeCqSocialUserEndpointsImpl();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties4 = new OASComAdobeCqSocialUserEndpointsImpl();

        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2));
        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1));
        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties4));
        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties4.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1 = OASComAdobeCqSocialUserEndpointsImpl.getExample();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2 = new OASComAdobeCqSocialUserEndpointsImpl();

        System.assertEquals(false, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1 = OASComAdobeCqSocialUserEndpointsImpl.getExample();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2 = new OASComAdobeCqSocialUserEndpointsImpl();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3;

        System.assertEquals(false, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3));
        System.assertEquals(false, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1 = OASComAdobeCqSocialUserEndpointsImpl.getExample();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2 = new OASComAdobeCqSocialUserEndpointsImpl();

        System.assertEquals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1.hashCode(), comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2.hashCode(), comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1 = OASComAdobeCqSocialUserEndpointsImpl.getExample();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2 = OASComAdobeCqSocialUserEndpointsImpl.getExample();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3 = new OASComAdobeCqSocialUserEndpointsImpl();
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties4 = new OASComAdobeCqSocialUserEndpointsImpl();

        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2));
        System.assert(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3.equals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties4));
        System.assertEquals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties1.hashCode(), comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties3.hashCode(), comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialUserEndpointsImpl comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties = new OASComAdobeCqSocialUserEndpointsImpl();
        Map<String, String> propertyMappings = comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.getPropertyMappings();
        System.assertEquals('slingServletExtensions', propertyMappings.get('sling.servlet.extensions'));
        System.assertEquals('slingServletPaths', propertyMappings.get('sling.servlet.paths'));
        System.assertEquals('slingServletMethods', propertyMappings.get('sling.servlet.methods'));
    }
}
