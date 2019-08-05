<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
{
    /**
     * @DTA\Data(field="cq.social.reporting.analytics.polling.importer.interval", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_social_reporting_analytics_polling_importer_interval;
    /**
     * @DTA\Data(field="cq.social.reporting.analytics.polling.importer.pageSize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $cq_social_reporting_analytics_polling_importer_page_size;
}
