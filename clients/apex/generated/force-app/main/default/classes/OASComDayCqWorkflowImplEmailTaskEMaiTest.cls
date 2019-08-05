@isTest
private class OASComDayCqWorkflowImplEmailTaskEMaiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailTaskEMai.getExample();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2 = comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1;
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3 = new OASComDayCqWorkflowImplEmailTaskEMai();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties4 = comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3;

        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2));
        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1));
        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1));
        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties4));
        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties4.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3));
        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailTaskEMai.getExample();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2 = OASComDayCqWorkflowImplEmailTaskEMai.getExample();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3 = new OASComDayCqWorkflowImplEmailTaskEMai();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties4 = new OASComDayCqWorkflowImplEmailTaskEMai();

        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2));
        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1));
        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties4));
        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties4.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailTaskEMai.getExample();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2 = new OASComDayCqWorkflowImplEmailTaskEMai();

        System.assertEquals(false, comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailTaskEMai.getExample();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2 = new OASComDayCqWorkflowImplEmailTaskEMai();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3;

        System.assertEquals(false, comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3));
        System.assertEquals(false, comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailTaskEMai.getExample();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2 = new OASComDayCqWorkflowImplEmailTaskEMai();

        System.assertEquals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1.hashCode(), comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1.hashCode());
        System.assertEquals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2.hashCode(), comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailTaskEMai.getExample();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2 = OASComDayCqWorkflowImplEmailTaskEMai.getExample();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3 = new OASComDayCqWorkflowImplEmailTaskEMai();
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties4 = new OASComDayCqWorkflowImplEmailTaskEMai();

        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2));
        System.assert(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3.equals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties4));
        System.assertEquals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties1.hashCode(), comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties2.hashCode());
        System.assertEquals(comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties3.hashCode(), comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWorkflowImplEmailTaskEMai comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties = new OASComDayCqWorkflowImplEmailTaskEMai();
        Map<String, String> propertyMappings = comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.getPropertyMappings();
        System.assertEquals('notifyOnupdate', propertyMappings.get('notify.onupdate'));
        System.assertEquals('notifyOncomplete', propertyMappings.get('notify.oncomplete'));
    }
}
