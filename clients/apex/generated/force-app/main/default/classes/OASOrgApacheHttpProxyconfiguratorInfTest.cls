@isTest
private class OASOrgApacheHttpProxyconfiguratorInfTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo1 = OASOrgApacheHttpProxyconfiguratorInf.getExample();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo2 = orgApacheHttpProxyconfiguratorInfo1;
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo3 = new OASOrgApacheHttpProxyconfiguratorInf();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo4 = orgApacheHttpProxyconfiguratorInfo3;

        System.assert(orgApacheHttpProxyconfiguratorInfo1.equals(orgApacheHttpProxyconfiguratorInfo2));
        System.assert(orgApacheHttpProxyconfiguratorInfo2.equals(orgApacheHttpProxyconfiguratorInfo1));
        System.assert(orgApacheHttpProxyconfiguratorInfo1.equals(orgApacheHttpProxyconfiguratorInfo1));
        System.assert(orgApacheHttpProxyconfiguratorInfo3.equals(orgApacheHttpProxyconfiguratorInfo4));
        System.assert(orgApacheHttpProxyconfiguratorInfo4.equals(orgApacheHttpProxyconfiguratorInfo3));
        System.assert(orgApacheHttpProxyconfiguratorInfo3.equals(orgApacheHttpProxyconfiguratorInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo1 = OASOrgApacheHttpProxyconfiguratorInf.getExample();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo2 = OASOrgApacheHttpProxyconfiguratorInf.getExample();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo3 = new OASOrgApacheHttpProxyconfiguratorInf();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo4 = new OASOrgApacheHttpProxyconfiguratorInf();

        System.assert(orgApacheHttpProxyconfiguratorInfo1.equals(orgApacheHttpProxyconfiguratorInfo2));
        System.assert(orgApacheHttpProxyconfiguratorInfo2.equals(orgApacheHttpProxyconfiguratorInfo1));
        System.assert(orgApacheHttpProxyconfiguratorInfo3.equals(orgApacheHttpProxyconfiguratorInfo4));
        System.assert(orgApacheHttpProxyconfiguratorInfo4.equals(orgApacheHttpProxyconfiguratorInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo1 = OASOrgApacheHttpProxyconfiguratorInf.getExample();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo2 = new OASOrgApacheHttpProxyconfiguratorInf();

        System.assertEquals(false, orgApacheHttpProxyconfiguratorInfo1.equals('foo'));
        System.assertEquals(false, orgApacheHttpProxyconfiguratorInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo1 = OASOrgApacheHttpProxyconfiguratorInf.getExample();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo2 = new OASOrgApacheHttpProxyconfiguratorInf();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo3;

        System.assertEquals(false, orgApacheHttpProxyconfiguratorInfo1.equals(orgApacheHttpProxyconfiguratorInfo3));
        System.assertEquals(false, orgApacheHttpProxyconfiguratorInfo2.equals(orgApacheHttpProxyconfiguratorInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo1 = OASOrgApacheHttpProxyconfiguratorInf.getExample();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo2 = new OASOrgApacheHttpProxyconfiguratorInf();

        System.assertEquals(orgApacheHttpProxyconfiguratorInfo1.hashCode(), orgApacheHttpProxyconfiguratorInfo1.hashCode());
        System.assertEquals(orgApacheHttpProxyconfiguratorInfo2.hashCode(), orgApacheHttpProxyconfiguratorInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo1 = OASOrgApacheHttpProxyconfiguratorInf.getExample();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo2 = OASOrgApacheHttpProxyconfiguratorInf.getExample();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo3 = new OASOrgApacheHttpProxyconfiguratorInf();
        OASOrgApacheHttpProxyconfiguratorInf orgApacheHttpProxyconfiguratorInfo4 = new OASOrgApacheHttpProxyconfiguratorInf();

        System.assert(orgApacheHttpProxyconfiguratorInfo1.equals(orgApacheHttpProxyconfiguratorInfo2));
        System.assert(orgApacheHttpProxyconfiguratorInfo3.equals(orgApacheHttpProxyconfiguratorInfo4));
        System.assertEquals(orgApacheHttpProxyconfiguratorInfo1.hashCode(), orgApacheHttpProxyconfiguratorInfo2.hashCode());
        System.assertEquals(orgApacheHttpProxyconfiguratorInfo3.hashCode(), orgApacheHttpProxyconfiguratorInfo4.hashCode());
    }
}
