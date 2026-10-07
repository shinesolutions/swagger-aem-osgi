@isTest
private class OASComAdobeCqSocialUgcbaseDispatcherTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1 = OASComAdobeCqSocialUgcbaseDispatcher.getExample();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2 = comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1;
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3 = new OASComAdobeCqSocialUgcbaseDispatcher();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties4 = comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3;

        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties4.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3));
        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1 = OASComAdobeCqSocialUgcbaseDispatcher.getExample();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2 = OASComAdobeCqSocialUgcbaseDispatcher.getExample();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3 = new OASComAdobeCqSocialUgcbaseDispatcher();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties4 = new OASComAdobeCqSocialUgcbaseDispatcher();

        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties4.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1 = OASComAdobeCqSocialUgcbaseDispatcher.getExample();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2 = new OASComAdobeCqSocialUgcbaseDispatcher();

        System.assertEquals(false, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1 = OASComAdobeCqSocialUgcbaseDispatcher.getExample();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2 = new OASComAdobeCqSocialUgcbaseDispatcher();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3;

        System.assertEquals(false, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3));
        System.assertEquals(false, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1 = OASComAdobeCqSocialUgcbaseDispatcher.getExample();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2 = new OASComAdobeCqSocialUgcbaseDispatcher();

        System.assertEquals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1.hashCode(), comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2.hashCode(), comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1 = OASComAdobeCqSocialUgcbaseDispatcher.getExample();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2 = OASComAdobeCqSocialUgcbaseDispatcher.getExample();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3 = new OASComAdobeCqSocialUgcbaseDispatcher();
        OASComAdobeCqSocialUgcbaseDispatcher comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties4 = new OASComAdobeCqSocialUgcbaseDispatcher();

        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3.equals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties4));
        System.assertEquals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties1.hashCode(), comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties3.hashCode(), comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties4.hashCode());
    }
}
