@isTest
private class OASComDayCqWcmNotificationImplNotifiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties1 = OASComDayCqWcmNotificationImplNotifi.getExample();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties2 = comDayCqWcmNotificationImplNotificationManagerImplProperties1;
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties3 = new OASComDayCqWcmNotificationImplNotifi();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties4 = comDayCqWcmNotificationImplNotificationManagerImplProperties3;

        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties1.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties2));
        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties2.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties1));
        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties1.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties1));
        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties3.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties4));
        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties4.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties3));
        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties3.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties1 = OASComDayCqWcmNotificationImplNotifi.getExample();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties2 = OASComDayCqWcmNotificationImplNotifi.getExample();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties3 = new OASComDayCqWcmNotificationImplNotifi();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties4 = new OASComDayCqWcmNotificationImplNotifi();

        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties1.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties2));
        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties2.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties1));
        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties3.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties4));
        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties4.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties1 = OASComDayCqWcmNotificationImplNotifi.getExample();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties2 = new OASComDayCqWcmNotificationImplNotifi();

        System.assertEquals(false, comDayCqWcmNotificationImplNotificationManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmNotificationImplNotificationManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties1 = OASComDayCqWcmNotificationImplNotifi.getExample();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties2 = new OASComDayCqWcmNotificationImplNotifi();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties3;

        System.assertEquals(false, comDayCqWcmNotificationImplNotificationManagerImplProperties1.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties3));
        System.assertEquals(false, comDayCqWcmNotificationImplNotificationManagerImplProperties2.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties1 = OASComDayCqWcmNotificationImplNotifi.getExample();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties2 = new OASComDayCqWcmNotificationImplNotifi();

        System.assertEquals(comDayCqWcmNotificationImplNotificationManagerImplProperties1.hashCode(), comDayCqWcmNotificationImplNotificationManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmNotificationImplNotificationManagerImplProperties2.hashCode(), comDayCqWcmNotificationImplNotificationManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties1 = OASComDayCqWcmNotificationImplNotifi.getExample();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties2 = OASComDayCqWcmNotificationImplNotifi.getExample();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties3 = new OASComDayCqWcmNotificationImplNotifi();
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties4 = new OASComDayCqWcmNotificationImplNotifi();

        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties1.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties2));
        System.assert(comDayCqWcmNotificationImplNotificationManagerImplProperties3.equals(comDayCqWcmNotificationImplNotificationManagerImplProperties4));
        System.assertEquals(comDayCqWcmNotificationImplNotificationManagerImplProperties1.hashCode(), comDayCqWcmNotificationImplNotificationManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmNotificationImplNotificationManagerImplProperties3.hashCode(), comDayCqWcmNotificationImplNotificationManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmNotificationImplNotifi comDayCqWcmNotificationImplNotificationManagerImplProperties = new OASComDayCqWcmNotificationImplNotifi();
        Map<String, String> propertyMappings = comDayCqWcmNotificationImplNotificationManagerImplProperties.getPropertyMappings();
        System.assertEquals('eventTopics', propertyMappings.get('event.topics'));
    }
}
