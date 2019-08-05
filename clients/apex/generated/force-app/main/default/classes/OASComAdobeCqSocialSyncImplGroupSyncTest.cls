@isTest
private class OASComAdobeCqSocialSyncImplGroupSyncTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplGroupSync.getExample();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2 = comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1;
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3 = new OASComAdobeCqSocialSyncImplGroupSync();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties4 = comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3;

        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2));
        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1));
        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1));
        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties4));
        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties4.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3));
        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplGroupSync.getExample();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2 = OASComAdobeCqSocialSyncImplGroupSync.getExample();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3 = new OASComAdobeCqSocialSyncImplGroupSync();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties4 = new OASComAdobeCqSocialSyncImplGroupSync();

        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2));
        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1));
        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties4));
        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties4.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplGroupSync.getExample();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2 = new OASComAdobeCqSocialSyncImplGroupSync();

        System.assertEquals(false, comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplGroupSync.getExample();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2 = new OASComAdobeCqSocialSyncImplGroupSync();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3;

        System.assertEquals(false, comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3));
        System.assertEquals(false, comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplGroupSync.getExample();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2 = new OASComAdobeCqSocialSyncImplGroupSync();

        System.assertEquals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1.hashCode(), comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2.hashCode(), comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1 = OASComAdobeCqSocialSyncImplGroupSync.getExample();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2 = OASComAdobeCqSocialSyncImplGroupSync.getExample();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3 = new OASComAdobeCqSocialSyncImplGroupSync();
        OASComAdobeCqSocialSyncImplGroupSync comAdobeCqSocialSyncImplGroupSyncListenerImplProperties4 = new OASComAdobeCqSocialSyncImplGroupSync();

        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2));
        System.assert(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3.equals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties4));
        System.assertEquals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties1.hashCode(), comAdobeCqSocialSyncImplGroupSyncListenerImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialSyncImplGroupSyncListenerImplProperties3.hashCode(), comAdobeCqSocialSyncImplGroupSyncListenerImplProperties4.hashCode());
    }
}
