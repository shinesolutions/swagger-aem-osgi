@isTest
private class OASOrgApacheSlingHapiImplHApiUtilImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties1 = OASOrgApacheSlingHapiImplHApiUtilImp.getExample();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties2 = orgApacheSlingHapiImplHApiUtilImplProperties1;
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties3 = new OASOrgApacheSlingHapiImplHApiUtilImp();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties4 = orgApacheSlingHapiImplHApiUtilImplProperties3;

        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties1.equals(orgApacheSlingHapiImplHApiUtilImplProperties2));
        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties2.equals(orgApacheSlingHapiImplHApiUtilImplProperties1));
        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties1.equals(orgApacheSlingHapiImplHApiUtilImplProperties1));
        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties3.equals(orgApacheSlingHapiImplHApiUtilImplProperties4));
        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties4.equals(orgApacheSlingHapiImplHApiUtilImplProperties3));
        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties3.equals(orgApacheSlingHapiImplHApiUtilImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties1 = OASOrgApacheSlingHapiImplHApiUtilImp.getExample();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties2 = OASOrgApacheSlingHapiImplHApiUtilImp.getExample();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties3 = new OASOrgApacheSlingHapiImplHApiUtilImp();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties4 = new OASOrgApacheSlingHapiImplHApiUtilImp();

        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties1.equals(orgApacheSlingHapiImplHApiUtilImplProperties2));
        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties2.equals(orgApacheSlingHapiImplHApiUtilImplProperties1));
        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties3.equals(orgApacheSlingHapiImplHApiUtilImplProperties4));
        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties4.equals(orgApacheSlingHapiImplHApiUtilImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties1 = OASOrgApacheSlingHapiImplHApiUtilImp.getExample();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties2 = new OASOrgApacheSlingHapiImplHApiUtilImp();

        System.assertEquals(false, orgApacheSlingHapiImplHApiUtilImplProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingHapiImplHApiUtilImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties1 = OASOrgApacheSlingHapiImplHApiUtilImp.getExample();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties2 = new OASOrgApacheSlingHapiImplHApiUtilImp();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties3;

        System.assertEquals(false, orgApacheSlingHapiImplHApiUtilImplProperties1.equals(orgApacheSlingHapiImplHApiUtilImplProperties3));
        System.assertEquals(false, orgApacheSlingHapiImplHApiUtilImplProperties2.equals(orgApacheSlingHapiImplHApiUtilImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties1 = OASOrgApacheSlingHapiImplHApiUtilImp.getExample();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties2 = new OASOrgApacheSlingHapiImplHApiUtilImp();

        System.assertEquals(orgApacheSlingHapiImplHApiUtilImplProperties1.hashCode(), orgApacheSlingHapiImplHApiUtilImplProperties1.hashCode());
        System.assertEquals(orgApacheSlingHapiImplHApiUtilImplProperties2.hashCode(), orgApacheSlingHapiImplHApiUtilImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties1 = OASOrgApacheSlingHapiImplHApiUtilImp.getExample();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties2 = OASOrgApacheSlingHapiImplHApiUtilImp.getExample();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties3 = new OASOrgApacheSlingHapiImplHApiUtilImp();
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties4 = new OASOrgApacheSlingHapiImplHApiUtilImp();

        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties1.equals(orgApacheSlingHapiImplHApiUtilImplProperties2));
        System.assert(orgApacheSlingHapiImplHApiUtilImplProperties3.equals(orgApacheSlingHapiImplHApiUtilImplProperties4));
        System.assertEquals(orgApacheSlingHapiImplHApiUtilImplProperties1.hashCode(), orgApacheSlingHapiImplHApiUtilImplProperties2.hashCode());
        System.assertEquals(orgApacheSlingHapiImplHApiUtilImplProperties3.hashCode(), orgApacheSlingHapiImplHApiUtilImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingHapiImplHApiUtilImp orgApacheSlingHapiImplHApiUtilImplProperties = new OASOrgApacheSlingHapiImplHApiUtilImp();
        Map<String, String> propertyMappings = orgApacheSlingHapiImplHApiUtilImplProperties.getPropertyMappings();
        System.assertEquals('orgApacheSlingHapiToolsResourcetype', propertyMappings.get('org.apache.sling.hapi.tools.resourcetype'));
        System.assertEquals('orgApacheSlingHapiToolsCollectionresourcetype', propertyMappings.get('org.apache.sling.hapi.tools.collectionresourcetype'));
        System.assertEquals('orgApacheSlingHapiToolsSearchpaths', propertyMappings.get('org.apache.sling.hapi.tools.searchpaths'));
        System.assertEquals('orgApacheSlingHapiToolsExternalurl', propertyMappings.get('org.apache.sling.hapi.tools.externalurl'));
        System.assertEquals('orgApacheSlingHapiToolsEnabled', propertyMappings.get('org.apache.sling.hapi.tools.enabled'));
    }
}
