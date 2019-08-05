@isTest
private class OASComAdobeCqWcmMobileQrcodeServletQTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1 = OASComAdobeCqWcmMobileQrcodeServletQ.getExample();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2 = comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1;
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3 = new OASComAdobeCqWcmMobileQrcodeServletQ();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties4 = comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3;

        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2));
        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1));
        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1));
        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties4));
        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties4.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3));
        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1 = OASComAdobeCqWcmMobileQrcodeServletQ.getExample();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2 = OASComAdobeCqWcmMobileQrcodeServletQ.getExample();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3 = new OASComAdobeCqWcmMobileQrcodeServletQ();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties4 = new OASComAdobeCqWcmMobileQrcodeServletQ();

        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2));
        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1));
        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties4));
        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties4.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1 = OASComAdobeCqWcmMobileQrcodeServletQ.getExample();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2 = new OASComAdobeCqWcmMobileQrcodeServletQ();

        System.assertEquals(false, comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1 = OASComAdobeCqWcmMobileQrcodeServletQ.getExample();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2 = new OASComAdobeCqWcmMobileQrcodeServletQ();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3;

        System.assertEquals(false, comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3));
        System.assertEquals(false, comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1 = OASComAdobeCqWcmMobileQrcodeServletQ.getExample();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2 = new OASComAdobeCqWcmMobileQrcodeServletQ();

        System.assertEquals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1.hashCode(), comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1.hashCode());
        System.assertEquals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2.hashCode(), comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1 = OASComAdobeCqWcmMobileQrcodeServletQ.getExample();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2 = OASComAdobeCqWcmMobileQrcodeServletQ.getExample();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3 = new OASComAdobeCqWcmMobileQrcodeServletQ();
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties4 = new OASComAdobeCqWcmMobileQrcodeServletQ();

        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2));
        System.assert(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3.equals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties4));
        System.assertEquals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties1.hashCode(), comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties2.hashCode());
        System.assertEquals(comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties3.hashCode(), comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqWcmMobileQrcodeServletQ comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties = new OASComAdobeCqWcmMobileQrcodeServletQ();
        Map<String, String> propertyMappings = comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.getPropertyMappings();
        System.assertEquals('cqWcmQrcodeServletWhitelist', propertyMappings.get('cq.wcm.qrcode.servlet.whitelist'));
    }
}
