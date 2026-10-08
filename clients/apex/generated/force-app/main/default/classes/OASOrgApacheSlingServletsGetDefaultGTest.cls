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
        Map<String, String> x-property-mappings = orgApacheSlingServletsGetDefaultGetServletProperties.getx-property-mappings();
        System.assertEquals('indexFiles', x-property-mappings.get('index.files'));
        System.assertEquals('enableHtml', x-property-mappings.get('enable.html'));
        System.assertEquals('enableJson', x-property-mappings.get('enable.json'));
        System.assertEquals('enableTxt', x-property-mappings.get('enable.txt'));
        System.assertEquals('enableXml', x-property-mappings.get('enable.xml'));
        System.assertEquals('jsonMaximumresults', x-property-mappings.get('json.maximumresults'));
    }
}
