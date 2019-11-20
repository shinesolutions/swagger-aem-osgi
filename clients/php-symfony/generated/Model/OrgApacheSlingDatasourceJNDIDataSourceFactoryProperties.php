<?php
/**
 * OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
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
 * Class representing the OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("datasource.name")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $datasourceName;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("datasource.svc.prop.name")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $datasourceSvcPropName;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("datasource.jndi.name")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $datasourceJndiName;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("jndi.properties")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $jndiProperties;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->datasourceName = isset($data['datasourceName']) ? $data['datasourceName'] : null;
        $this->datasourceSvcPropName = isset($data['datasourceSvcPropName']) ? $data['datasourceSvcPropName'] : null;
        $this->datasourceJndiName = isset($data['datasourceJndiName']) ? $data['datasourceJndiName'] : null;
        $this->jndiProperties = isset($data['jndiProperties']) ? $data['jndiProperties'] : null;
    }

    /**
     * Gets datasourceName.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getDatasourceName()
    {
        return $this->datasourceName;
    }

    /**
     * Sets datasourceName.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $datasourceName
     *
     * @return $this
     */
    public function setDatasourceName(ConfigNodePropertyString $datasourceName = null)
    {
        $this->datasourceName = $datasourceName;

        return $this;
    }

    /**
     * Gets datasourceSvcPropName.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getDatasourceSvcPropName()
    {
        return $this->datasourceSvcPropName;
    }

    /**
     * Sets datasourceSvcPropName.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $datasourceSvcPropName
     *
     * @return $this
     */
    public function setDatasourceSvcPropName(ConfigNodePropertyString $datasourceSvcPropName = null)
    {
        $this->datasourceSvcPropName = $datasourceSvcPropName;

        return $this;
    }

    /**
     * Gets datasourceJndiName.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getDatasourceJndiName()
    {
        return $this->datasourceJndiName;
    }

    /**
     * Sets datasourceJndiName.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $datasourceJndiName
     *
     * @return $this
     */
    public function setDatasourceJndiName(ConfigNodePropertyString $datasourceJndiName = null)
    {
        $this->datasourceJndiName = $datasourceJndiName;

        return $this;
    }

    /**
     * Gets jndiProperties.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getJndiProperties()
    {
        return $this->jndiProperties;
    }

    /**
     * Sets jndiProperties.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $jndiProperties
     *
     * @return $this
     */
    public function setJndiProperties(ConfigNodePropertyArray $jndiProperties = null)
    {
        $this->jndiProperties = $jndiProperties;

        return $this;
    }
}

