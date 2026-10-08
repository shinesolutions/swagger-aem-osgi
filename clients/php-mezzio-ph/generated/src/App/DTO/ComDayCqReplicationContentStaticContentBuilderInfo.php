<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqReplicationContentStaticContentBuilderInfo
{
    /**
     * @DTA\Data(field="pid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pid;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * @DTA\Data(field="properties", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ComDayCqReplicationContentStaticContentBuilderProperties::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ComDayCqReplicationContentStaticContentBuilderProperties::class})
     * @var \App\DTO\ComDayCqReplicationContentStaticContentBuilderProperties|null
     */
    public $properties;

}
