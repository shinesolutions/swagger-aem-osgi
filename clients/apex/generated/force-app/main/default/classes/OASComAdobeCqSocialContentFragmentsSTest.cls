@isTest
private class OASComAdobeCqSocialContentFragmentsSTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1 = OASComAdobeCqSocialContentFragmentsS.getExample();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2 = comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1;
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3 = new OASComAdobeCqSocialContentFragmentsS();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties4 = comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3;

        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2));
        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1));
        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1));
        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties4));
        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties4.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3));
        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1 = OASComAdobeCqSocialContentFragmentsS.getExample();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2 = OASComAdobeCqSocialContentFragmentsS.getExample();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3 = new OASComAdobeCqSocialContentFragmentsS();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties4 = new OASComAdobeCqSocialContentFragmentsS();

        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2));
        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1));
        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties4));
        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties4.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1 = OASComAdobeCqSocialContentFragmentsS.getExample();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2 = new OASComAdobeCqSocialContentFragmentsS();

        System.assertEquals(false, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1 = OASComAdobeCqSocialContentFragmentsS.getExample();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2 = new OASComAdobeCqSocialContentFragmentsS();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3;

        System.assertEquals(false, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3));
        System.assertEquals(false, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1 = OASComAdobeCqSocialContentFragmentsS.getExample();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2 = new OASComAdobeCqSocialContentFragmentsS();

        System.assertEquals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1.hashCode(), comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2.hashCode(), comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1 = OASComAdobeCqSocialContentFragmentsS.getExample();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2 = OASComAdobeCqSocialContentFragmentsS.getExample();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3 = new OASComAdobeCqSocialContentFragmentsS();
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties4 = new OASComAdobeCqSocialContentFragmentsS();

        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2));
        System.assert(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3.equals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties4));
        System.assertEquals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties1.hashCode(), comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties3.hashCode(), comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialContentFragmentsS comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties = new OASComAdobeCqSocialContentFragmentsS();
        Map<String, String> propertyMappings = comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.getPropertyMappings();
        System.assertEquals('cqSocialContentFragmentsServicesEnabled', propertyMappings.get('cq.social.content.fragments.services.enabled'));
        System.assertEquals('cqSocialContentFragmentsServicesWaitTimeSeconds', propertyMappings.get('cq.social.content.fragments.services.waitTimeSeconds'));
    }
}
