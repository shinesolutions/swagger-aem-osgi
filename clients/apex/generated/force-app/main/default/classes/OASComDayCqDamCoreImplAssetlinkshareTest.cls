@isTest
private class OASComDayCqDamCoreImplAssetlinkshareTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1 = OASComDayCqDamCoreImplAssetlinkshare.getExample();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2 = comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1;
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3 = new OASComDayCqDamCoreImplAssetlinkshare();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties4 = comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3;

        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2));
        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1));
        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1));
        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties4));
        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties4.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3));
        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1 = OASComDayCqDamCoreImplAssetlinkshare.getExample();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2 = OASComDayCqDamCoreImplAssetlinkshare.getExample();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3 = new OASComDayCqDamCoreImplAssetlinkshare();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties4 = new OASComDayCqDamCoreImplAssetlinkshare();

        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2));
        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1));
        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties4));
        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties4.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1 = OASComDayCqDamCoreImplAssetlinkshare.getExample();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2 = new OASComDayCqDamCoreImplAssetlinkshare();

        System.assertEquals(false, comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1 = OASComDayCqDamCoreImplAssetlinkshare.getExample();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2 = new OASComDayCqDamCoreImplAssetlinkshare();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1 = OASComDayCqDamCoreImplAssetlinkshare.getExample();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2 = new OASComDayCqDamCoreImplAssetlinkshare();

        System.assertEquals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1.hashCode(), comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2.hashCode(), comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1 = OASComDayCqDamCoreImplAssetlinkshare.getExample();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2 = OASComDayCqDamCoreImplAssetlinkshare.getExample();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3 = new OASComDayCqDamCoreImplAssetlinkshare();
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties4 = new OASComDayCqDamCoreImplAssetlinkshare();

        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2));
        System.assert(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3.equals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties4));
        System.assertEquals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties1.hashCode(), comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties3.hashCode(), comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplAssetlinkshare comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties = new OASComDayCqDamCoreImplAssetlinkshare();
        Map<String, String> propertyMappings = comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.getPropertyMappings();
        System.assertEquals('cqDamAdhocAssetSharePrezipMaxcontentsize', propertyMappings.get('cq.dam.adhoc.asset.share.prezip.maxcontentsize'));
    }
}
