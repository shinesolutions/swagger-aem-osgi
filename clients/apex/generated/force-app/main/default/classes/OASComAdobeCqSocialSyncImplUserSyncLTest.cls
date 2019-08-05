@isTest
private class OASComAdobeCqSocialSyncImplUserSyncLTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplUserSyncL.getExample();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties2 = comAdobeCqSocialSyncImplUserSyncListenerImplProperties1;
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties3 = new OASComAdobeCqSocialSyncImplUserSyncL();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties4 = comAdobeCqSocialSyncImplUserSyncListenerImplProperties3;

        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties2));
        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties2.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties1));
        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties1));
        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties4));
        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties4.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3));
        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplUserSyncL.getExample();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties2 = OASComAdobeCqSocialSyncImplUserSyncL.getExample();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties3 = new OASComAdobeCqSocialSyncImplUserSyncL();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties4 = new OASComAdobeCqSocialSyncImplUserSyncL();

        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties2));
        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties2.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties1));
        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties4));
        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties4.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplUserSyncL.getExample();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties2 = new OASComAdobeCqSocialSyncImplUserSyncL();

        System.assertEquals(false, comAdobeCqSocialSyncImplUserSyncListenerImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialSyncImplUserSyncListenerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplUserSyncL.getExample();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties2 = new OASComAdobeCqSocialSyncImplUserSyncL();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties3;

        System.assertEquals(false, comAdobeCqSocialSyncImplUserSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3));
        System.assertEquals(false, comAdobeCqSocialSyncImplUserSyncListenerImplProperties2.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplUserSyncL.getExample();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties2 = new OASComAdobeCqSocialSyncImplUserSyncL();

        System.assertEquals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties1.hashCode(), comAdobeCqSocialSyncImplUserSyncListenerImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties2.hashCode(), comAdobeCqSocialSyncImplUserSyncListenerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplUserSyncL.getExample();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties2 = OASComAdobeCqSocialSyncImplUserSyncL.getExample();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties3 = new OASComAdobeCqSocialSyncImplUserSyncL();
        OASComAdobeCqSocialSyncImplUserSyncL comAdobeCqSocialSyncImplUserSyncListenerImplProperties4 = new OASComAdobeCqSocialSyncImplUserSyncL();

        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties2));
        System.assert(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3.equals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties4));
        System.assertEquals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties1.hashCode(), comAdobeCqSocialSyncImplUserSyncListenerImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialSyncImplUserSyncListenerImplProperties3.hashCode(), comAdobeCqSocialSyncImplUserSyncListenerImplProperties4.hashCode());
    }
}
