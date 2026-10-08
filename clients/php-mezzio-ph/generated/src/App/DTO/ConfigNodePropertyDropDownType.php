<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConfigNodePropertyDropDownType
{
    /**
     * Drop Down label
     * @DTA\Data(field="labels", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @var mixed|null
     */
    public $labels;

    /**
     * Drown Down value
     * @DTA\Data(field="values", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @var mixed|null
     */
    public $values;

}
