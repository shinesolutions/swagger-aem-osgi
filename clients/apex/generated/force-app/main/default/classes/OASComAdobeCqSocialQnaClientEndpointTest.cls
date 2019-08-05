@isTest
private class OASComAdobeCqSocialQnaClientEndpointTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1 = OASComAdobeCqSocialQnaClientEndpoint.getExample();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2 = comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1;
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3 = new OASComAdobeCqSocialQnaClientEndpoint();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties4 = comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3;

        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2));
        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1));
        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1));
        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties4));
        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties4.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3));
        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1 = OASComAdobeCqSocialQnaClientEndpoint.getExample();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2 = OASComAdobeCqSocialQnaClientEndpoint.getExample();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3 = new OASComAdobeCqSocialQnaClientEndpoint();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties4 = new OASComAdobeCqSocialQnaClientEndpoint();

        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2));
        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1));
        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties4));
        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties4.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1 = OASComAdobeCqSocialQnaClientEndpoint.getExample();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2 = new OASComAdobeCqSocialQnaClientEndpoint();

        System.assertEquals(false, comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1 = OASComAdobeCqSocialQnaClientEndpoint.getExample();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2 = new OASComAdobeCqSocialQnaClientEndpoint();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3;

        System.assertEquals(false, comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3));
        System.assertEquals(false, comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1 = OASComAdobeCqSocialQnaClientEndpoint.getExample();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2 = new OASComAdobeCqSocialQnaClientEndpoint();

        System.assertEquals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1.hashCode(), comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2.hashCode(), comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1 = OASComAdobeCqSocialQnaClientEndpoint.getExample();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2 = OASComAdobeCqSocialQnaClientEndpoint.getExample();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3 = new OASComAdobeCqSocialQnaClientEndpoint();
        OASComAdobeCqSocialQnaClientEndpoint comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties4 = new OASComAdobeCqSocialQnaClientEndpoint();

        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2));
        System.assert(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3.equals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties4));
        System.assertEquals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties1.hashCode(), comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties3.hashCode(), comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties4.hashCode());
    }
}
