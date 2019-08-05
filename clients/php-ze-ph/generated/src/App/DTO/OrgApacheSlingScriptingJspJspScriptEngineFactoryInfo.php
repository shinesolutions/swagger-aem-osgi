<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::class})
     * @var \App\DTO\OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties
     */
    public $properties;
    /**
     * @DTA\Data(field="bundle_location", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $bundle_location;
    /**
     * @DTA\Data(field="service_location", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $service_location;
}
