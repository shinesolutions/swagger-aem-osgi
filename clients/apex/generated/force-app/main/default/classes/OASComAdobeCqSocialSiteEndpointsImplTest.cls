@isTest
private class OASComAdobeCqSocialSiteEndpointsImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1 = OASComAdobeCqSocialSiteEndpointsImpl.getExample();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2 = comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1;
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3 = new OASComAdobeCqSocialSiteEndpointsImpl();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties4 = comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3;

        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2));
        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1));
        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1));
        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties4));
        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties4.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3));
        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1 = OASComAdobeCqSocialSiteEndpointsImpl.getExample();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2 = OASComAdobeCqSocialSiteEndpointsImpl.getExample();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3 = new OASComAdobeCqSocialSiteEndpointsImpl();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties4 = new OASComAdobeCqSocialSiteEndpointsImpl();

        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2));
        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1));
        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties4));
        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties4.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1 = OASComAdobeCqSocialSiteEndpointsImpl.getExample();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2 = new OASComAdobeCqSocialSiteEndpointsImpl();

        System.assertEquals(false, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1 = OASComAdobeCqSocialSiteEndpointsImpl.getExample();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2 = new OASComAdobeCqSocialSiteEndpointsImpl();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3;

        System.assertEquals(false, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3));
        System.assertEquals(false, comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1 = OASComAdobeCqSocialSiteEndpointsImpl.getExample();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2 = new OASComAdobeCqSocialSiteEndpointsImpl();

        System.assertEquals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1.hashCode(), comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2.hashCode(), comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1 = OASComAdobeCqSocialSiteEndpointsImpl.getExample();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2 = OASComAdobeCqSocialSiteEndpointsImpl.getExample();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3 = new OASComAdobeCqSocialSiteEndpointsImpl();
        OASComAdobeCqSocialSiteEndpointsImpl comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties4 = new OASComAdobeCqSocialSiteEndpointsImpl();

        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2));
        System.assert(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3.equals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties4));
        System.assertEquals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties1.hashCode(), comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties3.hashCode(), comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties4.hashCode());
    }
}
