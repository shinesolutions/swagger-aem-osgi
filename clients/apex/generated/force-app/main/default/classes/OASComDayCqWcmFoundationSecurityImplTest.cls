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
        Map<String, String> x-property-mappings = comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.getx-property-mappings();
        System.assertEquals('parameterWhitelist', x-property-mappings.get('parameter.whitelist'));
        System.assertEquals('parameterWhitelistPrefixes', x-property-mappings.get('parameter.whitelist.prefixes'));
        System.assertEquals('binaryParameterWhitelist', x-property-mappings.get('binary.parameter.whitelist'));
        System.assertEquals('modifierWhitelist', x-property-mappings.get('modifier.whitelist'));
        System.assertEquals('operationWhitelist', x-property-mappings.get('operation.whitelist'));
        System.assertEquals('operationWhitelistPrefixes', x-property-mappings.get('operation.whitelist.prefixes'));
        System.assertEquals('typehintWhitelist', x-property-mappings.get('typehint.whitelist'));
        System.assertEquals('resourcetypeWhitelist', x-property-mappings.get('resourcetype.whitelist'));
    }
}
