@isTest
private class OASOrgApacheSlingModelsJacksonexportTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1 = OASOrgApacheSlingModelsJacksonexport.getExample();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2 = orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1;
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3 = new OASOrgApacheSlingModelsJacksonexport();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties4 = orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3;

        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2));
        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1));
        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1));
        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties4));
        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties4.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3));
        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1 = OASOrgApacheSlingModelsJacksonexport.getExample();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2 = OASOrgApacheSlingModelsJacksonexport.getExample();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3 = new OASOrgApacheSlingModelsJacksonexport();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties4 = new OASOrgApacheSlingModelsJacksonexport();

        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2));
        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1));
        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties4));
        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties4.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1 = OASOrgApacheSlingModelsJacksonexport.getExample();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2 = new OASOrgApacheSlingModelsJacksonexport();

        System.assertEquals(false, orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1 = OASOrgApacheSlingModelsJacksonexport.getExample();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2 = new OASOrgApacheSlingModelsJacksonexport();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3;

        System.assertEquals(false, orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3));
        System.assertEquals(false, orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1 = OASOrgApacheSlingModelsJacksonexport.getExample();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2 = new OASOrgApacheSlingModelsJacksonexport();

        System.assertEquals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1.hashCode(), orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1.hashCode());
        System.assertEquals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2.hashCode(), orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1 = OASOrgApacheSlingModelsJacksonexport.getExample();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2 = OASOrgApacheSlingModelsJacksonexport.getExample();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3 = new OASOrgApacheSlingModelsJacksonexport();
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties4 = new OASOrgApacheSlingModelsJacksonexport();

        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2));
        System.assert(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3.equals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties4));
        System.assertEquals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties1.hashCode(), orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties2.hashCode());
        System.assertEquals(orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties3.hashCode(), orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingModelsJacksonexport orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties = new OASOrgApacheSlingModelsJacksonexport();
        Map<String, String> propertyMappings = orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.getPropertyMappings();
        System.assertEquals('maxRecursionLevels', propertyMappings.get('max.recursion.levels'));
    }
}
