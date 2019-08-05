<?php
/**
 * ConfigNodePropertyDropDown
 */
namespace app\Models;

/**
 * ConfigNodePropertyDropDown
 */
class ConfigNodePropertyDropDown {

    /** @var string $name property name*/
    private $name;

    /** @var bool $optional True if optional*/
    private $optional;

    /** @var bool $is_set True if property is set*/
    private $is_set;

    /** @var \app\Models\ConfigNodePropertyDropDownType $type */
    private $type;

    /** @var object $value Property value*/
    private $value;

    /** @var string $description Property description*/
    private $description;

}
