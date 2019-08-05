@isTest
private class OASComAdobeCqSocialGroupClientImplCoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1 = OASComAdobeCqSocialGroupClientImplCo.getExample();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2 = comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1;
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3 = new OASComAdobeCqSocialGroupClientImplCo();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties4 = comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3;

        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2));
        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1));
        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1));
        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties4));
        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties4.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3));
        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1 = OASComAdobeCqSocialGroupClientImplCo.getExample();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2 = OASComAdobeCqSocialGroupClientImplCo.getExample();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3 = new OASComAdobeCqSocialGroupClientImplCo();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties4 = new OASComAdobeCqSocialGroupClientImplCo();

        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2));
        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1));
        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties4));
        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties4.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1 = OASComAdobeCqSocialGroupClientImplCo.getExample();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2 = new OASComAdobeCqSocialGroupClientImplCo();

        System.assertEquals(false, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1 = OASComAdobeCqSocialGroupClientImplCo.getExample();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2 = new OASComAdobeCqSocialGroupClientImplCo();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3;

        System.assertEquals(false, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3));
        System.assertEquals(false, comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1 = OASComAdobeCqSocialGroupClientImplCo.getExample();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2 = new OASComAdobeCqSocialGroupClientImplCo();

        System.assertEquals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1.hashCode(), comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2.hashCode(), comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1 = OASComAdobeCqSocialGroupClientImplCo.getExample();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2 = OASComAdobeCqSocialGroupClientImplCo.getExample();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3 = new OASComAdobeCqSocialGroupClientImplCo();
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties4 = new OASComAdobeCqSocialGroupClientImplCo();

        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2));
        System.assert(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3.equals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties4));
        System.assertEquals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties1.hashCode(), comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties3.hashCode(), comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialGroupClientImplCo comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties = new OASComAdobeCqSocialGroupClientImplCo();
        Map<String, String> propertyMappings = comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.getPropertyMappings();
        System.assertEquals('groupListingPaginationEnable', propertyMappings.get('group.listing.pagination.enable'));
        System.assertEquals('groupListingLazyloadingEnable', propertyMappings.get('group.listing.lazyloading.enable'));
        System.assertEquals('pageSize', propertyMappings.get('page.size'));
    }
}
