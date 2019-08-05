@isTest
private class OASComDayCqMcmImplMCMConfigurationPrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties1 = OASComDayCqMcmImplMCMConfigurationPr.getExample();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties2 = comDayCqMcmImplMCMConfigurationProperties1;
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties3 = new OASComDayCqMcmImplMCMConfigurationPr();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties4 = comDayCqMcmImplMCMConfigurationProperties3;

        System.assert(comDayCqMcmImplMCMConfigurationProperties1.equals(comDayCqMcmImplMCMConfigurationProperties2));
        System.assert(comDayCqMcmImplMCMConfigurationProperties2.equals(comDayCqMcmImplMCMConfigurationProperties1));
        System.assert(comDayCqMcmImplMCMConfigurationProperties1.equals(comDayCqMcmImplMCMConfigurationProperties1));
        System.assert(comDayCqMcmImplMCMConfigurationProperties3.equals(comDayCqMcmImplMCMConfigurationProperties4));
        System.assert(comDayCqMcmImplMCMConfigurationProperties4.equals(comDayCqMcmImplMCMConfigurationProperties3));
        System.assert(comDayCqMcmImplMCMConfigurationProperties3.equals(comDayCqMcmImplMCMConfigurationProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties1 = OASComDayCqMcmImplMCMConfigurationPr.getExample();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties2 = OASComDayCqMcmImplMCMConfigurationPr.getExample();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties3 = new OASComDayCqMcmImplMCMConfigurationPr();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties4 = new OASComDayCqMcmImplMCMConfigurationPr();

        System.assert(comDayCqMcmImplMCMConfigurationProperties1.equals(comDayCqMcmImplMCMConfigurationProperties2));
        System.assert(comDayCqMcmImplMCMConfigurationProperties2.equals(comDayCqMcmImplMCMConfigurationProperties1));
        System.assert(comDayCqMcmImplMCMConfigurationProperties3.equals(comDayCqMcmImplMCMConfigurationProperties4));
        System.assert(comDayCqMcmImplMCMConfigurationProperties4.equals(comDayCqMcmImplMCMConfigurationProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties1 = OASComDayCqMcmImplMCMConfigurationPr.getExample();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties2 = new OASComDayCqMcmImplMCMConfigurationPr();

        System.assertEquals(false, comDayCqMcmImplMCMConfigurationProperties1.equals('foo'));
        System.assertEquals(false, comDayCqMcmImplMCMConfigurationProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties1 = OASComDayCqMcmImplMCMConfigurationPr.getExample();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties2 = new OASComDayCqMcmImplMCMConfigurationPr();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties3;

        System.assertEquals(false, comDayCqMcmImplMCMConfigurationProperties1.equals(comDayCqMcmImplMCMConfigurationProperties3));
        System.assertEquals(false, comDayCqMcmImplMCMConfigurationProperties2.equals(comDayCqMcmImplMCMConfigurationProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties1 = OASComDayCqMcmImplMCMConfigurationPr.getExample();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties2 = new OASComDayCqMcmImplMCMConfigurationPr();

        System.assertEquals(comDayCqMcmImplMCMConfigurationProperties1.hashCode(), comDayCqMcmImplMCMConfigurationProperties1.hashCode());
        System.assertEquals(comDayCqMcmImplMCMConfigurationProperties2.hashCode(), comDayCqMcmImplMCMConfigurationProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties1 = OASComDayCqMcmImplMCMConfigurationPr.getExample();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties2 = OASComDayCqMcmImplMCMConfigurationPr.getExample();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties3 = new OASComDayCqMcmImplMCMConfigurationPr();
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties4 = new OASComDayCqMcmImplMCMConfigurationPr();

        System.assert(comDayCqMcmImplMCMConfigurationProperties1.equals(comDayCqMcmImplMCMConfigurationProperties2));
        System.assert(comDayCqMcmImplMCMConfigurationProperties3.equals(comDayCqMcmImplMCMConfigurationProperties4));
        System.assertEquals(comDayCqMcmImplMCMConfigurationProperties1.hashCode(), comDayCqMcmImplMCMConfigurationProperties2.hashCode());
        System.assertEquals(comDayCqMcmImplMCMConfigurationProperties3.hashCode(), comDayCqMcmImplMCMConfigurationProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqMcmImplMCMConfigurationPr comDayCqMcmImplMCMConfigurationProperties = new OASComDayCqMcmImplMCMConfigurationPr();
        Map<String, String> propertyMappings = comDayCqMcmImplMCMConfigurationProperties.getPropertyMappings();
        System.assertEquals('experienceIndirection', propertyMappings.get('experience.indirection'));
        System.assertEquals('touchpointIndirection', propertyMappings.get('touchpoint.indirection'));
    }
}
