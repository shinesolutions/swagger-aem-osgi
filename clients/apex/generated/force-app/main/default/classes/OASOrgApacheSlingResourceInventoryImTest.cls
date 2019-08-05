@isTest
private class OASOrgApacheSlingResourceInventoryImTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1 = OASOrgApacheSlingResourceInventoryIm.getExample();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2 = orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1;
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3 = new OASOrgApacheSlingResourceInventoryIm();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties4 = orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3;

        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2));
        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1));
        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1));
        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties4));
        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties4.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3));
        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1 = OASOrgApacheSlingResourceInventoryIm.getExample();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2 = OASOrgApacheSlingResourceInventoryIm.getExample();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3 = new OASOrgApacheSlingResourceInventoryIm();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties4 = new OASOrgApacheSlingResourceInventoryIm();

        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2));
        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1));
        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties4));
        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties4.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1 = OASOrgApacheSlingResourceInventoryIm.getExample();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2 = new OASOrgApacheSlingResourceInventoryIm();

        System.assertEquals(false, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1 = OASOrgApacheSlingResourceInventoryIm.getExample();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2 = new OASOrgApacheSlingResourceInventoryIm();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3;

        System.assertEquals(false, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3));
        System.assertEquals(false, orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1 = OASOrgApacheSlingResourceInventoryIm.getExample();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2 = new OASOrgApacheSlingResourceInventoryIm();

        System.assertEquals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1.hashCode(), orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1.hashCode());
        System.assertEquals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2.hashCode(), orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1 = OASOrgApacheSlingResourceInventoryIm.getExample();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2 = OASOrgApacheSlingResourceInventoryIm.getExample();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3 = new OASOrgApacheSlingResourceInventoryIm();
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties4 = new OASOrgApacheSlingResourceInventoryIm();

        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2));
        System.assert(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3.equals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties4));
        System.assertEquals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties1.hashCode(), orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties2.hashCode());
        System.assertEquals(orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties3.hashCode(), orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingResourceInventoryIm orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties = new OASOrgApacheSlingResourceInventoryIm();
        Map<String, String> propertyMappings = orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.getPropertyMappings();
        System.assertEquals('felixInventoryPrinterName', propertyMappings.get('felix.inventory.printer.name'));
        System.assertEquals('felixInventoryPrinterTitle', propertyMappings.get('felix.inventory.printer.title'));
    }
}
