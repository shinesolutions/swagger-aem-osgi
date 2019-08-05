@isTest
private class OASComAdobeCqSocialFilelibraryClientTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1 = OASComAdobeCqSocialFilelibraryClient.getExample();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2 = comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1;
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3 = new OASComAdobeCqSocialFilelibraryClient();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties4 = comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3;

        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2));
        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1));
        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1));
        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties4));
        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties4.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3));
        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1 = OASComAdobeCqSocialFilelibraryClient.getExample();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2 = OASComAdobeCqSocialFilelibraryClient.getExample();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3 = new OASComAdobeCqSocialFilelibraryClient();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties4 = new OASComAdobeCqSocialFilelibraryClient();

        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2));
        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1));
        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties4));
        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties4.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1 = OASComAdobeCqSocialFilelibraryClient.getExample();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2 = new OASComAdobeCqSocialFilelibraryClient();

        System.assertEquals(false, comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1 = OASComAdobeCqSocialFilelibraryClient.getExample();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2 = new OASComAdobeCqSocialFilelibraryClient();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3;

        System.assertEquals(false, comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3));
        System.assertEquals(false, comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1 = OASComAdobeCqSocialFilelibraryClient.getExample();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2 = new OASComAdobeCqSocialFilelibraryClient();

        System.assertEquals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1.hashCode(), comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2.hashCode(), comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1 = OASComAdobeCqSocialFilelibraryClient.getExample();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2 = OASComAdobeCqSocialFilelibraryClient.getExample();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3 = new OASComAdobeCqSocialFilelibraryClient();
        OASComAdobeCqSocialFilelibraryClient comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties4 = new OASComAdobeCqSocialFilelibraryClient();

        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2));
        System.assert(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3.equals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties4));
        System.assertEquals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties1.hashCode(), comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties3.hashCode(), comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties4.hashCode());
    }
}
