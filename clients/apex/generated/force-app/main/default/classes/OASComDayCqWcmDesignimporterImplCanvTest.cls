@isTest
private class OASComDayCqWcmDesignimporterImplCanvTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1 = OASComDayCqWcmDesignimporterImplCanv.getExample();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2 = comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1;
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3 = new OASComDayCqWcmDesignimporterImplCanv();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties4 = comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3;

        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2));
        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1));
        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1));
        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties4));
        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties4.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3));
        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1 = OASComDayCqWcmDesignimporterImplCanv.getExample();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2 = OASComDayCqWcmDesignimporterImplCanv.getExample();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3 = new OASComDayCqWcmDesignimporterImplCanv();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties4 = new OASComDayCqWcmDesignimporterImplCanv();

        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2));
        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1));
        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties4));
        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties4.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1 = OASComDayCqWcmDesignimporterImplCanv.getExample();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2 = new OASComDayCqWcmDesignimporterImplCanv();

        System.assertEquals(false, comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1 = OASComDayCqWcmDesignimporterImplCanv.getExample();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2 = new OASComDayCqWcmDesignimporterImplCanv();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3;

        System.assertEquals(false, comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3));
        System.assertEquals(false, comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1 = OASComDayCqWcmDesignimporterImplCanv.getExample();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2 = new OASComDayCqWcmDesignimporterImplCanv();

        System.assertEquals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1.hashCode(), comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2.hashCode(), comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1 = OASComDayCqWcmDesignimporterImplCanv.getExample();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2 = OASComDayCqWcmDesignimporterImplCanv.getExample();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3 = new OASComDayCqWcmDesignimporterImplCanv();
        OASComDayCqWcmDesignimporterImplCanv comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties4 = new OASComDayCqWcmDesignimporterImplCanv();

        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2));
        System.assert(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3.equals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties4));
        System.assertEquals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties1.hashCode(), comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties2.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties3.hashCode(), comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties4.hashCode());
    }
}
