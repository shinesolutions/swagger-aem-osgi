@isTest
private class OASOrgApacheSlingServletsPostImplHelTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1 = OASOrgApacheSlingServletsPostImplHel.getExample();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2 = orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1;
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3 = new OASOrgApacheSlingServletsPostImplHel();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties4 = orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3;

        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2));
        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1));
        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1));
        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties4));
        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties4.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3));
        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1 = OASOrgApacheSlingServletsPostImplHel.getExample();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2 = OASOrgApacheSlingServletsPostImplHel.getExample();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3 = new OASOrgApacheSlingServletsPostImplHel();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties4 = new OASOrgApacheSlingServletsPostImplHel();

        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2));
        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1));
        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties4));
        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties4.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1 = OASOrgApacheSlingServletsPostImplHel.getExample();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2 = new OASOrgApacheSlingServletsPostImplHel();

        System.assertEquals(false, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1 = OASOrgApacheSlingServletsPostImplHel.getExample();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2 = new OASOrgApacheSlingServletsPostImplHel();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3;

        System.assertEquals(false, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3));
        System.assertEquals(false, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1 = OASOrgApacheSlingServletsPostImplHel.getExample();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2 = new OASOrgApacheSlingServletsPostImplHel();

        System.assertEquals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1.hashCode(), orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1.hashCode());
        System.assertEquals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2.hashCode(), orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1 = OASOrgApacheSlingServletsPostImplHel.getExample();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2 = OASOrgApacheSlingServletsPostImplHel.getExample();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3 = new OASOrgApacheSlingServletsPostImplHel();
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties4 = new OASOrgApacheSlingServletsPostImplHel();

        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2));
        System.assert(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties4));
        System.assertEquals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties1.hashCode(), orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties2.hashCode());
        System.assertEquals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties3.hashCode(), orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingServletsPostImplHel orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties = new OASOrgApacheSlingServletsPostImplHel();
        Map<String, String> propertyMappings = orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
        System.assertEquals('schedulerConcurrent', propertyMappings.get('scheduler.concurrent'));
        System.assertEquals('chunkCleanupAge', propertyMappings.get('chunk.cleanup.age'));
    }
}
