@isTest
private class OASComDayCqDamCoreImplServletAssetStTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties1 = OASComDayCqDamCoreImplServletAssetSt.getExample();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties2 = comDayCqDamCoreImplServletAssetStatusServletProperties1;
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties3 = new OASComDayCqDamCoreImplServletAssetSt();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties4 = comDayCqDamCoreImplServletAssetStatusServletProperties3;

        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties1.equals(comDayCqDamCoreImplServletAssetStatusServletProperties2));
        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties2.equals(comDayCqDamCoreImplServletAssetStatusServletProperties1));
        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties1.equals(comDayCqDamCoreImplServletAssetStatusServletProperties1));
        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties3.equals(comDayCqDamCoreImplServletAssetStatusServletProperties4));
        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties4.equals(comDayCqDamCoreImplServletAssetStatusServletProperties3));
        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties3.equals(comDayCqDamCoreImplServletAssetStatusServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties1 = OASComDayCqDamCoreImplServletAssetSt.getExample();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties2 = OASComDayCqDamCoreImplServletAssetSt.getExample();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties3 = new OASComDayCqDamCoreImplServletAssetSt();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties4 = new OASComDayCqDamCoreImplServletAssetSt();

        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties1.equals(comDayCqDamCoreImplServletAssetStatusServletProperties2));
        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties2.equals(comDayCqDamCoreImplServletAssetStatusServletProperties1));
        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties3.equals(comDayCqDamCoreImplServletAssetStatusServletProperties4));
        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties4.equals(comDayCqDamCoreImplServletAssetStatusServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties1 = OASComDayCqDamCoreImplServletAssetSt.getExample();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties2 = new OASComDayCqDamCoreImplServletAssetSt();

        System.assertEquals(false, comDayCqDamCoreImplServletAssetStatusServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletAssetStatusServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties1 = OASComDayCqDamCoreImplServletAssetSt.getExample();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties2 = new OASComDayCqDamCoreImplServletAssetSt();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletAssetStatusServletProperties1.equals(comDayCqDamCoreImplServletAssetStatusServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletAssetStatusServletProperties2.equals(comDayCqDamCoreImplServletAssetStatusServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties1 = OASComDayCqDamCoreImplServletAssetSt.getExample();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties2 = new OASComDayCqDamCoreImplServletAssetSt();

        System.assertEquals(comDayCqDamCoreImplServletAssetStatusServletProperties1.hashCode(), comDayCqDamCoreImplServletAssetStatusServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletAssetStatusServletProperties2.hashCode(), comDayCqDamCoreImplServletAssetStatusServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties1 = OASComDayCqDamCoreImplServletAssetSt.getExample();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties2 = OASComDayCqDamCoreImplServletAssetSt.getExample();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties3 = new OASComDayCqDamCoreImplServletAssetSt();
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties4 = new OASComDayCqDamCoreImplServletAssetSt();

        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties1.equals(comDayCqDamCoreImplServletAssetStatusServletProperties2));
        System.assert(comDayCqDamCoreImplServletAssetStatusServletProperties3.equals(comDayCqDamCoreImplServletAssetStatusServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletAssetStatusServletProperties1.hashCode(), comDayCqDamCoreImplServletAssetStatusServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletAssetStatusServletProperties3.hashCode(), comDayCqDamCoreImplServletAssetStatusServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletAssetSt comDayCqDamCoreImplServletAssetStatusServletProperties = new OASComDayCqDamCoreImplServletAssetSt();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletAssetStatusServletProperties.getPropertyMappings();
        System.assertEquals('cqDamBatchStatusMaxassets', propertyMappings.get('cq.dam.batch.status.maxassets'));
    }
}
