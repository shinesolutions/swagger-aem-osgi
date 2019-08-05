<?php
/**
 * ConfigNodePropertyDropDown
 */
namespace OpenAPIServer\Model;

/**
 * ConfigNodePropertyDropDown
 */
class ConfigNodePropertyDropDown {

    /** @var string $name property name*/
    private $name;

    /** @var bool $optional True if optional*/
    private $optional;

    /** @var bool $isSet True if property is set*/
    private $isSet;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDownType $type */
    private $type;

    /** @var object $value Property value*/
    private $value;

    /** @var string $description Property description*/
    private $description;

}
