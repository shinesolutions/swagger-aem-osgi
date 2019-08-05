@isTest
private class OASComAdobeCqInboxImplTypeproviderItTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1 = OASComAdobeCqInboxImplTypeproviderIt.getExample();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2 = comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1;
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3 = new OASComAdobeCqInboxImplTypeproviderIt();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties4 = comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3;

        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2));
        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1));
        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1));
        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties4));
        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties4.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3));
        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1 = OASComAdobeCqInboxImplTypeproviderIt.getExample();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2 = OASComAdobeCqInboxImplTypeproviderIt.getExample();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3 = new OASComAdobeCqInboxImplTypeproviderIt();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties4 = new OASComAdobeCqInboxImplTypeproviderIt();

        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2));
        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1));
        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties4));
        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties4.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1 = OASComAdobeCqInboxImplTypeproviderIt.getExample();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2 = new OASComAdobeCqInboxImplTypeproviderIt();

        System.assertEquals(false, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1 = OASComAdobeCqInboxImplTypeproviderIt.getExample();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2 = new OASComAdobeCqInboxImplTypeproviderIt();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3;

        System.assertEquals(false, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3));
        System.assertEquals(false, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1 = OASComAdobeCqInboxImplTypeproviderIt.getExample();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2 = new OASComAdobeCqInboxImplTypeproviderIt();

        System.assertEquals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1.hashCode(), comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1.hashCode());
        System.assertEquals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2.hashCode(), comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1 = OASComAdobeCqInboxImplTypeproviderIt.getExample();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2 = OASComAdobeCqInboxImplTypeproviderIt.getExample();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3 = new OASComAdobeCqInboxImplTypeproviderIt();
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties4 = new OASComAdobeCqInboxImplTypeproviderIt();

        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2));
        System.assert(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3.equals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties4));
        System.assertEquals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties1.hashCode(), comAdobeCqInboxImplTypeproviderItemTypeProviderProperties2.hashCode());
        System.assertEquals(comAdobeCqInboxImplTypeproviderItemTypeProviderProperties3.hashCode(), comAdobeCqInboxImplTypeproviderItemTypeProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqInboxImplTypeproviderIt comAdobeCqInboxImplTypeproviderItemTypeProviderProperties = new OASComAdobeCqInboxImplTypeproviderIt();
        Map<String, String> propertyMappings = comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.getPropertyMappings();
        System.assertEquals('inboxImplTypeproviderRegistrypaths', propertyMappings.get('inbox.impl.typeprovider.registrypaths'));
        System.assertEquals('inboxImplTypeproviderLegacypaths', propertyMappings.get('inbox.impl.typeprovider.legacypaths'));
        System.assertEquals('inboxImplTypeproviderDefaulturlFailureitem', propertyMappings.get('inbox.impl.typeprovider.defaulturl.failureitem'));
        System.assertEquals('inboxImplTypeproviderDefaulturlWorkitem', propertyMappings.get('inbox.impl.typeprovider.defaulturl.workitem'));
        System.assertEquals('inboxImplTypeproviderDefaulturlTask', propertyMappings.get('inbox.impl.typeprovider.defaulturl.task'));
    }
}
