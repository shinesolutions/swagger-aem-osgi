@isTest
private class OASOrgApacheSlingServletsGetDefaultGTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties1 = OASOrgApacheSlingServletsGetDefaultG.getExample();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties2 = orgApacheSlingServletsGetDefaultGetServletProperties1;
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties3 = new OASOrgApacheSlingServletsGetDefaultG();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties4 = orgApacheSlingServletsGetDefaultGetServletProperties3;

        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties1.equals(orgApacheSlingServletsGetDefaultGetServletProperties2));
        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties2.equals(orgApacheSlingServletsGetDefaultGetServletProperties1));
        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties1.equals(orgApacheSlingServletsGetDefaultGetServletProperties1));
        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties3.equals(orgApacheSlingServletsGetDefaultGetServletProperties4));
        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties4.equals(orgApacheSlingServletsGetDefaultGetServletProperties3));
        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties3.equals(orgApacheSlingServletsGetDefaultGetServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties1 = OASOrgApacheSlingServletsGetDefaultG.getExample();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties2 = OASOrgApacheSlingServletsGetDefaultG.getExample();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties3 = new OASOrgApacheSlingServletsGetDefaultG();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties4 = new OASOrgApacheSlingServletsGetDefaultG();

        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties1.equals(orgApacheSlingServletsGetDefaultGetServletProperties2));
        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties2.equals(orgApacheSlingServletsGetDefaultGetServletProperties1));
        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties3.equals(orgApacheSlingServletsGetDefaultGetServletProperties4));
        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties4.equals(orgApacheSlingServletsGetDefaultGetServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties1 = OASOrgApacheSlingServletsGetDefaultG.getExample();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties2 = new OASOrgApacheSlingServletsGetDefaultG();

        System.assertEquals(false, orgApacheSlingServletsGetDefaultGetServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingServletsGetDefaultGetServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties1 = OASOrgApacheSlingServletsGetDefaultG.getExample();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties2 = new OASOrgApacheSlingServletsGetDefaultG();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties3;

        System.assertEquals(false, orgApacheSlingServletsGetDefaultGetServletProperties1.equals(orgApacheSlingServletsGetDefaultGetServletProperties3));
        System.assertEquals(false, orgApacheSlingServletsGetDefaultGetServletProperties2.equals(orgApacheSlingServletsGetDefaultGetServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties1 = OASOrgApacheSlingServletsGetDefaultG.getExample();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties2 = new OASOrgApacheSlingServletsGetDefaultG();

        System.assertEquals(orgApacheSlingServletsGetDefaultGetServletProperties1.hashCode(), orgApacheSlingServletsGetDefaultGetServletProperties1.hashCode());
        System.assertEquals(orgApacheSlingServletsGetDefaultGetServletProperties2.hashCode(), orgApacheSlingServletsGetDefaultGetServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties1 = OASOrgApacheSlingServletsGetDefaultG.getExample();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties2 = OASOrgApacheSlingServletsGetDefaultG.getExample();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties3 = new OASOrgApacheSlingServletsGetDefaultG();
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties4 = new OASOrgApacheSlingServletsGetDefaultG();

        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties1.equals(orgApacheSlingServletsGetDefaultGetServletProperties2));
        System.assert(orgApacheSlingServletsGetDefaultGetServletProperties3.equals(orgApacheSlingServletsGetDefaultGetServletProperties4));
        System.assertEquals(orgApacheSlingServletsGetDefaultGetServletProperties1.hashCode(), orgApacheSlingServletsGetDefaultGetServletProperties2.hashCode());
        System.assertEquals(orgApacheSlingServletsGetDefaultGetServletProperties3.hashCode(), orgApacheSlingServletsGetDefaultGetServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingServletsGetDefaultG orgApacheSlingServletsGetDefaultGetServletProperties = new OASOrgApacheSlingServletsGetDefaultG();
        Map<String, String> propertyMappings = orgApacheSlingServletsGetDefaultGetServletProperties.getPropertyMappings();
        System.assertEquals('indexFiles', propertyMappings.get('index.files'));
        System.assertEquals('enableHtml', propertyMappings.get('enable.html'));
        System.assertEquals('enableJson', propertyMappings.get('enable.json'));
        System.assertEquals('enableTxt', propertyMappings.get('enable.txt'));
        System.assertEquals('enableXml', propertyMappings.get('enable.xml'));
        System.assertEquals('jsonMaximumresults', propertyMappings.get('json.maximumresults'));
    }
}
