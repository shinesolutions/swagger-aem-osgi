-module(openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties/0]).

-type openapi_com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_properties() ::
    #{ 'cq_dam_config_annotation_pdf_document_width' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_annotation_pdf_document_height' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_annotation_pdf_document_padding_horizontal' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_annotation_pdf_document_padding_vertical' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_annotation_pdf_font_size' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_annotation_pdf_font_color' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_config_annotation_pdf_font_family' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_config_annotation_pdf_font_light' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_config_annotation_pdf_marginTextImage' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_annotation_pdf_minImageHeight' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_annotation_pdf_reviewStatus_width' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_annotation_pdf_reviewStatus_color_approved' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_config_annotation_pdf_reviewStatus_color_rejected' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_config_annotation_pdf_reviewStatus_color_changesRequested' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_config_annotation_pdf_annotationMarker_width' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_annotation_pdf_asset_minheight' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_config_annotation_pdf_document_width' := CqDamConfigAnnotationPdfDocumentWidth,
          'cq_dam_config_annotation_pdf_document_height' := CqDamConfigAnnotationPdfDocumentHeight,
          'cq_dam_config_annotation_pdf_document_padding_horizontal' := CqDamConfigAnnotationPdfDocumentPaddingHorizontal,
          'cq_dam_config_annotation_pdf_document_padding_vertical' := CqDamConfigAnnotationPdfDocumentPaddingVertical,
          'cq_dam_config_annotation_pdf_font_size' := CqDamConfigAnnotationPdfFontSize,
          'cq_dam_config_annotation_pdf_font_color' := CqDamConfigAnnotationPdfFontColor,
          'cq_dam_config_annotation_pdf_font_family' := CqDamConfigAnnotationPdfFontFamily,
          'cq_dam_config_annotation_pdf_font_light' := CqDamConfigAnnotationPdfFontLight,
          'cq_dam_config_annotation_pdf_marginTextImage' := CqDamConfigAnnotationPdfMarginTextImage,
          'cq_dam_config_annotation_pdf_minImageHeight' := CqDamConfigAnnotationPdfMinImageHeight,
          'cq_dam_config_annotation_pdf_reviewStatus_width' := CqDamConfigAnnotationPdfReviewStatusWidth,
          'cq_dam_config_annotation_pdf_reviewStatus_color_approved' := CqDamConfigAnnotationPdfReviewStatusColorApproved,
          'cq_dam_config_annotation_pdf_reviewStatus_color_rejected' := CqDamConfigAnnotationPdfReviewStatusColorRejected,
          'cq_dam_config_annotation_pdf_reviewStatus_color_changesRequested' := CqDamConfigAnnotationPdfReviewStatusColorChangesRequested,
          'cq_dam_config_annotation_pdf_annotationMarker_width' := CqDamConfigAnnotationPdfAnnotationMarkerWidth,
          'cq_dam_config_annotation_pdf_asset_minheight' := CqDamConfigAnnotationPdfAssetMinheight
        }) ->
    #{ 'cq.dam.config.annotation.pdf.document.width' => CqDamConfigAnnotationPdfDocumentWidth,
       'cq.dam.config.annotation.pdf.document.height' => CqDamConfigAnnotationPdfDocumentHeight,
       'cq.dam.config.annotation.pdf.document.padding.horizontal' => CqDamConfigAnnotationPdfDocumentPaddingHorizontal,
       'cq.dam.config.annotation.pdf.document.padding.vertical' => CqDamConfigAnnotationPdfDocumentPaddingVertical,
       'cq.dam.config.annotation.pdf.font.size' => CqDamConfigAnnotationPdfFontSize,
       'cq.dam.config.annotation.pdf.font.color' => CqDamConfigAnnotationPdfFontColor,
       'cq.dam.config.annotation.pdf.font.family' => CqDamConfigAnnotationPdfFontFamily,
       'cq.dam.config.annotation.pdf.font.light' => CqDamConfigAnnotationPdfFontLight,
       'cq.dam.config.annotation.pdf.marginTextImage' => CqDamConfigAnnotationPdfMarginTextImage,
       'cq.dam.config.annotation.pdf.minImageHeight' => CqDamConfigAnnotationPdfMinImageHeight,
       'cq.dam.config.annotation.pdf.reviewStatus.width' => CqDamConfigAnnotationPdfReviewStatusWidth,
       'cq.dam.config.annotation.pdf.reviewStatus.color.approved' => CqDamConfigAnnotationPdfReviewStatusColorApproved,
       'cq.dam.config.annotation.pdf.reviewStatus.color.rejected' => CqDamConfigAnnotationPdfReviewStatusColorRejected,
       'cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested' => CqDamConfigAnnotationPdfReviewStatusColorChangesRequested,
       'cq.dam.config.annotation.pdf.annotationMarker.width' => CqDamConfigAnnotationPdfAnnotationMarkerWidth,
       'cq.dam.config.annotation.pdf.asset.minheight' => CqDamConfigAnnotationPdfAssetMinheight
     }.
