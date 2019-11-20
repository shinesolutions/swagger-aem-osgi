<?php
/**
 * ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 3.2.1-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'cq_dam_config_annotation_pdf_document_width' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cq_dam_config_annotation_pdf_document_height' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cq_dam_config_annotation_pdf_document_padding_horizontal' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cq_dam_config_annotation_pdf_document_padding_vertical' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cq_dam_config_annotation_pdf_font_size' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cq_dam_config_annotation_pdf_font_color' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'cq_dam_config_annotation_pdf_font_family' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'cq_dam_config_annotation_pdf_font_light' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'cq_dam_config_annotation_pdf_margin_text_image' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cq_dam_config_annotation_pdf_min_image_height' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cq_dam_config_annotation_pdf_review_status_width' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cq_dam_config_annotation_pdf_review_status_color_approved' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'cq_dam_config_annotation_pdf_review_status_color_rejected' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'cq_dam_config_annotation_pdf_review_status_color_changes_requested' => '\OpenAPI\Client\Model\ConfigNodePropertyString',
        'cq_dam_config_annotation_pdf_annotation_marker_width' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger',
        'cq_dam_config_annotation_pdf_asset_minheight' => '\OpenAPI\Client\Model\ConfigNodePropertyInteger'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'cq_dam_config_annotation_pdf_document_width' => null,
        'cq_dam_config_annotation_pdf_document_height' => null,
        'cq_dam_config_annotation_pdf_document_padding_horizontal' => null,
        'cq_dam_config_annotation_pdf_document_padding_vertical' => null,
        'cq_dam_config_annotation_pdf_font_size' => null,
        'cq_dam_config_annotation_pdf_font_color' => null,
        'cq_dam_config_annotation_pdf_font_family' => null,
        'cq_dam_config_annotation_pdf_font_light' => null,
        'cq_dam_config_annotation_pdf_margin_text_image' => null,
        'cq_dam_config_annotation_pdf_min_image_height' => null,
        'cq_dam_config_annotation_pdf_review_status_width' => null,
        'cq_dam_config_annotation_pdf_review_status_color_approved' => null,
        'cq_dam_config_annotation_pdf_review_status_color_rejected' => null,
        'cq_dam_config_annotation_pdf_review_status_color_changes_requested' => null,
        'cq_dam_config_annotation_pdf_annotation_marker_width' => null,
        'cq_dam_config_annotation_pdf_asset_minheight' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'cq_dam_config_annotation_pdf_document_width' => 'cq.dam.config.annotation.pdf.document.width',
        'cq_dam_config_annotation_pdf_document_height' => 'cq.dam.config.annotation.pdf.document.height',
        'cq_dam_config_annotation_pdf_document_padding_horizontal' => 'cq.dam.config.annotation.pdf.document.padding.horizontal',
        'cq_dam_config_annotation_pdf_document_padding_vertical' => 'cq.dam.config.annotation.pdf.document.padding.vertical',
        'cq_dam_config_annotation_pdf_font_size' => 'cq.dam.config.annotation.pdf.font.size',
        'cq_dam_config_annotation_pdf_font_color' => 'cq.dam.config.annotation.pdf.font.color',
        'cq_dam_config_annotation_pdf_font_family' => 'cq.dam.config.annotation.pdf.font.family',
        'cq_dam_config_annotation_pdf_font_light' => 'cq.dam.config.annotation.pdf.font.light',
        'cq_dam_config_annotation_pdf_margin_text_image' => 'cq.dam.config.annotation.pdf.marginTextImage',
        'cq_dam_config_annotation_pdf_min_image_height' => 'cq.dam.config.annotation.pdf.minImageHeight',
        'cq_dam_config_annotation_pdf_review_status_width' => 'cq.dam.config.annotation.pdf.reviewStatus.width',
        'cq_dam_config_annotation_pdf_review_status_color_approved' => 'cq.dam.config.annotation.pdf.reviewStatus.color.approved',
        'cq_dam_config_annotation_pdf_review_status_color_rejected' => 'cq.dam.config.annotation.pdf.reviewStatus.color.rejected',
        'cq_dam_config_annotation_pdf_review_status_color_changes_requested' => 'cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested',
        'cq_dam_config_annotation_pdf_annotation_marker_width' => 'cq.dam.config.annotation.pdf.annotationMarker.width',
        'cq_dam_config_annotation_pdf_asset_minheight' => 'cq.dam.config.annotation.pdf.asset.minheight'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cq_dam_config_annotation_pdf_document_width' => 'setCqDamConfigAnnotationPdfDocumentWidth',
        'cq_dam_config_annotation_pdf_document_height' => 'setCqDamConfigAnnotationPdfDocumentHeight',
        'cq_dam_config_annotation_pdf_document_padding_horizontal' => 'setCqDamConfigAnnotationPdfDocumentPaddingHorizontal',
        'cq_dam_config_annotation_pdf_document_padding_vertical' => 'setCqDamConfigAnnotationPdfDocumentPaddingVertical',
        'cq_dam_config_annotation_pdf_font_size' => 'setCqDamConfigAnnotationPdfFontSize',
        'cq_dam_config_annotation_pdf_font_color' => 'setCqDamConfigAnnotationPdfFontColor',
        'cq_dam_config_annotation_pdf_font_family' => 'setCqDamConfigAnnotationPdfFontFamily',
        'cq_dam_config_annotation_pdf_font_light' => 'setCqDamConfigAnnotationPdfFontLight',
        'cq_dam_config_annotation_pdf_margin_text_image' => 'setCqDamConfigAnnotationPdfMarginTextImage',
        'cq_dam_config_annotation_pdf_min_image_height' => 'setCqDamConfigAnnotationPdfMinImageHeight',
        'cq_dam_config_annotation_pdf_review_status_width' => 'setCqDamConfigAnnotationPdfReviewStatusWidth',
        'cq_dam_config_annotation_pdf_review_status_color_approved' => 'setCqDamConfigAnnotationPdfReviewStatusColorApproved',
        'cq_dam_config_annotation_pdf_review_status_color_rejected' => 'setCqDamConfigAnnotationPdfReviewStatusColorRejected',
        'cq_dam_config_annotation_pdf_review_status_color_changes_requested' => 'setCqDamConfigAnnotationPdfReviewStatusColorChangesRequested',
        'cq_dam_config_annotation_pdf_annotation_marker_width' => 'setCqDamConfigAnnotationPdfAnnotationMarkerWidth',
        'cq_dam_config_annotation_pdf_asset_minheight' => 'setCqDamConfigAnnotationPdfAssetMinheight'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cq_dam_config_annotation_pdf_document_width' => 'getCqDamConfigAnnotationPdfDocumentWidth',
        'cq_dam_config_annotation_pdf_document_height' => 'getCqDamConfigAnnotationPdfDocumentHeight',
        'cq_dam_config_annotation_pdf_document_padding_horizontal' => 'getCqDamConfigAnnotationPdfDocumentPaddingHorizontal',
        'cq_dam_config_annotation_pdf_document_padding_vertical' => 'getCqDamConfigAnnotationPdfDocumentPaddingVertical',
        'cq_dam_config_annotation_pdf_font_size' => 'getCqDamConfigAnnotationPdfFontSize',
        'cq_dam_config_annotation_pdf_font_color' => 'getCqDamConfigAnnotationPdfFontColor',
        'cq_dam_config_annotation_pdf_font_family' => 'getCqDamConfigAnnotationPdfFontFamily',
        'cq_dam_config_annotation_pdf_font_light' => 'getCqDamConfigAnnotationPdfFontLight',
        'cq_dam_config_annotation_pdf_margin_text_image' => 'getCqDamConfigAnnotationPdfMarginTextImage',
        'cq_dam_config_annotation_pdf_min_image_height' => 'getCqDamConfigAnnotationPdfMinImageHeight',
        'cq_dam_config_annotation_pdf_review_status_width' => 'getCqDamConfigAnnotationPdfReviewStatusWidth',
        'cq_dam_config_annotation_pdf_review_status_color_approved' => 'getCqDamConfigAnnotationPdfReviewStatusColorApproved',
        'cq_dam_config_annotation_pdf_review_status_color_rejected' => 'getCqDamConfigAnnotationPdfReviewStatusColorRejected',
        'cq_dam_config_annotation_pdf_review_status_color_changes_requested' => 'getCqDamConfigAnnotationPdfReviewStatusColorChangesRequested',
        'cq_dam_config_annotation_pdf_annotation_marker_width' => 'getCqDamConfigAnnotationPdfAnnotationMarkerWidth',
        'cq_dam_config_annotation_pdf_asset_minheight' => 'getCqDamConfigAnnotationPdfAssetMinheight'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['cq_dam_config_annotation_pdf_document_width'] = isset($data['cq_dam_config_annotation_pdf_document_width']) ? $data['cq_dam_config_annotation_pdf_document_width'] : null;
        $this->container['cq_dam_config_annotation_pdf_document_height'] = isset($data['cq_dam_config_annotation_pdf_document_height']) ? $data['cq_dam_config_annotation_pdf_document_height'] : null;
        $this->container['cq_dam_config_annotation_pdf_document_padding_horizontal'] = isset($data['cq_dam_config_annotation_pdf_document_padding_horizontal']) ? $data['cq_dam_config_annotation_pdf_document_padding_horizontal'] : null;
        $this->container['cq_dam_config_annotation_pdf_document_padding_vertical'] = isset($data['cq_dam_config_annotation_pdf_document_padding_vertical']) ? $data['cq_dam_config_annotation_pdf_document_padding_vertical'] : null;
        $this->container['cq_dam_config_annotation_pdf_font_size'] = isset($data['cq_dam_config_annotation_pdf_font_size']) ? $data['cq_dam_config_annotation_pdf_font_size'] : null;
        $this->container['cq_dam_config_annotation_pdf_font_color'] = isset($data['cq_dam_config_annotation_pdf_font_color']) ? $data['cq_dam_config_annotation_pdf_font_color'] : null;
        $this->container['cq_dam_config_annotation_pdf_font_family'] = isset($data['cq_dam_config_annotation_pdf_font_family']) ? $data['cq_dam_config_annotation_pdf_font_family'] : null;
        $this->container['cq_dam_config_annotation_pdf_font_light'] = isset($data['cq_dam_config_annotation_pdf_font_light']) ? $data['cq_dam_config_annotation_pdf_font_light'] : null;
        $this->container['cq_dam_config_annotation_pdf_margin_text_image'] = isset($data['cq_dam_config_annotation_pdf_margin_text_image']) ? $data['cq_dam_config_annotation_pdf_margin_text_image'] : null;
        $this->container['cq_dam_config_annotation_pdf_min_image_height'] = isset($data['cq_dam_config_annotation_pdf_min_image_height']) ? $data['cq_dam_config_annotation_pdf_min_image_height'] : null;
        $this->container['cq_dam_config_annotation_pdf_review_status_width'] = isset($data['cq_dam_config_annotation_pdf_review_status_width']) ? $data['cq_dam_config_annotation_pdf_review_status_width'] : null;
        $this->container['cq_dam_config_annotation_pdf_review_status_color_approved'] = isset($data['cq_dam_config_annotation_pdf_review_status_color_approved']) ? $data['cq_dam_config_annotation_pdf_review_status_color_approved'] : null;
        $this->container['cq_dam_config_annotation_pdf_review_status_color_rejected'] = isset($data['cq_dam_config_annotation_pdf_review_status_color_rejected']) ? $data['cq_dam_config_annotation_pdf_review_status_color_rejected'] : null;
        $this->container['cq_dam_config_annotation_pdf_review_status_color_changes_requested'] = isset($data['cq_dam_config_annotation_pdf_review_status_color_changes_requested']) ? $data['cq_dam_config_annotation_pdf_review_status_color_changes_requested'] : null;
        $this->container['cq_dam_config_annotation_pdf_annotation_marker_width'] = isset($data['cq_dam_config_annotation_pdf_annotation_marker_width']) ? $data['cq_dam_config_annotation_pdf_annotation_marker_width'] : null;
        $this->container['cq_dam_config_annotation_pdf_asset_minheight'] = isset($data['cq_dam_config_annotation_pdf_asset_minheight']) ? $data['cq_dam_config_annotation_pdf_asset_minheight'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets cq_dam_config_annotation_pdf_document_width
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfDocumentWidth()
    {
        return $this->container['cq_dam_config_annotation_pdf_document_width'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_document_width
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_document_width cq_dam_config_annotation_pdf_document_width
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfDocumentWidth($cq_dam_config_annotation_pdf_document_width)
    {
        $this->container['cq_dam_config_annotation_pdf_document_width'] = $cq_dam_config_annotation_pdf_document_width;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_document_height
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfDocumentHeight()
    {
        return $this->container['cq_dam_config_annotation_pdf_document_height'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_document_height
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_document_height cq_dam_config_annotation_pdf_document_height
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfDocumentHeight($cq_dam_config_annotation_pdf_document_height)
    {
        $this->container['cq_dam_config_annotation_pdf_document_height'] = $cq_dam_config_annotation_pdf_document_height;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_document_padding_horizontal
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfDocumentPaddingHorizontal()
    {
        return $this->container['cq_dam_config_annotation_pdf_document_padding_horizontal'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_document_padding_horizontal
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_document_padding_horizontal cq_dam_config_annotation_pdf_document_padding_horizontal
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfDocumentPaddingHorizontal($cq_dam_config_annotation_pdf_document_padding_horizontal)
    {
        $this->container['cq_dam_config_annotation_pdf_document_padding_horizontal'] = $cq_dam_config_annotation_pdf_document_padding_horizontal;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_document_padding_vertical
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfDocumentPaddingVertical()
    {
        return $this->container['cq_dam_config_annotation_pdf_document_padding_vertical'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_document_padding_vertical
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_document_padding_vertical cq_dam_config_annotation_pdf_document_padding_vertical
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfDocumentPaddingVertical($cq_dam_config_annotation_pdf_document_padding_vertical)
    {
        $this->container['cq_dam_config_annotation_pdf_document_padding_vertical'] = $cq_dam_config_annotation_pdf_document_padding_vertical;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_font_size
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfFontSize()
    {
        return $this->container['cq_dam_config_annotation_pdf_font_size'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_font_size
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_font_size cq_dam_config_annotation_pdf_font_size
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfFontSize($cq_dam_config_annotation_pdf_font_size)
    {
        $this->container['cq_dam_config_annotation_pdf_font_size'] = $cq_dam_config_annotation_pdf_font_size;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_font_color
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getCqDamConfigAnnotationPdfFontColor()
    {
        return $this->container['cq_dam_config_annotation_pdf_font_color'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_font_color
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $cq_dam_config_annotation_pdf_font_color cq_dam_config_annotation_pdf_font_color
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfFontColor($cq_dam_config_annotation_pdf_font_color)
    {
        $this->container['cq_dam_config_annotation_pdf_font_color'] = $cq_dam_config_annotation_pdf_font_color;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_font_family
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getCqDamConfigAnnotationPdfFontFamily()
    {
        return $this->container['cq_dam_config_annotation_pdf_font_family'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_font_family
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $cq_dam_config_annotation_pdf_font_family cq_dam_config_annotation_pdf_font_family
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfFontFamily($cq_dam_config_annotation_pdf_font_family)
    {
        $this->container['cq_dam_config_annotation_pdf_font_family'] = $cq_dam_config_annotation_pdf_font_family;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_font_light
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getCqDamConfigAnnotationPdfFontLight()
    {
        return $this->container['cq_dam_config_annotation_pdf_font_light'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_font_light
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $cq_dam_config_annotation_pdf_font_light cq_dam_config_annotation_pdf_font_light
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfFontLight($cq_dam_config_annotation_pdf_font_light)
    {
        $this->container['cq_dam_config_annotation_pdf_font_light'] = $cq_dam_config_annotation_pdf_font_light;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_margin_text_image
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfMarginTextImage()
    {
        return $this->container['cq_dam_config_annotation_pdf_margin_text_image'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_margin_text_image
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_margin_text_image cq_dam_config_annotation_pdf_margin_text_image
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfMarginTextImage($cq_dam_config_annotation_pdf_margin_text_image)
    {
        $this->container['cq_dam_config_annotation_pdf_margin_text_image'] = $cq_dam_config_annotation_pdf_margin_text_image;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_min_image_height
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfMinImageHeight()
    {
        return $this->container['cq_dam_config_annotation_pdf_min_image_height'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_min_image_height
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_min_image_height cq_dam_config_annotation_pdf_min_image_height
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfMinImageHeight($cq_dam_config_annotation_pdf_min_image_height)
    {
        $this->container['cq_dam_config_annotation_pdf_min_image_height'] = $cq_dam_config_annotation_pdf_min_image_height;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_review_status_width
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfReviewStatusWidth()
    {
        return $this->container['cq_dam_config_annotation_pdf_review_status_width'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_review_status_width
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_review_status_width cq_dam_config_annotation_pdf_review_status_width
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfReviewStatusWidth($cq_dam_config_annotation_pdf_review_status_width)
    {
        $this->container['cq_dam_config_annotation_pdf_review_status_width'] = $cq_dam_config_annotation_pdf_review_status_width;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_review_status_color_approved
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getCqDamConfigAnnotationPdfReviewStatusColorApproved()
    {
        return $this->container['cq_dam_config_annotation_pdf_review_status_color_approved'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_review_status_color_approved
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $cq_dam_config_annotation_pdf_review_status_color_approved cq_dam_config_annotation_pdf_review_status_color_approved
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfReviewStatusColorApproved($cq_dam_config_annotation_pdf_review_status_color_approved)
    {
        $this->container['cq_dam_config_annotation_pdf_review_status_color_approved'] = $cq_dam_config_annotation_pdf_review_status_color_approved;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_review_status_color_rejected
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getCqDamConfigAnnotationPdfReviewStatusColorRejected()
    {
        return $this->container['cq_dam_config_annotation_pdf_review_status_color_rejected'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_review_status_color_rejected
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $cq_dam_config_annotation_pdf_review_status_color_rejected cq_dam_config_annotation_pdf_review_status_color_rejected
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfReviewStatusColorRejected($cq_dam_config_annotation_pdf_review_status_color_rejected)
    {
        $this->container['cq_dam_config_annotation_pdf_review_status_color_rejected'] = $cq_dam_config_annotation_pdf_review_status_color_rejected;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_review_status_color_changes_requested
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyString|null
     */
    public function getCqDamConfigAnnotationPdfReviewStatusColorChangesRequested()
    {
        return $this->container['cq_dam_config_annotation_pdf_review_status_color_changes_requested'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_review_status_color_changes_requested
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyString|null $cq_dam_config_annotation_pdf_review_status_color_changes_requested cq_dam_config_annotation_pdf_review_status_color_changes_requested
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfReviewStatusColorChangesRequested($cq_dam_config_annotation_pdf_review_status_color_changes_requested)
    {
        $this->container['cq_dam_config_annotation_pdf_review_status_color_changes_requested'] = $cq_dam_config_annotation_pdf_review_status_color_changes_requested;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_annotation_marker_width
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfAnnotationMarkerWidth()
    {
        return $this->container['cq_dam_config_annotation_pdf_annotation_marker_width'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_annotation_marker_width
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_annotation_marker_width cq_dam_config_annotation_pdf_annotation_marker_width
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfAnnotationMarkerWidth($cq_dam_config_annotation_pdf_annotation_marker_width)
    {
        $this->container['cq_dam_config_annotation_pdf_annotation_marker_width'] = $cq_dam_config_annotation_pdf_annotation_marker_width;

        return $this;
    }

    /**
     * Gets cq_dam_config_annotation_pdf_asset_minheight
     *
     * @return \OpenAPI\Client\Model\ConfigNodePropertyInteger|null
     */
    public function getCqDamConfigAnnotationPdfAssetMinheight()
    {
        return $this->container['cq_dam_config_annotation_pdf_asset_minheight'];
    }

    /**
     * Sets cq_dam_config_annotation_pdf_asset_minheight
     *
     * @param \OpenAPI\Client\Model\ConfigNodePropertyInteger|null $cq_dam_config_annotation_pdf_asset_minheight cq_dam_config_annotation_pdf_asset_minheight
     *
     * @return $this
     */
    public function setCqDamConfigAnnotationPdfAssetMinheight($cq_dam_config_annotation_pdf_asset_minheight)
    {
        $this->container['cq_dam_config_annotation_pdf_asset_minheight'] = $cq_dam_config_annotation_pdf_asset_minheight;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }
}

