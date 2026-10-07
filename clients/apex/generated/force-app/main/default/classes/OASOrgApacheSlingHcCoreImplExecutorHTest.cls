@isTest
private class OASOrgApacheSlingHcCoreImplExecutorHTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1 = OASOrgApacheSlingHcCoreImplExecutorH.getExample();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2 = orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1;
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3 = new OASOrgApacheSlingHcCoreImplExecutorH();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties4 = orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3;

        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2));
        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1));
        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1));
        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties4));
        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties4.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3));
        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1 = OASOrgApacheSlingHcCoreImplExecutorH.getExample();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2 = OASOrgApacheSlingHcCoreImplExecutorH.getExample();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3 = new OASOrgApacheSlingHcCoreImplExecutorH();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties4 = new OASOrgApacheSlingHcCoreImplExecutorH();

        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2));
        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1));
        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties4));
        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties4.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1 = OASOrgApacheSlingHcCoreImplExecutorH.getExample();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2 = new OASOrgApacheSlingHcCoreImplExecutorH();

        System.assertEquals(false, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1 = OASOrgApacheSlingHcCoreImplExecutorH.getExample();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2 = new OASOrgApacheSlingHcCoreImplExecutorH();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3;

        System.assertEquals(false, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3));
        System.assertEquals(false, orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1 = OASOrgApacheSlingHcCoreImplExecutorH.getExample();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2 = new OASOrgApacheSlingHcCoreImplExecutorH();

        System.assertEquals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1.hashCode(), orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2.hashCode(), orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1 = OASOrgApacheSlingHcCoreImplExecutorH.getExample();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2 = OASOrgApacheSlingHcCoreImplExecutorH.getExample();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3 = new OASOrgApacheSlingHcCoreImplExecutorH();
        OASOrgApacheSlingHcCoreImplExecutorH orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties4 = new OASOrgApacheSlingHcCoreImplExecutorH();

        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2));
        System.assert(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3.equals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties4));
        System.assertEquals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties1.hashCode(), orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties2.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties3.hashCode(), orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties4.hashCode());
    }
}
