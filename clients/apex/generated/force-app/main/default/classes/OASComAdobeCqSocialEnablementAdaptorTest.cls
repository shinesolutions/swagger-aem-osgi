@isTest
private class OASComAdobeCqSocialEnablementAdaptorTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1 = OASComAdobeCqSocialEnablementAdaptor.getExample();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2 = comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1;
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3 = new OASComAdobeCqSocialEnablementAdaptor();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties4 = comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3;

        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2));
        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1));
        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1));
        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties4));
        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties4.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3));
        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1 = OASComAdobeCqSocialEnablementAdaptor.getExample();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2 = OASComAdobeCqSocialEnablementAdaptor.getExample();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3 = new OASComAdobeCqSocialEnablementAdaptor();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties4 = new OASComAdobeCqSocialEnablementAdaptor();

        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2));
        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1));
        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties4));
        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties4.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1 = OASComAdobeCqSocialEnablementAdaptor.getExample();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2 = new OASComAdobeCqSocialEnablementAdaptor();

        System.assertEquals(false, comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1 = OASComAdobeCqSocialEnablementAdaptor.getExample();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2 = new OASComAdobeCqSocialEnablementAdaptor();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3;

        System.assertEquals(false, comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3));
        System.assertEquals(false, comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1 = OASComAdobeCqSocialEnablementAdaptor.getExample();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2 = new OASComAdobeCqSocialEnablementAdaptor();

        System.assertEquals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1.hashCode(), comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2.hashCode(), comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1 = OASComAdobeCqSocialEnablementAdaptor.getExample();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2 = OASComAdobeCqSocialEnablementAdaptor.getExample();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3 = new OASComAdobeCqSocialEnablementAdaptor();
        OASComAdobeCqSocialEnablementAdaptor comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties4 = new OASComAdobeCqSocialEnablementAdaptor();

        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2));
        System.assert(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3.equals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties4));
        System.assertEquals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties1.hashCode(), comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties3.hashCode(), comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties4.hashCode());
    }
}
