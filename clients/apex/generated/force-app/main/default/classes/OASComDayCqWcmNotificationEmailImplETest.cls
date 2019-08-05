@isTest
private class OASComDayCqWcmNotificationEmailImplETest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties1 = OASComDayCqWcmNotificationEmailImplE.getExample();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties2 = comDayCqWcmNotificationEmailImplEmailChannelProperties1;
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties3 = new OASComDayCqWcmNotificationEmailImplE();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties4 = comDayCqWcmNotificationEmailImplEmailChannelProperties3;

        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties1.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties2));
        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties2.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties1));
        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties1.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties1));
        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties3.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties4));
        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties4.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties3));
        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties3.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties1 = OASComDayCqWcmNotificationEmailImplE.getExample();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties2 = OASComDayCqWcmNotificationEmailImplE.getExample();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties3 = new OASComDayCqWcmNotificationEmailImplE();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties4 = new OASComDayCqWcmNotificationEmailImplE();

        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties1.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties2));
        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties2.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties1));
        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties3.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties4));
        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties4.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties1 = OASComDayCqWcmNotificationEmailImplE.getExample();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties2 = new OASComDayCqWcmNotificationEmailImplE();

        System.assertEquals(false, comDayCqWcmNotificationEmailImplEmailChannelProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmNotificationEmailImplEmailChannelProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties1 = OASComDayCqWcmNotificationEmailImplE.getExample();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties2 = new OASComDayCqWcmNotificationEmailImplE();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties3;

        System.assertEquals(false, comDayCqWcmNotificationEmailImplEmailChannelProperties1.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties3));
        System.assertEquals(false, comDayCqWcmNotificationEmailImplEmailChannelProperties2.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties1 = OASComDayCqWcmNotificationEmailImplE.getExample();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties2 = new OASComDayCqWcmNotificationEmailImplE();

        System.assertEquals(comDayCqWcmNotificationEmailImplEmailChannelProperties1.hashCode(), comDayCqWcmNotificationEmailImplEmailChannelProperties1.hashCode());
        System.assertEquals(comDayCqWcmNotificationEmailImplEmailChannelProperties2.hashCode(), comDayCqWcmNotificationEmailImplEmailChannelProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties1 = OASComDayCqWcmNotificationEmailImplE.getExample();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties2 = OASComDayCqWcmNotificationEmailImplE.getExample();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties3 = new OASComDayCqWcmNotificationEmailImplE();
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties4 = new OASComDayCqWcmNotificationEmailImplE();

        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties1.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties2));
        System.assert(comDayCqWcmNotificationEmailImplEmailChannelProperties3.equals(comDayCqWcmNotificationEmailImplEmailChannelProperties4));
        System.assertEquals(comDayCqWcmNotificationEmailImplEmailChannelProperties1.hashCode(), comDayCqWcmNotificationEmailImplEmailChannelProperties2.hashCode());
        System.assertEquals(comDayCqWcmNotificationEmailImplEmailChannelProperties3.hashCode(), comDayCqWcmNotificationEmailImplEmailChannelProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmNotificationEmailImplE comDayCqWcmNotificationEmailImplEmailChannelProperties = new OASComDayCqWcmNotificationEmailImplE();
        Map<String, String> propertyMappings = comDayCqWcmNotificationEmailImplEmailChannelProperties.getPropertyMappings();
        System.assertEquals('emailFrom', propertyMappings.get('email.from'));
    }
}
