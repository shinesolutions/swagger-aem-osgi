@isTest
private class OASComAdobeAemFormsndocumentsConfigATest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1 = OASComAdobeAemFormsndocumentsConfigA.getExample();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2 = comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1;
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3 = new OASComAdobeAemFormsndocumentsConfigA();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties4 = comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3;

        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2));
        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1));
        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1));
        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties4));
        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties4.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3));
        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1 = OASComAdobeAemFormsndocumentsConfigA.getExample();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2 = OASComAdobeAemFormsndocumentsConfigA.getExample();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3 = new OASComAdobeAemFormsndocumentsConfigA();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties4 = new OASComAdobeAemFormsndocumentsConfigA();

        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2));
        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1));
        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties4));
        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties4.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1 = OASComAdobeAemFormsndocumentsConfigA.getExample();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2 = new OASComAdobeAemFormsndocumentsConfigA();

        System.assertEquals(false, comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1.equals('foo'));
        System.assertEquals(false, comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1 = OASComAdobeAemFormsndocumentsConfigA.getExample();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2 = new OASComAdobeAemFormsndocumentsConfigA();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3;

        System.assertEquals(false, comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3));
        System.assertEquals(false, comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1 = OASComAdobeAemFormsndocumentsConfigA.getExample();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2 = new OASComAdobeAemFormsndocumentsConfigA();

        System.assertEquals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1.hashCode(), comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1.hashCode());
        System.assertEquals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2.hashCode(), comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1 = OASComAdobeAemFormsndocumentsConfigA.getExample();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2 = OASComAdobeAemFormsndocumentsConfigA.getExample();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3 = new OASComAdobeAemFormsndocumentsConfigA();
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties4 = new OASComAdobeAemFormsndocumentsConfigA();

        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2));
        System.assert(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3.equals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties4));
        System.assertEquals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties1.hashCode(), comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties2.hashCode());
        System.assertEquals(comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties3.hashCode(), comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeAemFormsndocumentsConfigA comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties = new OASComAdobeAemFormsndocumentsConfigA();
        Map<String, String> propertyMappings = comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.getPropertyMappings();
        System.assertEquals('formsManagerConfigIncludeOOTBTemplates', propertyMappings.get('formsManagerConfig.includeOOTBTemplates'));
        System.assertEquals('formsManagerConfigIncludeDeprecatedTemplates', propertyMappings.get('formsManagerConfig.includeDeprecatedTemplates'));
    }
}
