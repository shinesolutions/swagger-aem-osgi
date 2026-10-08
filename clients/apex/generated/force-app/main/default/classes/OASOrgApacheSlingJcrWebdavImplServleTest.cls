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
        Map<String, String> x-property-mappings = orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.getx-property-mappings();
        System.assertEquals('davRoot', x-property-mappings.get('dav.root'));
        System.assertEquals('davCreateAbsoluteUri', x-property-mappings.get('dav.create-absolute-uri'));
        System.assertEquals('davRealm', x-property-mappings.get('dav.realm'));
        System.assertEquals('collectionTypes', x-property-mappings.get('collection.types'));
        System.assertEquals('filterPrefixes', x-property-mappings.get('filter.prefixes'));
        System.assertEquals('filterTypes', x-property-mappings.get('filter.types'));
        System.assertEquals('filterUris', x-property-mappings.get('filter.uris'));
        System.assertEquals('typeCollections', x-property-mappings.get('type.collections'));
        System.assertEquals('typeNoncollections', x-property-mappings.get('type.noncollections'));
        System.assertEquals('typeContent', x-property-mappings.get('type.content'));
    }
}
