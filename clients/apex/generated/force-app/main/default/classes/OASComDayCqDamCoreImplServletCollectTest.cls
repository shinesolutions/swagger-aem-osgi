@isTest
private class OASComDayCqDamCoreImplServletCollectTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties1 = OASComDayCqDamCoreImplServletCollect.getExample();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties2 = comDayCqDamCoreImplServletCollectionsServletProperties1;
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties3 = new OASComDayCqDamCoreImplServletCollect();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties4 = comDayCqDamCoreImplServletCollectionsServletProperties3;

        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties1.equals(comDayCqDamCoreImplServletCollectionsServletProperties2));
        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties2.equals(comDayCqDamCoreImplServletCollectionsServletProperties1));
        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties1.equals(comDayCqDamCoreImplServletCollectionsServletProperties1));
        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties3.equals(comDayCqDamCoreImplServletCollectionsServletProperties4));
        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties4.equals(comDayCqDamCoreImplServletCollectionsServletProperties3));
        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties3.equals(comDayCqDamCoreImplServletCollectionsServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties1 = OASComDayCqDamCoreImplServletCollect.getExample();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties2 = OASComDayCqDamCoreImplServletCollect.getExample();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties3 = new OASComDayCqDamCoreImplServletCollect();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties4 = new OASComDayCqDamCoreImplServletCollect();

        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties1.equals(comDayCqDamCoreImplServletCollectionsServletProperties2));
        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties2.equals(comDayCqDamCoreImplServletCollectionsServletProperties1));
        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties3.equals(comDayCqDamCoreImplServletCollectionsServletProperties4));
        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties4.equals(comDayCqDamCoreImplServletCollectionsServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties1 = OASComDayCqDamCoreImplServletCollect.getExample();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties2 = new OASComDayCqDamCoreImplServletCollect();

        System.assertEquals(false, comDayCqDamCoreImplServletCollectionsServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletCollectionsServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties1 = OASComDayCqDamCoreImplServletCollect.getExample();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties2 = new OASComDayCqDamCoreImplServletCollect();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletCollectionsServletProperties1.equals(comDayCqDamCoreImplServletCollectionsServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletCollectionsServletProperties2.equals(comDayCqDamCoreImplServletCollectionsServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties1 = OASComDayCqDamCoreImplServletCollect.getExample();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties2 = new OASComDayCqDamCoreImplServletCollect();

        System.assertEquals(comDayCqDamCoreImplServletCollectionsServletProperties1.hashCode(), comDayCqDamCoreImplServletCollectionsServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletCollectionsServletProperties2.hashCode(), comDayCqDamCoreImplServletCollectionsServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties1 = OASComDayCqDamCoreImplServletCollect.getExample();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties2 = OASComDayCqDamCoreImplServletCollect.getExample();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties3 = new OASComDayCqDamCoreImplServletCollect();
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties4 = new OASComDayCqDamCoreImplServletCollect();

        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties1.equals(comDayCqDamCoreImplServletCollectionsServletProperties2));
        System.assert(comDayCqDamCoreImplServletCollectionsServletProperties3.equals(comDayCqDamCoreImplServletCollectionsServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletCollectionsServletProperties1.hashCode(), comDayCqDamCoreImplServletCollectionsServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletCollectionsServletProperties3.hashCode(), comDayCqDamCoreImplServletCollectionsServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletCollect comDayCqDamCoreImplServletCollectionsServletProperties = new OASComDayCqDamCoreImplServletCollect();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletCollectionsServletProperties.getPropertyMappings();
        System.assertEquals('cqDamBatchCollectionsProperties', propertyMappings.get('cq.dam.batch.collections.properties'));
        System.assertEquals('cqDamBatchCollectionsLimit', propertyMappings.get('cq.dam.batch.collections.limit'));
    }
}
