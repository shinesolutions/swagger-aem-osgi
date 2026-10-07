@isTest
private class OASMessagingUserComponentFactoryInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo1 = OASMessagingUserComponentFactoryInfo.getExample();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo2 = messagingUserComponentFactoryInfo1;
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo3 = new OASMessagingUserComponentFactoryInfo();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo4 = messagingUserComponentFactoryInfo3;

        System.assert(messagingUserComponentFactoryInfo1.equals(messagingUserComponentFactoryInfo2));
        System.assert(messagingUserComponentFactoryInfo2.equals(messagingUserComponentFactoryInfo1));
        System.assert(messagingUserComponentFactoryInfo1.equals(messagingUserComponentFactoryInfo1));
        System.assert(messagingUserComponentFactoryInfo3.equals(messagingUserComponentFactoryInfo4));
        System.assert(messagingUserComponentFactoryInfo4.equals(messagingUserComponentFactoryInfo3));
        System.assert(messagingUserComponentFactoryInfo3.equals(messagingUserComponentFactoryInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo1 = OASMessagingUserComponentFactoryInfo.getExample();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo2 = OASMessagingUserComponentFactoryInfo.getExample();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo3 = new OASMessagingUserComponentFactoryInfo();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo4 = new OASMessagingUserComponentFactoryInfo();

        System.assert(messagingUserComponentFactoryInfo1.equals(messagingUserComponentFactoryInfo2));
        System.assert(messagingUserComponentFactoryInfo2.equals(messagingUserComponentFactoryInfo1));
        System.assert(messagingUserComponentFactoryInfo3.equals(messagingUserComponentFactoryInfo4));
        System.assert(messagingUserComponentFactoryInfo4.equals(messagingUserComponentFactoryInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo1 = OASMessagingUserComponentFactoryInfo.getExample();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo2 = new OASMessagingUserComponentFactoryInfo();

        System.assertEquals(false, messagingUserComponentFactoryInfo1.equals('foo'));
        System.assertEquals(false, messagingUserComponentFactoryInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo1 = OASMessagingUserComponentFactoryInfo.getExample();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo2 = new OASMessagingUserComponentFactoryInfo();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo3;

        System.assertEquals(false, messagingUserComponentFactoryInfo1.equals(messagingUserComponentFactoryInfo3));
        System.assertEquals(false, messagingUserComponentFactoryInfo2.equals(messagingUserComponentFactoryInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo1 = OASMessagingUserComponentFactoryInfo.getExample();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo2 = new OASMessagingUserComponentFactoryInfo();

        System.assertEquals(messagingUserComponentFactoryInfo1.hashCode(), messagingUserComponentFactoryInfo1.hashCode());
        System.assertEquals(messagingUserComponentFactoryInfo2.hashCode(), messagingUserComponentFactoryInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo1 = OASMessagingUserComponentFactoryInfo.getExample();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo2 = OASMessagingUserComponentFactoryInfo.getExample();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo3 = new OASMessagingUserComponentFactoryInfo();
        OASMessagingUserComponentFactoryInfo messagingUserComponentFactoryInfo4 = new OASMessagingUserComponentFactoryInfo();

        System.assert(messagingUserComponentFactoryInfo1.equals(messagingUserComponentFactoryInfo2));
        System.assert(messagingUserComponentFactoryInfo3.equals(messagingUserComponentFactoryInfo4));
        System.assertEquals(messagingUserComponentFactoryInfo1.hashCode(), messagingUserComponentFactoryInfo2.hashCode());
        System.assertEquals(messagingUserComponentFactoryInfo3.hashCode(), messagingUserComponentFactoryInfo4.hashCode());
    }
}
