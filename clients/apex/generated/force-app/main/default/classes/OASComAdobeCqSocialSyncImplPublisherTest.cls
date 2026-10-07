@isTest
private class OASComAdobeCqSocialSyncImplPublisherTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1 = OASComAdobeCqSocialSyncImplPublisher.getExample();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2 = comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1;
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3 = new OASComAdobeCqSocialSyncImplPublisher();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties4 = comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3;

        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2));
        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1));
        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1));
        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties4));
        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties4.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3));
        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1 = OASComAdobeCqSocialSyncImplPublisher.getExample();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2 = OASComAdobeCqSocialSyncImplPublisher.getExample();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3 = new OASComAdobeCqSocialSyncImplPublisher();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties4 = new OASComAdobeCqSocialSyncImplPublisher();

        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2));
        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1));
        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties4));
        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties4.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1 = OASComAdobeCqSocialSyncImplPublisher.getExample();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2 = new OASComAdobeCqSocialSyncImplPublisher();

        System.assertEquals(false, comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1 = OASComAdobeCqSocialSyncImplPublisher.getExample();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2 = new OASComAdobeCqSocialSyncImplPublisher();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3;

        System.assertEquals(false, comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3));
        System.assertEquals(false, comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1 = OASComAdobeCqSocialSyncImplPublisher.getExample();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2 = new OASComAdobeCqSocialSyncImplPublisher();

        System.assertEquals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1.hashCode(), comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2.hashCode(), comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1 = OASComAdobeCqSocialSyncImplPublisher.getExample();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2 = OASComAdobeCqSocialSyncImplPublisher.getExample();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3 = new OASComAdobeCqSocialSyncImplPublisher();
        OASComAdobeCqSocialSyncImplPublisher comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties4 = new OASComAdobeCqSocialSyncImplPublisher();

        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2));
        System.assert(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3.equals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties4));
        System.assertEquals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties1.hashCode(), comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties3.hashCode(), comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties4.hashCode());
    }
}
