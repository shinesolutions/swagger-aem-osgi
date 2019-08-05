@isTest
private class OASApacheSlingHealthCheckResultHTMLSTest {
    @isTest
    private static void equalsSameInstance() {
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties1 = OASApacheSlingHealthCheckResultHTMLS.getExample();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties2 = apacheSlingHealthCheckResultHTMLSerializerProperties1;
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties3 = new OASApacheSlingHealthCheckResultHTMLS();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties4 = apacheSlingHealthCheckResultHTMLSerializerProperties3;

        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties1.equals(apacheSlingHealthCheckResultHTMLSerializerProperties2));
        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties2.equals(apacheSlingHealthCheckResultHTMLSerializerProperties1));
        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties1.equals(apacheSlingHealthCheckResultHTMLSerializerProperties1));
        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties3.equals(apacheSlingHealthCheckResultHTMLSerializerProperties4));
        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties4.equals(apacheSlingHealthCheckResultHTMLSerializerProperties3));
        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties3.equals(apacheSlingHealthCheckResultHTMLSerializerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties1 = OASApacheSlingHealthCheckResultHTMLS.getExample();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties2 = OASApacheSlingHealthCheckResultHTMLS.getExample();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties3 = new OASApacheSlingHealthCheckResultHTMLS();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties4 = new OASApacheSlingHealthCheckResultHTMLS();

        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties1.equals(apacheSlingHealthCheckResultHTMLSerializerProperties2));
        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties2.equals(apacheSlingHealthCheckResultHTMLSerializerProperties1));
        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties3.equals(apacheSlingHealthCheckResultHTMLSerializerProperties4));
        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties4.equals(apacheSlingHealthCheckResultHTMLSerializerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties1 = OASApacheSlingHealthCheckResultHTMLS.getExample();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties2 = new OASApacheSlingHealthCheckResultHTMLS();

        System.assertEquals(false, apacheSlingHealthCheckResultHTMLSerializerProperties1.equals('foo'));
        System.assertEquals(false, apacheSlingHealthCheckResultHTMLSerializerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties1 = OASApacheSlingHealthCheckResultHTMLS.getExample();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties2 = new OASApacheSlingHealthCheckResultHTMLS();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties3;

        System.assertEquals(false, apacheSlingHealthCheckResultHTMLSerializerProperties1.equals(apacheSlingHealthCheckResultHTMLSerializerProperties3));
        System.assertEquals(false, apacheSlingHealthCheckResultHTMLSerializerProperties2.equals(apacheSlingHealthCheckResultHTMLSerializerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties1 = OASApacheSlingHealthCheckResultHTMLS.getExample();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties2 = new OASApacheSlingHealthCheckResultHTMLS();

        System.assertEquals(apacheSlingHealthCheckResultHTMLSerializerProperties1.hashCode(), apacheSlingHealthCheckResultHTMLSerializerProperties1.hashCode());
        System.assertEquals(apacheSlingHealthCheckResultHTMLSerializerProperties2.hashCode(), apacheSlingHealthCheckResultHTMLSerializerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties1 = OASApacheSlingHealthCheckResultHTMLS.getExample();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties2 = OASApacheSlingHealthCheckResultHTMLS.getExample();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties3 = new OASApacheSlingHealthCheckResultHTMLS();
        OASApacheSlingHealthCheckResultHTMLS apacheSlingHealthCheckResultHTMLSerializerProperties4 = new OASApacheSlingHealthCheckResultHTMLS();

        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties1.equals(apacheSlingHealthCheckResultHTMLSerializerProperties2));
        System.assert(apacheSlingHealthCheckResultHTMLSerializerProperties3.equals(apacheSlingHealthCheckResultHTMLSerializerProperties4));
        System.assertEquals(apacheSlingHealthCheckResultHTMLSerializerProperties1.hashCode(), apacheSlingHealthCheckResultHTMLSerializerProperties2.hashCode());
        System.assertEquals(apacheSlingHealthCheckResultHTMLSerializerProperties3.hashCode(), apacheSlingHealthCheckResultHTMLSerializerProperties4.hashCode());
    }
}
