@isTest
private class OASOrgApacheFelixJaasConfigurationSpTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties1 = OASOrgApacheFelixJaasConfigurationSp.getExample();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties2 = orgApacheFelixJaasConfigurationSpiProperties1;
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties3 = new OASOrgApacheFelixJaasConfigurationSp();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties4 = orgApacheFelixJaasConfigurationSpiProperties3;

        System.assert(orgApacheFelixJaasConfigurationSpiProperties1.equals(orgApacheFelixJaasConfigurationSpiProperties2));
        System.assert(orgApacheFelixJaasConfigurationSpiProperties2.equals(orgApacheFelixJaasConfigurationSpiProperties1));
        System.assert(orgApacheFelixJaasConfigurationSpiProperties1.equals(orgApacheFelixJaasConfigurationSpiProperties1));
        System.assert(orgApacheFelixJaasConfigurationSpiProperties3.equals(orgApacheFelixJaasConfigurationSpiProperties4));
        System.assert(orgApacheFelixJaasConfigurationSpiProperties4.equals(orgApacheFelixJaasConfigurationSpiProperties3));
        System.assert(orgApacheFelixJaasConfigurationSpiProperties3.equals(orgApacheFelixJaasConfigurationSpiProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties1 = OASOrgApacheFelixJaasConfigurationSp.getExample();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties2 = OASOrgApacheFelixJaasConfigurationSp.getExample();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties3 = new OASOrgApacheFelixJaasConfigurationSp();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties4 = new OASOrgApacheFelixJaasConfigurationSp();

        System.assert(orgApacheFelixJaasConfigurationSpiProperties1.equals(orgApacheFelixJaasConfigurationSpiProperties2));
        System.assert(orgApacheFelixJaasConfigurationSpiProperties2.equals(orgApacheFelixJaasConfigurationSpiProperties1));
        System.assert(orgApacheFelixJaasConfigurationSpiProperties3.equals(orgApacheFelixJaasConfigurationSpiProperties4));
        System.assert(orgApacheFelixJaasConfigurationSpiProperties4.equals(orgApacheFelixJaasConfigurationSpiProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties1 = OASOrgApacheFelixJaasConfigurationSp.getExample();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties2 = new OASOrgApacheFelixJaasConfigurationSp();

        System.assertEquals(false, orgApacheFelixJaasConfigurationSpiProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixJaasConfigurationSpiProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties1 = OASOrgApacheFelixJaasConfigurationSp.getExample();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties2 = new OASOrgApacheFelixJaasConfigurationSp();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties3;

        System.assertEquals(false, orgApacheFelixJaasConfigurationSpiProperties1.equals(orgApacheFelixJaasConfigurationSpiProperties3));
        System.assertEquals(false, orgApacheFelixJaasConfigurationSpiProperties2.equals(orgApacheFelixJaasConfigurationSpiProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties1 = OASOrgApacheFelixJaasConfigurationSp.getExample();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties2 = new OASOrgApacheFelixJaasConfigurationSp();

        System.assertEquals(orgApacheFelixJaasConfigurationSpiProperties1.hashCode(), orgApacheFelixJaasConfigurationSpiProperties1.hashCode());
        System.assertEquals(orgApacheFelixJaasConfigurationSpiProperties2.hashCode(), orgApacheFelixJaasConfigurationSpiProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties1 = OASOrgApacheFelixJaasConfigurationSp.getExample();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties2 = OASOrgApacheFelixJaasConfigurationSp.getExample();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties3 = new OASOrgApacheFelixJaasConfigurationSp();
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties4 = new OASOrgApacheFelixJaasConfigurationSp();

        System.assert(orgApacheFelixJaasConfigurationSpiProperties1.equals(orgApacheFelixJaasConfigurationSpiProperties2));
        System.assert(orgApacheFelixJaasConfigurationSpiProperties3.equals(orgApacheFelixJaasConfigurationSpiProperties4));
        System.assertEquals(orgApacheFelixJaasConfigurationSpiProperties1.hashCode(), orgApacheFelixJaasConfigurationSpiProperties2.hashCode());
        System.assertEquals(orgApacheFelixJaasConfigurationSpiProperties3.hashCode(), orgApacheFelixJaasConfigurationSpiProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixJaasConfigurationSp orgApacheFelixJaasConfigurationSpiProperties = new OASOrgApacheFelixJaasConfigurationSp();
        Map<String, String> propertyMappings = orgApacheFelixJaasConfigurationSpiProperties.getPropertyMappings();
        System.assertEquals('jaasDefaultRealmName', propertyMappings.get('jaas.defaultRealmName'));
        System.assertEquals('jaasConfigProviderName', propertyMappings.get('jaas.configProviderName'));
        System.assertEquals('jaasGlobalConfigPolicy', propertyMappings.get('jaas.globalConfigPolicy'));
    }
}
