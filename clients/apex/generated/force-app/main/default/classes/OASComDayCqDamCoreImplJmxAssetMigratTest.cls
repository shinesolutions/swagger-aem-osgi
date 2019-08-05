@isTest
private class OASComDayCqDamCoreImplJmxAssetMigratTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1 = OASComDayCqDamCoreImplJmxAssetMigrat.getExample();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2 = comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1;
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3 = new OASComDayCqDamCoreImplJmxAssetMigrat();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties4 = comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3;

        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2));
        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1));
        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1));
        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties4));
        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties4.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3));
        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1 = OASComDayCqDamCoreImplJmxAssetMigrat.getExample();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2 = OASComDayCqDamCoreImplJmxAssetMigrat.getExample();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3 = new OASComDayCqDamCoreImplJmxAssetMigrat();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties4 = new OASComDayCqDamCoreImplJmxAssetMigrat();

        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2));
        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1));
        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties4));
        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties4.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1 = OASComDayCqDamCoreImplJmxAssetMigrat.getExample();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2 = new OASComDayCqDamCoreImplJmxAssetMigrat();

        System.assertEquals(false, comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1 = OASComDayCqDamCoreImplJmxAssetMigrat.getExample();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2 = new OASComDayCqDamCoreImplJmxAssetMigrat();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3;

        System.assertEquals(false, comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3));
        System.assertEquals(false, comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1 = OASComDayCqDamCoreImplJmxAssetMigrat.getExample();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2 = new OASComDayCqDamCoreImplJmxAssetMigrat();

        System.assertEquals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1.hashCode(), comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2.hashCode(), comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1 = OASComDayCqDamCoreImplJmxAssetMigrat.getExample();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2 = OASComDayCqDamCoreImplJmxAssetMigrat.getExample();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3 = new OASComDayCqDamCoreImplJmxAssetMigrat();
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties4 = new OASComDayCqDamCoreImplJmxAssetMigrat();

        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2));
        System.assert(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3.equals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties4));
        System.assertEquals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties1.hashCode(), comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties3.hashCode(), comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplJmxAssetMigrat comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties = new OASComDayCqDamCoreImplJmxAssetMigrat();
        Map<String, String> propertyMappings = comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.getPropertyMappings();
        System.assertEquals('jmxObjectname', propertyMappings.get('jmx.objectname'));
    }
}
