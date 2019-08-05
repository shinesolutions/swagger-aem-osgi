<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
{
    /**
     * @DTA\Data(field="workflowpackageinfoprovider.filter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $workflowpackageinfoprovider_filter;
    /**
     * @DTA\Data(field="workflowpackageinfoprovider.filter.rootpath", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $workflowpackageinfoprovider_filter_rootpath;
}
