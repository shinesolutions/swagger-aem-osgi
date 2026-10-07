@isTest
private class OASComAdobeGraniteWorkflowCoreWorkflTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1 = OASComAdobeGraniteWorkflowCoreWorkfl.getExample();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2 = comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1;
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3 = new OASComAdobeGraniteWorkflowCoreWorkfl();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties4 = comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3;

        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2));
        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1));
        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1));
        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties4));
        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties4.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3));
        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1 = OASComAdobeGraniteWorkflowCoreWorkfl.getExample();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2 = OASComAdobeGraniteWorkflowCoreWorkfl.getExample();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3 = new OASComAdobeGraniteWorkflowCoreWorkfl();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties4 = new OASComAdobeGraniteWorkflowCoreWorkfl();

        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2));
        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1));
        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties4));
        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties4.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1 = OASComAdobeGraniteWorkflowCoreWorkfl.getExample();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2 = new OASComAdobeGraniteWorkflowCoreWorkfl();

        System.assertEquals(false, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1 = OASComAdobeGraniteWorkflowCoreWorkfl.getExample();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2 = new OASComAdobeGraniteWorkflowCoreWorkfl();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3;

        System.assertEquals(false, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1 = OASComAdobeGraniteWorkflowCoreWorkfl.getExample();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2 = new OASComAdobeGraniteWorkflowCoreWorkfl();

        System.assertEquals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1.hashCode(), comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2.hashCode(), comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1 = OASComAdobeGraniteWorkflowCoreWorkfl.getExample();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2 = OASComAdobeGraniteWorkflowCoreWorkfl.getExample();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3 = new OASComAdobeGraniteWorkflowCoreWorkfl();
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties4 = new OASComAdobeGraniteWorkflowCoreWorkfl();

        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2));
        System.assert(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3.equals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties4));
        System.assertEquals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties1.hashCode(), comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties2.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties3.hashCode(), comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteWorkflowCoreWorkfl comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties = new OASComAdobeGraniteWorkflowCoreWorkfl();
        Map<String, String> x-property-mappings = comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.getx-property-mappings();
        System.assertEquals('graniteWorkflowinboxSortPropertyName', x-property-mappings.get('granite.workflowinbox.sort.propertyName'));
        System.assertEquals('graniteWorkflowinboxSortOrder', x-property-mappings.get('granite.workflowinbox.sort.order'));
        System.assertEquals('cqWorkflowJobRetry', x-property-mappings.get('cq.workflow.job.retry'));
        System.assertEquals('cqWorkflowSuperuser', x-property-mappings.get('cq.workflow.superuser'));
        System.assertEquals('graniteWorkflowInboxQuerySize', x-property-mappings.get('granite.workflow.inboxQuerySize'));
        System.assertEquals('graniteWorkflowAdminUserGroupFilter', x-property-mappings.get('granite.workflow.adminUserGroupFilter'));
        System.assertEquals('graniteWorkflowEnforceWorkitemAssigneePermissions', x-property-mappings.get('granite.workflow.enforceWorkitemAssigneePermissions'));
        System.assertEquals('graniteWorkflowEnforceWorkflowInitiatorPermissions', x-property-mappings.get('granite.workflow.enforceWorkflowInitiatorPermissions'));
        System.assertEquals('graniteWorkflowInjectTenantIdInJobTopics', x-property-mappings.get('granite.workflow.injectTenantIdInJobTopics'));
        System.assertEquals('graniteWorkflowMaxPurgeSaveThreshold', x-property-mappings.get('granite.workflow.maxPurgeSaveThreshold'));
        System.assertEquals('graniteWorkflowMaxPurgeQueryCount', x-property-mappings.get('granite.workflow.maxPurgeQueryCount'));
    }
}
