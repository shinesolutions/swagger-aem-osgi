@isTest
private class OASComDayCqWcmWorkflowImplWcmWorkfloTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1 = OASComDayCqWcmWorkflowImplWcmWorkflo.getExample();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2 = comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1;
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3 = new OASComDayCqWcmWorkflowImplWcmWorkflo();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties4 = comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3;

        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2));
        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1));
        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1));
        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties4));
        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties4.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3));
        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1 = OASComDayCqWcmWorkflowImplWcmWorkflo.getExample();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2 = OASComDayCqWcmWorkflowImplWcmWorkflo.getExample();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3 = new OASComDayCqWcmWorkflowImplWcmWorkflo();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties4 = new OASComDayCqWcmWorkflowImplWcmWorkflo();

        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2));
        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1));
        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties4));
        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties4.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1 = OASComDayCqWcmWorkflowImplWcmWorkflo.getExample();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2 = new OASComDayCqWcmWorkflowImplWcmWorkflo();

        System.assertEquals(false, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1 = OASComDayCqWcmWorkflowImplWcmWorkflo.getExample();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2 = new OASComDayCqWcmWorkflowImplWcmWorkflo();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3;

        System.assertEquals(false, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3));
        System.assertEquals(false, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1 = OASComDayCqWcmWorkflowImplWcmWorkflo.getExample();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2 = new OASComDayCqWcmWorkflowImplWcmWorkflo();

        System.assertEquals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1.hashCode(), comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2.hashCode(), comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1 = OASComDayCqWcmWorkflowImplWcmWorkflo.getExample();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2 = OASComDayCqWcmWorkflowImplWcmWorkflo.getExample();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3 = new OASComDayCqWcmWorkflowImplWcmWorkflo();
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties4 = new OASComDayCqWcmWorkflowImplWcmWorkflo();

        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2));
        System.assert(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3.equals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties4));
        System.assertEquals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties1.hashCode(), comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties3.hashCode(), comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmWorkflowImplWcmWorkflo comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties = new OASComDayCqWcmWorkflowImplWcmWorkflo();
        Map<String, String> propertyMappings = comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.getPropertyMappings();
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
        System.assertEquals('cqWcmWorkflowTerminateOnActivate', propertyMappings.get('cq.wcm.workflow.terminate.on.activate'));
        System.assertEquals('cqWcmWorklfowTerminateExclusionList', propertyMappings.get('cq.wcm.worklfow.terminate.exclusion.list'));
    }
}
