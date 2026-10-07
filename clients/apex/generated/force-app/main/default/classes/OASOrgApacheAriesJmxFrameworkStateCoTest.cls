@isTest
private class OASOrgApacheAriesJmxFrameworkStateCoTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties1 = OASOrgApacheAriesJmxFrameworkStateCo.getExample();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties2 = orgApacheAriesJmxFrameworkStateConfigProperties1;
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties3 = new OASOrgApacheAriesJmxFrameworkStateCo();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties4 = orgApacheAriesJmxFrameworkStateConfigProperties3;

        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties1.equals(orgApacheAriesJmxFrameworkStateConfigProperties2));
        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties2.equals(orgApacheAriesJmxFrameworkStateConfigProperties1));
        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties1.equals(orgApacheAriesJmxFrameworkStateConfigProperties1));
        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties3.equals(orgApacheAriesJmxFrameworkStateConfigProperties4));
        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties4.equals(orgApacheAriesJmxFrameworkStateConfigProperties3));
        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties3.equals(orgApacheAriesJmxFrameworkStateConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties1 = OASOrgApacheAriesJmxFrameworkStateCo.getExample();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties2 = OASOrgApacheAriesJmxFrameworkStateCo.getExample();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties3 = new OASOrgApacheAriesJmxFrameworkStateCo();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties4 = new OASOrgApacheAriesJmxFrameworkStateCo();

        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties1.equals(orgApacheAriesJmxFrameworkStateConfigProperties2));
        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties2.equals(orgApacheAriesJmxFrameworkStateConfigProperties1));
        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties3.equals(orgApacheAriesJmxFrameworkStateConfigProperties4));
        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties4.equals(orgApacheAriesJmxFrameworkStateConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties1 = OASOrgApacheAriesJmxFrameworkStateCo.getExample();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties2 = new OASOrgApacheAriesJmxFrameworkStateCo();

        System.assertEquals(false, orgApacheAriesJmxFrameworkStateConfigProperties1.equals('foo'));
        System.assertEquals(false, orgApacheAriesJmxFrameworkStateConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties1 = OASOrgApacheAriesJmxFrameworkStateCo.getExample();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties2 = new OASOrgApacheAriesJmxFrameworkStateCo();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties3;

        System.assertEquals(false, orgApacheAriesJmxFrameworkStateConfigProperties1.equals(orgApacheAriesJmxFrameworkStateConfigProperties3));
        System.assertEquals(false, orgApacheAriesJmxFrameworkStateConfigProperties2.equals(orgApacheAriesJmxFrameworkStateConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties1 = OASOrgApacheAriesJmxFrameworkStateCo.getExample();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties2 = new OASOrgApacheAriesJmxFrameworkStateCo();

        System.assertEquals(orgApacheAriesJmxFrameworkStateConfigProperties1.hashCode(), orgApacheAriesJmxFrameworkStateConfigProperties1.hashCode());
        System.assertEquals(orgApacheAriesJmxFrameworkStateConfigProperties2.hashCode(), orgApacheAriesJmxFrameworkStateConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties1 = OASOrgApacheAriesJmxFrameworkStateCo.getExample();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties2 = OASOrgApacheAriesJmxFrameworkStateCo.getExample();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties3 = new OASOrgApacheAriesJmxFrameworkStateCo();
        OASOrgApacheAriesJmxFrameworkStateCo orgApacheAriesJmxFrameworkStateConfigProperties4 = new OASOrgApacheAriesJmxFrameworkStateCo();

        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties1.equals(orgApacheAriesJmxFrameworkStateConfigProperties2));
        System.assert(orgApacheAriesJmxFrameworkStateConfigProperties3.equals(orgApacheAriesJmxFrameworkStateConfigProperties4));
        System.assertEquals(orgApacheAriesJmxFrameworkStateConfigProperties1.hashCode(), orgApacheAriesJmxFrameworkStateConfigProperties2.hashCode());
        System.assertEquals(orgApacheAriesJmxFrameworkStateConfigProperties3.hashCode(), orgApacheAriesJmxFrameworkStateConfigProperties4.hashCode());
    }
}
