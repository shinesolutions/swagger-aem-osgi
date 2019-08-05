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
        Map<String, String> propertyMappings = comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.getPropertyMappings();
        System.assertEquals('htmllibmanagerTiming', propertyMappings.get('htmllibmanager.timing'));
        System.assertEquals('htmllibmanagerDebugInitJs', propertyMappings.get('htmllibmanager.debug.init.js'));
        System.assertEquals('htmllibmanagerMinify', propertyMappings.get('htmllibmanager.minify'));
        System.assertEquals('htmllibmanagerDebug', propertyMappings.get('htmllibmanager.debug'));
        System.assertEquals('htmllibmanagerGzip', propertyMappings.get('htmllibmanager.gzip'));
        System.assertEquals('htmllibmanagerMaxDataUriSize', propertyMappings.get('htmllibmanager.maxDataUriSize'));
        System.assertEquals('htmllibmanagerMaxage', propertyMappings.get('htmllibmanager.maxage'));
        System.assertEquals('htmllibmanagerForceCQUrlInfo', propertyMappings.get('htmllibmanager.forceCQUrlInfo'));
        System.assertEquals('htmllibmanagerDefaultthemename', propertyMappings.get('htmllibmanager.defaultthemename'));
        System.assertEquals('htmllibmanagerDefaultuserthemename', propertyMappings.get('htmllibmanager.defaultuserthemename'));
        System.assertEquals('htmllibmanagerClientmanager', propertyMappings.get('htmllibmanager.clientmanager'));
        System.assertEquals('htmllibmanagerPathList', propertyMappings.get('htmllibmanager.path.list'));
        System.assertEquals('htmllibmanagerExcludedPathList', propertyMappings.get('htmllibmanager.excluded.path.list'));
        System.assertEquals('htmllibmanagerProcessorJs', propertyMappings.get('htmllibmanager.processor.js'));
        System.assertEquals('htmllibmanagerProcessorCss', propertyMappings.get('htmllibmanager.processor.css'));
        System.assertEquals('htmllibmanagerLongcachePatterns', propertyMappings.get('htmllibmanager.longcache.patterns'));
        System.assertEquals('htmllibmanagerLongcacheFormat', propertyMappings.get('htmllibmanager.longcache.format'));
        System.assertEquals('htmllibmanagerUseFileSystemOutputCache', propertyMappings.get('htmllibmanager.useFileSystemOutputCache'));
        System.assertEquals('htmllibmanagerFileSystemOutputCacheLocation', propertyMappings.get('htmllibmanager.fileSystemOutputCacheLocation'));
        System.assertEquals('htmllibmanagerDisableReplacement', propertyMappings.get('htmllibmanager.disable.replacement'));
    }
}
