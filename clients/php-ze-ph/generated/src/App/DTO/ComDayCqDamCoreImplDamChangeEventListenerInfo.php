<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqDamCoreImplDamChangeEventListenerInfo
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ComDayCqDamCoreImplDamChangeEventListenerProperties::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ComDayCqDamCoreImplDamChangeEventListenerProperties::class})
     * @var \App\DTO\ComDayCqDamCoreImplDamChangeEventListenerProperties
     */
    public $properties;
}
