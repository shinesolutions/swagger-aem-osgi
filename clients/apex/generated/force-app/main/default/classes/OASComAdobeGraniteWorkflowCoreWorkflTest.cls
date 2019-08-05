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
        Map<String, String> propertyMappings = comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.getPropertyMappings();
        System.assertEquals('graniteWorkflowinboxSortPropertyName', propertyMappings.get('granite.workflowinbox.sort.propertyName'));
        System.assertEquals('graniteWorkflowinboxSortOrder', propertyMappings.get('granite.workflowinbox.sort.order'));
        System.assertEquals('cqWorkflowJobRetry', propertyMappings.get('cq.workflow.job.retry'));
        System.assertEquals('cqWorkflowSuperuser', propertyMappings.get('cq.workflow.superuser'));
        System.assertEquals('graniteWorkflowInboxQuerySize', propertyMappings.get('granite.workflow.inboxQuerySize'));
        System.assertEquals('graniteWorkflowAdminUserGroupFilter', propertyMappings.get('granite.workflow.adminUserGroupFilter'));
        System.assertEquals('graniteWorkflowEnforceWorkitemAssigneePermissions', propertyMappings.get('granite.workflow.enforceWorkitemAssigneePermissions'));
        System.assertEquals('graniteWorkflowEnforceWorkflowInitiatorPermissions', propertyMappings.get('granite.workflow.enforceWorkflowInitiatorPermissions'));
        System.assertEquals('graniteWorkflowInjectTenantIdInJobTopics', propertyMappings.get('granite.workflow.injectTenantIdInJobTopics'));
        System.assertEquals('graniteWorkflowMaxPurgeSaveThreshold', propertyMappings.get('granite.workflow.maxPurgeSaveThreshold'));
        System.assertEquals('graniteWorkflowMaxPurgeQueryCount', propertyMappings.get('granite.workflow.maxPurgeQueryCount'));
    }
}
