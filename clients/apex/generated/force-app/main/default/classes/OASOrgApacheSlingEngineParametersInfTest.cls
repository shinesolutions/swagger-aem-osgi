@isTest
private class OASOrgApacheSlingEngineParametersInfTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo1 = OASOrgApacheSlingEngineParametersInf.getExample();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo2 = orgApacheSlingEngineParametersInfo1;
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo3 = new OASOrgApacheSlingEngineParametersInf();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo4 = orgApacheSlingEngineParametersInfo3;

        System.assert(orgApacheSlingEngineParametersInfo1.equals(orgApacheSlingEngineParametersInfo2));
        System.assert(orgApacheSlingEngineParametersInfo2.equals(orgApacheSlingEngineParametersInfo1));
        System.assert(orgApacheSlingEngineParametersInfo1.equals(orgApacheSlingEngineParametersInfo1));
        System.assert(orgApacheSlingEngineParametersInfo3.equals(orgApacheSlingEngineParametersInfo4));
        System.assert(orgApacheSlingEngineParametersInfo4.equals(orgApacheSlingEngineParametersInfo3));
        System.assert(orgApacheSlingEngineParametersInfo3.equals(orgApacheSlingEngineParametersInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo1 = OASOrgApacheSlingEngineParametersInf.getExample();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo2 = OASOrgApacheSlingEngineParametersInf.getExample();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo3 = new OASOrgApacheSlingEngineParametersInf();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo4 = new OASOrgApacheSlingEngineParametersInf();

        System.assert(orgApacheSlingEngineParametersInfo1.equals(orgApacheSlingEngineParametersInfo2));
        System.assert(orgApacheSlingEngineParametersInfo2.equals(orgApacheSlingEngineParametersInfo1));
        System.assert(orgApacheSlingEngineParametersInfo3.equals(orgApacheSlingEngineParametersInfo4));
        System.assert(orgApacheSlingEngineParametersInfo4.equals(orgApacheSlingEngineParametersInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo1 = OASOrgApacheSlingEngineParametersInf.getExample();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo2 = new OASOrgApacheSlingEngineParametersInf();

        System.assertEquals(false, orgApacheSlingEngineParametersInfo1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEngineParametersInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo1 = OASOrgApacheSlingEngineParametersInf.getExample();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo2 = new OASOrgApacheSlingEngineParametersInf();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo3;

        System.assertEquals(false, orgApacheSlingEngineParametersInfo1.equals(orgApacheSlingEngineParametersInfo3));
        System.assertEquals(false, orgApacheSlingEngineParametersInfo2.equals(orgApacheSlingEngineParametersInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo1 = OASOrgApacheSlingEngineParametersInf.getExample();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo2 = new OASOrgApacheSlingEngineParametersInf();

        System.assertEquals(orgApacheSlingEngineParametersInfo1.hashCode(), orgApacheSlingEngineParametersInfo1.hashCode());
        System.assertEquals(orgApacheSlingEngineParametersInfo2.hashCode(), orgApacheSlingEngineParametersInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo1 = OASOrgApacheSlingEngineParametersInf.getExample();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo2 = OASOrgApacheSlingEngineParametersInf.getExample();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo3 = new OASOrgApacheSlingEngineParametersInf();
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo4 = new OASOrgApacheSlingEngineParametersInf();

        System.assert(orgApacheSlingEngineParametersInfo1.equals(orgApacheSlingEngineParametersInfo2));
        System.assert(orgApacheSlingEngineParametersInfo3.equals(orgApacheSlingEngineParametersInfo4));
        System.assertEquals(orgApacheSlingEngineParametersInfo1.hashCode(), orgApacheSlingEngineParametersInfo2.hashCode());
        System.assertEquals(orgApacheSlingEngineParametersInfo3.hashCode(), orgApacheSlingEngineParametersInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingEngineParametersInf orgApacheSlingEngineParametersInfo = new OASOrgApacheSlingEngineParametersInf();
        Map<String, String> propertyMappings = orgApacheSlingEngineParametersInfo.getPropertyMappings();
        System.assertEquals('bundleLocation', propertyMappings.get('bundle_location'));
        System.assertEquals('serviceLocation', propertyMappings.get('service_location'));
    }
}
