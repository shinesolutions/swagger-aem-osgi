@isTest
private class OASComAdobeCqAuditPurgeDamPropertiesTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties1 = OASComAdobeCqAuditPurgeDamProperties.getExample();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties2 = comAdobeCqAuditPurgeDamProperties1;
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties3 = new OASComAdobeCqAuditPurgeDamProperties();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties4 = comAdobeCqAuditPurgeDamProperties3;

        System.assert(comAdobeCqAuditPurgeDamProperties1.equals(comAdobeCqAuditPurgeDamProperties2));
        System.assert(comAdobeCqAuditPurgeDamProperties2.equals(comAdobeCqAuditPurgeDamProperties1));
        System.assert(comAdobeCqAuditPurgeDamProperties1.equals(comAdobeCqAuditPurgeDamProperties1));
        System.assert(comAdobeCqAuditPurgeDamProperties3.equals(comAdobeCqAuditPurgeDamProperties4));
        System.assert(comAdobeCqAuditPurgeDamProperties4.equals(comAdobeCqAuditPurgeDamProperties3));
        System.assert(comAdobeCqAuditPurgeDamProperties3.equals(comAdobeCqAuditPurgeDamProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties1 = OASComAdobeCqAuditPurgeDamProperties.getExample();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties2 = OASComAdobeCqAuditPurgeDamProperties.getExample();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties3 = new OASComAdobeCqAuditPurgeDamProperties();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties4 = new OASComAdobeCqAuditPurgeDamProperties();

        System.assert(comAdobeCqAuditPurgeDamProperties1.equals(comAdobeCqAuditPurgeDamProperties2));
        System.assert(comAdobeCqAuditPurgeDamProperties2.equals(comAdobeCqAuditPurgeDamProperties1));
        System.assert(comAdobeCqAuditPurgeDamProperties3.equals(comAdobeCqAuditPurgeDamProperties4));
        System.assert(comAdobeCqAuditPurgeDamProperties4.equals(comAdobeCqAuditPurgeDamProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties1 = OASComAdobeCqAuditPurgeDamProperties.getExample();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties2 = new OASComAdobeCqAuditPurgeDamProperties();

        System.assertEquals(false, comAdobeCqAuditPurgeDamProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqAuditPurgeDamProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties1 = OASComAdobeCqAuditPurgeDamProperties.getExample();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties2 = new OASComAdobeCqAuditPurgeDamProperties();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties3;

        System.assertEquals(false, comAdobeCqAuditPurgeDamProperties1.equals(comAdobeCqAuditPurgeDamProperties3));
        System.assertEquals(false, comAdobeCqAuditPurgeDamProperties2.equals(comAdobeCqAuditPurgeDamProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties1 = OASComAdobeCqAuditPurgeDamProperties.getExample();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties2 = new OASComAdobeCqAuditPurgeDamProperties();

        System.assertEquals(comAdobeCqAuditPurgeDamProperties1.hashCode(), comAdobeCqAuditPurgeDamProperties1.hashCode());
        System.assertEquals(comAdobeCqAuditPurgeDamProperties2.hashCode(), comAdobeCqAuditPurgeDamProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties1 = OASComAdobeCqAuditPurgeDamProperties.getExample();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties2 = OASComAdobeCqAuditPurgeDamProperties.getExample();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties3 = new OASComAdobeCqAuditPurgeDamProperties();
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties4 = new OASComAdobeCqAuditPurgeDamProperties();

        System.assert(comAdobeCqAuditPurgeDamProperties1.equals(comAdobeCqAuditPurgeDamProperties2));
        System.assert(comAdobeCqAuditPurgeDamProperties3.equals(comAdobeCqAuditPurgeDamProperties4));
        System.assertEquals(comAdobeCqAuditPurgeDamProperties1.hashCode(), comAdobeCqAuditPurgeDamProperties2.hashCode());
        System.assertEquals(comAdobeCqAuditPurgeDamProperties3.hashCode(), comAdobeCqAuditPurgeDamProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties = new OASComAdobeCqAuditPurgeDamProperties();
        Map<String, String> propertyMappings = comAdobeCqAuditPurgeDamProperties.getPropertyMappings();
        System.assertEquals('auditlogRuleName', propertyMappings.get('auditlog.rule.name'));
        System.assertEquals('auditlogRuleContentpath', propertyMappings.get('auditlog.rule.contentpath'));
        System.assertEquals('auditlogRuleMinimumage', propertyMappings.get('auditlog.rule.minimumage'));
        System.assertEquals('auditlogRuleTypes', propertyMappings.get('auditlog.rule.types'));
    }
}
