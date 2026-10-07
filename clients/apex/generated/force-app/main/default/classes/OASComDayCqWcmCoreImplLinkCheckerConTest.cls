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
        Map<String, String> x-property-mappings = comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.getx-property-mappings();
        System.assertEquals('linkExpiredPrefix', x-property-mappings.get('link.expired.prefix'));
        System.assertEquals('linkExpiredRemove', x-property-mappings.get('link.expired.remove'));
        System.assertEquals('linkExpiredSuffix', x-property-mappings.get('link.expired.suffix'));
        System.assertEquals('linkInvalidPrefix', x-property-mappings.get('link.invalid.prefix'));
        System.assertEquals('linkInvalidRemove', x-property-mappings.get('link.invalid.remove'));
        System.assertEquals('linkInvalidSuffix', x-property-mappings.get('link.invalid.suffix'));
        System.assertEquals('linkPredatedPrefix', x-property-mappings.get('link.predated.prefix'));
        System.assertEquals('linkPredatedRemove', x-property-mappings.get('link.predated.remove'));
        System.assertEquals('linkPredatedSuffix', x-property-mappings.get('link.predated.suffix'));
        System.assertEquals('linkWcmmodes', x-property-mappings.get('link.wcmmodes'));
    }
}
