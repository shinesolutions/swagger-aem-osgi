@isTest
private class OASOrgApacheFelixScrScrServiceInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo1 = OASOrgApacheFelixScrScrServiceInfo.getExample();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo2 = orgApacheFelixScrScrServiceInfo1;
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo3 = new OASOrgApacheFelixScrScrServiceInfo();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo4 = orgApacheFelixScrScrServiceInfo3;

        System.assert(orgApacheFelixScrScrServiceInfo1.equals(orgApacheFelixScrScrServiceInfo2));
        System.assert(orgApacheFelixScrScrServiceInfo2.equals(orgApacheFelixScrScrServiceInfo1));
        System.assert(orgApacheFelixScrScrServiceInfo1.equals(orgApacheFelixScrScrServiceInfo1));
        System.assert(orgApacheFelixScrScrServiceInfo3.equals(orgApacheFelixScrScrServiceInfo4));
        System.assert(orgApacheFelixScrScrServiceInfo4.equals(orgApacheFelixScrScrServiceInfo3));
        System.assert(orgApacheFelixScrScrServiceInfo3.equals(orgApacheFelixScrScrServiceInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo1 = OASOrgApacheFelixScrScrServiceInfo.getExample();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo2 = OASOrgApacheFelixScrScrServiceInfo.getExample();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo3 = new OASOrgApacheFelixScrScrServiceInfo();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo4 = new OASOrgApacheFelixScrScrServiceInfo();

        System.assert(orgApacheFelixScrScrServiceInfo1.equals(orgApacheFelixScrScrServiceInfo2));
        System.assert(orgApacheFelixScrScrServiceInfo2.equals(orgApacheFelixScrScrServiceInfo1));
        System.assert(orgApacheFelixScrScrServiceInfo3.equals(orgApacheFelixScrScrServiceInfo4));
        System.assert(orgApacheFelixScrScrServiceInfo4.equals(orgApacheFelixScrScrServiceInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo1 = OASOrgApacheFelixScrScrServiceInfo.getExample();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo2 = new OASOrgApacheFelixScrScrServiceInfo();

        System.assertEquals(false, orgApacheFelixScrScrServiceInfo1.equals('foo'));
        System.assertEquals(false, orgApacheFelixScrScrServiceInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo1 = OASOrgApacheFelixScrScrServiceInfo.getExample();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo2 = new OASOrgApacheFelixScrScrServiceInfo();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo3;

        System.assertEquals(false, orgApacheFelixScrScrServiceInfo1.equals(orgApacheFelixScrScrServiceInfo3));
        System.assertEquals(false, orgApacheFelixScrScrServiceInfo2.equals(orgApacheFelixScrScrServiceInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo1 = OASOrgApacheFelixScrScrServiceInfo.getExample();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo2 = new OASOrgApacheFelixScrScrServiceInfo();

        System.assertEquals(orgApacheFelixScrScrServiceInfo1.hashCode(), orgApacheFelixScrScrServiceInfo1.hashCode());
        System.assertEquals(orgApacheFelixScrScrServiceInfo2.hashCode(), orgApacheFelixScrScrServiceInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo1 = OASOrgApacheFelixScrScrServiceInfo.getExample();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo2 = OASOrgApacheFelixScrScrServiceInfo.getExample();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo3 = new OASOrgApacheFelixScrScrServiceInfo();
        OASOrgApacheFelixScrScrServiceInfo orgApacheFelixScrScrServiceInfo4 = new OASOrgApacheFelixScrScrServiceInfo();

        System.assert(orgApacheFelixScrScrServiceInfo1.equals(orgApacheFelixScrScrServiceInfo2));
        System.assert(orgApacheFelixScrScrServiceInfo3.equals(orgApacheFelixScrScrServiceInfo4));
        System.assertEquals(orgApacheFelixScrScrServiceInfo1.hashCode(), orgApacheFelixScrScrServiceInfo2.hashCode());
        System.assertEquals(orgApacheFelixScrScrServiceInfo3.hashCode(), orgApacheFelixScrScrServiceInfo4.hashCode());
    }
}
