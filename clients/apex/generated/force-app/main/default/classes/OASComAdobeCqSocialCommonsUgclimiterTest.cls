@isTest
private class OASComAdobeCqSocialCommonsUgclimiterTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1 = OASComAdobeCqSocialCommonsUgclimiter.getExample();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2 = comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1;
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3 = new OASComAdobeCqSocialCommonsUgclimiter();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties4 = comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3;

        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2));
        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1));
        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1));
        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties4));
        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties4.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3));
        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1 = OASComAdobeCqSocialCommonsUgclimiter.getExample();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2 = OASComAdobeCqSocialCommonsUgclimiter.getExample();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3 = new OASComAdobeCqSocialCommonsUgclimiter();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties4 = new OASComAdobeCqSocialCommonsUgclimiter();

        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2));
        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1));
        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties4));
        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties4.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1 = OASComAdobeCqSocialCommonsUgclimiter.getExample();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2 = new OASComAdobeCqSocialCommonsUgclimiter();

        System.assertEquals(false, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1 = OASComAdobeCqSocialCommonsUgclimiter.getExample();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2 = new OASComAdobeCqSocialCommonsUgclimiter();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3;

        System.assertEquals(false, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3));
        System.assertEquals(false, comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1 = OASComAdobeCqSocialCommonsUgclimiter.getExample();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2 = new OASComAdobeCqSocialCommonsUgclimiter();

        System.assertEquals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1.hashCode(), comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2.hashCode(), comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1 = OASComAdobeCqSocialCommonsUgclimiter.getExample();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2 = OASComAdobeCqSocialCommonsUgclimiter.getExample();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3 = new OASComAdobeCqSocialCommonsUgclimiter();
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties4 = new OASComAdobeCqSocialCommonsUgclimiter();

        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2));
        System.assert(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3.equals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties4));
        System.assertEquals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties1.hashCode(), comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties3.hashCode(), comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialCommonsUgclimiter comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties = new OASComAdobeCqSocialCommonsUgclimiter();
        Map<String, String> propertyMappings = comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.getPropertyMappings();
        System.assertEquals('eventTopics', propertyMappings.get('event.topics'));
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
    }
}
