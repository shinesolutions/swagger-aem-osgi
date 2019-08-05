@isTest
private class OASComDayCqNotificationImplNotificatTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties1 = OASComDayCqNotificationImplNotificat.getExample();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties2 = comDayCqNotificationImplNotificationServiceImplProperties1;
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties3 = new OASComDayCqNotificationImplNotificat();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties4 = comDayCqNotificationImplNotificationServiceImplProperties3;

        System.assert(comDayCqNotificationImplNotificationServiceImplProperties1.equals(comDayCqNotificationImplNotificationServiceImplProperties2));
        System.assert(comDayCqNotificationImplNotificationServiceImplProperties2.equals(comDayCqNotificationImplNotificationServiceImplProperties1));
        System.assert(comDayCqNotificationImplNotificationServiceImplProperties1.equals(comDayCqNotificationImplNotificationServiceImplProperties1));
        System.assert(comDayCqNotificationImplNotificationServiceImplProperties3.equals(comDayCqNotificationImplNotificationServiceImplProperties4));
        System.assert(comDayCqNotificationImplNotificationServiceImplProperties4.equals(comDayCqNotificationImplNotificationServiceImplProperties3));
        System.assert(comDayCqNotificationImplNotificationServiceImplProperties3.equals(comDayCqNotificationImplNotificationServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties1 = OASComDayCqNotificationImplNotificat.getExample();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties2 = OASComDayCqNotificationImplNotificat.getExample();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties3 = new OASComDayCqNotificationImplNotificat();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties4 = new OASComDayCqNotificationImplNotificat();

        System.assert(comDayCqNotificationImplNotificationServiceImplProperties1.equals(comDayCqNotificationImplNotificationServiceImplProperties2));
        System.assert(comDayCqNotificationImplNotificationServiceImplProperties2.equals(comDayCqNotificationImplNotificationServiceImplProperties1));
        System.assert(comDayCqNotificationImplNotificationServiceImplProperties3.equals(comDayCqNotificationImplNotificationServiceImplProperties4));
        System.assert(comDayCqNotificationImplNotificationServiceImplProperties4.equals(comDayCqNotificationImplNotificationServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties1 = OASComDayCqNotificationImplNotificat.getExample();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties2 = new OASComDayCqNotificationImplNotificat();

        System.assertEquals(false, comDayCqNotificationImplNotificationServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqNotificationImplNotificationServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties1 = OASComDayCqNotificationImplNotificat.getExample();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties2 = new OASComDayCqNotificationImplNotificat();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties3;

        System.assertEquals(false, comDayCqNotificationImplNotificationServiceImplProperties1.equals(comDayCqNotificationImplNotificationServiceImplProperties3));
        System.assertEquals(false, comDayCqNotificationImplNotificationServiceImplProperties2.equals(comDayCqNotificationImplNotificationServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties1 = OASComDayCqNotificationImplNotificat.getExample();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties2 = new OASComDayCqNotificationImplNotificat();

        System.assertEquals(comDayCqNotificationImplNotificationServiceImplProperties1.hashCode(), comDayCqNotificationImplNotificationServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqNotificationImplNotificationServiceImplProperties2.hashCode(), comDayCqNotificationImplNotificationServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties1 = OASComDayCqNotificationImplNotificat.getExample();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties2 = OASComDayCqNotificationImplNotificat.getExample();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties3 = new OASComDayCqNotificationImplNotificat();
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties4 = new OASComDayCqNotificationImplNotificat();

        System.assert(comDayCqNotificationImplNotificationServiceImplProperties1.equals(comDayCqNotificationImplNotificationServiceImplProperties2));
        System.assert(comDayCqNotificationImplNotificationServiceImplProperties3.equals(comDayCqNotificationImplNotificationServiceImplProperties4));
        System.assertEquals(comDayCqNotificationImplNotificationServiceImplProperties1.hashCode(), comDayCqNotificationImplNotificationServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqNotificationImplNotificationServiceImplProperties3.hashCode(), comDayCqNotificationImplNotificationServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqNotificationImplNotificat comDayCqNotificationImplNotificationServiceImplProperties = new OASComDayCqNotificationImplNotificat();
        Map<String, String> propertyMappings = comDayCqNotificationImplNotificationServiceImplProperties.getPropertyMappings();
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
    }
}
