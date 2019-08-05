@isTest
private class OASOrgApacheSlingCommonsMimeInternalTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1 = OASOrgApacheSlingCommonsMimeInternal.getExample();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2 = orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1;
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3 = new OASOrgApacheSlingCommonsMimeInternal();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties4 = orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3;

        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2));
        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1));
        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1));
        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties4));
        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties4.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3));
        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1 = OASOrgApacheSlingCommonsMimeInternal.getExample();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2 = OASOrgApacheSlingCommonsMimeInternal.getExample();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3 = new OASOrgApacheSlingCommonsMimeInternal();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties4 = new OASOrgApacheSlingCommonsMimeInternal();

        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2));
        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1));
        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties4));
        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties4.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1 = OASOrgApacheSlingCommonsMimeInternal.getExample();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2 = new OASOrgApacheSlingCommonsMimeInternal();

        System.assertEquals(false, orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1 = OASOrgApacheSlingCommonsMimeInternal.getExample();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2 = new OASOrgApacheSlingCommonsMimeInternal();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3;

        System.assertEquals(false, orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3));
        System.assertEquals(false, orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1 = OASOrgApacheSlingCommonsMimeInternal.getExample();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2 = new OASOrgApacheSlingCommonsMimeInternal();

        System.assertEquals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1.hashCode(), orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1.hashCode());
        System.assertEquals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2.hashCode(), orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1 = OASOrgApacheSlingCommonsMimeInternal.getExample();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2 = OASOrgApacheSlingCommonsMimeInternal.getExample();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3 = new OASOrgApacheSlingCommonsMimeInternal();
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties4 = new OASOrgApacheSlingCommonsMimeInternal();

        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2));
        System.assert(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3.equals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties4));
        System.assertEquals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties1.hashCode(), orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties2.hashCode());
        System.assertEquals(orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties3.hashCode(), orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingCommonsMimeInternal orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties = new OASOrgApacheSlingCommonsMimeInternal();
        Map<String, String> propertyMappings = orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.getPropertyMappings();
        System.assertEquals('mimeTypes', propertyMappings.get('mime.types'));
    }
}
