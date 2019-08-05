@isTest
private class OASComAdobeCqSocialForumClientEndpoiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1 = OASComAdobeCqSocialForumClientEndpoi.getExample();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2 = comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1;
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3 = new OASComAdobeCqSocialForumClientEndpoi();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties4 = comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3;

        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2));
        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1));
        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1));
        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties4));
        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties4.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3));
        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1 = OASComAdobeCqSocialForumClientEndpoi.getExample();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2 = OASComAdobeCqSocialForumClientEndpoi.getExample();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3 = new OASComAdobeCqSocialForumClientEndpoi();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties4 = new OASComAdobeCqSocialForumClientEndpoi();

        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2));
        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1));
        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties4));
        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties4.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1 = OASComAdobeCqSocialForumClientEndpoi.getExample();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2 = new OASComAdobeCqSocialForumClientEndpoi();

        System.assertEquals(false, comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1 = OASComAdobeCqSocialForumClientEndpoi.getExample();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2 = new OASComAdobeCqSocialForumClientEndpoi();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3;

        System.assertEquals(false, comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3));
        System.assertEquals(false, comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1 = OASComAdobeCqSocialForumClientEndpoi.getExample();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2 = new OASComAdobeCqSocialForumClientEndpoi();

        System.assertEquals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1.hashCode(), comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2.hashCode(), comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1 = OASComAdobeCqSocialForumClientEndpoi.getExample();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2 = OASComAdobeCqSocialForumClientEndpoi.getExample();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3 = new OASComAdobeCqSocialForumClientEndpoi();
        OASComAdobeCqSocialForumClientEndpoi comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties4 = new OASComAdobeCqSocialForumClientEndpoi();

        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2));
        System.assert(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3.equals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties4));
        System.assertEquals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties1.hashCode(), comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties3.hashCode(), comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties4.hashCode());
    }
}
