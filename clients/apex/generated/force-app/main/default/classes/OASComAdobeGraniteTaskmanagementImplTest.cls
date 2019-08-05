@isTest
private class OASComAdobeGraniteTaskmanagementImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1 = OASComAdobeGraniteTaskmanagementImpl.getExample();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2 = comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1;
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3 = new OASComAdobeGraniteTaskmanagementImpl();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties4 = comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3;

        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2));
        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1));
        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1));
        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties4));
        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties4.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3));
        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1 = OASComAdobeGraniteTaskmanagementImpl.getExample();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2 = OASComAdobeGraniteTaskmanagementImpl.getExample();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3 = new OASComAdobeGraniteTaskmanagementImpl();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties4 = new OASComAdobeGraniteTaskmanagementImpl();

        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2));
        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1));
        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties4));
        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties4.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1 = OASComAdobeGraniteTaskmanagementImpl.getExample();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2 = new OASComAdobeGraniteTaskmanagementImpl();

        System.assertEquals(false, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1 = OASComAdobeGraniteTaskmanagementImpl.getExample();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2 = new OASComAdobeGraniteTaskmanagementImpl();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3;

        System.assertEquals(false, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3));
        System.assertEquals(false, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1 = OASComAdobeGraniteTaskmanagementImpl.getExample();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2 = new OASComAdobeGraniteTaskmanagementImpl();

        System.assertEquals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1.hashCode(), comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1.hashCode());
        System.assertEquals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2.hashCode(), comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1 = OASComAdobeGraniteTaskmanagementImpl.getExample();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2 = OASComAdobeGraniteTaskmanagementImpl.getExample();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3 = new OASComAdobeGraniteTaskmanagementImpl();
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties4 = new OASComAdobeGraniteTaskmanagementImpl();

        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2));
        System.assert(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties4));
        System.assertEquals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties1.hashCode(), comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties2.hashCode());
        System.assertEquals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties3.hashCode(), comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteTaskmanagementImpl comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties = new OASComAdobeGraniteTaskmanagementImpl();
        Map<String, String> propertyMappings = comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.getPropertyMappings();
        System.assertEquals('adapterCondition', propertyMappings.get('adapter.condition'));
        System.assertEquals('taskmanagerAdmingroups', propertyMappings.get('taskmanager.admingroups'));
    }
}
