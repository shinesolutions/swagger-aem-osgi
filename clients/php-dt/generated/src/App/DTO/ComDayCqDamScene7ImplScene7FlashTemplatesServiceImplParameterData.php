<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl
 */
class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplParameterData
{
    /**
     * @DTA\Data(subset="query", field="propertylist", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     */
    public ?array $propertylist = null;

    /**
     * @DTA\Data(subset="query", field="scene7FlashTemplates.rti", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $scene7_flash_templates_rti = null;

    /**
     * @DTA\Data(subset="query", field="scene7FlashTemplates.rb", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $scene7_flash_templates_rb = null;

    /**
     * @DTA\Data(subset="query", field="scene7FlashTemplates.rurl", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $scene7_flash_templates_rurl = null;

    /**
     * @DTA\Data(subset="query", field="scene7FlashTemplates.rsi", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $scene7_flash_templates_rsi = null;

    /**
     * @DTA\Data(subset="query", field="post", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $post = null;

    /**
     * @DTA\Data(subset="query", field="apply", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $apply = null;

    /**
     * @DTA\Data(subset="query", field="$location", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $location = null;

    /**
     * @DTA\Data(subset="query", field="action", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $action = null;

    /**
     * @DTA\Data(subset="query", field="delete", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $delete = null;

    /**
     * @DTA\Data(subset="query", field="scene7FlashTemplate.urlFormatParameter", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $scene7_flash_template_url_format_parameter = null;

}
