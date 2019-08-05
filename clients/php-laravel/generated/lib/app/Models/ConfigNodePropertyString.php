<?php
/**
 * ConfigNodePropertyString
 */
namespace app\Models;

/**
 * ConfigNodePropertyString
 */
class ConfigNodePropertyString {

    /** @var string $name property name*/
    private $name;

    /** @var bool $optional True if optional*/
    private $optional;

    /** @var bool $is_set True if property is set*/
    private $is_set;

    /** @var int $type Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)*/
    private $type;

    /** @var string $value Property value*/
    private $value;

    /** @var string $description Property description*/
    private $description;

}
