@isTest
private class OASComDayCqWcmWorkflowImplWorkflowPaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1 = OASComDayCqWcmWorkflowImplWorkflowPa.getExample();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2 = comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1;
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3 = new OASComDayCqWcmWorkflowImplWorkflowPa();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties4 = comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3;

        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2));
        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1));
        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1));
        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties4));
        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties4.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3));
        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1 = OASComDayCqWcmWorkflowImplWorkflowPa.getExample();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2 = OASComDayCqWcmWorkflowImplWorkflowPa.getExample();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3 = new OASComDayCqWcmWorkflowImplWorkflowPa();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties4 = new OASComDayCqWcmWorkflowImplWorkflowPa();

        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2));
        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1));
        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties4));
        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties4.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1 = OASComDayCqWcmWorkflowImplWorkflowPa.getExample();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2 = new OASComDayCqWcmWorkflowImplWorkflowPa();

        System.assertEquals(false, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1 = OASComDayCqWcmWorkflowImplWorkflowPa.getExample();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2 = new OASComDayCqWcmWorkflowImplWorkflowPa();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3;

        System.assertEquals(false, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3));
        System.assertEquals(false, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1 = OASComDayCqWcmWorkflowImplWorkflowPa.getExample();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2 = new OASComDayCqWcmWorkflowImplWorkflowPa();

        System.assertEquals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1.hashCode(), comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1.hashCode());
        System.assertEquals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2.hashCode(), comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1 = OASComDayCqWcmWorkflowImplWorkflowPa.getExample();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2 = OASComDayCqWcmWorkflowImplWorkflowPa.getExample();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3 = new OASComDayCqWcmWorkflowImplWorkflowPa();
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties4 = new OASComDayCqWcmWorkflowImplWorkflowPa();

        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2));
        System.assert(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3.equals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties4));
        System.assertEquals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties1.hashCode(), comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties2.hashCode());
        System.assertEquals(comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties3.hashCode(), comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmWorkflowImplWorkflowPa comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties = new OASComDayCqWcmWorkflowImplWorkflowPa();
        Map<String, String> propertyMappings = comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.getPropertyMappings();
        System.assertEquals('workflowpackageinfoproviderFilter', propertyMappings.get('workflowpackageinfoprovider.filter'));
        System.assertEquals('workflowpackageinfoproviderFilterRootpath', propertyMappings.get('workflowpackageinfoprovider.filter.rootpath'));
    }
}
