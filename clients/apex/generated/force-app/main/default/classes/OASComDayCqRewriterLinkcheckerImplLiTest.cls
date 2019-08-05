@isTest
private class OASComDayCqRewriterLinkcheckerImplLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1 = OASComDayCqRewriterLinkcheckerImplLi.getExample();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2 = comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1;
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3 = new OASComDayCqRewriterLinkcheckerImplLi();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties4 = comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3;

        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2));
        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1));
        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1));
        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties4));
        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties4.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3));
        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1 = OASComDayCqRewriterLinkcheckerImplLi.getExample();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2 = OASComDayCqRewriterLinkcheckerImplLi.getExample();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3 = new OASComDayCqRewriterLinkcheckerImplLi();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties4 = new OASComDayCqRewriterLinkcheckerImplLi();

        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2));
        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1));
        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties4));
        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties4.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1 = OASComDayCqRewriterLinkcheckerImplLi.getExample();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2 = new OASComDayCqRewriterLinkcheckerImplLi();

        System.assertEquals(false, comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1 = OASComDayCqRewriterLinkcheckerImplLi.getExample();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2 = new OASComDayCqRewriterLinkcheckerImplLi();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3;

        System.assertEquals(false, comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3));
        System.assertEquals(false, comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1 = OASComDayCqRewriterLinkcheckerImplLi.getExample();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2 = new OASComDayCqRewriterLinkcheckerImplLi();

        System.assertEquals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1.hashCode(), comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1.hashCode());
        System.assertEquals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2.hashCode(), comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1 = OASComDayCqRewriterLinkcheckerImplLi.getExample();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2 = OASComDayCqRewriterLinkcheckerImplLi.getExample();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3 = new OASComDayCqRewriterLinkcheckerImplLi();
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties4 = new OASComDayCqRewriterLinkcheckerImplLi();

        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2));
        System.assert(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3.equals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties4));
        System.assertEquals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties1.hashCode(), comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties2.hashCode());
        System.assertEquals(comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties3.hashCode(), comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqRewriterLinkcheckerImplLi comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties = new OASComDayCqRewriterLinkcheckerImplLi();
        Map<String, String> propertyMappings = comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.getPropertyMappings();
        System.assertEquals('serviceMaxLinksPerHost', propertyMappings.get('service.max_links_per_host'));
        System.assertEquals('serviceSaveExternalLinkReferences', propertyMappings.get('service.save_external_link_references'));
    }
}
