@isTest
private class OASComAdobeGraniteUiClientlibsImplHtTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1 = OASComAdobeGraniteUiClientlibsImplHt.getExample();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2 = comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1;
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3 = new OASComAdobeGraniteUiClientlibsImplHt();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties4 = comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3;

        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2));
        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1));
        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1));
        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties4));
        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties4.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3));
        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1 = OASComAdobeGraniteUiClientlibsImplHt.getExample();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2 = OASComAdobeGraniteUiClientlibsImplHt.getExample();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3 = new OASComAdobeGraniteUiClientlibsImplHt();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties4 = new OASComAdobeGraniteUiClientlibsImplHt();

        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2));
        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1));
        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties4));
        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties4.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1 = OASComAdobeGraniteUiClientlibsImplHt.getExample();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2 = new OASComAdobeGraniteUiClientlibsImplHt();

        System.assertEquals(false, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1 = OASComAdobeGraniteUiClientlibsImplHt.getExample();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2 = new OASComAdobeGraniteUiClientlibsImplHt();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3;

        System.assertEquals(false, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3));
        System.assertEquals(false, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1 = OASComAdobeGraniteUiClientlibsImplHt.getExample();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2 = new OASComAdobeGraniteUiClientlibsImplHt();

        System.assertEquals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1.hashCode(), comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2.hashCode(), comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1 = OASComAdobeGraniteUiClientlibsImplHt.getExample();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2 = OASComAdobeGraniteUiClientlibsImplHt.getExample();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3 = new OASComAdobeGraniteUiClientlibsImplHt();
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties4 = new OASComAdobeGraniteUiClientlibsImplHt();

        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2));
        System.assert(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3.equals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties4));
        System.assertEquals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties1.hashCode(), comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties3.hashCode(), comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteUiClientlibsImplHt comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties = new OASComAdobeGraniteUiClientlibsImplHt();
        Map<String, String> x-property-mappings = comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.getx-property-mappings();
        System.assertEquals('htmllibmanagerTiming', x-property-mappings.get('htmllibmanager.timing'));
        System.assertEquals('htmllibmanagerDebugInitJs', x-property-mappings.get('htmllibmanager.debug.init.js'));
        System.assertEquals('htmllibmanagerMinify', x-property-mappings.get('htmllibmanager.minify'));
        System.assertEquals('htmllibmanagerDebug', x-property-mappings.get('htmllibmanager.debug'));
        System.assertEquals('htmllibmanagerGzip', x-property-mappings.get('htmllibmanager.gzip'));
        System.assertEquals('htmllibmanagerMaxDataUriSize', x-property-mappings.get('htmllibmanager.maxDataUriSize'));
        System.assertEquals('htmllibmanagerMaxage', x-property-mappings.get('htmllibmanager.maxage'));
        System.assertEquals('htmllibmanagerForceCQUrlInfo', x-property-mappings.get('htmllibmanager.forceCQUrlInfo'));
        System.assertEquals('htmllibmanagerDefaultthemename', x-property-mappings.get('htmllibmanager.defaultthemename'));
        System.assertEquals('htmllibmanagerDefaultuserthemename', x-property-mappings.get('htmllibmanager.defaultuserthemename'));
        System.assertEquals('htmllibmanagerClientmanager', x-property-mappings.get('htmllibmanager.clientmanager'));
        System.assertEquals('htmllibmanagerPathList', x-property-mappings.get('htmllibmanager.path.list'));
        System.assertEquals('htmllibmanagerExcludedPathList', x-property-mappings.get('htmllibmanager.excluded.path.list'));
        System.assertEquals('htmllibmanagerProcessorJs', x-property-mappings.get('htmllibmanager.processor.js'));
        System.assertEquals('htmllibmanagerProcessorCss', x-property-mappings.get('htmllibmanager.processor.css'));
        System.assertEquals('htmllibmanagerLongcachePatterns', x-property-mappings.get('htmllibmanager.longcache.patterns'));
        System.assertEquals('htmllibmanagerLongcacheFormat', x-property-mappings.get('htmllibmanager.longcache.format'));
        System.assertEquals('htmllibmanagerUseFileSystemOutputCache', x-property-mappings.get('htmllibmanager.useFileSystemOutputCache'));
        System.assertEquals('htmllibmanagerFileSystemOutputCacheLocation', x-property-mappings.get('htmllibmanager.fileSystemOutputCacheLocation'));
        System.assertEquals('htmllibmanagerDisableReplacement', x-property-mappings.get('htmllibmanager.disable.replacement'));
    }
}
