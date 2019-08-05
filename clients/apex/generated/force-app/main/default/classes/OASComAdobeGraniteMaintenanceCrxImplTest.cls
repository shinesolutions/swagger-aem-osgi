@isTest
private class OASComAdobeGraniteMaintenanceCrxImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1 = OASComAdobeGraniteMaintenanceCrxImpl.getExample();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2 = comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1;
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3 = new OASComAdobeGraniteMaintenanceCrxImpl();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties4 = comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3;

        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2));
        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1));
        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1));
        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties4));
        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties4.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3));
        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1 = OASComAdobeGraniteMaintenanceCrxImpl.getExample();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2 = OASComAdobeGraniteMaintenanceCrxImpl.getExample();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3 = new OASComAdobeGraniteMaintenanceCrxImpl();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties4 = new OASComAdobeGraniteMaintenanceCrxImpl();

        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2));
        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1));
        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties4));
        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties4.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1 = OASComAdobeGraniteMaintenanceCrxImpl.getExample();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2 = new OASComAdobeGraniteMaintenanceCrxImpl();

        System.assertEquals(false, comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1 = OASComAdobeGraniteMaintenanceCrxImpl.getExample();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2 = new OASComAdobeGraniteMaintenanceCrxImpl();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3;

        System.assertEquals(false, comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3));
        System.assertEquals(false, comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1 = OASComAdobeGraniteMaintenanceCrxImpl.getExample();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2 = new OASComAdobeGraniteMaintenanceCrxImpl();

        System.assertEquals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1.hashCode(), comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1.hashCode());
        System.assertEquals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2.hashCode(), comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1 = OASComAdobeGraniteMaintenanceCrxImpl.getExample();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2 = OASComAdobeGraniteMaintenanceCrxImpl.getExample();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3 = new OASComAdobeGraniteMaintenanceCrxImpl();
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties4 = new OASComAdobeGraniteMaintenanceCrxImpl();

        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2));
        System.assert(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3.equals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties4));
        System.assertEquals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties1.hashCode(), comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties2.hashCode());
        System.assertEquals(comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties3.hashCode(), comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteMaintenanceCrxImpl comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties = new OASComAdobeGraniteMaintenanceCrxImpl();
        Map<String, String> propertyMappings = comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.getPropertyMappings();
        System.assertEquals('fullGcDays', propertyMappings.get('full.gc.days'));
    }
}
