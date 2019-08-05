@isTest
private class OASComDayCqDamInddProcessINDDMediaExTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties1 = OASComDayCqDamInddProcessINDDMediaEx.getExample();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties2 = comDayCqDamInddProcessINDDMediaExtractProcessProperties1;
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties3 = new OASComDayCqDamInddProcessINDDMediaEx();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties4 = comDayCqDamInddProcessINDDMediaExtractProcessProperties3;

        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties1.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties2));
        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties2.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties1));
        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties1.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties1));
        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties3.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties4));
        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties4.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties3));
        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties3.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties1 = OASComDayCqDamInddProcessINDDMediaEx.getExample();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties2 = OASComDayCqDamInddProcessINDDMediaEx.getExample();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties3 = new OASComDayCqDamInddProcessINDDMediaEx();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties4 = new OASComDayCqDamInddProcessINDDMediaEx();

        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties1.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties2));
        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties2.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties1));
        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties3.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties4));
        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties4.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties1 = OASComDayCqDamInddProcessINDDMediaEx.getExample();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties2 = new OASComDayCqDamInddProcessINDDMediaEx();

        System.assertEquals(false, comDayCqDamInddProcessINDDMediaExtractProcessProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamInddProcessINDDMediaExtractProcessProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties1 = OASComDayCqDamInddProcessINDDMediaEx.getExample();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties2 = new OASComDayCqDamInddProcessINDDMediaEx();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties3;

        System.assertEquals(false, comDayCqDamInddProcessINDDMediaExtractProcessProperties1.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties3));
        System.assertEquals(false, comDayCqDamInddProcessINDDMediaExtractProcessProperties2.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties1 = OASComDayCqDamInddProcessINDDMediaEx.getExample();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties2 = new OASComDayCqDamInddProcessINDDMediaEx();

        System.assertEquals(comDayCqDamInddProcessINDDMediaExtractProcessProperties1.hashCode(), comDayCqDamInddProcessINDDMediaExtractProcessProperties1.hashCode());
        System.assertEquals(comDayCqDamInddProcessINDDMediaExtractProcessProperties2.hashCode(), comDayCqDamInddProcessINDDMediaExtractProcessProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties1 = OASComDayCqDamInddProcessINDDMediaEx.getExample();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties2 = OASComDayCqDamInddProcessINDDMediaEx.getExample();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties3 = new OASComDayCqDamInddProcessINDDMediaEx();
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties4 = new OASComDayCqDamInddProcessINDDMediaEx();

        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties1.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties2));
        System.assert(comDayCqDamInddProcessINDDMediaExtractProcessProperties3.equals(comDayCqDamInddProcessINDDMediaExtractProcessProperties4));
        System.assertEquals(comDayCqDamInddProcessINDDMediaExtractProcessProperties1.hashCode(), comDayCqDamInddProcessINDDMediaExtractProcessProperties2.hashCode());
        System.assertEquals(comDayCqDamInddProcessINDDMediaExtractProcessProperties3.hashCode(), comDayCqDamInddProcessINDDMediaExtractProcessProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamInddProcessINDDMediaEx comDayCqDamInddProcessINDDMediaExtractProcessProperties = new OASComDayCqDamInddProcessINDDMediaEx();
        Map<String, String> propertyMappings = comDayCqDamInddProcessINDDMediaExtractProcessProperties.getPropertyMappings();
        System.assertEquals('processLabel', propertyMappings.get('process.label'));
        System.assertEquals('cqDamInddPagesRegex', propertyMappings.get('cq.dam.indd.pages.regex'));
        System.assertEquals('idsJobDecoupled', propertyMappings.get('ids.job.decoupled'));
        System.assertEquals('idsJobWorkflowModel', propertyMappings.get('ids.job.workflow.model'));
    }
}
