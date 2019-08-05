@isTest
private class OASOrgApacheSlingCommonsHtmlInternalTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1 = OASOrgApacheSlingCommonsHtmlInternal.getExample();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2 = orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1;
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3 = new OASOrgApacheSlingCommonsHtmlInternal();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties4 = orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3;

        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2));
        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1));
        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1));
        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties4));
        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties4.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3));
        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1 = OASOrgApacheSlingCommonsHtmlInternal.getExample();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2 = OASOrgApacheSlingCommonsHtmlInternal.getExample();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3 = new OASOrgApacheSlingCommonsHtmlInternal();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties4 = new OASOrgApacheSlingCommonsHtmlInternal();

        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2));
        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1));
        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties4));
        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties4.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1 = OASOrgApacheSlingCommonsHtmlInternal.getExample();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2 = new OASOrgApacheSlingCommonsHtmlInternal();

        System.assertEquals(false, orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1 = OASOrgApacheSlingCommonsHtmlInternal.getExample();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2 = new OASOrgApacheSlingCommonsHtmlInternal();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3;

        System.assertEquals(false, orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3));
        System.assertEquals(false, orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1 = OASOrgApacheSlingCommonsHtmlInternal.getExample();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2 = new OASOrgApacheSlingCommonsHtmlInternal();

        System.assertEquals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1.hashCode(), orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1.hashCode());
        System.assertEquals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2.hashCode(), orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1 = OASOrgApacheSlingCommonsHtmlInternal.getExample();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2 = OASOrgApacheSlingCommonsHtmlInternal.getExample();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3 = new OASOrgApacheSlingCommonsHtmlInternal();
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties4 = new OASOrgApacheSlingCommonsHtmlInternal();

        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2));
        System.assert(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3.equals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties4));
        System.assertEquals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties1.hashCode(), orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties2.hashCode());
        System.assertEquals(orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties3.hashCode(), orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingCommonsHtmlInternal orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties = new OASOrgApacheSlingCommonsHtmlInternal();
        Map<String, String> propertyMappings = orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.getPropertyMappings();
        System.assertEquals('parserFeatures', propertyMappings.get('parser.features'));
    }
}
