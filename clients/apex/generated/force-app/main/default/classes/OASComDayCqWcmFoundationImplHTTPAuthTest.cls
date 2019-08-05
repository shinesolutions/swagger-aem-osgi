@isTest
private class OASComDayCqWcmFoundationImplHTTPAuthTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties1 = OASComDayCqWcmFoundationImplHTTPAuth.getExample();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties2 = comDayCqWcmFoundationImplHTTPAuthHandlerProperties1;
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties3 = new OASComDayCqWcmFoundationImplHTTPAuth();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties4 = comDayCqWcmFoundationImplHTTPAuthHandlerProperties3;

        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties1.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties2));
        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties2.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties1));
        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties1.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties1));
        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties4));
        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties4.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3));
        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties1 = OASComDayCqWcmFoundationImplHTTPAuth.getExample();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties2 = OASComDayCqWcmFoundationImplHTTPAuth.getExample();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties3 = new OASComDayCqWcmFoundationImplHTTPAuth();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties4 = new OASComDayCqWcmFoundationImplHTTPAuth();

        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties1.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties2));
        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties2.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties1));
        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties4));
        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties4.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties1 = OASComDayCqWcmFoundationImplHTTPAuth.getExample();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties2 = new OASComDayCqWcmFoundationImplHTTPAuth();

        System.assertEquals(false, comDayCqWcmFoundationImplHTTPAuthHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmFoundationImplHTTPAuthHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties1 = OASComDayCqWcmFoundationImplHTTPAuth.getExample();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties2 = new OASComDayCqWcmFoundationImplHTTPAuth();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties3;

        System.assertEquals(false, comDayCqWcmFoundationImplHTTPAuthHandlerProperties1.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3));
        System.assertEquals(false, comDayCqWcmFoundationImplHTTPAuthHandlerProperties2.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties1 = OASComDayCqWcmFoundationImplHTTPAuth.getExample();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties2 = new OASComDayCqWcmFoundationImplHTTPAuth();

        System.assertEquals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties1.hashCode(), comDayCqWcmFoundationImplHTTPAuthHandlerProperties1.hashCode());
        System.assertEquals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties2.hashCode(), comDayCqWcmFoundationImplHTTPAuthHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties1 = OASComDayCqWcmFoundationImplHTTPAuth.getExample();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties2 = OASComDayCqWcmFoundationImplHTTPAuth.getExample();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties3 = new OASComDayCqWcmFoundationImplHTTPAuth();
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties4 = new OASComDayCqWcmFoundationImplHTTPAuth();

        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties1.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties2));
        System.assert(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3.equals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties4));
        System.assertEquals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties1.hashCode(), comDayCqWcmFoundationImplHTTPAuthHandlerProperties2.hashCode());
        System.assertEquals(comDayCqWcmFoundationImplHTTPAuthHandlerProperties3.hashCode(), comDayCqWcmFoundationImplHTTPAuthHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmFoundationImplHTTPAuth comDayCqWcmFoundationImplHTTPAuthHandlerProperties = new OASComDayCqWcmFoundationImplHTTPAuth();
        Map<String, String> propertyMappings = comDayCqWcmFoundationImplHTTPAuthHandlerProperties.getPropertyMappings();
        System.assertEquals('authHttpNologin', propertyMappings.get('auth.http.nologin'));
        System.assertEquals('authHttpRealm', propertyMappings.get('auth.http.realm'));
        System.assertEquals('authDefaultLoginpage', propertyMappings.get('auth.default.loginpage'));
        System.assertEquals('authCredForm', propertyMappings.get('auth.cred.form'));
        System.assertEquals('authCredUtf8', propertyMappings.get('auth.cred.utf8'));
    }
}
