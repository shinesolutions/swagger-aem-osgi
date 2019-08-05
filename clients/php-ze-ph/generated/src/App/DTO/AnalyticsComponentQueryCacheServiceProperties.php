<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AnalyticsComponentQueryCacheServiceProperties
{
    /**
     * @DTA\Data(field="cq.analytics.component.query.cache.size", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_analytics_component_query_cache_size;
}
