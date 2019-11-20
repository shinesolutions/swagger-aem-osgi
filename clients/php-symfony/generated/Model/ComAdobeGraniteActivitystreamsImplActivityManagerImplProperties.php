<?php
/**
 * ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("aggregate.relationships")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $aggregateRelationships;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("aggregate.descend.virtual")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $aggregateDescendVirtual;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->aggregateRelationships = isset($data['aggregateRelationships']) ? $data['aggregateRelationships'] : null;
        $this->aggregateDescendVirtual = isset($data['aggregateDescendVirtual']) ? $data['aggregateDescendVirtual'] : null;
    }

    /**
     * Gets aggregateRelationships.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getAggregateRelationships()
    {
        return $this->aggregateRelationships;
    }

    /**
     * Sets aggregateRelationships.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $aggregateRelationships
     *
     * @return $this
     */
    public function setAggregateRelationships(ConfigNodePropertyArray $aggregateRelationships = null)
    {
        $this->aggregateRelationships = $aggregateRelationships;

        return $this;
    }

    /**
     * Gets aggregateDescendVirtual.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getAggregateDescendVirtual()
    {
        return $this->aggregateDescendVirtual;
    }

    /**
     * Sets aggregateDescendVirtual.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $aggregateDescendVirtual
     *
     * @return $this
     */
    public function setAggregateDescendVirtual(ConfigNodePropertyBoolean $aggregateDescendVirtual = null)
    {
        $this->aggregateDescendVirtual = $aggregateDescendVirtual;

        return $this;
    }
}

