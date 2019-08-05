@isTest
private class OASComDayCqDamCoreImplServletHealthCTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties1 = OASComDayCqDamCoreImplServletHealthC.getExample();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties2 = comDayCqDamCoreImplServletHealthCheckServletProperties1;
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties3 = new OASComDayCqDamCoreImplServletHealthC();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties4 = comDayCqDamCoreImplServletHealthCheckServletProperties3;

        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties1.equals(comDayCqDamCoreImplServletHealthCheckServletProperties2));
        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties2.equals(comDayCqDamCoreImplServletHealthCheckServletProperties1));
        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties1.equals(comDayCqDamCoreImplServletHealthCheckServletProperties1));
        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties3.equals(comDayCqDamCoreImplServletHealthCheckServletProperties4));
        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties4.equals(comDayCqDamCoreImplServletHealthCheckServletProperties3));
        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties3.equals(comDayCqDamCoreImplServletHealthCheckServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties1 = OASComDayCqDamCoreImplServletHealthC.getExample();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties2 = OASComDayCqDamCoreImplServletHealthC.getExample();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties3 = new OASComDayCqDamCoreImplServletHealthC();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties4 = new OASComDayCqDamCoreImplServletHealthC();

        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties1.equals(comDayCqDamCoreImplServletHealthCheckServletProperties2));
        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties2.equals(comDayCqDamCoreImplServletHealthCheckServletProperties1));
        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties3.equals(comDayCqDamCoreImplServletHealthCheckServletProperties4));
        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties4.equals(comDayCqDamCoreImplServletHealthCheckServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties1 = OASComDayCqDamCoreImplServletHealthC.getExample();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties2 = new OASComDayCqDamCoreImplServletHealthC();

        System.assertEquals(false, comDayCqDamCoreImplServletHealthCheckServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletHealthCheckServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties1 = OASComDayCqDamCoreImplServletHealthC.getExample();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties2 = new OASComDayCqDamCoreImplServletHealthC();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletHealthCheckServletProperties1.equals(comDayCqDamCoreImplServletHealthCheckServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletHealthCheckServletProperties2.equals(comDayCqDamCoreImplServletHealthCheckServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties1 = OASComDayCqDamCoreImplServletHealthC.getExample();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties2 = new OASComDayCqDamCoreImplServletHealthC();

        System.assertEquals(comDayCqDamCoreImplServletHealthCheckServletProperties1.hashCode(), comDayCqDamCoreImplServletHealthCheckServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletHealthCheckServletProperties2.hashCode(), comDayCqDamCoreImplServletHealthCheckServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties1 = OASComDayCqDamCoreImplServletHealthC.getExample();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties2 = OASComDayCqDamCoreImplServletHealthC.getExample();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties3 = new OASComDayCqDamCoreImplServletHealthC();
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties4 = new OASComDayCqDamCoreImplServletHealthC();

        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties1.equals(comDayCqDamCoreImplServletHealthCheckServletProperties2));
        System.assert(comDayCqDamCoreImplServletHealthCheckServletProperties3.equals(comDayCqDamCoreImplServletHealthCheckServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletHealthCheckServletProperties1.hashCode(), comDayCqDamCoreImplServletHealthCheckServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletHealthCheckServletProperties3.hashCode(), comDayCqDamCoreImplServletHealthCheckServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletHealthC comDayCqDamCoreImplServletHealthCheckServletProperties = new OASComDayCqDamCoreImplServletHealthC();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletHealthCheckServletProperties.getPropertyMappings();
        System.assertEquals('cqDamSyncWorkflowId', propertyMappings.get('cq.dam.sync.workflow.id'));
        System.assertEquals('cqDamSyncFolderTypes', propertyMappings.get('cq.dam.sync.folder.types'));
    }
}
