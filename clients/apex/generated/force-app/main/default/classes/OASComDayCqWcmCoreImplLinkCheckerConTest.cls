@isTest
private class OASComDayCqWcmCoreImplLinkCheckerConTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1 = OASComDayCqWcmCoreImplLinkCheckerCon.getExample();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2 = comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1;
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3 = new OASComDayCqWcmCoreImplLinkCheckerCon();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties4 = comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3;

        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2));
        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1));
        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1));
        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties4));
        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties4.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3));
        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1 = OASComDayCqWcmCoreImplLinkCheckerCon.getExample();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2 = OASComDayCqWcmCoreImplLinkCheckerCon.getExample();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3 = new OASComDayCqWcmCoreImplLinkCheckerCon();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties4 = new OASComDayCqWcmCoreImplLinkCheckerCon();

        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2));
        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1));
        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties4));
        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties4.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1 = OASComDayCqWcmCoreImplLinkCheckerCon.getExample();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2 = new OASComDayCqWcmCoreImplLinkCheckerCon();

        System.assertEquals(false, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1 = OASComDayCqWcmCoreImplLinkCheckerCon.getExample();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2 = new OASComDayCqWcmCoreImplLinkCheckerCon();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1 = OASComDayCqWcmCoreImplLinkCheckerCon.getExample();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2 = new OASComDayCqWcmCoreImplLinkCheckerCon();

        System.assertEquals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1.hashCode(), comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2.hashCode(), comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1 = OASComDayCqWcmCoreImplLinkCheckerCon.getExample();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2 = OASComDayCqWcmCoreImplLinkCheckerCon.getExample();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3 = new OASComDayCqWcmCoreImplLinkCheckerCon();
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties4 = new OASComDayCqWcmCoreImplLinkCheckerCon();

        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2));
        System.assert(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3.equals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties4));
        System.assertEquals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties1.hashCode(), comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties3.hashCode(), comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplLinkCheckerCon comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties = new OASComDayCqWcmCoreImplLinkCheckerCon();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.getPropertyMappings();
        System.assertEquals('linkExpiredPrefix', propertyMappings.get('link.expired.prefix'));
        System.assertEquals('linkExpiredRemove', propertyMappings.get('link.expired.remove'));
        System.assertEquals('linkExpiredSuffix', propertyMappings.get('link.expired.suffix'));
        System.assertEquals('linkInvalidPrefix', propertyMappings.get('link.invalid.prefix'));
        System.assertEquals('linkInvalidRemove', propertyMappings.get('link.invalid.remove'));
        System.assertEquals('linkInvalidSuffix', propertyMappings.get('link.invalid.suffix'));
        System.assertEquals('linkPredatedPrefix', propertyMappings.get('link.predated.prefix'));
        System.assertEquals('linkPredatedRemove', propertyMappings.get('link.predated.remove'));
        System.assertEquals('linkPredatedSuffix', propertyMappings.get('link.predated.suffix'));
        System.assertEquals('linkWcmmodes', propertyMappings.get('link.wcmmodes'));
    }
}
