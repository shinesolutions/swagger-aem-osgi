<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties
{
    /**
     * @DTA\Data(field="formsManagerConfig.includeOOTBTemplates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $forms_manager_config_include_ootb_templates = null;

    /**
     * @DTA\Data(field="formsManagerConfig.includeDeprecatedTemplates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $forms_manager_config_include_deprecated_templates = null;

}
