<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties
{
    /**
     * @DTA\Data(field="reportingservices.url", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $reportingservices_url;
}
