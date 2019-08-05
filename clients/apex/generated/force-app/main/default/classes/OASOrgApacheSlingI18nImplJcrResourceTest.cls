@isTest
private class OASOrgApacheSlingI18nImplJcrResourceTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties1 = OASOrgApacheSlingI18nImplJcrResource.getExample();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties2 = orgApacheSlingI18nImplJcrResourceBundleProviderProperties1;
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties3 = new OASOrgApacheSlingI18nImplJcrResource();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties4 = orgApacheSlingI18nImplJcrResourceBundleProviderProperties3;

        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties1.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties2));
        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties2.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties1));
        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties1.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties1));
        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties4));
        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties4.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3));
        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties1 = OASOrgApacheSlingI18nImplJcrResource.getExample();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties2 = OASOrgApacheSlingI18nImplJcrResource.getExample();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties3 = new OASOrgApacheSlingI18nImplJcrResource();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties4 = new OASOrgApacheSlingI18nImplJcrResource();

        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties1.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties2));
        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties2.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties1));
        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties4));
        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties4.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties1 = OASOrgApacheSlingI18nImplJcrResource.getExample();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties2 = new OASOrgApacheSlingI18nImplJcrResource();

        System.assertEquals(false, orgApacheSlingI18nImplJcrResourceBundleProviderProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingI18nImplJcrResourceBundleProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties1 = OASOrgApacheSlingI18nImplJcrResource.getExample();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties2 = new OASOrgApacheSlingI18nImplJcrResource();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties3;

        System.assertEquals(false, orgApacheSlingI18nImplJcrResourceBundleProviderProperties1.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3));
        System.assertEquals(false, orgApacheSlingI18nImplJcrResourceBundleProviderProperties2.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties1 = OASOrgApacheSlingI18nImplJcrResource.getExample();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties2 = new OASOrgApacheSlingI18nImplJcrResource();

        System.assertEquals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties1.hashCode(), orgApacheSlingI18nImplJcrResourceBundleProviderProperties1.hashCode());
        System.assertEquals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties2.hashCode(), orgApacheSlingI18nImplJcrResourceBundleProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties1 = OASOrgApacheSlingI18nImplJcrResource.getExample();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties2 = OASOrgApacheSlingI18nImplJcrResource.getExample();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties3 = new OASOrgApacheSlingI18nImplJcrResource();
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties4 = new OASOrgApacheSlingI18nImplJcrResource();

        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties1.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties2));
        System.assert(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3.equals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties4));
        System.assertEquals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties1.hashCode(), orgApacheSlingI18nImplJcrResourceBundleProviderProperties2.hashCode());
        System.assertEquals(orgApacheSlingI18nImplJcrResourceBundleProviderProperties3.hashCode(), orgApacheSlingI18nImplJcrResourceBundleProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingI18nImplJcrResource orgApacheSlingI18nImplJcrResourceBundleProviderProperties = new OASOrgApacheSlingI18nImplJcrResource();
        Map<String, String> propertyMappings = orgApacheSlingI18nImplJcrResourceBundleProviderProperties.getPropertyMappings();
        System.assertEquals('localeDefault', propertyMappings.get('locale.default'));
        System.assertEquals('preloadBundles', propertyMappings.get('preload.bundles'));
        System.assertEquals('invalidationDelay', propertyMappings.get('invalidation.delay'));
    }
}
