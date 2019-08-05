<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqReplicationContentStaticContentBuilderInfo
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ComDayCqReplicationContentStaticContentBuilderProperties::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ComDayCqReplicationContentStaticContentBuilderProperties::class})
     * @var \App\DTO\ComDayCqReplicationContentStaticContentBuilderProperties
     */
    public $properties;
}
