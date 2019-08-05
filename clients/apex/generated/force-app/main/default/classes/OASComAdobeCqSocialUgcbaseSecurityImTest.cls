@isTest
private class OASComAdobeCqSocialUgcbaseSecurityImTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1 = OASComAdobeCqSocialUgcbaseSecurityIm.getExample();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2 = comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1;
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3 = new OASComAdobeCqSocialUgcbaseSecurityIm();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties4 = comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3;

        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties4.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3));
        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1 = OASComAdobeCqSocialUgcbaseSecurityIm.getExample();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2 = OASComAdobeCqSocialUgcbaseSecurityIm.getExample();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3 = new OASComAdobeCqSocialUgcbaseSecurityIm();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties4 = new OASComAdobeCqSocialUgcbaseSecurityIm();

        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties4.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1 = OASComAdobeCqSocialUgcbaseSecurityIm.getExample();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2 = new OASComAdobeCqSocialUgcbaseSecurityIm();

        System.assertEquals(false, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1 = OASComAdobeCqSocialUgcbaseSecurityIm.getExample();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2 = new OASComAdobeCqSocialUgcbaseSecurityIm();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3;

        System.assertEquals(false, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3));
        System.assertEquals(false, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1 = OASComAdobeCqSocialUgcbaseSecurityIm.getExample();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2 = new OASComAdobeCqSocialUgcbaseSecurityIm();

        System.assertEquals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1.hashCode(), comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2.hashCode(), comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1 = OASComAdobeCqSocialUgcbaseSecurityIm.getExample();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2 = OASComAdobeCqSocialUgcbaseSecurityIm.getExample();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3 = new OASComAdobeCqSocialUgcbaseSecurityIm();
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties4 = new OASComAdobeCqSocialUgcbaseSecurityIm();

        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3.equals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties4));
        System.assertEquals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties1.hashCode(), comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties3.hashCode(), comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialUgcbaseSecurityIm comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties = new OASComAdobeCqSocialUgcbaseSecurityIm();
        Map<String, String> propertyMappings = comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.getPropertyMappings();
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
