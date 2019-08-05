@isTest
private class OASComAdobeGraniteI18nImplBundlePseuTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1 = OASComAdobeGraniteI18nImplBundlePseu.getExample();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2 = comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1;
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3 = new OASComAdobeGraniteI18nImplBundlePseu();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties4 = comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3;

        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2));
        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1));
        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1));
        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties4));
        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties4.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3));
        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1 = OASComAdobeGraniteI18nImplBundlePseu.getExample();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2 = OASComAdobeGraniteI18nImplBundlePseu.getExample();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3 = new OASComAdobeGraniteI18nImplBundlePseu();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties4 = new OASComAdobeGraniteI18nImplBundlePseu();

        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2));
        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1));
        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties4));
        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties4.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1 = OASComAdobeGraniteI18nImplBundlePseu.getExample();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2 = new OASComAdobeGraniteI18nImplBundlePseu();

        System.assertEquals(false, comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1 = OASComAdobeGraniteI18nImplBundlePseu.getExample();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2 = new OASComAdobeGraniteI18nImplBundlePseu();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3;

        System.assertEquals(false, comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3));
        System.assertEquals(false, comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1 = OASComAdobeGraniteI18nImplBundlePseu.getExample();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2 = new OASComAdobeGraniteI18nImplBundlePseu();

        System.assertEquals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1.hashCode(), comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1.hashCode());
        System.assertEquals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2.hashCode(), comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1 = OASComAdobeGraniteI18nImplBundlePseu.getExample();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2 = OASComAdobeGraniteI18nImplBundlePseu.getExample();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3 = new OASComAdobeGraniteI18nImplBundlePseu();
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties4 = new OASComAdobeGraniteI18nImplBundlePseu();

        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2));
        System.assert(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3.equals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties4));
        System.assertEquals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties1.hashCode(), comAdobeGraniteI18nImplBundlePseudoTranslationsProperties2.hashCode());
        System.assertEquals(comAdobeGraniteI18nImplBundlePseudoTranslationsProperties3.hashCode(), comAdobeGraniteI18nImplBundlePseudoTranslationsProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteI18nImplBundlePseu comAdobeGraniteI18nImplBundlePseudoTranslationsProperties = new OASComAdobeGraniteI18nImplBundlePseu();
        Map<String, String> propertyMappings = comAdobeGraniteI18nImplBundlePseudoTranslationsProperties.getPropertyMappings();
        System.assertEquals('pseudoPatterns', propertyMappings.get('pseudo.patterns'));
    }
}
