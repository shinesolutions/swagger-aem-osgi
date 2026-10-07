@isTest
private class OASMessagingUserComponentFactoryPropTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties1 = OASMessagingUserComponentFactoryProp.getExample();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties2 = messagingUserComponentFactoryProperties1;
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties3 = new OASMessagingUserComponentFactoryProp();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties4 = messagingUserComponentFactoryProperties3;

        System.assert(messagingUserComponentFactoryProperties1.equals(messagingUserComponentFactoryProperties2));
        System.assert(messagingUserComponentFactoryProperties2.equals(messagingUserComponentFactoryProperties1));
        System.assert(messagingUserComponentFactoryProperties1.equals(messagingUserComponentFactoryProperties1));
        System.assert(messagingUserComponentFactoryProperties3.equals(messagingUserComponentFactoryProperties4));
        System.assert(messagingUserComponentFactoryProperties4.equals(messagingUserComponentFactoryProperties3));
        System.assert(messagingUserComponentFactoryProperties3.equals(messagingUserComponentFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties1 = OASMessagingUserComponentFactoryProp.getExample();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties2 = OASMessagingUserComponentFactoryProp.getExample();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties3 = new OASMessagingUserComponentFactoryProp();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties4 = new OASMessagingUserComponentFactoryProp();

        System.assert(messagingUserComponentFactoryProperties1.equals(messagingUserComponentFactoryProperties2));
        System.assert(messagingUserComponentFactoryProperties2.equals(messagingUserComponentFactoryProperties1));
        System.assert(messagingUserComponentFactoryProperties3.equals(messagingUserComponentFactoryProperties4));
        System.assert(messagingUserComponentFactoryProperties4.equals(messagingUserComponentFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties1 = OASMessagingUserComponentFactoryProp.getExample();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties2 = new OASMessagingUserComponentFactoryProp();

        System.assertEquals(false, messagingUserComponentFactoryProperties1.equals('foo'));
        System.assertEquals(false, messagingUserComponentFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties1 = OASMessagingUserComponentFactoryProp.getExample();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties2 = new OASMessagingUserComponentFactoryProp();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties3;

        System.assertEquals(false, messagingUserComponentFactoryProperties1.equals(messagingUserComponentFactoryProperties3));
        System.assertEquals(false, messagingUserComponentFactoryProperties2.equals(messagingUserComponentFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties1 = OASMessagingUserComponentFactoryProp.getExample();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties2 = new OASMessagingUserComponentFactoryProp();

        System.assertEquals(messagingUserComponentFactoryProperties1.hashCode(), messagingUserComponentFactoryProperties1.hashCode());
        System.assertEquals(messagingUserComponentFactoryProperties2.hashCode(), messagingUserComponentFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties1 = OASMessagingUserComponentFactoryProp.getExample();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties2 = OASMessagingUserComponentFactoryProp.getExample();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties3 = new OASMessagingUserComponentFactoryProp();
        OASMessagingUserComponentFactoryProp messagingUserComponentFactoryProperties4 = new OASMessagingUserComponentFactoryProp();

        System.assert(messagingUserComponentFactoryProperties1.equals(messagingUserComponentFactoryProperties2));
        System.assert(messagingUserComponentFactoryProperties3.equals(messagingUserComponentFactoryProperties4));
        System.assertEquals(messagingUserComponentFactoryProperties1.hashCode(), messagingUserComponentFactoryProperties2.hashCode());
        System.assertEquals(messagingUserComponentFactoryProperties3.hashCode(), messagingUserComponentFactoryProperties4.hashCode());
    }
}
