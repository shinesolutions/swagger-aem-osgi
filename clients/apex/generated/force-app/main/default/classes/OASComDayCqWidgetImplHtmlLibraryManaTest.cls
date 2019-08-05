@isTest
private class OASComDayCqWidgetImplHtmlLibraryManaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties1 = OASComDayCqWidgetImplHtmlLibraryMana.getExample();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties2 = comDayCqWidgetImplHtmlLibraryManagerImplProperties1;
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties3 = new OASComDayCqWidgetImplHtmlLibraryMana();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties4 = comDayCqWidgetImplHtmlLibraryManagerImplProperties3;

        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties1.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties2));
        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties2.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties1));
        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties1.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties1));
        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties3.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties4));
        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties4.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties3));
        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties3.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties1 = OASComDayCqWidgetImplHtmlLibraryMana.getExample();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties2 = OASComDayCqWidgetImplHtmlLibraryMana.getExample();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties3 = new OASComDayCqWidgetImplHtmlLibraryMana();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties4 = new OASComDayCqWidgetImplHtmlLibraryMana();

        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties1.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties2));
        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties2.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties1));
        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties3.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties4));
        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties4.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties1 = OASComDayCqWidgetImplHtmlLibraryMana.getExample();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties2 = new OASComDayCqWidgetImplHtmlLibraryMana();

        System.assertEquals(false, comDayCqWidgetImplHtmlLibraryManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWidgetImplHtmlLibraryManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties1 = OASComDayCqWidgetImplHtmlLibraryMana.getExample();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties2 = new OASComDayCqWidgetImplHtmlLibraryMana();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties3;

        System.assertEquals(false, comDayCqWidgetImplHtmlLibraryManagerImplProperties1.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties3));
        System.assertEquals(false, comDayCqWidgetImplHtmlLibraryManagerImplProperties2.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties1 = OASComDayCqWidgetImplHtmlLibraryMana.getExample();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties2 = new OASComDayCqWidgetImplHtmlLibraryMana();

        System.assertEquals(comDayCqWidgetImplHtmlLibraryManagerImplProperties1.hashCode(), comDayCqWidgetImplHtmlLibraryManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqWidgetImplHtmlLibraryManagerImplProperties2.hashCode(), comDayCqWidgetImplHtmlLibraryManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties1 = OASComDayCqWidgetImplHtmlLibraryMana.getExample();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties2 = OASComDayCqWidgetImplHtmlLibraryMana.getExample();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties3 = new OASComDayCqWidgetImplHtmlLibraryMana();
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties4 = new OASComDayCqWidgetImplHtmlLibraryMana();

        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties1.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties2));
        System.assert(comDayCqWidgetImplHtmlLibraryManagerImplProperties3.equals(comDayCqWidgetImplHtmlLibraryManagerImplProperties4));
        System.assertEquals(comDayCqWidgetImplHtmlLibraryManagerImplProperties1.hashCode(), comDayCqWidgetImplHtmlLibraryManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqWidgetImplHtmlLibraryManagerImplProperties3.hashCode(), comDayCqWidgetImplHtmlLibraryManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWidgetImplHtmlLibraryMana comDayCqWidgetImplHtmlLibraryManagerImplProperties = new OASComDayCqWidgetImplHtmlLibraryMana();
        Map<String, String> propertyMappings = comDayCqWidgetImplHtmlLibraryManagerImplProperties.getPropertyMappings();
        System.assertEquals('htmllibmanagerClientmanager', propertyMappings.get('htmllibmanager.clientmanager'));
        System.assertEquals('htmllibmanagerDebug', propertyMappings.get('htmllibmanager.debug'));
        System.assertEquals('htmllibmanagerDebugConsole', propertyMappings.get('htmllibmanager.debug.console'));
        System.assertEquals('htmllibmanagerDebugInitJs', propertyMappings.get('htmllibmanager.debug.init.js'));
        System.assertEquals('htmllibmanagerDefaultthemename', propertyMappings.get('htmllibmanager.defaultthemename'));
        System.assertEquals('htmllibmanagerDefaultuserthemename', propertyMappings.get('htmllibmanager.defaultuserthemename'));
        System.assertEquals('htmllibmanagerFirebuglitePath', propertyMappings.get('htmllibmanager.firebuglite.path'));
        System.assertEquals('htmllibmanagerForceCQUrlInfo', propertyMappings.get('htmllibmanager.forceCQUrlInfo'));
        System.assertEquals('htmllibmanagerGzip', propertyMappings.get('htmllibmanager.gzip'));
        System.assertEquals('htmllibmanagerMaxage', propertyMappings.get('htmllibmanager.maxage'));
        System.assertEquals('htmllibmanagerMaxDataUriSize', propertyMappings.get('htmllibmanager.maxDataUriSize'));
        System.assertEquals('htmllibmanagerMinify', propertyMappings.get('htmllibmanager.minify'));
        System.assertEquals('htmllibmanagerPathList', propertyMappings.get('htmllibmanager.path.list'));
        System.assertEquals('htmllibmanagerTiming', propertyMappings.get('htmllibmanager.timing'));
    }
}
