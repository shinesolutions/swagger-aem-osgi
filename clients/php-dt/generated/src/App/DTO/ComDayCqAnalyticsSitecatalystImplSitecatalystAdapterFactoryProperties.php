<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties
{
    /**
     * @DTA\Data(field="cq.analytics.adapterfactory.contextstores", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_analytics_adapterfactory_contextstores = null;

}
