<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConfigNodePropertyDropDownType
{
    /**
     * Drop Down label
     * @DTA\Data(field="labels", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"object"})
     * @var object
     */
    public $labels;
    /**
     * Drown Down value
     * @DTA\Data(field="values", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"object"})
     * @var object
     */
    public $values;
}
