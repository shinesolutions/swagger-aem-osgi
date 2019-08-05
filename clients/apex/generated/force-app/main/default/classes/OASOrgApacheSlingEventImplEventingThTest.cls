@isTest
private class OASOrgApacheSlingEventImplEventingThTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties1 = OASOrgApacheSlingEventImplEventingTh.getExample();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties2 = orgApacheSlingEventImplEventingThreadPoolProperties1;
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties3 = new OASOrgApacheSlingEventImplEventingTh();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties4 = orgApacheSlingEventImplEventingThreadPoolProperties3;

        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties1.equals(orgApacheSlingEventImplEventingThreadPoolProperties2));
        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties2.equals(orgApacheSlingEventImplEventingThreadPoolProperties1));
        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties1.equals(orgApacheSlingEventImplEventingThreadPoolProperties1));
        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties3.equals(orgApacheSlingEventImplEventingThreadPoolProperties4));
        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties4.equals(orgApacheSlingEventImplEventingThreadPoolProperties3));
        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties3.equals(orgApacheSlingEventImplEventingThreadPoolProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties1 = OASOrgApacheSlingEventImplEventingTh.getExample();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties2 = OASOrgApacheSlingEventImplEventingTh.getExample();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties3 = new OASOrgApacheSlingEventImplEventingTh();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties4 = new OASOrgApacheSlingEventImplEventingTh();

        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties1.equals(orgApacheSlingEventImplEventingThreadPoolProperties2));
        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties2.equals(orgApacheSlingEventImplEventingThreadPoolProperties1));
        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties3.equals(orgApacheSlingEventImplEventingThreadPoolProperties4));
        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties4.equals(orgApacheSlingEventImplEventingThreadPoolProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties1 = OASOrgApacheSlingEventImplEventingTh.getExample();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties2 = new OASOrgApacheSlingEventImplEventingTh();

        System.assertEquals(false, orgApacheSlingEventImplEventingThreadPoolProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEventImplEventingThreadPoolProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties1 = OASOrgApacheSlingEventImplEventingTh.getExample();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties2 = new OASOrgApacheSlingEventImplEventingTh();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties3;

        System.assertEquals(false, orgApacheSlingEventImplEventingThreadPoolProperties1.equals(orgApacheSlingEventImplEventingThreadPoolProperties3));
        System.assertEquals(false, orgApacheSlingEventImplEventingThreadPoolProperties2.equals(orgApacheSlingEventImplEventingThreadPoolProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties1 = OASOrgApacheSlingEventImplEventingTh.getExample();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties2 = new OASOrgApacheSlingEventImplEventingTh();

        System.assertEquals(orgApacheSlingEventImplEventingThreadPoolProperties1.hashCode(), orgApacheSlingEventImplEventingThreadPoolProperties1.hashCode());
        System.assertEquals(orgApacheSlingEventImplEventingThreadPoolProperties2.hashCode(), orgApacheSlingEventImplEventingThreadPoolProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties1 = OASOrgApacheSlingEventImplEventingTh.getExample();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties2 = OASOrgApacheSlingEventImplEventingTh.getExample();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties3 = new OASOrgApacheSlingEventImplEventingTh();
        OASOrgApacheSlingEventImplEventingTh orgApacheSlingEventImplEventingThreadPoolProperties4 = new OASOrgApacheSlingEventImplEventingTh();

        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties1.equals(orgApacheSlingEventImplEventingThreadPoolProperties2));
        System.assert(orgApacheSlingEventImplEventingThreadPoolProperties3.equals(orgApacheSlingEventImplEventingThreadPoolProperties4));
        System.assertEquals(orgApacheSlingEventImplEventingThreadPoolProperties1.hashCode(), orgApacheSlingEventImplEventingThreadPoolProperties2.hashCode());
        System.assertEquals(orgApacheSlingEventImplEventingThreadPoolProperties3.hashCode(), orgApacheSlingEventImplEventingThreadPoolProperties4.hashCode());
    }
}
