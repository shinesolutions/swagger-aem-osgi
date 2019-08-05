@isTest
private class OASOrgApacheJackrabbitOakSpiSecurityTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1 = OASOrgApacheJackrabbitOakSpiSecurity.getExample();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2 = orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1;
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3 = new OASOrgApacheJackrabbitOakSpiSecurity();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties4 = orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3;

        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2));
        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1));
        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1));
        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties4));
        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties4.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3));
        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1 = OASOrgApacheJackrabbitOakSpiSecurity.getExample();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2 = OASOrgApacheJackrabbitOakSpiSecurity.getExample();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3 = new OASOrgApacheJackrabbitOakSpiSecurity();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties4 = new OASOrgApacheJackrabbitOakSpiSecurity();

        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2));
        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1));
        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties4));
        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties4.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1 = OASOrgApacheJackrabbitOakSpiSecurity.getExample();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2 = new OASOrgApacheJackrabbitOakSpiSecurity();

        System.assertEquals(false, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1 = OASOrgApacheJackrabbitOakSpiSecurity.getExample();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2 = new OASOrgApacheJackrabbitOakSpiSecurity();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1 = OASOrgApacheJackrabbitOakSpiSecurity.getExample();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2 = new OASOrgApacheJackrabbitOakSpiSecurity();

        System.assertEquals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1.hashCode(), orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2.hashCode(), orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1 = OASOrgApacheJackrabbitOakSpiSecurity.getExample();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2 = OASOrgApacheJackrabbitOakSpiSecurity.getExample();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3 = new OASOrgApacheJackrabbitOakSpiSecurity();
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties4 = new OASOrgApacheJackrabbitOakSpiSecurity();

        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2));
        System.assert(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3.equals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties4));
        System.assertEquals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties1.hashCode(), orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties3.hashCode(), orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheJackrabbitOakSpiSecurity orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties = new OASOrgApacheJackrabbitOakSpiSecurity();
        Map<String, String> propertyMappings = orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.getPropertyMappings();
        System.assertEquals('jaasRanking', propertyMappings.get('jaas.ranking'));
        System.assertEquals('jaasControlFlag', propertyMappings.get('jaas.controlFlag'));
        System.assertEquals('jaasRealmName', propertyMappings.get('jaas.realmName'));
        System.assertEquals('idpName', propertyMappings.get('idp.name'));
        System.assertEquals('syncHandlerName', propertyMappings.get('sync.handlerName'));
    }
}
