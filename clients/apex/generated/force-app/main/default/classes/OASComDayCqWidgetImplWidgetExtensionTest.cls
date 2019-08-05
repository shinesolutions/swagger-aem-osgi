@isTest
private class OASComDayCqWidgetImplWidgetExtensionTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties1 = OASComDayCqWidgetImplWidgetExtension.getExample();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties2 = comDayCqWidgetImplWidgetExtensionProviderImplProperties1;
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties3 = new OASComDayCqWidgetImplWidgetExtension();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties4 = comDayCqWidgetImplWidgetExtensionProviderImplProperties3;

        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties1.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties2));
        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties2.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties1));
        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties1.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties1));
        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties3.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties4));
        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties4.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties3));
        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties3.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties1 = OASComDayCqWidgetImplWidgetExtension.getExample();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties2 = OASComDayCqWidgetImplWidgetExtension.getExample();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties3 = new OASComDayCqWidgetImplWidgetExtension();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties4 = new OASComDayCqWidgetImplWidgetExtension();

        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties1.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties2));
        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties2.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties1));
        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties3.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties4));
        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties4.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties1 = OASComDayCqWidgetImplWidgetExtension.getExample();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties2 = new OASComDayCqWidgetImplWidgetExtension();

        System.assertEquals(false, comDayCqWidgetImplWidgetExtensionProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWidgetImplWidgetExtensionProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties1 = OASComDayCqWidgetImplWidgetExtension.getExample();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties2 = new OASComDayCqWidgetImplWidgetExtension();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties3;

        System.assertEquals(false, comDayCqWidgetImplWidgetExtensionProviderImplProperties1.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties3));
        System.assertEquals(false, comDayCqWidgetImplWidgetExtensionProviderImplProperties2.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties1 = OASComDayCqWidgetImplWidgetExtension.getExample();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties2 = new OASComDayCqWidgetImplWidgetExtension();

        System.assertEquals(comDayCqWidgetImplWidgetExtensionProviderImplProperties1.hashCode(), comDayCqWidgetImplWidgetExtensionProviderImplProperties1.hashCode());
        System.assertEquals(comDayCqWidgetImplWidgetExtensionProviderImplProperties2.hashCode(), comDayCqWidgetImplWidgetExtensionProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties1 = OASComDayCqWidgetImplWidgetExtension.getExample();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties2 = OASComDayCqWidgetImplWidgetExtension.getExample();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties3 = new OASComDayCqWidgetImplWidgetExtension();
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties4 = new OASComDayCqWidgetImplWidgetExtension();

        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties1.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties2));
        System.assert(comDayCqWidgetImplWidgetExtensionProviderImplProperties3.equals(comDayCqWidgetImplWidgetExtensionProviderImplProperties4));
        System.assertEquals(comDayCqWidgetImplWidgetExtensionProviderImplProperties1.hashCode(), comDayCqWidgetImplWidgetExtensionProviderImplProperties2.hashCode());
        System.assertEquals(comDayCqWidgetImplWidgetExtensionProviderImplProperties3.hashCode(), comDayCqWidgetImplWidgetExtensionProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWidgetImplWidgetExtension comDayCqWidgetImplWidgetExtensionProviderImplProperties = new OASComDayCqWidgetImplWidgetExtension();
        Map<String, String> propertyMappings = comDayCqWidgetImplWidgetExtensionProviderImplProperties.getPropertyMappings();
        System.assertEquals('extendableWidgets', propertyMappings.get('extendable.widgets'));
        System.assertEquals('widgetextensionproviderDebug', propertyMappings.get('widgetextensionprovider.debug'));
    }
}
