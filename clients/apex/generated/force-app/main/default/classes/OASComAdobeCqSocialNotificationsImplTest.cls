@isTest
private class OASComAdobeCqSocialNotificationsImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties1 = OASComAdobeCqSocialNotificationsImpl.getExample();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties2 = comAdobeCqSocialNotificationsImplNotificationsRouterProperties1;
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties3 = new OASComAdobeCqSocialNotificationsImpl();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties4 = comAdobeCqSocialNotificationsImplNotificationsRouterProperties3;

        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties1.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties2));
        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties2.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties1));
        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties1.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties1));
        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties4));
        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties4.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3));
        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties1 = OASComAdobeCqSocialNotificationsImpl.getExample();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties2 = OASComAdobeCqSocialNotificationsImpl.getExample();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties3 = new OASComAdobeCqSocialNotificationsImpl();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties4 = new OASComAdobeCqSocialNotificationsImpl();

        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties1.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties2));
        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties2.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties1));
        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties4));
        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties4.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties1 = OASComAdobeCqSocialNotificationsImpl.getExample();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties2 = new OASComAdobeCqSocialNotificationsImpl();

        System.assertEquals(false, comAdobeCqSocialNotificationsImplNotificationsRouterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialNotificationsImplNotificationsRouterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties1 = OASComAdobeCqSocialNotificationsImpl.getExample();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties2 = new OASComAdobeCqSocialNotificationsImpl();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties3;

        System.assertEquals(false, comAdobeCqSocialNotificationsImplNotificationsRouterProperties1.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3));
        System.assertEquals(false, comAdobeCqSocialNotificationsImplNotificationsRouterProperties2.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties1 = OASComAdobeCqSocialNotificationsImpl.getExample();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties2 = new OASComAdobeCqSocialNotificationsImpl();

        System.assertEquals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties1.hashCode(), comAdobeCqSocialNotificationsImplNotificationsRouterProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties2.hashCode(), comAdobeCqSocialNotificationsImplNotificationsRouterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties1 = OASComAdobeCqSocialNotificationsImpl.getExample();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties2 = OASComAdobeCqSocialNotificationsImpl.getExample();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties3 = new OASComAdobeCqSocialNotificationsImpl();
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties4 = new OASComAdobeCqSocialNotificationsImpl();

        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties1.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties2));
        System.assert(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3.equals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties4));
        System.assertEquals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties1.hashCode(), comAdobeCqSocialNotificationsImplNotificationsRouterProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialNotificationsImplNotificationsRouterProperties3.hashCode(), comAdobeCqSocialNotificationsImplNotificationsRouterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialNotificationsImpl comAdobeCqSocialNotificationsImplNotificationsRouterProperties = new OASComAdobeCqSocialNotificationsImpl();
        Map<String, String> propertyMappings = comAdobeCqSocialNotificationsImplNotificationsRouterProperties.getPropertyMappings();
        System.assertEquals('eventTopics', propertyMappings.get('event.topics'));
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
    }
}
