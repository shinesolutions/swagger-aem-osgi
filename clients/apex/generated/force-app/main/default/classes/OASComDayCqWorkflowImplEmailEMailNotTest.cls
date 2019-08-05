@isTest
private class OASComDayCqWorkflowImplEmailEMailNotTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailEMailNot.getExample();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties2 = comDayCqWorkflowImplEmailEMailNotificationServiceProperties1;
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties3 = new OASComDayCqWorkflowImplEmailEMailNot();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties4 = comDayCqWorkflowImplEmailEMailNotificationServiceProperties3;

        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties2));
        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties2.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties1));
        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties1));
        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties4));
        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties4.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3));
        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailEMailNot.getExample();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties2 = OASComDayCqWorkflowImplEmailEMailNot.getExample();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties3 = new OASComDayCqWorkflowImplEmailEMailNot();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties4 = new OASComDayCqWorkflowImplEmailEMailNot();

        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties2));
        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties2.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties1));
        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties4));
        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties4.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailEMailNot.getExample();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties2 = new OASComDayCqWorkflowImplEmailEMailNot();

        System.assertEquals(false, comDayCqWorkflowImplEmailEMailNotificationServiceProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWorkflowImplEmailEMailNotificationServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailEMailNot.getExample();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties2 = new OASComDayCqWorkflowImplEmailEMailNot();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties3;

        System.assertEquals(false, comDayCqWorkflowImplEmailEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3));
        System.assertEquals(false, comDayCqWorkflowImplEmailEMailNotificationServiceProperties2.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailEMailNot.getExample();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties2 = new OASComDayCqWorkflowImplEmailEMailNot();

        System.assertEquals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties1.hashCode(), comDayCqWorkflowImplEmailEMailNotificationServiceProperties1.hashCode());
        System.assertEquals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties2.hashCode(), comDayCqWorkflowImplEmailEMailNotificationServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties1 = OASComDayCqWorkflowImplEmailEMailNot.getExample();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties2 = OASComDayCqWorkflowImplEmailEMailNot.getExample();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties3 = new OASComDayCqWorkflowImplEmailEMailNot();
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties4 = new OASComDayCqWorkflowImplEmailEMailNot();

        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties1.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties2));
        System.assert(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3.equals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties4));
        System.assertEquals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties1.hashCode(), comDayCqWorkflowImplEmailEMailNotificationServiceProperties2.hashCode());
        System.assertEquals(comDayCqWorkflowImplEmailEMailNotificationServiceProperties3.hashCode(), comDayCqWorkflowImplEmailEMailNotificationServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWorkflowImplEmailEMailNot comDayCqWorkflowImplEmailEMailNotificationServiceProperties = new OASComDayCqWorkflowImplEmailEMailNot();
        Map<String, String> propertyMappings = comDayCqWorkflowImplEmailEMailNotificationServiceProperties.getPropertyMappings();
        System.assertEquals('fromAddress', propertyMappings.get('from.address'));
        System.assertEquals('hostPrefix', propertyMappings.get('host.prefix'));
        System.assertEquals('notifyOnabort', propertyMappings.get('notify.onabort'));
        System.assertEquals('notifyOncomplete', propertyMappings.get('notify.oncomplete'));
        System.assertEquals('notifyOncontainercomplete', propertyMappings.get('notify.oncontainercomplete'));
        System.assertEquals('notifyUseronly', propertyMappings.get('notify.useronly'));
    }
}
