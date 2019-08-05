@isTest
private class OASComAdobeCqSocialScoringImplScorinTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties1 = OASComAdobeCqSocialScoringImplScorin.getExample();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties2 = comAdobeCqSocialScoringImplScoringEventListenerProperties1;
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties3 = new OASComAdobeCqSocialScoringImplScorin();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties4 = comAdobeCqSocialScoringImplScoringEventListenerProperties3;

        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties1.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties2));
        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties2.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties1));
        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties1.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties1));
        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties3.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties4));
        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties4.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties3));
        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties3.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties1 = OASComAdobeCqSocialScoringImplScorin.getExample();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties2 = OASComAdobeCqSocialScoringImplScorin.getExample();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties3 = new OASComAdobeCqSocialScoringImplScorin();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties4 = new OASComAdobeCqSocialScoringImplScorin();

        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties1.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties2));
        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties2.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties1));
        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties3.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties4));
        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties4.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties1 = OASComAdobeCqSocialScoringImplScorin.getExample();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties2 = new OASComAdobeCqSocialScoringImplScorin();

        System.assertEquals(false, comAdobeCqSocialScoringImplScoringEventListenerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialScoringImplScoringEventListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties1 = OASComAdobeCqSocialScoringImplScorin.getExample();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties2 = new OASComAdobeCqSocialScoringImplScorin();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties3;

        System.assertEquals(false, comAdobeCqSocialScoringImplScoringEventListenerProperties1.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties3));
        System.assertEquals(false, comAdobeCqSocialScoringImplScoringEventListenerProperties2.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties1 = OASComAdobeCqSocialScoringImplScorin.getExample();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties2 = new OASComAdobeCqSocialScoringImplScorin();

        System.assertEquals(comAdobeCqSocialScoringImplScoringEventListenerProperties1.hashCode(), comAdobeCqSocialScoringImplScoringEventListenerProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialScoringImplScoringEventListenerProperties2.hashCode(), comAdobeCqSocialScoringImplScoringEventListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties1 = OASComAdobeCqSocialScoringImplScorin.getExample();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties2 = OASComAdobeCqSocialScoringImplScorin.getExample();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties3 = new OASComAdobeCqSocialScoringImplScorin();
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties4 = new OASComAdobeCqSocialScoringImplScorin();

        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties1.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties2));
        System.assert(comAdobeCqSocialScoringImplScoringEventListenerProperties3.equals(comAdobeCqSocialScoringImplScoringEventListenerProperties4));
        System.assertEquals(comAdobeCqSocialScoringImplScoringEventListenerProperties1.hashCode(), comAdobeCqSocialScoringImplScoringEventListenerProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialScoringImplScoringEventListenerProperties3.hashCode(), comAdobeCqSocialScoringImplScoringEventListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialScoringImplScorin comAdobeCqSocialScoringImplScoringEventListenerProperties = new OASComAdobeCqSocialScoringImplScorin();
        Map<String, String> propertyMappings = comAdobeCqSocialScoringImplScoringEventListenerProperties.getPropertyMappings();
        System.assertEquals('eventTopics', propertyMappings.get('event.topics'));
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
    }
}
