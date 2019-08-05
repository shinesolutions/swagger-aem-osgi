<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::class})
     * @var \App\DTO\ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties
     */
    public $properties;
}
