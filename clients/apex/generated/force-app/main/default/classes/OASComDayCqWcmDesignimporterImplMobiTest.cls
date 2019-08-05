@isTest
private class OASComDayCqWcmDesignimporterImplMobiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1 = OASComDayCqWcmDesignimporterImplMobi.getExample();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2 = comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1;
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3 = new OASComDayCqWcmDesignimporterImplMobi();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties4 = comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3;

        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2));
        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1));
        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1));
        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties4));
        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties4.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3));
        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1 = OASComDayCqWcmDesignimporterImplMobi.getExample();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2 = OASComDayCqWcmDesignimporterImplMobi.getExample();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3 = new OASComDayCqWcmDesignimporterImplMobi();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties4 = new OASComDayCqWcmDesignimporterImplMobi();

        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2));
        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1));
        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties4));
        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties4.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1 = OASComDayCqWcmDesignimporterImplMobi.getExample();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2 = new OASComDayCqWcmDesignimporterImplMobi();

        System.assertEquals(false, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1 = OASComDayCqWcmDesignimporterImplMobi.getExample();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2 = new OASComDayCqWcmDesignimporterImplMobi();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3;

        System.assertEquals(false, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3));
        System.assertEquals(false, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1 = OASComDayCqWcmDesignimporterImplMobi.getExample();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2 = new OASComDayCqWcmDesignimporterImplMobi();

        System.assertEquals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1.hashCode(), comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2.hashCode(), comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1 = OASComDayCqWcmDesignimporterImplMobi.getExample();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2 = OASComDayCqWcmDesignimporterImplMobi.getExample();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3 = new OASComDayCqWcmDesignimporterImplMobi();
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties4 = new OASComDayCqWcmDesignimporterImplMobi();

        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2));
        System.assert(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3.equals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties4));
        System.assertEquals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties1.hashCode(), comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties3.hashCode(), comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmDesignimporterImplMobi comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties = new OASComDayCqWcmDesignimporterImplMobi();
        Map<String, String> propertyMappings = comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.getPropertyMappings();
        System.assertEquals('deviceGroups', propertyMappings.get('device.groups'));
        System.assertEquals('buildPageNodes', propertyMappings.get('build.page.nodes'));
        System.assertEquals('buildClientLibs', propertyMappings.get('build.client.libs'));
        System.assertEquals('buildCanvasComponent', propertyMappings.get('build.canvas.component'));
    }
}
