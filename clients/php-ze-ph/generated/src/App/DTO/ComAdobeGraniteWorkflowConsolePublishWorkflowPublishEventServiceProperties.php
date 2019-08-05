<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties
{
    /**
     * @DTA\Data(field="granite.workflow.WorkflowPublishEventService.enabled", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $granite_workflow_workflow_publish_event_service_enabled;
}
