<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConfigNodePropertyFloat
{
    /**
     * property name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * True if optional
     * @DTA\Data(field="optional", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $optional;
    /**
     * True if property is set
     * @DTA\Data(field="is_set", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $is_set;
    /**
     * Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $type;
    /**
     * Property value
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $value;
    /**
     * Property description
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $description;
}
