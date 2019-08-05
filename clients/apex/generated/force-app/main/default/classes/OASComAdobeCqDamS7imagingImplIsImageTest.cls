@isTest
private class OASComAdobeCqDamS7imagingImplIsImageTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties1 = OASComAdobeCqDamS7imagingImplIsImage.getExample();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties2 = comAdobeCqDamS7imagingImplIsImageServerComponentProperties1;
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties3 = new OASComAdobeCqDamS7imagingImplIsImage();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties4 = comAdobeCqDamS7imagingImplIsImageServerComponentProperties3;

        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties1.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties2));
        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties2.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties1));
        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties1.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties1));
        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties4));
        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties4.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3));
        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties1 = OASComAdobeCqDamS7imagingImplIsImage.getExample();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties2 = OASComAdobeCqDamS7imagingImplIsImage.getExample();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties3 = new OASComAdobeCqDamS7imagingImplIsImage();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties4 = new OASComAdobeCqDamS7imagingImplIsImage();

        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties1.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties2));
        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties2.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties1));
        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties4));
        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties4.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties1 = OASComAdobeCqDamS7imagingImplIsImage.getExample();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties2 = new OASComAdobeCqDamS7imagingImplIsImage();

        System.assertEquals(false, comAdobeCqDamS7imagingImplIsImageServerComponentProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamS7imagingImplIsImageServerComponentProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties1 = OASComAdobeCqDamS7imagingImplIsImage.getExample();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties2 = new OASComAdobeCqDamS7imagingImplIsImage();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties3;

        System.assertEquals(false, comAdobeCqDamS7imagingImplIsImageServerComponentProperties1.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3));
        System.assertEquals(false, comAdobeCqDamS7imagingImplIsImageServerComponentProperties2.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties1 = OASComAdobeCqDamS7imagingImplIsImage.getExample();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties2 = new OASComAdobeCqDamS7imagingImplIsImage();

        System.assertEquals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties1.hashCode(), comAdobeCqDamS7imagingImplIsImageServerComponentProperties1.hashCode());
        System.assertEquals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties2.hashCode(), comAdobeCqDamS7imagingImplIsImageServerComponentProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties1 = OASComAdobeCqDamS7imagingImplIsImage.getExample();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties2 = OASComAdobeCqDamS7imagingImplIsImage.getExample();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties3 = new OASComAdobeCqDamS7imagingImplIsImage();
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties4 = new OASComAdobeCqDamS7imagingImplIsImage();

        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties1.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties2));
        System.assert(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3.equals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties4));
        System.assertEquals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties1.hashCode(), comAdobeCqDamS7imagingImplIsImageServerComponentProperties2.hashCode());
        System.assertEquals(comAdobeCqDamS7imagingImplIsImageServerComponentProperties3.hashCode(), comAdobeCqDamS7imagingImplIsImageServerComponentProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamS7imagingImplIsImage comAdobeCqDamS7imagingImplIsImageServerComponentProperties = new OASComAdobeCqDamS7imagingImplIsImage();
        Map<String, String> propertyMappings = comAdobeCqDamS7imagingImplIsImageServerComponentProperties.getPropertyMappings();
        System.assertEquals('tcpPort', propertyMappings.get('TcpPort'));
        System.assertEquals('allowRemoteAccess', propertyMappings.get('AllowRemoteAccess'));
        System.assertEquals('maxRenderRgnPixels', propertyMappings.get('MaxRenderRgnPixels'));
        System.assertEquals('maxMessageSize', propertyMappings.get('MaxMessageSize'));
        System.assertEquals('randomAccessUrlTimeout', propertyMappings.get('RandomAccessUrlTimeout'));
        System.assertEquals('workerThreads', propertyMappings.get('WorkerThreads'));
    }
}
