<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig
 */
class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigParameterData
{
    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.font.family", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $cq_dam_config_annotation_pdf_font_family = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.reviewStatus.color.approved", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $cq_dam_config_annotation_pdf_review_status_color_approved = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.font.color", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $cq_dam_config_annotation_pdf_font_color = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.asset.minheight", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_asset_minheight = null;

    /**
     * @DTA\Data(subset="query", field="apply", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $apply = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.document.padding.horizontal", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_document_padding_horizontal = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.font.light", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $cq_dam_config_annotation_pdf_font_light = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.reviewStatus.width", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_review_status_width = null;

    /**
     * @DTA\Data(subset="query", field="delete", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $delete = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $cq_dam_config_annotation_pdf_review_status_color_changes_requested = null;

    /**
     * @DTA\Data(subset="query", field="propertylist", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     */
    public ?array $propertylist = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.marginTextImage", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_margin_text_image = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.reviewStatus.color.rejected", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $cq_dam_config_annotation_pdf_review_status_color_rejected = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.document.width", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_document_width = null;

    /**
     * @DTA\Data(subset="query", field="post", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $post = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.minImageHeight", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_min_image_height = null;

    /**
     * @DTA\Data(subset="query", field="$location", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $location = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.document.height", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_document_height = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.font.size", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_font_size = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.annotationMarker.width", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_annotation_marker_width = null;

    /**
     * @DTA\Data(subset="query", field="action", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $action = null;

    /**
     * @DTA\Data(subset="query", field="cq.dam.config.annotation.pdf.document.padding.vertical", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_dam_config_annotation_pdf_document_padding_vertical = null;

}
