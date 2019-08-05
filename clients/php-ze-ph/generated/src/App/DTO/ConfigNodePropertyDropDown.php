<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConfigNodePropertyDropDown
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
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDownType::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyDropDownType::class})
     * @var \App\DTO\ConfigNodePropertyDropDownType
     */
    public $type;
    /**
     * Property value
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"object"})
     * @var object
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
