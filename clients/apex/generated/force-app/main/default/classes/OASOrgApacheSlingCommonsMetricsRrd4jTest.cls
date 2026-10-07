@isTest
private class OASOrgApacheSlingCommonsMetricsRrd4jTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1 = OASOrgApacheSlingCommonsMetricsRrd4j.getExample();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2 = orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1;
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3 = new OASOrgApacheSlingCommonsMetricsRrd4j();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties4 = orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3;

        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2));
        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1));
        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1));
        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties4));
        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties4.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3));
        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1 = OASOrgApacheSlingCommonsMetricsRrd4j.getExample();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2 = OASOrgApacheSlingCommonsMetricsRrd4j.getExample();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3 = new OASOrgApacheSlingCommonsMetricsRrd4j();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties4 = new OASOrgApacheSlingCommonsMetricsRrd4j();

        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2));
        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1));
        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties4));
        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties4.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1 = OASOrgApacheSlingCommonsMetricsRrd4j.getExample();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2 = new OASOrgApacheSlingCommonsMetricsRrd4j();

        System.assertEquals(false, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1 = OASOrgApacheSlingCommonsMetricsRrd4j.getExample();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2 = new OASOrgApacheSlingCommonsMetricsRrd4j();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3;

        System.assertEquals(false, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3));
        System.assertEquals(false, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1 = OASOrgApacheSlingCommonsMetricsRrd4j.getExample();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2 = new OASOrgApacheSlingCommonsMetricsRrd4j();

        System.assertEquals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1.hashCode(), orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1.hashCode());
        System.assertEquals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2.hashCode(), orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1 = OASOrgApacheSlingCommonsMetricsRrd4j.getExample();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2 = OASOrgApacheSlingCommonsMetricsRrd4j.getExample();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3 = new OASOrgApacheSlingCommonsMetricsRrd4j();
        OASOrgApacheSlingCommonsMetricsRrd4j orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties4 = new OASOrgApacheSlingCommonsMetricsRrd4j();

        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2));
        System.assert(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3.equals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties4));
        System.assertEquals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties1.hashCode(), orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties2.hashCode());
        System.assertEquals(orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties3.hashCode(), orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties4.hashCode());
    }
}
