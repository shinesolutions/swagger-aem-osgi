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
        Map<String, String> x-property-mappings = orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.getx-property-mappings();
        System.assertEquals('providerName', x-property-mappings.get('provider.name'));
        System.assertEquals('hostName', x-property-mappings.get('host.name'));
        System.assertEquals('hostPort', x-property-mappings.get('host.port'));
        System.assertEquals('hostSsl', x-property-mappings.get('host.ssl'));
        System.assertEquals('hostTls', x-property-mappings.get('host.tls'));
        System.assertEquals('hostNoCertCheck', x-property-mappings.get('host.noCertCheck'));
        System.assertEquals('bindDn', x-property-mappings.get('bind.dn'));
        System.assertEquals('bindPassword', x-property-mappings.get('bind.password'));
        System.assertEquals('adminPoolMaxActive', x-property-mappings.get('adminPool.maxActive'));
        System.assertEquals('adminPoolLookupOnValidate', x-property-mappings.get('adminPool.lookupOnValidate'));
        System.assertEquals('userPoolMaxActive', x-property-mappings.get('userPool.maxActive'));
        System.assertEquals('userPoolLookupOnValidate', x-property-mappings.get('userPool.lookupOnValidate'));
        System.assertEquals('userBaseDN', x-property-mappings.get('user.baseDN'));
        System.assertEquals('userObjectclass', x-property-mappings.get('user.objectclass'));
        System.assertEquals('userIdAttribute', x-property-mappings.get('user.idAttribute'));
        System.assertEquals('userExtraFilter', x-property-mappings.get('user.extraFilter'));
        System.assertEquals('userMakeDnPath', x-property-mappings.get('user.makeDnPath'));
        System.assertEquals('groupBaseDN', x-property-mappings.get('group.baseDN'));
        System.assertEquals('groupObjectclass', x-property-mappings.get('group.objectclass'));
        System.assertEquals('groupNameAttribute', x-property-mappings.get('group.nameAttribute'));
        System.assertEquals('groupExtraFilter', x-property-mappings.get('group.extraFilter'));
        System.assertEquals('groupMakeDnPath', x-property-mappings.get('group.makeDnPath'));
        System.assertEquals('groupMemberAttribute', x-property-mappings.get('group.memberAttribute'));
    }
}
