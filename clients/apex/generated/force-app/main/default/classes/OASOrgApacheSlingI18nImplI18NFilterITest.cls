@isTest
private class OASOrgApacheSlingI18nImplI18NFilterITest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo1 = OASOrgApacheSlingI18nImplI18NFilterI.getExample();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo2 = orgApacheSlingI18nImplI18NFilterInfo1;
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo3 = new OASOrgApacheSlingI18nImplI18NFilterI();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo4 = orgApacheSlingI18nImplI18NFilterInfo3;

        System.assert(orgApacheSlingI18nImplI18NFilterInfo1.equals(orgApacheSlingI18nImplI18NFilterInfo2));
        System.assert(orgApacheSlingI18nImplI18NFilterInfo2.equals(orgApacheSlingI18nImplI18NFilterInfo1));
        System.assert(orgApacheSlingI18nImplI18NFilterInfo1.equals(orgApacheSlingI18nImplI18NFilterInfo1));
        System.assert(orgApacheSlingI18nImplI18NFilterInfo3.equals(orgApacheSlingI18nImplI18NFilterInfo4));
        System.assert(orgApacheSlingI18nImplI18NFilterInfo4.equals(orgApacheSlingI18nImplI18NFilterInfo3));
        System.assert(orgApacheSlingI18nImplI18NFilterInfo3.equals(orgApacheSlingI18nImplI18NFilterInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo1 = OASOrgApacheSlingI18nImplI18NFilterI.getExample();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo2 = OASOrgApacheSlingI18nImplI18NFilterI.getExample();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo3 = new OASOrgApacheSlingI18nImplI18NFilterI();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo4 = new OASOrgApacheSlingI18nImplI18NFilterI();

        System.assert(orgApacheSlingI18nImplI18NFilterInfo1.equals(orgApacheSlingI18nImplI18NFilterInfo2));
        System.assert(orgApacheSlingI18nImplI18NFilterInfo2.equals(orgApacheSlingI18nImplI18NFilterInfo1));
        System.assert(orgApacheSlingI18nImplI18NFilterInfo3.equals(orgApacheSlingI18nImplI18NFilterInfo4));
        System.assert(orgApacheSlingI18nImplI18NFilterInfo4.equals(orgApacheSlingI18nImplI18NFilterInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo1 = OASOrgApacheSlingI18nImplI18NFilterI.getExample();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo2 = new OASOrgApacheSlingI18nImplI18NFilterI();

        System.assertEquals(false, orgApacheSlingI18nImplI18NFilterInfo1.equals('foo'));
        System.assertEquals(false, orgApacheSlingI18nImplI18NFilterInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo1 = OASOrgApacheSlingI18nImplI18NFilterI.getExample();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo2 = new OASOrgApacheSlingI18nImplI18NFilterI();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo3;

        System.assertEquals(false, orgApacheSlingI18nImplI18NFilterInfo1.equals(orgApacheSlingI18nImplI18NFilterInfo3));
        System.assertEquals(false, orgApacheSlingI18nImplI18NFilterInfo2.equals(orgApacheSlingI18nImplI18NFilterInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo1 = OASOrgApacheSlingI18nImplI18NFilterI.getExample();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo2 = new OASOrgApacheSlingI18nImplI18NFilterI();

        System.assertEquals(orgApacheSlingI18nImplI18NFilterInfo1.hashCode(), orgApacheSlingI18nImplI18NFilterInfo1.hashCode());
        System.assertEquals(orgApacheSlingI18nImplI18NFilterInfo2.hashCode(), orgApacheSlingI18nImplI18NFilterInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo1 = OASOrgApacheSlingI18nImplI18NFilterI.getExample();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo2 = OASOrgApacheSlingI18nImplI18NFilterI.getExample();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo3 = new OASOrgApacheSlingI18nImplI18NFilterI();
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo4 = new OASOrgApacheSlingI18nImplI18NFilterI();

        System.assert(orgApacheSlingI18nImplI18NFilterInfo1.equals(orgApacheSlingI18nImplI18NFilterInfo2));
        System.assert(orgApacheSlingI18nImplI18NFilterInfo3.equals(orgApacheSlingI18nImplI18NFilterInfo4));
        System.assertEquals(orgApacheSlingI18nImplI18NFilterInfo1.hashCode(), orgApacheSlingI18nImplI18NFilterInfo2.hashCode());
        System.assertEquals(orgApacheSlingI18nImplI18NFilterInfo3.hashCode(), orgApacheSlingI18nImplI18NFilterInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingI18nImplI18NFilterI orgApacheSlingI18nImplI18NFilterInfo = new OASOrgApacheSlingI18nImplI18NFilterI();
        Map<String, String> propertyMappings = orgApacheSlingI18nImplI18NFilterInfo.getPropertyMappings();
        System.assertEquals('bundleLocation', propertyMappings.get('bundle_location'));
        System.assertEquals('serviceLocation', propertyMappings.get('service_location'));
    }
}
