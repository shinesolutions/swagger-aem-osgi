<?php
/**
 * OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties
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
 * Class representing the OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("dir")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $dir;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->dir = isset($data['dir']) ? $data['dir'] : null;
    }

    /**
     * Gets dir.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getDir()
    {
        return $this->dir;
    }

    /**
     * Sets dir.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $dir
     *
     * @return $this
     */
    public function setDir(ConfigNodePropertyString $dir = null)
    {
        $this->dir = $dir;

        return $this;
    }
}

