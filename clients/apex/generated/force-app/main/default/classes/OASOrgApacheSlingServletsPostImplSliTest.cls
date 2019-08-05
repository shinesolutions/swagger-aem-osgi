@isTest
private class OASOrgApacheSlingServletsPostImplSliTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties1 = OASOrgApacheSlingServletsPostImplSli.getExample();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties2 = orgApacheSlingServletsPostImplSlingPostServletProperties1;
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties3 = new OASOrgApacheSlingServletsPostImplSli();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties4 = orgApacheSlingServletsPostImplSlingPostServletProperties3;

        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties1.equals(orgApacheSlingServletsPostImplSlingPostServletProperties2));
        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties2.equals(orgApacheSlingServletsPostImplSlingPostServletProperties1));
        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties1.equals(orgApacheSlingServletsPostImplSlingPostServletProperties1));
        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties3.equals(orgApacheSlingServletsPostImplSlingPostServletProperties4));
        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties4.equals(orgApacheSlingServletsPostImplSlingPostServletProperties3));
        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties3.equals(orgApacheSlingServletsPostImplSlingPostServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties1 = OASOrgApacheSlingServletsPostImplSli.getExample();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties2 = OASOrgApacheSlingServletsPostImplSli.getExample();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties3 = new OASOrgApacheSlingServletsPostImplSli();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties4 = new OASOrgApacheSlingServletsPostImplSli();

        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties1.equals(orgApacheSlingServletsPostImplSlingPostServletProperties2));
        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties2.equals(orgApacheSlingServletsPostImplSlingPostServletProperties1));
        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties3.equals(orgApacheSlingServletsPostImplSlingPostServletProperties4));
        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties4.equals(orgApacheSlingServletsPostImplSlingPostServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties1 = OASOrgApacheSlingServletsPostImplSli.getExample();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties2 = new OASOrgApacheSlingServletsPostImplSli();

        System.assertEquals(false, orgApacheSlingServletsPostImplSlingPostServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingServletsPostImplSlingPostServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties1 = OASOrgApacheSlingServletsPostImplSli.getExample();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties2 = new OASOrgApacheSlingServletsPostImplSli();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties3;

        System.assertEquals(false, orgApacheSlingServletsPostImplSlingPostServletProperties1.equals(orgApacheSlingServletsPostImplSlingPostServletProperties3));
        System.assertEquals(false, orgApacheSlingServletsPostImplSlingPostServletProperties2.equals(orgApacheSlingServletsPostImplSlingPostServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties1 = OASOrgApacheSlingServletsPostImplSli.getExample();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties2 = new OASOrgApacheSlingServletsPostImplSli();

        System.assertEquals(orgApacheSlingServletsPostImplSlingPostServletProperties1.hashCode(), orgApacheSlingServletsPostImplSlingPostServletProperties1.hashCode());
        System.assertEquals(orgApacheSlingServletsPostImplSlingPostServletProperties2.hashCode(), orgApacheSlingServletsPostImplSlingPostServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties1 = OASOrgApacheSlingServletsPostImplSli.getExample();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties2 = OASOrgApacheSlingServletsPostImplSli.getExample();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties3 = new OASOrgApacheSlingServletsPostImplSli();
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties4 = new OASOrgApacheSlingServletsPostImplSli();

        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties1.equals(orgApacheSlingServletsPostImplSlingPostServletProperties2));
        System.assert(orgApacheSlingServletsPostImplSlingPostServletProperties3.equals(orgApacheSlingServletsPostImplSlingPostServletProperties4));
        System.assertEquals(orgApacheSlingServletsPostImplSlingPostServletProperties1.hashCode(), orgApacheSlingServletsPostImplSlingPostServletProperties2.hashCode());
        System.assertEquals(orgApacheSlingServletsPostImplSlingPostServletProperties3.hashCode(), orgApacheSlingServletsPostImplSlingPostServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingServletsPostImplSli orgApacheSlingServletsPostImplSlingPostServletProperties = new OASOrgApacheSlingServletsPostImplSli();
        Map<String, String> propertyMappings = orgApacheSlingServletsPostImplSlingPostServletProperties.getPropertyMappings();
        System.assertEquals('servletPostDateFormats', propertyMappings.get('servlet.post.dateFormats'));
        System.assertEquals('servletPostNodeNameHints', propertyMappings.get('servlet.post.nodeNameHints'));
        System.assertEquals('servletPostNodeNameMaxLength', propertyMappings.get('servlet.post.nodeNameMaxLength'));
        System.assertEquals('servletPostCheckinNewVersionableNodes', propertyMappings.get('servlet.post.checkinNewVersionableNodes'));
        System.assertEquals('servletPostAutoCheckout', propertyMappings.get('servlet.post.autoCheckout'));
        System.assertEquals('servletPostAutoCheckin', propertyMappings.get('servlet.post.autoCheckin'));
        System.assertEquals('servletPostIgnorePattern', propertyMappings.get('servlet.post.ignorePattern'));
    }
}
