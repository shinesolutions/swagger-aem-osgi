@isTest
private class OASComAdobeGraniteI18nImplPreferenceTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1 = OASComAdobeGraniteI18nImplPreference.getExample();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2 = comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1;
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3 = new OASComAdobeGraniteI18nImplPreference();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties4 = comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3;

        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2));
        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1));
        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1));
        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties4));
        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties4.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3));
        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1 = OASComAdobeGraniteI18nImplPreference.getExample();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2 = OASComAdobeGraniteI18nImplPreference.getExample();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3 = new OASComAdobeGraniteI18nImplPreference();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties4 = new OASComAdobeGraniteI18nImplPreference();

        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2));
        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1));
        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties4));
        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties4.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1 = OASComAdobeGraniteI18nImplPreference.getExample();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2 = new OASComAdobeGraniteI18nImplPreference();

        System.assertEquals(false, comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1 = OASComAdobeGraniteI18nImplPreference.getExample();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2 = new OASComAdobeGraniteI18nImplPreference();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3;

        System.assertEquals(false, comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3));
        System.assertEquals(false, comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1 = OASComAdobeGraniteI18nImplPreference.getExample();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2 = new OASComAdobeGraniteI18nImplPreference();

        System.assertEquals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1.hashCode(), comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1.hashCode());
        System.assertEquals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2.hashCode(), comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1 = OASComAdobeGraniteI18nImplPreference.getExample();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2 = OASComAdobeGraniteI18nImplPreference.getExample();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3 = new OASComAdobeGraniteI18nImplPreference();
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties4 = new OASComAdobeGraniteI18nImplPreference();

        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2));
        System.assert(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3.equals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties4));
        System.assertEquals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties1.hashCode(), comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties2.hashCode());
        System.assertEquals(comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties3.hashCode(), comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteI18nImplPreference comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties = new OASComAdobeGraniteI18nImplPreference();
        Map<String, String> propertyMappings = comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.getPropertyMappings();
        System.assertEquals('securityPreferencesName', propertyMappings.get('security.preferences.name'));
    }
}
