@isTest
private class OASComDayCqWcmMsmImplServletsAuditLoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties1 = OASComDayCqWcmMsmImplServletsAuditLo.getExample();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties2 = comDayCqWcmMsmImplServletsAuditLogServletProperties1;
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties3 = new OASComDayCqWcmMsmImplServletsAuditLo();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties4 = comDayCqWcmMsmImplServletsAuditLogServletProperties3;

        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties1.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties2));
        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties2.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties1));
        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties1.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties1));
        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties3.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties4));
        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties4.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties3));
        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties3.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties1 = OASComDayCqWcmMsmImplServletsAuditLo.getExample();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties2 = OASComDayCqWcmMsmImplServletsAuditLo.getExample();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties3 = new OASComDayCqWcmMsmImplServletsAuditLo();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties4 = new OASComDayCqWcmMsmImplServletsAuditLo();

        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties1.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties2));
        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties2.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties1));
        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties3.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties4));
        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties4.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties1 = OASComDayCqWcmMsmImplServletsAuditLo.getExample();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties2 = new OASComDayCqWcmMsmImplServletsAuditLo();

        System.assertEquals(false, comDayCqWcmMsmImplServletsAuditLogServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplServletsAuditLogServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties1 = OASComDayCqWcmMsmImplServletsAuditLo.getExample();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties2 = new OASComDayCqWcmMsmImplServletsAuditLo();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplServletsAuditLogServletProperties1.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplServletsAuditLogServletProperties2.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties1 = OASComDayCqWcmMsmImplServletsAuditLo.getExample();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties2 = new OASComDayCqWcmMsmImplServletsAuditLo();

        System.assertEquals(comDayCqWcmMsmImplServletsAuditLogServletProperties1.hashCode(), comDayCqWcmMsmImplServletsAuditLogServletProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplServletsAuditLogServletProperties2.hashCode(), comDayCqWcmMsmImplServletsAuditLogServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties1 = OASComDayCqWcmMsmImplServletsAuditLo.getExample();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties2 = OASComDayCqWcmMsmImplServletsAuditLo.getExample();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties3 = new OASComDayCqWcmMsmImplServletsAuditLo();
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties4 = new OASComDayCqWcmMsmImplServletsAuditLo();

        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties1.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties2));
        System.assert(comDayCqWcmMsmImplServletsAuditLogServletProperties3.equals(comDayCqWcmMsmImplServletsAuditLogServletProperties4));
        System.assertEquals(comDayCqWcmMsmImplServletsAuditLogServletProperties1.hashCode(), comDayCqWcmMsmImplServletsAuditLogServletProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplServletsAuditLogServletProperties3.hashCode(), comDayCqWcmMsmImplServletsAuditLogServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplServletsAuditLo comDayCqWcmMsmImplServletsAuditLogServletProperties = new OASComDayCqWcmMsmImplServletsAuditLo();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplServletsAuditLogServletProperties.getPropertyMappings();
        System.assertEquals('auditlogservletDefaultEventsCount', propertyMappings.get('auditlogservlet.default.events.count'));
        System.assertEquals('auditlogservletDefaultPath', propertyMappings.get('auditlogservlet.default.path'));
    }
}
