@isTest
private class OASComDayCqWcmCoreImplEventPageEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties1 = OASComDayCqWcmCoreImplEventPageEvent.getExample();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties2 = comDayCqWcmCoreImplEventPageEventAuditListenerProperties1;
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties3 = new OASComDayCqWcmCoreImplEventPageEvent();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties4 = comDayCqWcmCoreImplEventPageEventAuditListenerProperties3;

        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties1.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties2));
        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties2.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties1));
        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties1.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties1));
        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties4));
        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties4.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3));
        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties1 = OASComDayCqWcmCoreImplEventPageEvent.getExample();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties2 = OASComDayCqWcmCoreImplEventPageEvent.getExample();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties3 = new OASComDayCqWcmCoreImplEventPageEvent();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties4 = new OASComDayCqWcmCoreImplEventPageEvent();

        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties1.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties2));
        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties2.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties1));
        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties4));
        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties4.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties1 = OASComDayCqWcmCoreImplEventPageEvent.getExample();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties2 = new OASComDayCqWcmCoreImplEventPageEvent();

        System.assertEquals(false, comDayCqWcmCoreImplEventPageEventAuditListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplEventPageEventAuditListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties1 = OASComDayCqWcmCoreImplEventPageEvent.getExample();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties2 = new OASComDayCqWcmCoreImplEventPageEvent();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplEventPageEventAuditListenerProperties1.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplEventPageEventAuditListenerProperties2.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties1 = OASComDayCqWcmCoreImplEventPageEvent.getExample();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties2 = new OASComDayCqWcmCoreImplEventPageEvent();

        System.assertEquals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties1.hashCode(), comDayCqWcmCoreImplEventPageEventAuditListenerProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties2.hashCode(), comDayCqWcmCoreImplEventPageEventAuditListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties1 = OASComDayCqWcmCoreImplEventPageEvent.getExample();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties2 = OASComDayCqWcmCoreImplEventPageEvent.getExample();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties3 = new OASComDayCqWcmCoreImplEventPageEvent();
        OASComDayCqWcmCoreImplEventPageEvent comDayCqWcmCoreImplEventPageEventAuditListenerProperties4 = new OASComDayCqWcmCoreImplEventPageEvent();

        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties1.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties2));
        System.assert(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3.equals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties4));
        System.assertEquals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties1.hashCode(), comDayCqWcmCoreImplEventPageEventAuditListenerProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplEventPageEventAuditListenerProperties3.hashCode(), comDayCqWcmCoreImplEventPageEventAuditListenerProperties4.hashCode());
    }
}
