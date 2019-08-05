@isTest
private class OASComAdobeCqDamWebdavImplIoAssetIOHTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1 = OASComAdobeCqDamWebdavImplIoAssetIOH.getExample();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2 = comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1;
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3 = new OASComAdobeCqDamWebdavImplIoAssetIOH();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties4 = comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3;

        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2));
        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1));
        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1));
        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties4));
        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties4.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3));
        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1 = OASComAdobeCqDamWebdavImplIoAssetIOH.getExample();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2 = OASComAdobeCqDamWebdavImplIoAssetIOH.getExample();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3 = new OASComAdobeCqDamWebdavImplIoAssetIOH();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties4 = new OASComAdobeCqDamWebdavImplIoAssetIOH();

        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2));
        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1));
        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties4));
        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties4.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1 = OASComAdobeCqDamWebdavImplIoAssetIOH.getExample();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2 = new OASComAdobeCqDamWebdavImplIoAssetIOH();

        System.assertEquals(false, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1 = OASComAdobeCqDamWebdavImplIoAssetIOH.getExample();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2 = new OASComAdobeCqDamWebdavImplIoAssetIOH();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3;

        System.assertEquals(false, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3));
        System.assertEquals(false, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1 = OASComAdobeCqDamWebdavImplIoAssetIOH.getExample();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2 = new OASComAdobeCqDamWebdavImplIoAssetIOH();

        System.assertEquals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1.hashCode(), comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1.hashCode());
        System.assertEquals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2.hashCode(), comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1 = OASComAdobeCqDamWebdavImplIoAssetIOH.getExample();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2 = OASComAdobeCqDamWebdavImplIoAssetIOH.getExample();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3 = new OASComAdobeCqDamWebdavImplIoAssetIOH();
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties4 = new OASComAdobeCqDamWebdavImplIoAssetIOH();

        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2));
        System.assert(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3.equals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties4));
        System.assertEquals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties1.hashCode(), comAdobeCqDamWebdavImplIoAssetIOHandlerProperties2.hashCode());
        System.assertEquals(comAdobeCqDamWebdavImplIoAssetIOHandlerProperties3.hashCode(), comAdobeCqDamWebdavImplIoAssetIOHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties = new OASComAdobeCqDamWebdavImplIoAssetIOH();
        Map<String, String> propertyMappings = comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
