@isTest
private class OASOrgApacheSlingEngineImplAuthSlingTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1 = OASOrgApacheSlingEngineImplAuthSling.getExample();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2 = orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1;
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3 = new OASOrgApacheSlingEngineImplAuthSling();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties4 = orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3;

        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2));
        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1));
        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1));
        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties4));
        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties4.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3));
        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1 = OASOrgApacheSlingEngineImplAuthSling.getExample();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2 = OASOrgApacheSlingEngineImplAuthSling.getExample();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3 = new OASOrgApacheSlingEngineImplAuthSling();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties4 = new OASOrgApacheSlingEngineImplAuthSling();

        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2));
        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1));
        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties4));
        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties4.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1 = OASOrgApacheSlingEngineImplAuthSling.getExample();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2 = new OASOrgApacheSlingEngineImplAuthSling();

        System.assertEquals(false, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1 = OASOrgApacheSlingEngineImplAuthSling.getExample();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2 = new OASOrgApacheSlingEngineImplAuthSling();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3;

        System.assertEquals(false, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3));
        System.assertEquals(false, orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1 = OASOrgApacheSlingEngineImplAuthSling.getExample();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2 = new OASOrgApacheSlingEngineImplAuthSling();

        System.assertEquals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1.hashCode(), orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1.hashCode());
        System.assertEquals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2.hashCode(), orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1 = OASOrgApacheSlingEngineImplAuthSling.getExample();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2 = OASOrgApacheSlingEngineImplAuthSling.getExample();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3 = new OASOrgApacheSlingEngineImplAuthSling();
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties4 = new OASOrgApacheSlingEngineImplAuthSling();

        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2));
        System.assert(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3.equals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties4));
        System.assertEquals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties1.hashCode(), orgApacheSlingEngineImplAuthSlingAuthenticatorProperties2.hashCode());
        System.assertEquals(orgApacheSlingEngineImplAuthSlingAuthenticatorProperties3.hashCode(), orgApacheSlingEngineImplAuthSlingAuthenticatorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingEngineImplAuthSling orgApacheSlingEngineImplAuthSlingAuthenticatorProperties = new OASOrgApacheSlingEngineImplAuthSling();
        Map<String, String> propertyMappings = orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.getPropertyMappings();
        System.assertEquals('osgiHttpWhiteboardContextSelect', propertyMappings.get('osgi.http.whiteboard.context.select'));
        System.assertEquals('osgiHttpWhiteboardListener', propertyMappings.get('osgi.http.whiteboard.listener'));
        System.assertEquals('authSudoCookie', propertyMappings.get('auth.sudo.cookie'));
        System.assertEquals('authSudoParameter', propertyMappings.get('auth.sudo.parameter'));
        System.assertEquals('authAnnonymous', propertyMappings.get('auth.annonymous'));
        System.assertEquals('slingAuthRequirements', propertyMappings.get('sling.auth.requirements'));
        System.assertEquals('slingAuthAnonymousUser', propertyMappings.get('sling.auth.anonymous.user'));
        System.assertEquals('slingAuthAnonymousPassword', propertyMappings.get('sling.auth.anonymous.password'));
        System.assertEquals('authHttp', propertyMappings.get('auth.http'));
        System.assertEquals('authHttpRealm', propertyMappings.get('auth.http.realm'));
        System.assertEquals('authUriSuffix', propertyMappings.get('auth.uri.suffix'));
    }
}
