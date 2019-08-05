@isTest
private class OASComDayCrxSecurityTokenImplImplTokTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1 = OASComDayCrxSecurityTokenImplImplTok.getExample();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2 = comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1;
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3 = new OASComDayCrxSecurityTokenImplImplTok();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties4 = comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3;

        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2));
        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1));
        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1));
        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties4));
        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties4.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3));
        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1 = OASComDayCrxSecurityTokenImplImplTok.getExample();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2 = OASComDayCrxSecurityTokenImplImplTok.getExample();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3 = new OASComDayCrxSecurityTokenImplImplTok();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties4 = new OASComDayCrxSecurityTokenImplImplTok();

        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2));
        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1));
        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties4));
        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties4.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1 = OASComDayCrxSecurityTokenImplImplTok.getExample();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2 = new OASComDayCrxSecurityTokenImplImplTok();

        System.assertEquals(false, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1 = OASComDayCrxSecurityTokenImplImplTok.getExample();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2 = new OASComDayCrxSecurityTokenImplImplTok();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3;

        System.assertEquals(false, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3));
        System.assertEquals(false, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1 = OASComDayCrxSecurityTokenImplImplTok.getExample();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2 = new OASComDayCrxSecurityTokenImplImplTok();

        System.assertEquals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1.hashCode(), comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1.hashCode());
        System.assertEquals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2.hashCode(), comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1 = OASComDayCrxSecurityTokenImplImplTok.getExample();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2 = OASComDayCrxSecurityTokenImplImplTok.getExample();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3 = new OASComDayCrxSecurityTokenImplImplTok();
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties4 = new OASComDayCrxSecurityTokenImplImplTok();

        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2));
        System.assert(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3.equals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties4));
        System.assertEquals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties1.hashCode(), comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties2.hashCode());
        System.assertEquals(comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties3.hashCode(), comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCrxSecurityTokenImplImplTok comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties = new OASComDayCrxSecurityTokenImplImplTok();
        Map<String, String> propertyMappings = comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.getPropertyMappings();
        System.assertEquals('tokenRequiredAttr', propertyMappings.get('token.required.attr'));
        System.assertEquals('tokenAlternateUrl', propertyMappings.get('token.alternate.url'));
        System.assertEquals('tokenEncapsulated', propertyMappings.get('token.encapsulated'));
        System.assertEquals('skipTokenRefresh', propertyMappings.get('skip.token.refresh'));
    }
}
