@isTest
private class OASOrgApacheSlingJcrWebdavImplServleTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1 = OASOrgApacheSlingJcrWebdavImplServle.getExample();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2 = orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1;
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3 = new OASOrgApacheSlingJcrWebdavImplServle();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties4 = orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3;

        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2));
        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1));
        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1));
        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties4));
        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties4.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3));
        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1 = OASOrgApacheSlingJcrWebdavImplServle.getExample();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2 = OASOrgApacheSlingJcrWebdavImplServle.getExample();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3 = new OASOrgApacheSlingJcrWebdavImplServle();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties4 = new OASOrgApacheSlingJcrWebdavImplServle();

        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2));
        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1));
        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties4));
        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties4.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1 = OASOrgApacheSlingJcrWebdavImplServle.getExample();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2 = new OASOrgApacheSlingJcrWebdavImplServle();

        System.assertEquals(false, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1 = OASOrgApacheSlingJcrWebdavImplServle.getExample();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2 = new OASOrgApacheSlingJcrWebdavImplServle();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3;

        System.assertEquals(false, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3));
        System.assertEquals(false, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1 = OASOrgApacheSlingJcrWebdavImplServle.getExample();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2 = new OASOrgApacheSlingJcrWebdavImplServle();

        System.assertEquals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1.hashCode(), orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1.hashCode());
        System.assertEquals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2.hashCode(), orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1 = OASOrgApacheSlingJcrWebdavImplServle.getExample();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2 = OASOrgApacheSlingJcrWebdavImplServle.getExample();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3 = new OASOrgApacheSlingJcrWebdavImplServle();
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties4 = new OASOrgApacheSlingJcrWebdavImplServle();

        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2));
        System.assert(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3.equals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties4));
        System.assertEquals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties1.hashCode(), orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties2.hashCode());
        System.assertEquals(orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties3.hashCode(), orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingJcrWebdavImplServle orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties = new OASOrgApacheSlingJcrWebdavImplServle();
        Map<String, String> propertyMappings = orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.getPropertyMappings();
        System.assertEquals('davRoot', propertyMappings.get('dav.root'));
        System.assertEquals('davCreateAbsoluteUri', propertyMappings.get('dav.create-absolute-uri'));
        System.assertEquals('davRealm', propertyMappings.get('dav.realm'));
        System.assertEquals('collectionTypes', propertyMappings.get('collection.types'));
        System.assertEquals('filterPrefixes', propertyMappings.get('filter.prefixes'));
        System.assertEquals('filterTypes', propertyMappings.get('filter.types'));
        System.assertEquals('filterUris', propertyMappings.get('filter.uris'));
        System.assertEquals('typeCollections', propertyMappings.get('type.collections'));
        System.assertEquals('typeNoncollections', propertyMappings.get('type.noncollections'));
        System.assertEquals('typeContent', propertyMappings.get('type.content'));
    }
}
