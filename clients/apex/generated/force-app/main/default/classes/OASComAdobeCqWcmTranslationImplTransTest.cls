@isTest
private class OASComAdobeCqWcmTranslationImplTransTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1 = OASComAdobeCqWcmTranslationImplTrans.getExample();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2 = comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1;
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3 = new OASComAdobeCqWcmTranslationImplTrans();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties4 = comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3;

        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2));
        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1));
        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1));
        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties4));
        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties4.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3));
        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1 = OASComAdobeCqWcmTranslationImplTrans.getExample();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2 = OASComAdobeCqWcmTranslationImplTrans.getExample();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3 = new OASComAdobeCqWcmTranslationImplTrans();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties4 = new OASComAdobeCqWcmTranslationImplTrans();

        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2));
        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1));
        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties4));
        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties4.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1 = OASComAdobeCqWcmTranslationImplTrans.getExample();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2 = new OASComAdobeCqWcmTranslationImplTrans();

        System.assertEquals(false, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1 = OASComAdobeCqWcmTranslationImplTrans.getExample();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2 = new OASComAdobeCqWcmTranslationImplTrans();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3;

        System.assertEquals(false, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3));
        System.assertEquals(false, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1 = OASComAdobeCqWcmTranslationImplTrans.getExample();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2 = new OASComAdobeCqWcmTranslationImplTrans();

        System.assertEquals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1.hashCode(), comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1.hashCode());
        System.assertEquals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2.hashCode(), comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1 = OASComAdobeCqWcmTranslationImplTrans.getExample();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2 = OASComAdobeCqWcmTranslationImplTrans.getExample();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3 = new OASComAdobeCqWcmTranslationImplTrans();
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties4 = new OASComAdobeCqWcmTranslationImplTrans();

        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2));
        System.assert(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3.equals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties4));
        System.assertEquals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties1.hashCode(), comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties2.hashCode());
        System.assertEquals(comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties3.hashCode(), comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqWcmTranslationImplTrans comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties = new OASComAdobeCqWcmTranslationImplTrans();
        Map<String, String> propertyMappings = comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.getPropertyMappings();
        System.assertEquals('syncTranslationStateSchedulingFormat', propertyMappings.get('syncTranslationState.schedulingFormat'));
        System.assertEquals('schedulingRepeatTranslationSchedulingFormat', propertyMappings.get('schedulingRepeatTranslation.schedulingFormat'));
        System.assertEquals('syncTranslationStateLockTimeoutInMinutes', propertyMappings.get('syncTranslationState.lockTimeoutInMinutes'));
        System.assertEquals('exportFormat', propertyMappings.get('export.format'));
    }
}
