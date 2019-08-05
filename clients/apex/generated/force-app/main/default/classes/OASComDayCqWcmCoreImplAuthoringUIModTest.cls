@isTest
private class OASComDayCqWcmCoreImplAuthoringUIModTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1 = OASComDayCqWcmCoreImplAuthoringUIMod.getExample();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2 = comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1;
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3 = new OASComDayCqWcmCoreImplAuthoringUIMod();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties4 = comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3;

        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2));
        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1));
        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1));
        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties4));
        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties4.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3));
        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1 = OASComDayCqWcmCoreImplAuthoringUIMod.getExample();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2 = OASComDayCqWcmCoreImplAuthoringUIMod.getExample();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3 = new OASComDayCqWcmCoreImplAuthoringUIMod();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties4 = new OASComDayCqWcmCoreImplAuthoringUIMod();

        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2));
        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1));
        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties4));
        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties4.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1 = OASComDayCqWcmCoreImplAuthoringUIMod.getExample();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2 = new OASComDayCqWcmCoreImplAuthoringUIMod();

        System.assertEquals(false, comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1 = OASComDayCqWcmCoreImplAuthoringUIMod.getExample();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2 = new OASComDayCqWcmCoreImplAuthoringUIMod();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1 = OASComDayCqWcmCoreImplAuthoringUIMod.getExample();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2 = new OASComDayCqWcmCoreImplAuthoringUIMod();

        System.assertEquals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1.hashCode(), comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2.hashCode(), comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1 = OASComDayCqWcmCoreImplAuthoringUIMod.getExample();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2 = OASComDayCqWcmCoreImplAuthoringUIMod.getExample();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3 = new OASComDayCqWcmCoreImplAuthoringUIMod();
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties4 = new OASComDayCqWcmCoreImplAuthoringUIMod();

        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2));
        System.assert(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3.equals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties4));
        System.assertEquals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties1.hashCode(), comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties3.hashCode(), comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplAuthoringUIMod comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties = new OASComDayCqWcmCoreImplAuthoringUIMod();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.getPropertyMappings();
        System.assertEquals('authoringUIModeServiceDefault', propertyMappings.get('authoringUIModeService.default'));
    }
}
