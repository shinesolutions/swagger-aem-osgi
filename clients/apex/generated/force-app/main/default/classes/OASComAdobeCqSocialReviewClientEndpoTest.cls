@isTest
private class OASComAdobeCqSocialReviewClientEndpoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1 = OASComAdobeCqSocialReviewClientEndpo.getExample();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2 = comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1;
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3 = new OASComAdobeCqSocialReviewClientEndpo();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties4 = comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3;

        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2));
        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1));
        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1));
        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties4));
        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties4.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3));
        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1 = OASComAdobeCqSocialReviewClientEndpo.getExample();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2 = OASComAdobeCqSocialReviewClientEndpo.getExample();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3 = new OASComAdobeCqSocialReviewClientEndpo();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties4 = new OASComAdobeCqSocialReviewClientEndpo();

        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2));
        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1));
        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties4));
        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties4.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1 = OASComAdobeCqSocialReviewClientEndpo.getExample();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2 = new OASComAdobeCqSocialReviewClientEndpo();

        System.assertEquals(false, comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1 = OASComAdobeCqSocialReviewClientEndpo.getExample();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2 = new OASComAdobeCqSocialReviewClientEndpo();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3;

        System.assertEquals(false, comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3));
        System.assertEquals(false, comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1 = OASComAdobeCqSocialReviewClientEndpo.getExample();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2 = new OASComAdobeCqSocialReviewClientEndpo();

        System.assertEquals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1.hashCode(), comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2.hashCode(), comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1 = OASComAdobeCqSocialReviewClientEndpo.getExample();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2 = OASComAdobeCqSocialReviewClientEndpo.getExample();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3 = new OASComAdobeCqSocialReviewClientEndpo();
        OASComAdobeCqSocialReviewClientEndpo comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties4 = new OASComAdobeCqSocialReviewClientEndpo();

        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2));
        System.assert(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3.equals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties4));
        System.assertEquals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties1.hashCode(), comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties3.hashCode(), comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties4.hashCode());
    }
}
