<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties
{
    /**
     * @DTA\Data(field="communities.integration.livefyre.sling.event.filter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $communities_integration_livefyre_sling_event_filter;
}
