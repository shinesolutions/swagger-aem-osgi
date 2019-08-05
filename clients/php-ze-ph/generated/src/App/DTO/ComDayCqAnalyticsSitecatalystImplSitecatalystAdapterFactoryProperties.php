<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties
{
    /**
     * @DTA\Data(field="cq.analytics.adapterfactory.contextstores", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_analytics_adapterfactory_contextstores;
}
