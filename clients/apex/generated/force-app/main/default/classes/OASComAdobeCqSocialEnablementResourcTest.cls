@isTest
private class OASComAdobeCqSocialEnablementResourcTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1 = OASComAdobeCqSocialEnablementResourc.getExample();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2 = comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1;
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3 = new OASComAdobeCqSocialEnablementResourc();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties4 = comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3;

        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2));
        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1));
        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1));
        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties4));
        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties4.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3));
        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1 = OASComAdobeCqSocialEnablementResourc.getExample();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2 = OASComAdobeCqSocialEnablementResourc.getExample();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3 = new OASComAdobeCqSocialEnablementResourc();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties4 = new OASComAdobeCqSocialEnablementResourc();

        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2));
        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1));
        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties4));
        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties4.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1 = OASComAdobeCqSocialEnablementResourc.getExample();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2 = new OASComAdobeCqSocialEnablementResourc();

        System.assertEquals(false, comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1 = OASComAdobeCqSocialEnablementResourc.getExample();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2 = new OASComAdobeCqSocialEnablementResourc();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3;

        System.assertEquals(false, comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3));
        System.assertEquals(false, comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1 = OASComAdobeCqSocialEnablementResourc.getExample();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2 = new OASComAdobeCqSocialEnablementResourc();

        System.assertEquals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1.hashCode(), comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2.hashCode(), comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1 = OASComAdobeCqSocialEnablementResourc.getExample();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2 = OASComAdobeCqSocialEnablementResourc.getExample();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3 = new OASComAdobeCqSocialEnablementResourc();
        OASComAdobeCqSocialEnablementResourc comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties4 = new OASComAdobeCqSocialEnablementResourc();

        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2));
        System.assert(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3.equals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties4));
        System.assertEquals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties1.hashCode(), comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties3.hashCode(), comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties4.hashCode());
    }
}
