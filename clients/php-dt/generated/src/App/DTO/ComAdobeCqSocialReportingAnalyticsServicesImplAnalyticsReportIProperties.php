<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
{
    /**
     * @DTA\Data(field="cq.social.reporting.analytics.polling.importer.interval", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_social_reporting_analytics_polling_importer_interval = null;

    /**
     * @DTA\Data(field="cq.social.reporting.analytics.polling.importer.pageSize", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $cq_social_reporting_analytics_polling_importer_page_size = null;

}
