@isTest
private class OASOrgApacheSlingCommonsThreadsImplDTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1 = OASOrgApacheSlingCommonsThreadsImplD.getExample();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2 = orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1;
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3 = new OASOrgApacheSlingCommonsThreadsImplD();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties4 = orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3;

        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2));
        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1));
        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1));
        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties4));
        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties4.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3));
        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1 = OASOrgApacheSlingCommonsThreadsImplD.getExample();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2 = OASOrgApacheSlingCommonsThreadsImplD.getExample();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3 = new OASOrgApacheSlingCommonsThreadsImplD();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties4 = new OASOrgApacheSlingCommonsThreadsImplD();

        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2));
        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1));
        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties4));
        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties4.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1 = OASOrgApacheSlingCommonsThreadsImplD.getExample();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2 = new OASOrgApacheSlingCommonsThreadsImplD();

        System.assertEquals(false, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1 = OASOrgApacheSlingCommonsThreadsImplD.getExample();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2 = new OASOrgApacheSlingCommonsThreadsImplD();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3;

        System.assertEquals(false, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3));
        System.assertEquals(false, orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1 = OASOrgApacheSlingCommonsThreadsImplD.getExample();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2 = new OASOrgApacheSlingCommonsThreadsImplD();

        System.assertEquals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1.hashCode(), orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1.hashCode());
        System.assertEquals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2.hashCode(), orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1 = OASOrgApacheSlingCommonsThreadsImplD.getExample();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2 = OASOrgApacheSlingCommonsThreadsImplD.getExample();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3 = new OASOrgApacheSlingCommonsThreadsImplD();
        OASOrgApacheSlingCommonsThreadsImplD orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties4 = new OASOrgApacheSlingCommonsThreadsImplD();

        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2));
        System.assert(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3.equals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties4));
        System.assertEquals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties1.hashCode(), orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties2.hashCode());
        System.assertEquals(orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties3.hashCode(), orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties4.hashCode());
    }
}
