@isTest
private class OASOrgApacheFelixHttpInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo1 = OASOrgApacheFelixHttpInfo.getExample();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo2 = orgApacheFelixHttpInfo1;
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo3 = new OASOrgApacheFelixHttpInfo();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo4 = orgApacheFelixHttpInfo3;

        System.assert(orgApacheFelixHttpInfo1.equals(orgApacheFelixHttpInfo2));
        System.assert(orgApacheFelixHttpInfo2.equals(orgApacheFelixHttpInfo1));
        System.assert(orgApacheFelixHttpInfo1.equals(orgApacheFelixHttpInfo1));
        System.assert(orgApacheFelixHttpInfo3.equals(orgApacheFelixHttpInfo4));
        System.assert(orgApacheFelixHttpInfo4.equals(orgApacheFelixHttpInfo3));
        System.assert(orgApacheFelixHttpInfo3.equals(orgApacheFelixHttpInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo1 = OASOrgApacheFelixHttpInfo.getExample();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo2 = OASOrgApacheFelixHttpInfo.getExample();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo3 = new OASOrgApacheFelixHttpInfo();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo4 = new OASOrgApacheFelixHttpInfo();

        System.assert(orgApacheFelixHttpInfo1.equals(orgApacheFelixHttpInfo2));
        System.assert(orgApacheFelixHttpInfo2.equals(orgApacheFelixHttpInfo1));
        System.assert(orgApacheFelixHttpInfo3.equals(orgApacheFelixHttpInfo4));
        System.assert(orgApacheFelixHttpInfo4.equals(orgApacheFelixHttpInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo1 = OASOrgApacheFelixHttpInfo.getExample();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo2 = new OASOrgApacheFelixHttpInfo();

        System.assertEquals(false, orgApacheFelixHttpInfo1.equals('foo'));
        System.assertEquals(false, orgApacheFelixHttpInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo1 = OASOrgApacheFelixHttpInfo.getExample();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo2 = new OASOrgApacheFelixHttpInfo();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo3;

        System.assertEquals(false, orgApacheFelixHttpInfo1.equals(orgApacheFelixHttpInfo3));
        System.assertEquals(false, orgApacheFelixHttpInfo2.equals(orgApacheFelixHttpInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo1 = OASOrgApacheFelixHttpInfo.getExample();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo2 = new OASOrgApacheFelixHttpInfo();

        System.assertEquals(orgApacheFelixHttpInfo1.hashCode(), orgApacheFelixHttpInfo1.hashCode());
        System.assertEquals(orgApacheFelixHttpInfo2.hashCode(), orgApacheFelixHttpInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo1 = OASOrgApacheFelixHttpInfo.getExample();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo2 = OASOrgApacheFelixHttpInfo.getExample();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo3 = new OASOrgApacheFelixHttpInfo();
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo4 = new OASOrgApacheFelixHttpInfo();

        System.assert(orgApacheFelixHttpInfo1.equals(orgApacheFelixHttpInfo2));
        System.assert(orgApacheFelixHttpInfo3.equals(orgApacheFelixHttpInfo4));
        System.assertEquals(orgApacheFelixHttpInfo1.hashCode(), orgApacheFelixHttpInfo2.hashCode());
        System.assertEquals(orgApacheFelixHttpInfo3.hashCode(), orgApacheFelixHttpInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixHttpInfo orgApacheFelixHttpInfo = new OASOrgApacheFelixHttpInfo();
        Map<String, String> propertyMappings = orgApacheFelixHttpInfo.getPropertyMappings();
        System.assertEquals('bundleLocation', propertyMappings.get('bundle_location'));
        System.assertEquals('serviceLocation', propertyMappings.get('service_location'));
    }
}
