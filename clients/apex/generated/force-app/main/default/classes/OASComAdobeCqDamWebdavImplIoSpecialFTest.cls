@isTest
private class OASComAdobeCqDamWebdavImplIoSpecialFTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1 = OASComAdobeCqDamWebdavImplIoSpecialF.getExample();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2 = comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1;
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3 = new OASComAdobeCqDamWebdavImplIoSpecialF();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties4 = comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3;

        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2));
        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1));
        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1));
        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties4));
        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties4.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3));
        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1 = OASComAdobeCqDamWebdavImplIoSpecialF.getExample();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2 = OASComAdobeCqDamWebdavImplIoSpecialF.getExample();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3 = new OASComAdobeCqDamWebdavImplIoSpecialF();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties4 = new OASComAdobeCqDamWebdavImplIoSpecialF();

        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2));
        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1));
        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties4));
        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties4.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1 = OASComAdobeCqDamWebdavImplIoSpecialF.getExample();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2 = new OASComAdobeCqDamWebdavImplIoSpecialF();

        System.assertEquals(false, comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1 = OASComAdobeCqDamWebdavImplIoSpecialF.getExample();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2 = new OASComAdobeCqDamWebdavImplIoSpecialF();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3;

        System.assertEquals(false, comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3));
        System.assertEquals(false, comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1 = OASComAdobeCqDamWebdavImplIoSpecialF.getExample();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2 = new OASComAdobeCqDamWebdavImplIoSpecialF();

        System.assertEquals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1.hashCode(), comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1.hashCode());
        System.assertEquals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2.hashCode(), comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1 = OASComAdobeCqDamWebdavImplIoSpecialF.getExample();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2 = OASComAdobeCqDamWebdavImplIoSpecialF.getExample();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3 = new OASComAdobeCqDamWebdavImplIoSpecialF();
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties4 = new OASComAdobeCqDamWebdavImplIoSpecialF();

        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2));
        System.assert(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3.equals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties4));
        System.assertEquals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties1.hashCode(), comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties2.hashCode());
        System.assertEquals(comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties3.hashCode(), comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamWebdavImplIoSpecialF comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties = new OASComAdobeCqDamWebdavImplIoSpecialF();
        Map<String, String> propertyMappings = comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.getPropertyMappings();
        System.assertEquals('comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters', propertyMappings.get('com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters'));
    }
}
