<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqPollingImporterImplManagedPollConfigImplInfo
{
    /**
     * @DTA\Data(field="pid", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $pid;
    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $title;
    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $description;
    /**
     * @DTA\Data(field="properties", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ComDayCqPollingImporterImplManagedPollConfigImplProperties::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ComDayCqPollingImporterImplManagedPollConfigImplProperties::class})
     * @var \App\DTO\ComDayCqPollingImporterImplManagedPollConfigImplProperties
     */
    public $properties;
}
