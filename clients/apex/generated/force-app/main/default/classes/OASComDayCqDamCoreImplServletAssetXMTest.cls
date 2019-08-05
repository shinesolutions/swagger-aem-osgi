@isTest
private class OASComDayCqDamCoreImplServletAssetXMTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties1 = OASComDayCqDamCoreImplServletAssetXM.getExample();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties2 = comDayCqDamCoreImplServletAssetXMPSearchServletProperties1;
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties3 = new OASComDayCqDamCoreImplServletAssetXM();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties4 = comDayCqDamCoreImplServletAssetXMPSearchServletProperties3;

        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties1.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties2));
        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties2.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties1));
        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties1.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties1));
        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties4));
        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties4.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3));
        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties1 = OASComDayCqDamCoreImplServletAssetXM.getExample();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties2 = OASComDayCqDamCoreImplServletAssetXM.getExample();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties3 = new OASComDayCqDamCoreImplServletAssetXM();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties4 = new OASComDayCqDamCoreImplServletAssetXM();

        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties1.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties2));
        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties2.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties1));
        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties4));
        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties4.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties1 = OASComDayCqDamCoreImplServletAssetXM.getExample();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties2 = new OASComDayCqDamCoreImplServletAssetXM();

        System.assertEquals(false, comDayCqDamCoreImplServletAssetXMPSearchServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletAssetXMPSearchServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties1 = OASComDayCqDamCoreImplServletAssetXM.getExample();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties2 = new OASComDayCqDamCoreImplServletAssetXM();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletAssetXMPSearchServletProperties1.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletAssetXMPSearchServletProperties2.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties1 = OASComDayCqDamCoreImplServletAssetXM.getExample();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties2 = new OASComDayCqDamCoreImplServletAssetXM();

        System.assertEquals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties1.hashCode(), comDayCqDamCoreImplServletAssetXMPSearchServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties2.hashCode(), comDayCqDamCoreImplServletAssetXMPSearchServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties1 = OASComDayCqDamCoreImplServletAssetXM.getExample();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties2 = OASComDayCqDamCoreImplServletAssetXM.getExample();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties3 = new OASComDayCqDamCoreImplServletAssetXM();
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties4 = new OASComDayCqDamCoreImplServletAssetXM();

        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties1.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties2));
        System.assert(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3.equals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties1.hashCode(), comDayCqDamCoreImplServletAssetXMPSearchServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletAssetXMPSearchServletProperties3.hashCode(), comDayCqDamCoreImplServletAssetXMPSearchServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletAssetXM comDayCqDamCoreImplServletAssetXMPSearchServletProperties = new OASComDayCqDamCoreImplServletAssetXM();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletAssetXMPSearchServletProperties.getPropertyMappings();
        System.assertEquals('cqDamBatchIndesignMaxassets', propertyMappings.get('cq.dam.batch.indesign.maxassets'));
    }
}
