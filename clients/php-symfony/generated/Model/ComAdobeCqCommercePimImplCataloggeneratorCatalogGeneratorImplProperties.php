<?php
/**
 * ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
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
 * Class representing the ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("cq.commerce.cataloggenerator.bucketsize")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $cqCommerceCataloggeneratorBucketsize;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("cq.commerce.cataloggenerator.bucketname")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $cqCommerceCataloggeneratorBucketname;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("cq.commerce.cataloggenerator.excludedtemplateproperties")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $cqCommerceCataloggeneratorExcludedtemplateproperties;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->cqCommerceCataloggeneratorBucketsize = isset($data['cqCommerceCataloggeneratorBucketsize']) ? $data['cqCommerceCataloggeneratorBucketsize'] : null;
        $this->cqCommerceCataloggeneratorBucketname = isset($data['cqCommerceCataloggeneratorBucketname']) ? $data['cqCommerceCataloggeneratorBucketname'] : null;
        $this->cqCommerceCataloggeneratorExcludedtemplateproperties = isset($data['cqCommerceCataloggeneratorExcludedtemplateproperties']) ? $data['cqCommerceCataloggeneratorExcludedtemplateproperties'] : null;
    }

    /**
     * Gets cqCommerceCataloggeneratorBucketsize.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getCqCommerceCataloggeneratorBucketsize()
    {
        return $this->cqCommerceCataloggeneratorBucketsize;
    }

    /**
     * Sets cqCommerceCataloggeneratorBucketsize.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $cqCommerceCataloggeneratorBucketsize
     *
     * @return $this
     */
    public function setCqCommerceCataloggeneratorBucketsize(ConfigNodePropertyInteger $cqCommerceCataloggeneratorBucketsize = null)
    {
        $this->cqCommerceCataloggeneratorBucketsize = $cqCommerceCataloggeneratorBucketsize;

        return $this;
    }

    /**
     * Gets cqCommerceCataloggeneratorBucketname.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getCqCommerceCataloggeneratorBucketname()
    {
        return $this->cqCommerceCataloggeneratorBucketname;
    }

    /**
     * Sets cqCommerceCataloggeneratorBucketname.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $cqCommerceCataloggeneratorBucketname
     *
     * @return $this
     */
    public function setCqCommerceCataloggeneratorBucketname(ConfigNodePropertyString $cqCommerceCataloggeneratorBucketname = null)
    {
        $this->cqCommerceCataloggeneratorBucketname = $cqCommerceCataloggeneratorBucketname;

        return $this;
    }

    /**
     * Gets cqCommerceCataloggeneratorExcludedtemplateproperties.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getCqCommerceCataloggeneratorExcludedtemplateproperties()
    {
        return $this->cqCommerceCataloggeneratorExcludedtemplateproperties;
    }

    /**
     * Sets cqCommerceCataloggeneratorExcludedtemplateproperties.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $cqCommerceCataloggeneratorExcludedtemplateproperties
     *
     * @return $this
     */
    public function setCqCommerceCataloggeneratorExcludedtemplateproperties(ConfigNodePropertyArray $cqCommerceCataloggeneratorExcludedtemplateproperties = null)
    {
        $this->cqCommerceCataloggeneratorExcludedtemplateproperties = $cqCommerceCataloggeneratorExcludedtemplateproperties;

        return $this;
    }
}

