@isTest
private class OASComAdobeCqAuditPurgePagesPropertiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties1 = OASComAdobeCqAuditPurgePagesProperti.getExample();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties2 = comAdobeCqAuditPurgePagesProperties1;
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties3 = new OASComAdobeCqAuditPurgePagesProperti();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties4 = comAdobeCqAuditPurgePagesProperties3;

        System.assert(comAdobeCqAuditPurgePagesProperties1.equals(comAdobeCqAuditPurgePagesProperties2));
        System.assert(comAdobeCqAuditPurgePagesProperties2.equals(comAdobeCqAuditPurgePagesProperties1));
        System.assert(comAdobeCqAuditPurgePagesProperties1.equals(comAdobeCqAuditPurgePagesProperties1));
        System.assert(comAdobeCqAuditPurgePagesProperties3.equals(comAdobeCqAuditPurgePagesProperties4));
        System.assert(comAdobeCqAuditPurgePagesProperties4.equals(comAdobeCqAuditPurgePagesProperties3));
        System.assert(comAdobeCqAuditPurgePagesProperties3.equals(comAdobeCqAuditPurgePagesProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties1 = OASComAdobeCqAuditPurgePagesProperti.getExample();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties2 = OASComAdobeCqAuditPurgePagesProperti.getExample();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties3 = new OASComAdobeCqAuditPurgePagesProperti();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties4 = new OASComAdobeCqAuditPurgePagesProperti();

        System.assert(comAdobeCqAuditPurgePagesProperties1.equals(comAdobeCqAuditPurgePagesProperties2));
        System.assert(comAdobeCqAuditPurgePagesProperties2.equals(comAdobeCqAuditPurgePagesProperties1));
        System.assert(comAdobeCqAuditPurgePagesProperties3.equals(comAdobeCqAuditPurgePagesProperties4));
        System.assert(comAdobeCqAuditPurgePagesProperties4.equals(comAdobeCqAuditPurgePagesProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties1 = OASComAdobeCqAuditPurgePagesProperti.getExample();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties2 = new OASComAdobeCqAuditPurgePagesProperti();

        System.assertEquals(false, comAdobeCqAuditPurgePagesProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqAuditPurgePagesProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties1 = OASComAdobeCqAuditPurgePagesProperti.getExample();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties2 = new OASComAdobeCqAuditPurgePagesProperti();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties3;

        System.assertEquals(false, comAdobeCqAuditPurgePagesProperties1.equals(comAdobeCqAuditPurgePagesProperties3));
        System.assertEquals(false, comAdobeCqAuditPurgePagesProperties2.equals(comAdobeCqAuditPurgePagesProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties1 = OASComAdobeCqAuditPurgePagesProperti.getExample();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties2 = new OASComAdobeCqAuditPurgePagesProperti();

        System.assertEquals(comAdobeCqAuditPurgePagesProperties1.hashCode(), comAdobeCqAuditPurgePagesProperties1.hashCode());
        System.assertEquals(comAdobeCqAuditPurgePagesProperties2.hashCode(), comAdobeCqAuditPurgePagesProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties1 = OASComAdobeCqAuditPurgePagesProperti.getExample();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties2 = OASComAdobeCqAuditPurgePagesProperti.getExample();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties3 = new OASComAdobeCqAuditPurgePagesProperti();
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties4 = new OASComAdobeCqAuditPurgePagesProperti();

        System.assert(comAdobeCqAuditPurgePagesProperties1.equals(comAdobeCqAuditPurgePagesProperties2));
        System.assert(comAdobeCqAuditPurgePagesProperties3.equals(comAdobeCqAuditPurgePagesProperties4));
        System.assertEquals(comAdobeCqAuditPurgePagesProperties1.hashCode(), comAdobeCqAuditPurgePagesProperties2.hashCode());
        System.assertEquals(comAdobeCqAuditPurgePagesProperties3.hashCode(), comAdobeCqAuditPurgePagesProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqAuditPurgePagesProperti comAdobeCqAuditPurgePagesProperties = new OASComAdobeCqAuditPurgePagesProperti();
        Map<String, String> propertyMappings = comAdobeCqAuditPurgePagesProperties.getPropertyMappings();
        System.assertEquals('auditlogRuleName', propertyMappings.get('auditlog.rule.name'));
        System.assertEquals('auditlogRuleContentpath', propertyMappings.get('auditlog.rule.contentpath'));
        System.assertEquals('auditlogRuleMinimumage', propertyMappings.get('auditlog.rule.minimumage'));
        System.assertEquals('auditlogRuleTypes', propertyMappings.get('auditlog.rule.types'));
    }
}
