@isTest
private class OASComAdobeCqSocialEnablementLearninTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1 = OASComAdobeCqSocialEnablementLearnin.getExample();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2 = comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1;
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3 = new OASComAdobeCqSocialEnablementLearnin();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties4 = comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3;

        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2));
        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1));
        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1));
        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties4));
        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties4.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3));
        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1 = OASComAdobeCqSocialEnablementLearnin.getExample();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2 = OASComAdobeCqSocialEnablementLearnin.getExample();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3 = new OASComAdobeCqSocialEnablementLearnin();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties4 = new OASComAdobeCqSocialEnablementLearnin();

        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2));
        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1));
        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties4));
        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties4.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1 = OASComAdobeCqSocialEnablementLearnin.getExample();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2 = new OASComAdobeCqSocialEnablementLearnin();

        System.assertEquals(false, comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1 = OASComAdobeCqSocialEnablementLearnin.getExample();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2 = new OASComAdobeCqSocialEnablementLearnin();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3;

        System.assertEquals(false, comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3));
        System.assertEquals(false, comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1 = OASComAdobeCqSocialEnablementLearnin.getExample();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2 = new OASComAdobeCqSocialEnablementLearnin();

        System.assertEquals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1.hashCode(), comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2.hashCode(), comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1 = OASComAdobeCqSocialEnablementLearnin.getExample();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2 = OASComAdobeCqSocialEnablementLearnin.getExample();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3 = new OASComAdobeCqSocialEnablementLearnin();
        OASComAdobeCqSocialEnablementLearnin comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties4 = new OASComAdobeCqSocialEnablementLearnin();

        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2));
        System.assert(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3.equals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties4));
        System.assertEquals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties1.hashCode(), comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties3.hashCode(), comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties4.hashCode());
    }
}
