@isTest
private class OASOrgApacheJackrabbitOakSecurityAutTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1 = OASOrgApacheJackrabbitOakSecurityAut.getExample();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2 = orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1;
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3 = new OASOrgApacheJackrabbitOakSecurityAut();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties4 = orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3;

        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2));
        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1));
        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1));
        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties4));
        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties4.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3));
        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1 = OASOrgApacheJackrabbitOakSecurityAut.getExample();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2 = OASOrgApacheJackrabbitOakSecurityAut.getExample();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3 = new OASOrgApacheJackrabbitOakSecurityAut();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties4 = new OASOrgApacheJackrabbitOakSecurityAut();

        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2));
        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1));
        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties4));
        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties4.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1 = OASOrgApacheJackrabbitOakSecurityAut.getExample();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2 = new OASOrgApacheJackrabbitOakSecurityAut();

        System.assertEquals(false, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1 = OASOrgApacheJackrabbitOakSecurityAut.getExample();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2 = new OASOrgApacheJackrabbitOakSecurityAut();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1 = OASOrgApacheJackrabbitOakSecurityAut.getExample();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2 = new OASOrgApacheJackrabbitOakSecurityAut();

        System.assertEquals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1.hashCode(), orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2.hashCode(), orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1 = OASOrgApacheJackrabbitOakSecurityAut.getExample();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2 = OASOrgApacheJackrabbitOakSecurityAut.getExample();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3 = new OASOrgApacheJackrabbitOakSecurityAut();
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties4 = new OASOrgApacheJackrabbitOakSecurityAut();

        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2));
        System.assert(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3.equals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties4));
        System.assertEquals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties1.hashCode(), orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties3.hashCode(), orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheJackrabbitOakSecurityAut orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties = new OASOrgApacheJackrabbitOakSecurityAut();
        Map<String, String> propertyMappings = orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.getPropertyMappings();
        System.assertEquals('providerName', propertyMappings.get('provider.name'));
        System.assertEquals('hostName', propertyMappings.get('host.name'));
        System.assertEquals('hostPort', propertyMappings.get('host.port'));
        System.assertEquals('hostSsl', propertyMappings.get('host.ssl'));
        System.assertEquals('hostTls', propertyMappings.get('host.tls'));
        System.assertEquals('hostNoCertCheck', propertyMappings.get('host.noCertCheck'));
        System.assertEquals('bindDn', propertyMappings.get('bind.dn'));
        System.assertEquals('bindPassword', propertyMappings.get('bind.password'));
        System.assertEquals('adminPoolMaxActive', propertyMappings.get('adminPool.maxActive'));
        System.assertEquals('adminPoolLookupOnValidate', propertyMappings.get('adminPool.lookupOnValidate'));
        System.assertEquals('userPoolMaxActive', propertyMappings.get('userPool.maxActive'));
        System.assertEquals('userPoolLookupOnValidate', propertyMappings.get('userPool.lookupOnValidate'));
        System.assertEquals('userBaseDN', propertyMappings.get('user.baseDN'));
        System.assertEquals('userObjectclass', propertyMappings.get('user.objectclass'));
        System.assertEquals('userIdAttribute', propertyMappings.get('user.idAttribute'));
        System.assertEquals('userExtraFilter', propertyMappings.get('user.extraFilter'));
        System.assertEquals('userMakeDnPath', propertyMappings.get('user.makeDnPath'));
        System.assertEquals('groupBaseDN', propertyMappings.get('group.baseDN'));
        System.assertEquals('groupObjectclass', propertyMappings.get('group.objectclass'));
        System.assertEquals('groupNameAttribute', propertyMappings.get('group.nameAttribute'));
        System.assertEquals('groupExtraFilter', propertyMappings.get('group.extraFilter'));
        System.assertEquals('groupMakeDnPath', propertyMappings.get('group.makeDnPath'));
        System.assertEquals('groupMemberAttribute', propertyMappings.get('group.memberAttribute'));
    }
}
