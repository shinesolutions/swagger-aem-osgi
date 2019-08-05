@isTest
private class OASComDayCqWcmFoundationSecurityImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1 = OASComDayCqWcmFoundationSecurityImpl.getExample();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2 = comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1;
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3 = new OASComDayCqWcmFoundationSecurityImpl();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties4 = comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3;

        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2));
        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1));
        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1));
        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties4));
        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties4.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3));
        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1 = OASComDayCqWcmFoundationSecurityImpl.getExample();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2 = OASComDayCqWcmFoundationSecurityImpl.getExample();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3 = new OASComDayCqWcmFoundationSecurityImpl();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties4 = new OASComDayCqWcmFoundationSecurityImpl();

        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2));
        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1));
        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties4));
        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties4.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1 = OASComDayCqWcmFoundationSecurityImpl.getExample();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2 = new OASComDayCqWcmFoundationSecurityImpl();

        System.assertEquals(false, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1 = OASComDayCqWcmFoundationSecurityImpl.getExample();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2 = new OASComDayCqWcmFoundationSecurityImpl();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3;

        System.assertEquals(false, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3));
        System.assertEquals(false, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1 = OASComDayCqWcmFoundationSecurityImpl.getExample();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2 = new OASComDayCqWcmFoundationSecurityImpl();

        System.assertEquals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1.hashCode(), comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2.hashCode(), comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1 = OASComDayCqWcmFoundationSecurityImpl.getExample();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2 = OASComDayCqWcmFoundationSecurityImpl.getExample();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3 = new OASComDayCqWcmFoundationSecurityImpl();
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties4 = new OASComDayCqWcmFoundationSecurityImpl();

        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2));
        System.assert(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3.equals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties4));
        System.assertEquals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties1.hashCode(), comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties3.hashCode(), comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmFoundationSecurityImpl comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties = new OASComDayCqWcmFoundationSecurityImpl();
        Map<String, String> propertyMappings = comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.getPropertyMappings();
        System.assertEquals('parameterWhitelist', propertyMappings.get('parameter.whitelist'));
        System.assertEquals('parameterWhitelistPrefixes', propertyMappings.get('parameter.whitelist.prefixes'));
        System.assertEquals('binaryParameterWhitelist', propertyMappings.get('binary.parameter.whitelist'));
        System.assertEquals('modifierWhitelist', propertyMappings.get('modifier.whitelist'));
        System.assertEquals('operationWhitelist', propertyMappings.get('operation.whitelist'));
        System.assertEquals('operationWhitelistPrefixes', propertyMappings.get('operation.whitelist.prefixes'));
        System.assertEquals('typehintWhitelist', propertyMappings.get('typehint.whitelist'));
        System.assertEquals('resourcetypeWhitelist', propertyMappings.get('resourcetype.whitelist'));
    }
}
