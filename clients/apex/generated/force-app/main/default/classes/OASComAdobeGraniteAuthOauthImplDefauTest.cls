@isTest
private class OASComAdobeGraniteAuthOauthImplDefauTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1 = OASComAdobeGraniteAuthOauthImplDefau.getExample();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2 = comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1;
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3 = new OASComAdobeGraniteAuthOauthImplDefau();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties4 = comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3;

        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties4));
        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties4.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3));
        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1 = OASComAdobeGraniteAuthOauthImplDefau.getExample();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2 = OASComAdobeGraniteAuthOauthImplDefau.getExample();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3 = new OASComAdobeGraniteAuthOauthImplDefau();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties4 = new OASComAdobeGraniteAuthOauthImplDefau();

        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties4));
        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties4.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1 = OASComAdobeGraniteAuthOauthImplDefau.getExample();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2 = new OASComAdobeGraniteAuthOauthImplDefau();

        System.assertEquals(false, comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1 = OASComAdobeGraniteAuthOauthImplDefau.getExample();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2 = new OASComAdobeGraniteAuthOauthImplDefau();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1 = OASComAdobeGraniteAuthOauthImplDefau.getExample();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2 = new OASComAdobeGraniteAuthOauthImplDefau();

        System.assertEquals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1.hashCode(), comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2.hashCode(), comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1 = OASComAdobeGraniteAuthOauthImplDefau.getExample();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2 = OASComAdobeGraniteAuthOauthImplDefau.getExample();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3 = new OASComAdobeGraniteAuthOauthImplDefau();
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties4 = new OASComAdobeGraniteAuthOauthImplDefau();

        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3.equals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties1.hashCode(), comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties3.hashCode(), comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthOauthImplDefau comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties = new OASComAdobeGraniteAuthOauthImplDefau();
        Map<String, String> propertyMappings = comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.getPropertyMappings();
        System.assertEquals('authTokenValidatorType', propertyMappings.get('auth.token.validator.type'));
    }
}
