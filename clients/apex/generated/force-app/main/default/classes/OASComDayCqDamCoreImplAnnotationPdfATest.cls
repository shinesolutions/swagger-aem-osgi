@isTest
private class OASComDayCqDamCoreImplAnnotationPdfATest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1 = OASComDayCqDamCoreImplAnnotationPdfA.getExample();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2 = comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1;
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3 = new OASComDayCqDamCoreImplAnnotationPdfA();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties4 = comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3;

        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2));
        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1));
        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1));
        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties4));
        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties4.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3));
        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1 = OASComDayCqDamCoreImplAnnotationPdfA.getExample();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2 = OASComDayCqDamCoreImplAnnotationPdfA.getExample();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3 = new OASComDayCqDamCoreImplAnnotationPdfA();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties4 = new OASComDayCqDamCoreImplAnnotationPdfA();

        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2));
        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1));
        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties4));
        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties4.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1 = OASComDayCqDamCoreImplAnnotationPdfA.getExample();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2 = new OASComDayCqDamCoreImplAnnotationPdfA();

        System.assertEquals(false, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1 = OASComDayCqDamCoreImplAnnotationPdfA.getExample();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2 = new OASComDayCqDamCoreImplAnnotationPdfA();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3;

        System.assertEquals(false, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3));
        System.assertEquals(false, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1 = OASComDayCqDamCoreImplAnnotationPdfA.getExample();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2 = new OASComDayCqDamCoreImplAnnotationPdfA();

        System.assertEquals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1.hashCode(), comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2.hashCode(), comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1 = OASComDayCqDamCoreImplAnnotationPdfA.getExample();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2 = OASComDayCqDamCoreImplAnnotationPdfA.getExample();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3 = new OASComDayCqDamCoreImplAnnotationPdfA();
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties4 = new OASComDayCqDamCoreImplAnnotationPdfA();

        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2));
        System.assert(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3.equals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties4));
        System.assertEquals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties1.hashCode(), comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties3.hashCode(), comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplAnnotationPdfA comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties = new OASComDayCqDamCoreImplAnnotationPdfA();
        Map<String, String> propertyMappings = comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.getPropertyMappings();
        System.assertEquals('cqDamConfigAnnotationPdfDocumentWidth', propertyMappings.get('cq.dam.config.annotation.pdf.document.width'));
        System.assertEquals('cqDamConfigAnnotationPdfDocumentHeight', propertyMappings.get('cq.dam.config.annotation.pdf.document.height'));
        System.assertEquals('cqDamConfigAnnotationPdfDocumentPaddingHorizontal', propertyMappings.get('cq.dam.config.annotation.pdf.document.padding.horizontal'));
        System.assertEquals('cqDamConfigAnnotationPdfDocumentPaddingVertical', propertyMappings.get('cq.dam.config.annotation.pdf.document.padding.vertical'));
        System.assertEquals('cqDamConfigAnnotationPdfFontSize', propertyMappings.get('cq.dam.config.annotation.pdf.font.size'));
        System.assertEquals('cqDamConfigAnnotationPdfFontColor', propertyMappings.get('cq.dam.config.annotation.pdf.font.color'));
        System.assertEquals('cqDamConfigAnnotationPdfFontFamily', propertyMappings.get('cq.dam.config.annotation.pdf.font.family'));
        System.assertEquals('cqDamConfigAnnotationPdfFontLight', propertyMappings.get('cq.dam.config.annotation.pdf.font.light'));
        System.assertEquals('cqDamConfigAnnotationPdfMarginTextImage', propertyMappings.get('cq.dam.config.annotation.pdf.marginTextImage'));
        System.assertEquals('cqDamConfigAnnotationPdfMinImageHeight', propertyMappings.get('cq.dam.config.annotation.pdf.minImageHeight'));
        System.assertEquals('cqDamConfigAnnotationPdfReviewStatusWidth', propertyMappings.get('cq.dam.config.annotation.pdf.reviewStatus.width'));
        System.assertEquals('cqDamConfigAnnotationPdfReviewStatusColorApproved', propertyMappings.get('cq.dam.config.annotation.pdf.reviewStatus.color.approved'));
        System.assertEquals('cqDamConfigAnnotationPdfReviewStatusColorRejected', propertyMappings.get('cq.dam.config.annotation.pdf.reviewStatus.color.rejected'));
        System.assertEquals('cqDamConfigAnnotationPdfReviewStatusColorChangesRequested', propertyMappings.get('cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested'));
        System.assertEquals('cqDamConfigAnnotationPdfAnnotationMarkerWidth', propertyMappings.get('cq.dam.config.annotation.pdf.annotationMarker.width'));
        System.assertEquals('cqDamConfigAnnotationPdfAssetMinheight', propertyMappings.get('cq.dam.config.annotation.pdf.asset.minheight'));
    }
}
