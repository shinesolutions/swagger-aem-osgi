@isTest
private class OASComDayCqDamCoreImplJmxAssetUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1 = OASComDayCqDamCoreImplJmxAssetUpdate.getExample();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2 = comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1;
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3 = new OASComDayCqDamCoreImplJmxAssetUpdate();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties4 = comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3;

        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2));
        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1));
        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1));
        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties4));
        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties4.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3));
        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1 = OASComDayCqDamCoreImplJmxAssetUpdate.getExample();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2 = OASComDayCqDamCoreImplJmxAssetUpdate.getExample();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3 = new OASComDayCqDamCoreImplJmxAssetUpdate();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties4 = new OASComDayCqDamCoreImplJmxAssetUpdate();

        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2));
        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1));
        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties4));
        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties4.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1 = OASComDayCqDamCoreImplJmxAssetUpdate.getExample();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2 = new OASComDayCqDamCoreImplJmxAssetUpdate();

        System.assertEquals(false, comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1 = OASComDayCqDamCoreImplJmxAssetUpdate.getExample();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2 = new OASComDayCqDamCoreImplJmxAssetUpdate();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3;

        System.assertEquals(false, comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3));
        System.assertEquals(false, comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1 = OASComDayCqDamCoreImplJmxAssetUpdate.getExample();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2 = new OASComDayCqDamCoreImplJmxAssetUpdate();

        System.assertEquals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1.hashCode(), comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2.hashCode(), comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1 = OASComDayCqDamCoreImplJmxAssetUpdate.getExample();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2 = OASComDayCqDamCoreImplJmxAssetUpdate.getExample();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3 = new OASComDayCqDamCoreImplJmxAssetUpdate();
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties4 = new OASComDayCqDamCoreImplJmxAssetUpdate();

        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2));
        System.assert(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3.equals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties4));
        System.assertEquals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties1.hashCode(), comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties3.hashCode(), comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplJmxAssetUpdate comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties = new OASComDayCqDamCoreImplJmxAssetUpdate();
        Map<String, String> propertyMappings = comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.getPropertyMappings();
        System.assertEquals('jmxObjectname', propertyMappings.get('jmx.objectname'));
    }
}
