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
        Map<String, String> x-property-mappings = comDayCqWidgetImplHtmlLibraryManagerImplProperties.getx-property-mappings();
        System.assertEquals('htmllibmanagerClientmanager', x-property-mappings.get('htmllibmanager.clientmanager'));
        System.assertEquals('htmllibmanagerDebug', x-property-mappings.get('htmllibmanager.debug'));
        System.assertEquals('htmllibmanagerDebugConsole', x-property-mappings.get('htmllibmanager.debug.console'));
        System.assertEquals('htmllibmanagerDebugInitJs', x-property-mappings.get('htmllibmanager.debug.init.js'));
        System.assertEquals('htmllibmanagerDefaultthemename', x-property-mappings.get('htmllibmanager.defaultthemename'));
        System.assertEquals('htmllibmanagerDefaultuserthemename', x-property-mappings.get('htmllibmanager.defaultuserthemename'));
        System.assertEquals('htmllibmanagerFirebuglitePath', x-property-mappings.get('htmllibmanager.firebuglite.path'));
        System.assertEquals('htmllibmanagerForceCQUrlInfo', x-property-mappings.get('htmllibmanager.forceCQUrlInfo'));
        System.assertEquals('htmllibmanagerGzip', x-property-mappings.get('htmllibmanager.gzip'));
        System.assertEquals('htmllibmanagerMaxage', x-property-mappings.get('htmllibmanager.maxage'));
        System.assertEquals('htmllibmanagerMaxDataUriSize', x-property-mappings.get('htmllibmanager.maxDataUriSize'));
        System.assertEquals('htmllibmanagerMinify', x-property-mappings.get('htmllibmanager.minify'));
        System.assertEquals('htmllibmanagerPathList', x-property-mappings.get('htmllibmanager.path.list'));
        System.assertEquals('htmllibmanagerTiming', x-property-mappings.get('htmllibmanager.timing'));
    }
}
