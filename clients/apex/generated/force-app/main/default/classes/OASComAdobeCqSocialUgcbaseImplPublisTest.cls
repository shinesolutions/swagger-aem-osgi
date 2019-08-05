@isTest
private class OASComAdobeCqSocialUgcbaseImplPublisTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1 = OASComAdobeCqSocialUgcbaseImplPublis.getExample();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2 = comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1;
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3 = new OASComAdobeCqSocialUgcbaseImplPublis();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties4 = comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3;

        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties4.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3));
        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1 = OASComAdobeCqSocialUgcbaseImplPublis.getExample();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2 = OASComAdobeCqSocialUgcbaseImplPublis.getExample();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3 = new OASComAdobeCqSocialUgcbaseImplPublis();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties4 = new OASComAdobeCqSocialUgcbaseImplPublis();

        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties4.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1 = OASComAdobeCqSocialUgcbaseImplPublis.getExample();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2 = new OASComAdobeCqSocialUgcbaseImplPublis();

        System.assertEquals(false, comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1 = OASComAdobeCqSocialUgcbaseImplPublis.getExample();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2 = new OASComAdobeCqSocialUgcbaseImplPublis();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3;

        System.assertEquals(false, comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3));
        System.assertEquals(false, comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1 = OASComAdobeCqSocialUgcbaseImplPublis.getExample();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2 = new OASComAdobeCqSocialUgcbaseImplPublis();

        System.assertEquals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1.hashCode(), comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2.hashCode(), comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1 = OASComAdobeCqSocialUgcbaseImplPublis.getExample();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2 = OASComAdobeCqSocialUgcbaseImplPublis.getExample();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3 = new OASComAdobeCqSocialUgcbaseImplPublis();
        OASComAdobeCqSocialUgcbaseImplPublis comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties4 = new OASComAdobeCqSocialUgcbaseImplPublis();

        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3.equals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties4));
        System.assertEquals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties1.hashCode(), comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties3.hashCode(), comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties4.hashCode());
    }
}
