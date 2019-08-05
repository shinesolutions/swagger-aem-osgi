<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties
{
    /**
     * @DTA\Data(field="formsManagerConfig.includeOOTBTemplates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $forms_manager_config_include_ootb_templates;
    /**
     * @DTA\Data(field="formsManagerConfig.includeDeprecatedTemplates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $forms_manager_config_include_deprecated_templates;
}
