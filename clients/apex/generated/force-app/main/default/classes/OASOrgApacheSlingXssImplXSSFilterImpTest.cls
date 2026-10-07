@isTest
private class OASOrgApacheSlingXssImplXSSFilterImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties1 = OASOrgApacheSlingXssImplXSSFilterImp.getExample();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties2 = orgApacheSlingXssImplXSSFilterImplProperties1;
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties3 = new OASOrgApacheSlingXssImplXSSFilterImp();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties4 = orgApacheSlingXssImplXSSFilterImplProperties3;

        System.assert(orgApacheSlingXssImplXSSFilterImplProperties1.equals(orgApacheSlingXssImplXSSFilterImplProperties2));
        System.assert(orgApacheSlingXssImplXSSFilterImplProperties2.equals(orgApacheSlingXssImplXSSFilterImplProperties1));
        System.assert(orgApacheSlingXssImplXSSFilterImplProperties1.equals(orgApacheSlingXssImplXSSFilterImplProperties1));
        System.assert(orgApacheSlingXssImplXSSFilterImplProperties3.equals(orgApacheSlingXssImplXSSFilterImplProperties4));
        System.assert(orgApacheSlingXssImplXSSFilterImplProperties4.equals(orgApacheSlingXssImplXSSFilterImplProperties3));
        System.assert(orgApacheSlingXssImplXSSFilterImplProperties3.equals(orgApacheSlingXssImplXSSFilterImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties1 = OASOrgApacheSlingXssImplXSSFilterImp.getExample();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties2 = OASOrgApacheSlingXssImplXSSFilterImp.getExample();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties3 = new OASOrgApacheSlingXssImplXSSFilterImp();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties4 = new OASOrgApacheSlingXssImplXSSFilterImp();

        System.assert(orgApacheSlingXssImplXSSFilterImplProperties1.equals(orgApacheSlingXssImplXSSFilterImplProperties2));
        System.assert(orgApacheSlingXssImplXSSFilterImplProperties2.equals(orgApacheSlingXssImplXSSFilterImplProperties1));
        System.assert(orgApacheSlingXssImplXSSFilterImplProperties3.equals(orgApacheSlingXssImplXSSFilterImplProperties4));
        System.assert(orgApacheSlingXssImplXSSFilterImplProperties4.equals(orgApacheSlingXssImplXSSFilterImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties1 = OASOrgApacheSlingXssImplXSSFilterImp.getExample();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties2 = new OASOrgApacheSlingXssImplXSSFilterImp();

        System.assertEquals(false, orgApacheSlingXssImplXSSFilterImplProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingXssImplXSSFilterImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties1 = OASOrgApacheSlingXssImplXSSFilterImp.getExample();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties2 = new OASOrgApacheSlingXssImplXSSFilterImp();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties3;

        System.assertEquals(false, orgApacheSlingXssImplXSSFilterImplProperties1.equals(orgApacheSlingXssImplXSSFilterImplProperties3));
        System.assertEquals(false, orgApacheSlingXssImplXSSFilterImplProperties2.equals(orgApacheSlingXssImplXSSFilterImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties1 = OASOrgApacheSlingXssImplXSSFilterImp.getExample();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties2 = new OASOrgApacheSlingXssImplXSSFilterImp();

        System.assertEquals(orgApacheSlingXssImplXSSFilterImplProperties1.hashCode(), orgApacheSlingXssImplXSSFilterImplProperties1.hashCode());
        System.assertEquals(orgApacheSlingXssImplXSSFilterImplProperties2.hashCode(), orgApacheSlingXssImplXSSFilterImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties1 = OASOrgApacheSlingXssImplXSSFilterImp.getExample();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties2 = OASOrgApacheSlingXssImplXSSFilterImp.getExample();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties3 = new OASOrgApacheSlingXssImplXSSFilterImp();
        OASOrgApacheSlingXssImplXSSFilterImp orgApacheSlingXssImplXSSFilterImplProperties4 = new OASOrgApacheSlingXssImplXSSFilterImp();

        System.assert(orgApacheSlingXssImplXSSFilterImplProperties1.equals(orgApacheSlingXssImplXSSFilterImplProperties2));
        System.assert(orgApacheSlingXssImplXSSFilterImplProperties3.equals(orgApacheSlingXssImplXSSFilterImplProperties4));
        System.assertEquals(orgApacheSlingXssImplXSSFilterImplProperties1.hashCode(), orgApacheSlingXssImplXSSFilterImplProperties2.hashCode());
        System.assertEquals(orgApacheSlingXssImplXSSFilterImplProperties3.hashCode(), orgApacheSlingXssImplXSSFilterImplProperties4.hashCode());
    }
}
