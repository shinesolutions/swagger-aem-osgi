@isTest
private class OASComDayCqDamScene7ImplScene7FlashTTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1 = OASComDayCqDamScene7ImplScene7FlashT.getExample();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2 = comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1;
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3 = new OASComDayCqDamScene7ImplScene7FlashT();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties4 = comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3;

        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties4));
        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties4.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3));
        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1 = OASComDayCqDamScene7ImplScene7FlashT.getExample();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2 = OASComDayCqDamScene7ImplScene7FlashT.getExample();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3 = new OASComDayCqDamScene7ImplScene7FlashT();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties4 = new OASComDayCqDamScene7ImplScene7FlashT();

        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties4));
        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties4.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1 = OASComDayCqDamScene7ImplScene7FlashT.getExample();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2 = new OASComDayCqDamScene7ImplScene7FlashT();

        System.assertEquals(false, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1 = OASComDayCqDamScene7ImplScene7FlashT.getExample();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2 = new OASComDayCqDamScene7ImplScene7FlashT();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3;

        System.assertEquals(false, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3));
        System.assertEquals(false, comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1 = OASComDayCqDamScene7ImplScene7FlashT.getExample();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2 = new OASComDayCqDamScene7ImplScene7FlashT();

        System.assertEquals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1.hashCode(), comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2.hashCode(), comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1 = OASComDayCqDamScene7ImplScene7FlashT.getExample();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2 = OASComDayCqDamScene7ImplScene7FlashT.getExample();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3 = new OASComDayCqDamScene7ImplScene7FlashT();
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties4 = new OASComDayCqDamScene7ImplScene7FlashT();

        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3.equals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties4));
        System.assertEquals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties1.hashCode(), comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties3.hashCode(), comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamScene7ImplScene7FlashT comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties = new OASComDayCqDamScene7ImplScene7FlashT();
        Map<String, String> propertyMappings = comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.getPropertyMappings();
        System.assertEquals('scene7FlashTemplatesRti', propertyMappings.get('scene7FlashTemplates.rti'));
        System.assertEquals('scene7FlashTemplatesRsi', propertyMappings.get('scene7FlashTemplates.rsi'));
        System.assertEquals('scene7FlashTemplatesRb', propertyMappings.get('scene7FlashTemplates.rb'));
        System.assertEquals('scene7FlashTemplatesRurl', propertyMappings.get('scene7FlashTemplates.rurl'));
        System.assertEquals('scene7FlashTemplateUrlFormatParameter', propertyMappings.get('scene7FlashTemplate.urlFormatParameter'));
    }
}
