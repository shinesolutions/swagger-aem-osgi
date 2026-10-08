<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver
 */
class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverQueryData
{
    /**
     * @DTA\Data(field="apply", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $apply;

    /**
     * @DTA\Data(field="agentName", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $agent_name;

    /**
     * @DTA\Data(field="serviceName", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $service_name;

    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $delete;

    /**
     * @DTA\Data(field="enabled", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $enabled;

    /**
     * @DTA\Data(field="propertylist", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @var string[]|null
     */
    public $propertylist;

    /**
     * @DTA\Data(field="serviceUser.target", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $service_user_target;

    /**
     * @DTA\Data(field="post", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $post;

    /**
     * @DTA\Data(field="$location", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $location;

    /**
     * @DTA\Data(field="propertyNames", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $property_names;

    /**
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $action;

    /**
     * @DTA\Data(field="distributionDelay", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $distribution_delay;

    /**
     * @DTA\Data(field="observedPath", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $observed_path;

    /**
     * @DTA\Data(field="diffPath", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $diff_path;

}
