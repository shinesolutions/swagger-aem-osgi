@isTest
private class OASComDayCqDamCoreImplDamEventRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties1 = OASComDayCqDamCoreImplDamEventRecord.getExample();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties2 = comDayCqDamCoreImplDamEventRecorderImplProperties1;
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties3 = new OASComDayCqDamCoreImplDamEventRecord();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties4 = comDayCqDamCoreImplDamEventRecorderImplProperties3;

        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties1.equals(comDayCqDamCoreImplDamEventRecorderImplProperties2));
        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties2.equals(comDayCqDamCoreImplDamEventRecorderImplProperties1));
        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties1.equals(comDayCqDamCoreImplDamEventRecorderImplProperties1));
        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties3.equals(comDayCqDamCoreImplDamEventRecorderImplProperties4));
        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties4.equals(comDayCqDamCoreImplDamEventRecorderImplProperties3));
        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties3.equals(comDayCqDamCoreImplDamEventRecorderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties1 = OASComDayCqDamCoreImplDamEventRecord.getExample();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties2 = OASComDayCqDamCoreImplDamEventRecord.getExample();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties3 = new OASComDayCqDamCoreImplDamEventRecord();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties4 = new OASComDayCqDamCoreImplDamEventRecord();

        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties1.equals(comDayCqDamCoreImplDamEventRecorderImplProperties2));
        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties2.equals(comDayCqDamCoreImplDamEventRecorderImplProperties1));
        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties3.equals(comDayCqDamCoreImplDamEventRecorderImplProperties4));
        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties4.equals(comDayCqDamCoreImplDamEventRecorderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties1 = OASComDayCqDamCoreImplDamEventRecord.getExample();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties2 = new OASComDayCqDamCoreImplDamEventRecord();

        System.assertEquals(false, comDayCqDamCoreImplDamEventRecorderImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplDamEventRecorderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties1 = OASComDayCqDamCoreImplDamEventRecord.getExample();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties2 = new OASComDayCqDamCoreImplDamEventRecord();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties3;

        System.assertEquals(false, comDayCqDamCoreImplDamEventRecorderImplProperties1.equals(comDayCqDamCoreImplDamEventRecorderImplProperties3));
        System.assertEquals(false, comDayCqDamCoreImplDamEventRecorderImplProperties2.equals(comDayCqDamCoreImplDamEventRecorderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties1 = OASComDayCqDamCoreImplDamEventRecord.getExample();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties2 = new OASComDayCqDamCoreImplDamEventRecord();

        System.assertEquals(comDayCqDamCoreImplDamEventRecorderImplProperties1.hashCode(), comDayCqDamCoreImplDamEventRecorderImplProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplDamEventRecorderImplProperties2.hashCode(), comDayCqDamCoreImplDamEventRecorderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties1 = OASComDayCqDamCoreImplDamEventRecord.getExample();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties2 = OASComDayCqDamCoreImplDamEventRecord.getExample();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties3 = new OASComDayCqDamCoreImplDamEventRecord();
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties4 = new OASComDayCqDamCoreImplDamEventRecord();

        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties1.equals(comDayCqDamCoreImplDamEventRecorderImplProperties2));
        System.assert(comDayCqDamCoreImplDamEventRecorderImplProperties3.equals(comDayCqDamCoreImplDamEventRecorderImplProperties4));
        System.assertEquals(comDayCqDamCoreImplDamEventRecorderImplProperties1.hashCode(), comDayCqDamCoreImplDamEventRecorderImplProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplDamEventRecorderImplProperties3.hashCode(), comDayCqDamCoreImplDamEventRecorderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplDamEventRecord comDayCqDamCoreImplDamEventRecorderImplProperties = new OASComDayCqDamCoreImplDamEventRecord();
        Map<String, String> propertyMappings = comDayCqDamCoreImplDamEventRecorderImplProperties.getPropertyMappings();
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
        System.assertEquals('eventQueueLength', propertyMappings.get('event.queue.length'));
        System.assertEquals('eventrecorderEnabled', propertyMappings.get('eventrecorder.enabled'));
        System.assertEquals('eventrecorderBlacklist', propertyMappings.get('eventrecorder.blacklist'));
        System.assertEquals('eventrecorderEventtypes', propertyMappings.get('eventrecorder.eventtypes'));
    }
}
