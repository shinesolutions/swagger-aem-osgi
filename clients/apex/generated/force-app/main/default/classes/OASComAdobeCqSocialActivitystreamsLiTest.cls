@isTest
private class OASComAdobeCqSocialActivitystreamsLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1 = OASComAdobeCqSocialActivitystreamsLi.getExample();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2 = comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1;
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3 = new OASComAdobeCqSocialActivitystreamsLi();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties4 = comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3;

        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2));
        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1));
        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1));
        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties4));
        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties4.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3));
        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1 = OASComAdobeCqSocialActivitystreamsLi.getExample();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2 = OASComAdobeCqSocialActivitystreamsLi.getExample();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3 = new OASComAdobeCqSocialActivitystreamsLi();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties4 = new OASComAdobeCqSocialActivitystreamsLi();

        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2));
        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1));
        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties4));
        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties4.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1 = OASComAdobeCqSocialActivitystreamsLi.getExample();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2 = new OASComAdobeCqSocialActivitystreamsLi();

        System.assertEquals(false, comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1 = OASComAdobeCqSocialActivitystreamsLi.getExample();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2 = new OASComAdobeCqSocialActivitystreamsLi();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3;

        System.assertEquals(false, comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3));
        System.assertEquals(false, comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1 = OASComAdobeCqSocialActivitystreamsLi.getExample();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2 = new OASComAdobeCqSocialActivitystreamsLi();

        System.assertEquals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1.hashCode(), comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2.hashCode(), comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1 = OASComAdobeCqSocialActivitystreamsLi.getExample();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2 = OASComAdobeCqSocialActivitystreamsLi.getExample();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3 = new OASComAdobeCqSocialActivitystreamsLi();
        OASComAdobeCqSocialActivitystreamsLi comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties4 = new OASComAdobeCqSocialActivitystreamsLi();

        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2));
        System.assert(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3.equals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties4));
        System.assertEquals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties1.hashCode(), comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties3.hashCode(), comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties4.hashCode());
    }
}
