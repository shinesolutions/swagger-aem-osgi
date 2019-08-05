@isTest
private class OASComAdobeCqScreensImplRemoteImplDiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1 = OASComAdobeCqScreensImplRemoteImplDi.getExample();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2 = comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1;
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3 = new OASComAdobeCqScreensImplRemoteImplDi();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties4 = comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3;

        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2));
        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1));
        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1));
        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties4));
        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties4.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3));
        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1 = OASComAdobeCqScreensImplRemoteImplDi.getExample();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2 = OASComAdobeCqScreensImplRemoteImplDi.getExample();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3 = new OASComAdobeCqScreensImplRemoteImplDi();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties4 = new OASComAdobeCqScreensImplRemoteImplDi();

        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2));
        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1));
        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties4));
        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties4.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1 = OASComAdobeCqScreensImplRemoteImplDi.getExample();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2 = new OASComAdobeCqScreensImplRemoteImplDi();

        System.assertEquals(false, comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1 = OASComAdobeCqScreensImplRemoteImplDi.getExample();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2 = new OASComAdobeCqScreensImplRemoteImplDi();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3;

        System.assertEquals(false, comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3));
        System.assertEquals(false, comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1 = OASComAdobeCqScreensImplRemoteImplDi.getExample();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2 = new OASComAdobeCqScreensImplRemoteImplDi();

        System.assertEquals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1.hashCode(), comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2.hashCode(), comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1 = OASComAdobeCqScreensImplRemoteImplDi.getExample();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2 = OASComAdobeCqScreensImplRemoteImplDi.getExample();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3 = new OASComAdobeCqScreensImplRemoteImplDi();
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties4 = new OASComAdobeCqScreensImplRemoteImplDi();

        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2));
        System.assert(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3.equals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties4));
        System.assertEquals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties1.hashCode(), comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties3.hashCode(), comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqScreensImplRemoteImplDi comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties = new OASComAdobeCqScreensImplRemoteImplDi();
        Map<String, String> propertyMappings = comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.getPropertyMappings();
        System.assertEquals('comAdobeAemScreensImplRemoteRequestTimeout', propertyMappings.get('com.adobe.aem.screens.impl.remote.request_timeout'));
    }
}
