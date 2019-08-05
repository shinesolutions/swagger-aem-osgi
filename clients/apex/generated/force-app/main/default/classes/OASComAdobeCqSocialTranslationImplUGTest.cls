@isTest
private class OASComAdobeCqSocialTranslationImplUGTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1 = OASComAdobeCqSocialTranslationImplUG.getExample();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2 = comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1;
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3 = new OASComAdobeCqSocialTranslationImplUG();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties4 = comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3;

        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2));
        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1));
        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1));
        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties4));
        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties4.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3));
        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1 = OASComAdobeCqSocialTranslationImplUG.getExample();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2 = OASComAdobeCqSocialTranslationImplUG.getExample();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3 = new OASComAdobeCqSocialTranslationImplUG();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties4 = new OASComAdobeCqSocialTranslationImplUG();

        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2));
        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1));
        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties4));
        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties4.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1 = OASComAdobeCqSocialTranslationImplUG.getExample();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2 = new OASComAdobeCqSocialTranslationImplUG();

        System.assertEquals(false, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1 = OASComAdobeCqSocialTranslationImplUG.getExample();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2 = new OASComAdobeCqSocialTranslationImplUG();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3;

        System.assertEquals(false, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3));
        System.assertEquals(false, comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1 = OASComAdobeCqSocialTranslationImplUG.getExample();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2 = new OASComAdobeCqSocialTranslationImplUG();

        System.assertEquals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1.hashCode(), comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2.hashCode(), comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1 = OASComAdobeCqSocialTranslationImplUG.getExample();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2 = OASComAdobeCqSocialTranslationImplUG.getExample();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3 = new OASComAdobeCqSocialTranslationImplUG();
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties4 = new OASComAdobeCqSocialTranslationImplUG();

        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2));
        System.assert(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3.equals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties4));
        System.assertEquals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties1.hashCode(), comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties3.hashCode(), comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialTranslationImplUG comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties = new OASComAdobeCqSocialTranslationImplUG();
        Map<String, String> propertyMappings = comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.getPropertyMappings();
        System.assertEquals('eventTopics', propertyMappings.get('event.topics'));
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
        System.assertEquals('translateListenerType', propertyMappings.get('translate.listener.type'));
        System.assertEquals('translatePropertyList', propertyMappings.get('translate.property.list'));
    }
}
