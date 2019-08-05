@isTest
private class OASComAdobeGraniteOffloadingImplOfflTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1 = OASComAdobeGraniteOffloadingImplOffl.getExample();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2 = comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1;
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3 = new OASComAdobeGraniteOffloadingImplOffl();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties4 = comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3;

        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2));
        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1));
        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1));
        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties4));
        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties4.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3));
        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1 = OASComAdobeGraniteOffloadingImplOffl.getExample();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2 = OASComAdobeGraniteOffloadingImplOffl.getExample();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3 = new OASComAdobeGraniteOffloadingImplOffl();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties4 = new OASComAdobeGraniteOffloadingImplOffl();

        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2));
        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1));
        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties4));
        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties4.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1 = OASComAdobeGraniteOffloadingImplOffl.getExample();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2 = new OASComAdobeGraniteOffloadingImplOffl();

        System.assertEquals(false, comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1 = OASComAdobeGraniteOffloadingImplOffl.getExample();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2 = new OASComAdobeGraniteOffloadingImplOffl();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3;

        System.assertEquals(false, comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3));
        System.assertEquals(false, comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1 = OASComAdobeGraniteOffloadingImplOffl.getExample();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2 = new OASComAdobeGraniteOffloadingImplOffl();

        System.assertEquals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1.hashCode(), comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1.hashCode());
        System.assertEquals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2.hashCode(), comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1 = OASComAdobeGraniteOffloadingImplOffl.getExample();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2 = OASComAdobeGraniteOffloadingImplOffl.getExample();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3 = new OASComAdobeGraniteOffloadingImplOffl();
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties4 = new OASComAdobeGraniteOffloadingImplOffl();

        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2));
        System.assert(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3.equals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties4));
        System.assertEquals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties1.hashCode(), comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties2.hashCode());
        System.assertEquals(comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties3.hashCode(), comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteOffloadingImplOffl comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties = new OASComAdobeGraniteOffloadingImplOffl();
        Map<String, String> propertyMappings = comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.getPropertyMappings();
        System.assertEquals('offloadingOffloaderEnabled', propertyMappings.get('offloading.offloader.enabled'));
    }
}
