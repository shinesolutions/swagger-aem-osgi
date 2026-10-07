@isTest
private class OASComAdobeCqSocialActivitystreamsClTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1 = OASComAdobeCqSocialActivitystreamsCl.getExample();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2 = comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1;
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3 = new OASComAdobeCqSocialActivitystreamsCl();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties4 = comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3;

        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2));
        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1));
        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1));
        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties4));
        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties4.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3));
        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1 = OASComAdobeCqSocialActivitystreamsCl.getExample();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2 = OASComAdobeCqSocialActivitystreamsCl.getExample();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3 = new OASComAdobeCqSocialActivitystreamsCl();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties4 = new OASComAdobeCqSocialActivitystreamsCl();

        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2));
        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1));
        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties4));
        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties4.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1 = OASComAdobeCqSocialActivitystreamsCl.getExample();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2 = new OASComAdobeCqSocialActivitystreamsCl();

        System.assertEquals(false, comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1 = OASComAdobeCqSocialActivitystreamsCl.getExample();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2 = new OASComAdobeCqSocialActivitystreamsCl();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3;

        System.assertEquals(false, comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3));
        System.assertEquals(false, comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1 = OASComAdobeCqSocialActivitystreamsCl.getExample();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2 = new OASComAdobeCqSocialActivitystreamsCl();

        System.assertEquals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1.hashCode(), comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2.hashCode(), comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1 = OASComAdobeCqSocialActivitystreamsCl.getExample();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2 = OASComAdobeCqSocialActivitystreamsCl.getExample();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3 = new OASComAdobeCqSocialActivitystreamsCl();
        OASComAdobeCqSocialActivitystreamsCl comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties4 = new OASComAdobeCqSocialActivitystreamsCl();

        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2));
        System.assert(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3.equals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties4));
        System.assertEquals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties1.hashCode(), comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties3.hashCode(), comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties4.hashCode());
    }
}
