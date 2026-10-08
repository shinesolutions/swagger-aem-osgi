@isTest
private class OASComAdobeGraniteThreaddumpThreadDuTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties1 = OASComAdobeGraniteThreaddumpThreadDu.getExample();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties2 = comAdobeGraniteThreaddumpThreadDumpCollectorProperties1;
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties3 = new OASComAdobeGraniteThreaddumpThreadDu();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties4 = comAdobeGraniteThreaddumpThreadDumpCollectorProperties3;

        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties1.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties2));
        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties2.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties1));
        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties1.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties1));
        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties4));
        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties4.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3));
        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties1 = OASComAdobeGraniteThreaddumpThreadDu.getExample();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties2 = OASComAdobeGraniteThreaddumpThreadDu.getExample();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties3 = new OASComAdobeGraniteThreaddumpThreadDu();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties4 = new OASComAdobeGraniteThreaddumpThreadDu();

        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties1.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties2));
        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties2.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties1));
        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties4));
        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties4.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties1 = OASComAdobeGraniteThreaddumpThreadDu.getExample();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties2 = new OASComAdobeGraniteThreaddumpThreadDu();

        System.assertEquals(false, comAdobeGraniteThreaddumpThreadDumpCollectorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteThreaddumpThreadDumpCollectorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties1 = OASComAdobeGraniteThreaddumpThreadDu.getExample();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties2 = new OASComAdobeGraniteThreaddumpThreadDu();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties3;

        System.assertEquals(false, comAdobeGraniteThreaddumpThreadDumpCollectorProperties1.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3));
        System.assertEquals(false, comAdobeGraniteThreaddumpThreadDumpCollectorProperties2.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties1 = OASComAdobeGraniteThreaddumpThreadDu.getExample();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties2 = new OASComAdobeGraniteThreaddumpThreadDu();

        System.assertEquals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties1.hashCode(), comAdobeGraniteThreaddumpThreadDumpCollectorProperties1.hashCode());
        System.assertEquals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties2.hashCode(), comAdobeGraniteThreaddumpThreadDumpCollectorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties1 = OASComAdobeGraniteThreaddumpThreadDu.getExample();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties2 = OASComAdobeGraniteThreaddumpThreadDu.getExample();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties3 = new OASComAdobeGraniteThreaddumpThreadDu();
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties4 = new OASComAdobeGraniteThreaddumpThreadDu();

        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties1.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties2));
        System.assert(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3.equals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties4));
        System.assertEquals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties1.hashCode(), comAdobeGraniteThreaddumpThreadDumpCollectorProperties2.hashCode());
        System.assertEquals(comAdobeGraniteThreaddumpThreadDumpCollectorProperties3.hashCode(), comAdobeGraniteThreaddumpThreadDumpCollectorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteThreaddumpThreadDu comAdobeGraniteThreaddumpThreadDumpCollectorProperties = new OASComAdobeGraniteThreaddumpThreadDu();
        Map<String, String> x-property-mappings = comAdobeGraniteThreaddumpThreadDumpCollectorProperties.getx-property-mappings();
        System.assertEquals('schedulerPeriod', x-property-mappings.get('scheduler.period'));
        System.assertEquals('schedulerRunOn', x-property-mappings.get('scheduler.runOn'));
        System.assertEquals('graniteThreaddumpEnabled', x-property-mappings.get('granite.threaddump.enabled'));
        System.assertEquals('graniteThreaddumpDumpsPerFile', x-property-mappings.get('granite.threaddump.dumpsPerFile'));
        System.assertEquals('graniteThreaddumpEnableGzipCompression', x-property-mappings.get('granite.threaddump.enableGzipCompression'));
        System.assertEquals('graniteThreaddumpEnableDirectoriesCompression', x-property-mappings.get('granite.threaddump.enableDirectoriesCompression'));
        System.assertEquals('graniteThreaddumpEnableJStack', x-property-mappings.get('granite.threaddump.enableJStack'));
        System.assertEquals('graniteThreaddumpMaxBackupDays', x-property-mappings.get('granite.threaddump.maxBackupDays'));
        System.assertEquals('graniteThreaddumpBackupCleanTrigger', x-property-mappings.get('granite.threaddump.backupCleanTrigger'));
    }
}
