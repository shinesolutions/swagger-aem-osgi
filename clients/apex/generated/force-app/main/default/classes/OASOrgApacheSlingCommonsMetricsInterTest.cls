@isTest
private class OASOrgApacheSlingCommonsMetricsInterTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties1 = OASOrgApacheSlingCommonsMetricsInter.getExample();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties2 = orgApacheSlingCommonsMetricsInternalLogReporterProperties1;
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties3 = new OASOrgApacheSlingCommonsMetricsInter();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties4 = orgApacheSlingCommonsMetricsInternalLogReporterProperties3;

        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties1.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties2));
        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties2.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties1));
        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties1.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties1));
        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties3.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties4));
        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties4.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties3));
        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties3.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties1 = OASOrgApacheSlingCommonsMetricsInter.getExample();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties2 = OASOrgApacheSlingCommonsMetricsInter.getExample();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties3 = new OASOrgApacheSlingCommonsMetricsInter();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties4 = new OASOrgApacheSlingCommonsMetricsInter();

        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties1.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties2));
        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties2.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties1));
        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties3.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties4));
        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties4.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties1 = OASOrgApacheSlingCommonsMetricsInter.getExample();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties2 = new OASOrgApacheSlingCommonsMetricsInter();

        System.assertEquals(false, orgApacheSlingCommonsMetricsInternalLogReporterProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCommonsMetricsInternalLogReporterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties1 = OASOrgApacheSlingCommonsMetricsInter.getExample();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties2 = new OASOrgApacheSlingCommonsMetricsInter();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties3;

        System.assertEquals(false, orgApacheSlingCommonsMetricsInternalLogReporterProperties1.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties3));
        System.assertEquals(false, orgApacheSlingCommonsMetricsInternalLogReporterProperties2.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties1 = OASOrgApacheSlingCommonsMetricsInter.getExample();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties2 = new OASOrgApacheSlingCommonsMetricsInter();

        System.assertEquals(orgApacheSlingCommonsMetricsInternalLogReporterProperties1.hashCode(), orgApacheSlingCommonsMetricsInternalLogReporterProperties1.hashCode());
        System.assertEquals(orgApacheSlingCommonsMetricsInternalLogReporterProperties2.hashCode(), orgApacheSlingCommonsMetricsInternalLogReporterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties1 = OASOrgApacheSlingCommonsMetricsInter.getExample();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties2 = OASOrgApacheSlingCommonsMetricsInter.getExample();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties3 = new OASOrgApacheSlingCommonsMetricsInter();
        OASOrgApacheSlingCommonsMetricsInter orgApacheSlingCommonsMetricsInternalLogReporterProperties4 = new OASOrgApacheSlingCommonsMetricsInter();

        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties1.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties2));
        System.assert(orgApacheSlingCommonsMetricsInternalLogReporterProperties3.equals(orgApacheSlingCommonsMetricsInternalLogReporterProperties4));
        System.assertEquals(orgApacheSlingCommonsMetricsInternalLogReporterProperties1.hashCode(), orgApacheSlingCommonsMetricsInternalLogReporterProperties2.hashCode());
        System.assertEquals(orgApacheSlingCommonsMetricsInternalLogReporterProperties3.hashCode(), orgApacheSlingCommonsMetricsInternalLogReporterProperties4.hashCode());
    }
}
