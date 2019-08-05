@isTest
private class OASComDayCqWcmCoreImplWCMDeveloperMoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1 = OASComDayCqWcmCoreImplWCMDeveloperMo.getExample();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2 = comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1;
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3 = new OASComDayCqWcmCoreImplWCMDeveloperMo();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties4 = comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3;

        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2));
        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1));
        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1));
        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties4));
        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties4.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3));
        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1 = OASComDayCqWcmCoreImplWCMDeveloperMo.getExample();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2 = OASComDayCqWcmCoreImplWCMDeveloperMo.getExample();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3 = new OASComDayCqWcmCoreImplWCMDeveloperMo();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties4 = new OASComDayCqWcmCoreImplWCMDeveloperMo();

        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2));
        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1));
        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties4));
        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties4.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1 = OASComDayCqWcmCoreImplWCMDeveloperMo.getExample();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2 = new OASComDayCqWcmCoreImplWCMDeveloperMo();

        System.assertEquals(false, comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1 = OASComDayCqWcmCoreImplWCMDeveloperMo.getExample();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2 = new OASComDayCqWcmCoreImplWCMDeveloperMo();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1 = OASComDayCqWcmCoreImplWCMDeveloperMo.getExample();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2 = new OASComDayCqWcmCoreImplWCMDeveloperMo();

        System.assertEquals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1.hashCode(), comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2.hashCode(), comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1 = OASComDayCqWcmCoreImplWCMDeveloperMo.getExample();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2 = OASComDayCqWcmCoreImplWCMDeveloperMo.getExample();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3 = new OASComDayCqWcmCoreImplWCMDeveloperMo();
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties4 = new OASComDayCqWcmCoreImplWCMDeveloperMo();

        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2));
        System.assert(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3.equals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties4));
        System.assertEquals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties1.hashCode(), comDayCqWcmCoreImplWCMDeveloperModeFilterProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplWCMDeveloperModeFilterProperties3.hashCode(), comDayCqWcmCoreImplWCMDeveloperModeFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplWCMDeveloperMo comDayCqWcmCoreImplWCMDeveloperModeFilterProperties = new OASComDayCqWcmCoreImplWCMDeveloperMo();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplWCMDeveloperModeFilterProperties.getPropertyMappings();
        System.assertEquals('wcmdevmodefilterEnabled', propertyMappings.get('wcmdevmodefilter.enabled'));
    }
}
