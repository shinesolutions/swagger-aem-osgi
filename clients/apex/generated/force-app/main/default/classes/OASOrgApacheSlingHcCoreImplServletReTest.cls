@isTest
private class OASOrgApacheSlingHcCoreImplServletReTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1 = OASOrgApacheSlingHcCoreImplServletRe.getExample();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2 = orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1;
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3 = new OASOrgApacheSlingHcCoreImplServletRe();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties4 = orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3;

        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2));
        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1));
        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1));
        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties4));
        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties4.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3));
        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1 = OASOrgApacheSlingHcCoreImplServletRe.getExample();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2 = OASOrgApacheSlingHcCoreImplServletRe.getExample();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3 = new OASOrgApacheSlingHcCoreImplServletRe();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties4 = new OASOrgApacheSlingHcCoreImplServletRe();

        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2));
        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1));
        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties4));
        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties4.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1 = OASOrgApacheSlingHcCoreImplServletRe.getExample();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2 = new OASOrgApacheSlingHcCoreImplServletRe();

        System.assertEquals(false, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1 = OASOrgApacheSlingHcCoreImplServletRe.getExample();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2 = new OASOrgApacheSlingHcCoreImplServletRe();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3;

        System.assertEquals(false, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3));
        System.assertEquals(false, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1 = OASOrgApacheSlingHcCoreImplServletRe.getExample();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2 = new OASOrgApacheSlingHcCoreImplServletRe();

        System.assertEquals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1.hashCode(), orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2.hashCode(), orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1 = OASOrgApacheSlingHcCoreImplServletRe.getExample();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2 = OASOrgApacheSlingHcCoreImplServletRe.getExample();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3 = new OASOrgApacheSlingHcCoreImplServletRe();
        OASOrgApacheSlingHcCoreImplServletRe orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties4 = new OASOrgApacheSlingHcCoreImplServletRe();

        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2));
        System.assert(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3.equals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties4));
        System.assertEquals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties1.hashCode(), orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties2.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties3.hashCode(), orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties4.hashCode());
    }
}
