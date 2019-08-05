@isTest
private class OASComAdobeCqAuditPurgeReplicationPrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties1 = OASComAdobeCqAuditPurgeReplicationPr.getExample();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties2 = comAdobeCqAuditPurgeReplicationProperties1;
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties3 = new OASComAdobeCqAuditPurgeReplicationPr();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties4 = comAdobeCqAuditPurgeReplicationProperties3;

        System.assert(comAdobeCqAuditPurgeReplicationProperties1.equals(comAdobeCqAuditPurgeReplicationProperties2));
        System.assert(comAdobeCqAuditPurgeReplicationProperties2.equals(comAdobeCqAuditPurgeReplicationProperties1));
        System.assert(comAdobeCqAuditPurgeReplicationProperties1.equals(comAdobeCqAuditPurgeReplicationProperties1));
        System.assert(comAdobeCqAuditPurgeReplicationProperties3.equals(comAdobeCqAuditPurgeReplicationProperties4));
        System.assert(comAdobeCqAuditPurgeReplicationProperties4.equals(comAdobeCqAuditPurgeReplicationProperties3));
        System.assert(comAdobeCqAuditPurgeReplicationProperties3.equals(comAdobeCqAuditPurgeReplicationProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties1 = OASComAdobeCqAuditPurgeReplicationPr.getExample();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties2 = OASComAdobeCqAuditPurgeReplicationPr.getExample();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties3 = new OASComAdobeCqAuditPurgeReplicationPr();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties4 = new OASComAdobeCqAuditPurgeReplicationPr();

        System.assert(comAdobeCqAuditPurgeReplicationProperties1.equals(comAdobeCqAuditPurgeReplicationProperties2));
        System.assert(comAdobeCqAuditPurgeReplicationProperties2.equals(comAdobeCqAuditPurgeReplicationProperties1));
        System.assert(comAdobeCqAuditPurgeReplicationProperties3.equals(comAdobeCqAuditPurgeReplicationProperties4));
        System.assert(comAdobeCqAuditPurgeReplicationProperties4.equals(comAdobeCqAuditPurgeReplicationProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties1 = OASComAdobeCqAuditPurgeReplicationPr.getExample();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties2 = new OASComAdobeCqAuditPurgeReplicationPr();

        System.assertEquals(false, comAdobeCqAuditPurgeReplicationProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqAuditPurgeReplicationProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties1 = OASComAdobeCqAuditPurgeReplicationPr.getExample();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties2 = new OASComAdobeCqAuditPurgeReplicationPr();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties3;

        System.assertEquals(false, comAdobeCqAuditPurgeReplicationProperties1.equals(comAdobeCqAuditPurgeReplicationProperties3));
        System.assertEquals(false, comAdobeCqAuditPurgeReplicationProperties2.equals(comAdobeCqAuditPurgeReplicationProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties1 = OASComAdobeCqAuditPurgeReplicationPr.getExample();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties2 = new OASComAdobeCqAuditPurgeReplicationPr();

        System.assertEquals(comAdobeCqAuditPurgeReplicationProperties1.hashCode(), comAdobeCqAuditPurgeReplicationProperties1.hashCode());
        System.assertEquals(comAdobeCqAuditPurgeReplicationProperties2.hashCode(), comAdobeCqAuditPurgeReplicationProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties1 = OASComAdobeCqAuditPurgeReplicationPr.getExample();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties2 = OASComAdobeCqAuditPurgeReplicationPr.getExample();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties3 = new OASComAdobeCqAuditPurgeReplicationPr();
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties4 = new OASComAdobeCqAuditPurgeReplicationPr();

        System.assert(comAdobeCqAuditPurgeReplicationProperties1.equals(comAdobeCqAuditPurgeReplicationProperties2));
        System.assert(comAdobeCqAuditPurgeReplicationProperties3.equals(comAdobeCqAuditPurgeReplicationProperties4));
        System.assertEquals(comAdobeCqAuditPurgeReplicationProperties1.hashCode(), comAdobeCqAuditPurgeReplicationProperties2.hashCode());
        System.assertEquals(comAdobeCqAuditPurgeReplicationProperties3.hashCode(), comAdobeCqAuditPurgeReplicationProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqAuditPurgeReplicationPr comAdobeCqAuditPurgeReplicationProperties = new OASComAdobeCqAuditPurgeReplicationPr();
        Map<String, String> propertyMappings = comAdobeCqAuditPurgeReplicationProperties.getPropertyMappings();
        System.assertEquals('auditlogRuleName', propertyMappings.get('auditlog.rule.name'));
        System.assertEquals('auditlogRuleContentpath', propertyMappings.get('auditlog.rule.contentpath'));
        System.assertEquals('auditlogRuleMinimumage', propertyMappings.get('auditlog.rule.minimumage'));
        System.assertEquals('auditlogRuleTypes', propertyMappings.get('auditlog.rule.types'));
    }
}
