@isTest
private class OASComDayCqWcmFoundationFormsImplForTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1 = OASComDayCqWcmFoundationFormsImplFor.getExample();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2 = comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1;
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3 = new OASComDayCqWcmFoundationFormsImplFor();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties4 = comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3;

        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2));
        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1));
        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1));
        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties4));
        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties4.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3));
        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1 = OASComDayCqWcmFoundationFormsImplFor.getExample();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2 = OASComDayCqWcmFoundationFormsImplFor.getExample();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3 = new OASComDayCqWcmFoundationFormsImplFor();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties4 = new OASComDayCqWcmFoundationFormsImplFor();

        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2));
        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1));
        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties4));
        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties4.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1 = OASComDayCqWcmFoundationFormsImplFor.getExample();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2 = new OASComDayCqWcmFoundationFormsImplFor();

        System.assertEquals(false, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1 = OASComDayCqWcmFoundationFormsImplFor.getExample();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2 = new OASComDayCqWcmFoundationFormsImplFor();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3;

        System.assertEquals(false, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3));
        System.assertEquals(false, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1 = OASComDayCqWcmFoundationFormsImplFor.getExample();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2 = new OASComDayCqWcmFoundationFormsImplFor();

        System.assertEquals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1.hashCode(), comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1.hashCode());
        System.assertEquals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2.hashCode(), comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1 = OASComDayCqWcmFoundationFormsImplFor.getExample();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2 = OASComDayCqWcmFoundationFormsImplFor.getExample();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3 = new OASComDayCqWcmFoundationFormsImplFor();
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties4 = new OASComDayCqWcmFoundationFormsImplFor();

        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2));
        System.assert(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3.equals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties4));
        System.assertEquals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties1.hashCode(), comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties2.hashCode());
        System.assertEquals(comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties3.hashCode(), comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmFoundationFormsImplFor comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties = new OASComDayCqWcmFoundationFormsImplFor();
        Map<String, String> propertyMappings = comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.getPropertyMappings();
        System.assertEquals('formsFormparagraphpostprocessorEnabled', propertyMappings.get('forms.formparagraphpostprocessor.enabled'));
        System.assertEquals('formsFormparagraphpostprocessorFormresourcetypes', propertyMappings.get('forms.formparagraphpostprocessor.formresourcetypes'));
    }
}
