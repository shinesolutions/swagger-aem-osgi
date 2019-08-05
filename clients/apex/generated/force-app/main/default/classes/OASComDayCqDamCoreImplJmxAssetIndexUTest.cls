@isTest
private class OASComDayCqDamCoreImplJmxAssetIndexUTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1 = OASComDayCqDamCoreImplJmxAssetIndexU.getExample();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2 = comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1;
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3 = new OASComDayCqDamCoreImplJmxAssetIndexU();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties4 = comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3;

        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2));
        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1));
        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1));
        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties4));
        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties4.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3));
        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1 = OASComDayCqDamCoreImplJmxAssetIndexU.getExample();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2 = OASComDayCqDamCoreImplJmxAssetIndexU.getExample();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3 = new OASComDayCqDamCoreImplJmxAssetIndexU();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties4 = new OASComDayCqDamCoreImplJmxAssetIndexU();

        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2));
        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1));
        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties4));
        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties4.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1 = OASComDayCqDamCoreImplJmxAssetIndexU.getExample();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2 = new OASComDayCqDamCoreImplJmxAssetIndexU();

        System.assertEquals(false, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1 = OASComDayCqDamCoreImplJmxAssetIndexU.getExample();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2 = new OASComDayCqDamCoreImplJmxAssetIndexU();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3;

        System.assertEquals(false, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3));
        System.assertEquals(false, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1 = OASComDayCqDamCoreImplJmxAssetIndexU.getExample();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2 = new OASComDayCqDamCoreImplJmxAssetIndexU();

        System.assertEquals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1.hashCode(), comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2.hashCode(), comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1 = OASComDayCqDamCoreImplJmxAssetIndexU.getExample();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2 = OASComDayCqDamCoreImplJmxAssetIndexU.getExample();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3 = new OASComDayCqDamCoreImplJmxAssetIndexU();
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties4 = new OASComDayCqDamCoreImplJmxAssetIndexU();

        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2));
        System.assert(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3.equals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties4));
        System.assertEquals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties1.hashCode(), comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties3.hashCode(), comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplJmxAssetIndexU comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties = new OASComDayCqDamCoreImplJmxAssetIndexU();
        Map<String, String> propertyMappings = comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.getPropertyMappings();
        System.assertEquals('jmxObjectname', propertyMappings.get('jmx.objectname'));
        System.assertEquals('propertyMeasureEnabled', propertyMappings.get('property.measure.enabled'));
        System.assertEquals('propertyName', propertyMappings.get('property.name'));
        System.assertEquals('propertyMaxWaitMs', propertyMappings.get('property.max.wait.ms'));
        System.assertEquals('propertyMaxRate', propertyMappings.get('property.max.rate'));
        System.assertEquals('fulltextMeasureEnabled', propertyMappings.get('fulltext.measure.enabled'));
        System.assertEquals('fulltextName', propertyMappings.get('fulltext.name'));
        System.assertEquals('fulltextMaxWaitMs', propertyMappings.get('fulltext.max.wait.ms'));
        System.assertEquals('fulltextMaxRate', propertyMappings.get('fulltext.max.rate'));
    }
}
