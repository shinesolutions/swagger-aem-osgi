@isTest
private class OASComDayCqWcmCoreImplReferencesContTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1 = OASComDayCqWcmCoreImplReferencesCont.getExample();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2 = comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1;
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3 = new OASComDayCqWcmCoreImplReferencesCont();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties4 = comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3;

        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2));
        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1));
        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1));
        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties4));
        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties4.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3));
        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1 = OASComDayCqWcmCoreImplReferencesCont.getExample();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2 = OASComDayCqWcmCoreImplReferencesCont.getExample();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3 = new OASComDayCqWcmCoreImplReferencesCont();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties4 = new OASComDayCqWcmCoreImplReferencesCont();

        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2));
        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1));
        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties4));
        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties4.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1 = OASComDayCqWcmCoreImplReferencesCont.getExample();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2 = new OASComDayCqWcmCoreImplReferencesCont();

        System.assertEquals(false, comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1 = OASComDayCqWcmCoreImplReferencesCont.getExample();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2 = new OASComDayCqWcmCoreImplReferencesCont();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1 = OASComDayCqWcmCoreImplReferencesCont.getExample();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2 = new OASComDayCqWcmCoreImplReferencesCont();

        System.assertEquals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1.hashCode(), comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2.hashCode(), comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1 = OASComDayCqWcmCoreImplReferencesCont.getExample();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2 = OASComDayCqWcmCoreImplReferencesCont.getExample();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3 = new OASComDayCqWcmCoreImplReferencesCont();
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties4 = new OASComDayCqWcmCoreImplReferencesCont();

        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2));
        System.assert(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3.equals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties4));
        System.assertEquals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties1.hashCode(), comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties3.hashCode(), comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplReferencesCont comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties = new OASComDayCqWcmCoreImplReferencesCont();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.getPropertyMappings();
        System.assertEquals('contentReferenceConfigResourceTypes', propertyMappings.get('contentReferenceConfig.resourceTypes'));
    }
}
