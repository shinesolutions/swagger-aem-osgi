<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
{
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.document.width", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_document_width;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.document.height", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_document_height;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.document.padding.horizontal", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_document_padding_horizontal;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.document.padding.vertical", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_document_padding_vertical;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.font.size", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_font_size;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.font.color", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_dam_config_annotation_pdf_font_color;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.font.family", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_dam_config_annotation_pdf_font_family;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.font.light", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_dam_config_annotation_pdf_font_light;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.marginTextImage", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_margin_text_image;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.minImageHeight", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_min_image_height;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.reviewStatus.width", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_review_status_width;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.reviewStatus.color.approved", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_dam_config_annotation_pdf_review_status_color_approved;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.reviewStatus.color.rejected", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_dam_config_annotation_pdf_review_status_color_rejected;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $cq_dam_config_annotation_pdf_review_status_color_changes_requested;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.annotationMarker.width", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_annotation_marker_width;
    /**
     * @DTA\Data(field="cq.dam.config.annotation.pdf.asset.minheight", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_dam_config_annotation_pdf_asset_minheight;
}
