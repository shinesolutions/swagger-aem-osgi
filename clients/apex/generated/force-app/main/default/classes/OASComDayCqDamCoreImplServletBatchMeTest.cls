@isTest
private class OASComDayCqDamCoreImplServletBatchMeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties1 = OASComDayCqDamCoreImplServletBatchMe.getExample();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties2 = comDayCqDamCoreImplServletBatchMetadataServletProperties1;
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties3 = new OASComDayCqDamCoreImplServletBatchMe();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties4 = comDayCqDamCoreImplServletBatchMetadataServletProperties3;

        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties1.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties2));
        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties2.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties1));
        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties1.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties1));
        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties3.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties4));
        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties4.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties3));
        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties3.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties1 = OASComDayCqDamCoreImplServletBatchMe.getExample();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties2 = OASComDayCqDamCoreImplServletBatchMe.getExample();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties3 = new OASComDayCqDamCoreImplServletBatchMe();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties4 = new OASComDayCqDamCoreImplServletBatchMe();

        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties1.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties2));
        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties2.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties1));
        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties3.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties4));
        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties4.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties1 = OASComDayCqDamCoreImplServletBatchMe.getExample();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties2 = new OASComDayCqDamCoreImplServletBatchMe();

        System.assertEquals(false, comDayCqDamCoreImplServletBatchMetadataServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletBatchMetadataServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties1 = OASComDayCqDamCoreImplServletBatchMe.getExample();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties2 = new OASComDayCqDamCoreImplServletBatchMe();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletBatchMetadataServletProperties1.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletBatchMetadataServletProperties2.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties1 = OASComDayCqDamCoreImplServletBatchMe.getExample();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties2 = new OASComDayCqDamCoreImplServletBatchMe();

        System.assertEquals(comDayCqDamCoreImplServletBatchMetadataServletProperties1.hashCode(), comDayCqDamCoreImplServletBatchMetadataServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletBatchMetadataServletProperties2.hashCode(), comDayCqDamCoreImplServletBatchMetadataServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties1 = OASComDayCqDamCoreImplServletBatchMe.getExample();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties2 = OASComDayCqDamCoreImplServletBatchMe.getExample();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties3 = new OASComDayCqDamCoreImplServletBatchMe();
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties4 = new OASComDayCqDamCoreImplServletBatchMe();

        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties1.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties2));
        System.assert(comDayCqDamCoreImplServletBatchMetadataServletProperties3.equals(comDayCqDamCoreImplServletBatchMetadataServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletBatchMetadataServletProperties1.hashCode(), comDayCqDamCoreImplServletBatchMetadataServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletBatchMetadataServletProperties3.hashCode(), comDayCqDamCoreImplServletBatchMetadataServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties = new OASComDayCqDamCoreImplServletBatchMe();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletBatchMetadataServletProperties.getPropertyMappings();
        System.assertEquals('cqDamBatchMetadataAssetDefault', propertyMappings.get('cq.dam.batch.metadata.asset.default'));
        System.assertEquals('cqDamBatchMetadataCollectionDefault', propertyMappings.get('cq.dam.batch.metadata.collection.default'));
        System.assertEquals('cqDamBatchMetadataMaxresources', propertyMappings.get('cq.dam.batch.metadata.maxresources'));
    }
}
