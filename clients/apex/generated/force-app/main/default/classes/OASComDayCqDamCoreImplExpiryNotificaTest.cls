@isTest
private class OASComDayCqDamCoreImplExpiryNotificaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties1 = OASComDayCqDamCoreImplExpiryNotifica.getExample();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties2 = comDayCqDamCoreImplExpiryNotificationJobImplProperties1;
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties3 = new OASComDayCqDamCoreImplExpiryNotifica();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties4 = comDayCqDamCoreImplExpiryNotificationJobImplProperties3;

        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties1.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties2));
        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties2.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties1));
        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties1.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties1));
        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties3.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties4));
        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties4.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties3));
        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties3.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties1 = OASComDayCqDamCoreImplExpiryNotifica.getExample();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties2 = OASComDayCqDamCoreImplExpiryNotifica.getExample();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties3 = new OASComDayCqDamCoreImplExpiryNotifica();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties4 = new OASComDayCqDamCoreImplExpiryNotifica();

        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties1.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties2));
        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties2.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties1));
        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties3.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties4));
        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties4.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties1 = OASComDayCqDamCoreImplExpiryNotifica.getExample();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties2 = new OASComDayCqDamCoreImplExpiryNotifica();

        System.assertEquals(false, comDayCqDamCoreImplExpiryNotificationJobImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplExpiryNotificationJobImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties1 = OASComDayCqDamCoreImplExpiryNotifica.getExample();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties2 = new OASComDayCqDamCoreImplExpiryNotifica();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties3;

        System.assertEquals(false, comDayCqDamCoreImplExpiryNotificationJobImplProperties1.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties3));
        System.assertEquals(false, comDayCqDamCoreImplExpiryNotificationJobImplProperties2.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties1 = OASComDayCqDamCoreImplExpiryNotifica.getExample();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties2 = new OASComDayCqDamCoreImplExpiryNotifica();

        System.assertEquals(comDayCqDamCoreImplExpiryNotificationJobImplProperties1.hashCode(), comDayCqDamCoreImplExpiryNotificationJobImplProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplExpiryNotificationJobImplProperties2.hashCode(), comDayCqDamCoreImplExpiryNotificationJobImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties1 = OASComDayCqDamCoreImplExpiryNotifica.getExample();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties2 = OASComDayCqDamCoreImplExpiryNotifica.getExample();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties3 = new OASComDayCqDamCoreImplExpiryNotifica();
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties4 = new OASComDayCqDamCoreImplExpiryNotifica();

        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties1.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties2));
        System.assert(comDayCqDamCoreImplExpiryNotificationJobImplProperties3.equals(comDayCqDamCoreImplExpiryNotificationJobImplProperties4));
        System.assertEquals(comDayCqDamCoreImplExpiryNotificationJobImplProperties1.hashCode(), comDayCqDamCoreImplExpiryNotificationJobImplProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplExpiryNotificationJobImplProperties3.hashCode(), comDayCqDamCoreImplExpiryNotificationJobImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplExpiryNotifica comDayCqDamCoreImplExpiryNotificationJobImplProperties = new OASComDayCqDamCoreImplExpiryNotifica();
        Map<String, String> propertyMappings = comDayCqDamCoreImplExpiryNotificationJobImplProperties.getPropertyMappings();
        System.assertEquals('cqDamExpiryNotificationSchedulerIstimebased', propertyMappings.get('cq.dam.expiry.notification.scheduler.istimebased'));
        System.assertEquals('cqDamExpiryNotificationSchedulerTimebasedRule', propertyMappings.get('cq.dam.expiry.notification.scheduler.timebased.rule'));
        System.assertEquals('cqDamExpiryNotificationSchedulerPeriodRule', propertyMappings.get('cq.dam.expiry.notification.scheduler.period.rule'));
        System.assertEquals('sendEmail', propertyMappings.get('send_email'));
        System.assertEquals('assetExpiredLimit', propertyMappings.get('asset_expired_limit'));
        System.assertEquals('priorNotificationSeconds', propertyMappings.get('prior_notification_seconds'));
        System.assertEquals('cqDamExpiryNotificationUrlProtocol', propertyMappings.get('cq.dam.expiry.notification.url.protocol'));
    }
}
