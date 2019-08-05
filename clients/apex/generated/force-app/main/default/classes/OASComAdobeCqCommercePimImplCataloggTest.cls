@isTest
private class OASComAdobeCqCommercePimImplCataloggTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1 = OASComAdobeCqCommercePimImplCatalogg.getExample();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2 = comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1;
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3 = new OASComAdobeCqCommercePimImplCatalogg();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties4 = comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3;

        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2));
        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1));
        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1));
        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties4));
        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties4.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3));
        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1 = OASComAdobeCqCommercePimImplCatalogg.getExample();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2 = OASComAdobeCqCommercePimImplCatalogg.getExample();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3 = new OASComAdobeCqCommercePimImplCatalogg();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties4 = new OASComAdobeCqCommercePimImplCatalogg();

        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2));
        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1));
        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties4));
        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties4.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1 = OASComAdobeCqCommercePimImplCatalogg.getExample();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2 = new OASComAdobeCqCommercePimImplCatalogg();

        System.assertEquals(false, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1 = OASComAdobeCqCommercePimImplCatalogg.getExample();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2 = new OASComAdobeCqCommercePimImplCatalogg();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3;

        System.assertEquals(false, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3));
        System.assertEquals(false, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1 = OASComAdobeCqCommercePimImplCatalogg.getExample();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2 = new OASComAdobeCqCommercePimImplCatalogg();

        System.assertEquals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1.hashCode(), comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1.hashCode());
        System.assertEquals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2.hashCode(), comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1 = OASComAdobeCqCommercePimImplCatalogg.getExample();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2 = OASComAdobeCqCommercePimImplCatalogg.getExample();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3 = new OASComAdobeCqCommercePimImplCatalogg();
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties4 = new OASComAdobeCqCommercePimImplCatalogg();

        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2));
        System.assert(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3.equals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties4));
        System.assertEquals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties1.hashCode(), comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties2.hashCode());
        System.assertEquals(comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties3.hashCode(), comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCommercePimImplCatalogg comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties = new OASComAdobeCqCommercePimImplCatalogg();
        Map<String, String> propertyMappings = comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.getPropertyMappings();
        System.assertEquals('cqCommerceCataloggeneratorBucketsize', propertyMappings.get('cq.commerce.cataloggenerator.bucketsize'));
        System.assertEquals('cqCommerceCataloggeneratorBucketname', propertyMappings.get('cq.commerce.cataloggenerator.bucketname'));
        System.assertEquals('cqCommerceCataloggeneratorExcludedtemplateproperties', propertyMappings.get('cq.commerce.cataloggenerator.excludedtemplateproperties'));
    }
}
