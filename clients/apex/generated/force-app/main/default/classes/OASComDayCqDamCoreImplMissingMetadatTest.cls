@isTest
private class OASComDayCqDamCoreImplMissingMetadatTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties1 = OASComDayCqDamCoreImplMissingMetadat.getExample();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties2 = comDayCqDamCoreImplMissingMetadataNotificationJobProperties1;
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties3 = new OASComDayCqDamCoreImplMissingMetadat();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties4 = comDayCqDamCoreImplMissingMetadataNotificationJobProperties3;

        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties1.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties2));
        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties2.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties1));
        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties1.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties1));
        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties4));
        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties4.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3));
        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties1 = OASComDayCqDamCoreImplMissingMetadat.getExample();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties2 = OASComDayCqDamCoreImplMissingMetadat.getExample();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties3 = new OASComDayCqDamCoreImplMissingMetadat();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties4 = new OASComDayCqDamCoreImplMissingMetadat();

        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties1.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties2));
        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties2.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties1));
        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties4));
        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties4.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties1 = OASComDayCqDamCoreImplMissingMetadat.getExample();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties2 = new OASComDayCqDamCoreImplMissingMetadat();

        System.assertEquals(false, comDayCqDamCoreImplMissingMetadataNotificationJobProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplMissingMetadataNotificationJobProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties1 = OASComDayCqDamCoreImplMissingMetadat.getExample();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties2 = new OASComDayCqDamCoreImplMissingMetadat();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties3;

        System.assertEquals(false, comDayCqDamCoreImplMissingMetadataNotificationJobProperties1.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3));
        System.assertEquals(false, comDayCqDamCoreImplMissingMetadataNotificationJobProperties2.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties1 = OASComDayCqDamCoreImplMissingMetadat.getExample();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties2 = new OASComDayCqDamCoreImplMissingMetadat();

        System.assertEquals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties1.hashCode(), comDayCqDamCoreImplMissingMetadataNotificationJobProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties2.hashCode(), comDayCqDamCoreImplMissingMetadataNotificationJobProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties1 = OASComDayCqDamCoreImplMissingMetadat.getExample();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties2 = OASComDayCqDamCoreImplMissingMetadat.getExample();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties3 = new OASComDayCqDamCoreImplMissingMetadat();
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties4 = new OASComDayCqDamCoreImplMissingMetadat();

        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties1.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties2));
        System.assert(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3.equals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties4));
        System.assertEquals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties1.hashCode(), comDayCqDamCoreImplMissingMetadataNotificationJobProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplMissingMetadataNotificationJobProperties3.hashCode(), comDayCqDamCoreImplMissingMetadataNotificationJobProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplMissingMetadat comDayCqDamCoreImplMissingMetadataNotificationJobProperties = new OASComDayCqDamCoreImplMissingMetadat();
        Map<String, String> propertyMappings = comDayCqDamCoreImplMissingMetadataNotificationJobProperties.getPropertyMappings();
        System.assertEquals('cqDamMissingmetadataNotificationSchedulerIstimebased', propertyMappings.get('cq.dam.missingmetadata.notification.scheduler.istimebased'));
        System.assertEquals('cqDamMissingmetadataNotificationSchedulerTimebasedRule', propertyMappings.get('cq.dam.missingmetadata.notification.scheduler.timebased.rule'));
        System.assertEquals('cqDamMissingmetadataNotificationSchedulerPeriodRule', propertyMappings.get('cq.dam.missingmetadata.notification.scheduler.period.rule'));
        System.assertEquals('cqDamMissingmetadataNotificationRecipient', propertyMappings.get('cq.dam.missingmetadata.notification.recipient'));
    }
}
