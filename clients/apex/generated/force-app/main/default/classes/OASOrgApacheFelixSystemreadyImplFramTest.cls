@isTest
private class OASOrgApacheFelixSystemreadyImplFramTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1 = OASOrgApacheFelixSystemreadyImplFram.getExample();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2 = orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1;
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3 = new OASOrgApacheFelixSystemreadyImplFram();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties4 = orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3;

        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2));
        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1));
        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1));
        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties4));
        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties4.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3));
        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1 = OASOrgApacheFelixSystemreadyImplFram.getExample();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2 = OASOrgApacheFelixSystemreadyImplFram.getExample();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3 = new OASOrgApacheFelixSystemreadyImplFram();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties4 = new OASOrgApacheFelixSystemreadyImplFram();

        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2));
        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1));
        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties4));
        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties4.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1 = OASOrgApacheFelixSystemreadyImplFram.getExample();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2 = new OASOrgApacheFelixSystemreadyImplFram();

        System.assertEquals(false, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1 = OASOrgApacheFelixSystemreadyImplFram.getExample();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2 = new OASOrgApacheFelixSystemreadyImplFram();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3;

        System.assertEquals(false, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3));
        System.assertEquals(false, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1 = OASOrgApacheFelixSystemreadyImplFram.getExample();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2 = new OASOrgApacheFelixSystemreadyImplFram();

        System.assertEquals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1.hashCode(), orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1.hashCode());
        System.assertEquals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2.hashCode(), orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1 = OASOrgApacheFelixSystemreadyImplFram.getExample();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2 = OASOrgApacheFelixSystemreadyImplFram.getExample();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3 = new OASOrgApacheFelixSystemreadyImplFram();
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties4 = new OASOrgApacheFelixSystemreadyImplFram();

        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2));
        System.assert(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3.equals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties4));
        System.assertEquals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties1.hashCode(), orgApacheFelixSystemreadyImplFrameworkStartCheckProperties2.hashCode());
        System.assertEquals(orgApacheFelixSystemreadyImplFrameworkStartCheckProperties3.hashCode(), orgApacheFelixSystemreadyImplFrameworkStartCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixSystemreadyImplFram orgApacheFelixSystemreadyImplFrameworkStartCheckProperties = new OASOrgApacheFelixSystemreadyImplFram();
        Map<String, String> propertyMappings = orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.getPropertyMappings();
        System.assertEquals('targetStartLevel', propertyMappings.get('target.start.level'));
        System.assertEquals('targetStartLevelPropName', propertyMappings.get('target.start.level.prop.name'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
