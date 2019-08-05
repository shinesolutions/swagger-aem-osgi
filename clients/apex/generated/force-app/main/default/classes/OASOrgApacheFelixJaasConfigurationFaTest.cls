@isTest
private class OASOrgApacheFelixJaasConfigurationFaTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties1 = OASOrgApacheFelixJaasConfigurationFa.getExample();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties2 = orgApacheFelixJaasConfigurationFactoryProperties1;
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties3 = new OASOrgApacheFelixJaasConfigurationFa();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties4 = orgApacheFelixJaasConfigurationFactoryProperties3;

        System.assert(orgApacheFelixJaasConfigurationFactoryProperties1.equals(orgApacheFelixJaasConfigurationFactoryProperties2));
        System.assert(orgApacheFelixJaasConfigurationFactoryProperties2.equals(orgApacheFelixJaasConfigurationFactoryProperties1));
        System.assert(orgApacheFelixJaasConfigurationFactoryProperties1.equals(orgApacheFelixJaasConfigurationFactoryProperties1));
        System.assert(orgApacheFelixJaasConfigurationFactoryProperties3.equals(orgApacheFelixJaasConfigurationFactoryProperties4));
        System.assert(orgApacheFelixJaasConfigurationFactoryProperties4.equals(orgApacheFelixJaasConfigurationFactoryProperties3));
        System.assert(orgApacheFelixJaasConfigurationFactoryProperties3.equals(orgApacheFelixJaasConfigurationFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties1 = OASOrgApacheFelixJaasConfigurationFa.getExample();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties2 = OASOrgApacheFelixJaasConfigurationFa.getExample();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties3 = new OASOrgApacheFelixJaasConfigurationFa();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties4 = new OASOrgApacheFelixJaasConfigurationFa();

        System.assert(orgApacheFelixJaasConfigurationFactoryProperties1.equals(orgApacheFelixJaasConfigurationFactoryProperties2));
        System.assert(orgApacheFelixJaasConfigurationFactoryProperties2.equals(orgApacheFelixJaasConfigurationFactoryProperties1));
        System.assert(orgApacheFelixJaasConfigurationFactoryProperties3.equals(orgApacheFelixJaasConfigurationFactoryProperties4));
        System.assert(orgApacheFelixJaasConfigurationFactoryProperties4.equals(orgApacheFelixJaasConfigurationFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties1 = OASOrgApacheFelixJaasConfigurationFa.getExample();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties2 = new OASOrgApacheFelixJaasConfigurationFa();

        System.assertEquals(false, orgApacheFelixJaasConfigurationFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixJaasConfigurationFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties1 = OASOrgApacheFelixJaasConfigurationFa.getExample();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties2 = new OASOrgApacheFelixJaasConfigurationFa();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties3;

        System.assertEquals(false, orgApacheFelixJaasConfigurationFactoryProperties1.equals(orgApacheFelixJaasConfigurationFactoryProperties3));
        System.assertEquals(false, orgApacheFelixJaasConfigurationFactoryProperties2.equals(orgApacheFelixJaasConfigurationFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties1 = OASOrgApacheFelixJaasConfigurationFa.getExample();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties2 = new OASOrgApacheFelixJaasConfigurationFa();

        System.assertEquals(orgApacheFelixJaasConfigurationFactoryProperties1.hashCode(), orgApacheFelixJaasConfigurationFactoryProperties1.hashCode());
        System.assertEquals(orgApacheFelixJaasConfigurationFactoryProperties2.hashCode(), orgApacheFelixJaasConfigurationFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties1 = OASOrgApacheFelixJaasConfigurationFa.getExample();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties2 = OASOrgApacheFelixJaasConfigurationFa.getExample();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties3 = new OASOrgApacheFelixJaasConfigurationFa();
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties4 = new OASOrgApacheFelixJaasConfigurationFa();

        System.assert(orgApacheFelixJaasConfigurationFactoryProperties1.equals(orgApacheFelixJaasConfigurationFactoryProperties2));
        System.assert(orgApacheFelixJaasConfigurationFactoryProperties3.equals(orgApacheFelixJaasConfigurationFactoryProperties4));
        System.assertEquals(orgApacheFelixJaasConfigurationFactoryProperties1.hashCode(), orgApacheFelixJaasConfigurationFactoryProperties2.hashCode());
        System.assertEquals(orgApacheFelixJaasConfigurationFactoryProperties3.hashCode(), orgApacheFelixJaasConfigurationFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixJaasConfigurationFa orgApacheFelixJaasConfigurationFactoryProperties = new OASOrgApacheFelixJaasConfigurationFa();
        Map<String, String> propertyMappings = orgApacheFelixJaasConfigurationFactoryProperties.getPropertyMappings();
        System.assertEquals('jaasControlFlag', propertyMappings.get('jaas.controlFlag'));
        System.assertEquals('jaasRanking', propertyMappings.get('jaas.ranking'));
        System.assertEquals('jaasRealmName', propertyMappings.get('jaas.realmName'));
        System.assertEquals('jaasClassname', propertyMappings.get('jaas.classname'));
        System.assertEquals('jaasOptions', propertyMappings.get('jaas.options'));
    }
}
