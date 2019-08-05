@isTest
private class OASComDayCqDamCoreImplProcessSendTraTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1 = OASComDayCqDamCoreImplProcessSendTra.getExample();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2 = comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1;
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3 = new OASComDayCqDamCoreImplProcessSendTra();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties4 = comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3;

        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2));
        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1));
        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1));
        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties4));
        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties4.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3));
        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1 = OASComDayCqDamCoreImplProcessSendTra.getExample();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2 = OASComDayCqDamCoreImplProcessSendTra.getExample();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3 = new OASComDayCqDamCoreImplProcessSendTra();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties4 = new OASComDayCqDamCoreImplProcessSendTra();

        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2));
        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1));
        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties4));
        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties4.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1 = OASComDayCqDamCoreImplProcessSendTra.getExample();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2 = new OASComDayCqDamCoreImplProcessSendTra();

        System.assertEquals(false, comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1 = OASComDayCqDamCoreImplProcessSendTra.getExample();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2 = new OASComDayCqDamCoreImplProcessSendTra();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3;

        System.assertEquals(false, comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3));
        System.assertEquals(false, comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1 = OASComDayCqDamCoreImplProcessSendTra.getExample();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2 = new OASComDayCqDamCoreImplProcessSendTra();

        System.assertEquals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1.hashCode(), comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2.hashCode(), comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1 = OASComDayCqDamCoreImplProcessSendTra.getExample();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2 = OASComDayCqDamCoreImplProcessSendTra.getExample();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3 = new OASComDayCqDamCoreImplProcessSendTra();
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties4 = new OASComDayCqDamCoreImplProcessSendTra();

        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2));
        System.assert(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3.equals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties4));
        System.assertEquals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties1.hashCode(), comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties3.hashCode(), comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplProcessSendTra comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties = new OASComDayCqDamCoreImplProcessSendTra();
        Map<String, String> propertyMappings = comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.getPropertyMappings();
        System.assertEquals('processLabel', propertyMappings.get('process.label'));
        System.assertEquals('notifyOnComplete', propertyMappings.get('Notify on Complete'));
    }
}
