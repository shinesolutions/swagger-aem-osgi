@isTest
private class OASComAdobeCqSocialTranslationImplTrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1 = OASComAdobeCqSocialTranslationImplTr.getExample();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2 = comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1;
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3 = new OASComAdobeCqSocialTranslationImplTr();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties4 = comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3;

        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2));
        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1));
        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1));
        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties4));
        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties4.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3));
        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1 = OASComAdobeCqSocialTranslationImplTr.getExample();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2 = OASComAdobeCqSocialTranslationImplTr.getExample();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3 = new OASComAdobeCqSocialTranslationImplTr();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties4 = new OASComAdobeCqSocialTranslationImplTr();

        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2));
        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1));
        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties4));
        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties4.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1 = OASComAdobeCqSocialTranslationImplTr.getExample();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2 = new OASComAdobeCqSocialTranslationImplTr();

        System.assertEquals(false, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1 = OASComAdobeCqSocialTranslationImplTr.getExample();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2 = new OASComAdobeCqSocialTranslationImplTr();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3;

        System.assertEquals(false, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3));
        System.assertEquals(false, comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1 = OASComAdobeCqSocialTranslationImplTr.getExample();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2 = new OASComAdobeCqSocialTranslationImplTr();

        System.assertEquals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1.hashCode(), comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2.hashCode(), comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1 = OASComAdobeCqSocialTranslationImplTr.getExample();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2 = OASComAdobeCqSocialTranslationImplTr.getExample();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3 = new OASComAdobeCqSocialTranslationImplTr();
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties4 = new OASComAdobeCqSocialTranslationImplTr();

        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2));
        System.assert(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3.equals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties4));
        System.assertEquals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties1.hashCode(), comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties3.hashCode(), comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialTranslationImplTr comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties = new OASComAdobeCqSocialTranslationImplTr();
        Map<String, String> propertyMappings = comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.getPropertyMappings();
        System.assertEquals('translateLanguage', propertyMappings.get('translate.language'));
        System.assertEquals('translateDisplay', propertyMappings.get('translate.display'));
        System.assertEquals('translateAttribution', propertyMappings.get('translate.attribution'));
        System.assertEquals('translateCaching', propertyMappings.get('translate.caching'));
        System.assertEquals('translateSmartRendering', propertyMappings.get('translate.smart.rendering'));
        System.assertEquals('translateCachingDuration', propertyMappings.get('translate.caching.duration'));
        System.assertEquals('translateSessionSaveInterval', propertyMappings.get('translate.session.save.interval'));
        System.assertEquals('translateSessionSaveBatchLimit', propertyMappings.get('translate.session.save.batchLimit'));
    }
}
