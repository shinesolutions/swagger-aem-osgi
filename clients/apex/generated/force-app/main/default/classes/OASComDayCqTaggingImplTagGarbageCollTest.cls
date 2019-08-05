@isTest
private class OASComDayCqTaggingImplTagGarbageCollTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties1 = OASComDayCqTaggingImplTagGarbageColl.getExample();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties2 = comDayCqTaggingImplTagGarbageCollectorProperties1;
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties3 = new OASComDayCqTaggingImplTagGarbageColl();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties4 = comDayCqTaggingImplTagGarbageCollectorProperties3;

        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties1.equals(comDayCqTaggingImplTagGarbageCollectorProperties2));
        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties2.equals(comDayCqTaggingImplTagGarbageCollectorProperties1));
        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties1.equals(comDayCqTaggingImplTagGarbageCollectorProperties1));
        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties3.equals(comDayCqTaggingImplTagGarbageCollectorProperties4));
        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties4.equals(comDayCqTaggingImplTagGarbageCollectorProperties3));
        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties3.equals(comDayCqTaggingImplTagGarbageCollectorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties1 = OASComDayCqTaggingImplTagGarbageColl.getExample();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties2 = OASComDayCqTaggingImplTagGarbageColl.getExample();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties3 = new OASComDayCqTaggingImplTagGarbageColl();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties4 = new OASComDayCqTaggingImplTagGarbageColl();

        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties1.equals(comDayCqTaggingImplTagGarbageCollectorProperties2));
        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties2.equals(comDayCqTaggingImplTagGarbageCollectorProperties1));
        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties3.equals(comDayCqTaggingImplTagGarbageCollectorProperties4));
        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties4.equals(comDayCqTaggingImplTagGarbageCollectorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties1 = OASComDayCqTaggingImplTagGarbageColl.getExample();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties2 = new OASComDayCqTaggingImplTagGarbageColl();

        System.assertEquals(false, comDayCqTaggingImplTagGarbageCollectorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqTaggingImplTagGarbageCollectorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties1 = OASComDayCqTaggingImplTagGarbageColl.getExample();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties2 = new OASComDayCqTaggingImplTagGarbageColl();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties3;

        System.assertEquals(false, comDayCqTaggingImplTagGarbageCollectorProperties1.equals(comDayCqTaggingImplTagGarbageCollectorProperties3));
        System.assertEquals(false, comDayCqTaggingImplTagGarbageCollectorProperties2.equals(comDayCqTaggingImplTagGarbageCollectorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties1 = OASComDayCqTaggingImplTagGarbageColl.getExample();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties2 = new OASComDayCqTaggingImplTagGarbageColl();

        System.assertEquals(comDayCqTaggingImplTagGarbageCollectorProperties1.hashCode(), comDayCqTaggingImplTagGarbageCollectorProperties1.hashCode());
        System.assertEquals(comDayCqTaggingImplTagGarbageCollectorProperties2.hashCode(), comDayCqTaggingImplTagGarbageCollectorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties1 = OASComDayCqTaggingImplTagGarbageColl.getExample();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties2 = OASComDayCqTaggingImplTagGarbageColl.getExample();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties3 = new OASComDayCqTaggingImplTagGarbageColl();
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties4 = new OASComDayCqTaggingImplTagGarbageColl();

        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties1.equals(comDayCqTaggingImplTagGarbageCollectorProperties2));
        System.assert(comDayCqTaggingImplTagGarbageCollectorProperties3.equals(comDayCqTaggingImplTagGarbageCollectorProperties4));
        System.assertEquals(comDayCqTaggingImplTagGarbageCollectorProperties1.hashCode(), comDayCqTaggingImplTagGarbageCollectorProperties2.hashCode());
        System.assertEquals(comDayCqTaggingImplTagGarbageCollectorProperties3.hashCode(), comDayCqTaggingImplTagGarbageCollectorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqTaggingImplTagGarbageColl comDayCqTaggingImplTagGarbageCollectorProperties = new OASComDayCqTaggingImplTagGarbageColl();
        Map<String, String> propertyMappings = comDayCqTaggingImplTagGarbageCollectorProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
    }
}
