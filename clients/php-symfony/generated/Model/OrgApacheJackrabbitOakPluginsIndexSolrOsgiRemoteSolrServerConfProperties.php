<?php
/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
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
 * Class representing the OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("solr.http.url")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $solrHttpUrl;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("solr.zk.host")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $solrZkHost;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("solr.collection")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $solrCollection;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("solr.socket.timeout")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $solrSocketTimeout;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("solr.connection.timeout")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $solrConnectionTimeout;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("solr.shards.no")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $solrShardsNo;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("solr.replication.factor")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $solrReplicationFactor;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("solr.conf.dir")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $solrConfDir;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->solrHttpUrl = isset($data['solrHttpUrl']) ? $data['solrHttpUrl'] : null;
        $this->solrZkHost = isset($data['solrZkHost']) ? $data['solrZkHost'] : null;
        $this->solrCollection = isset($data['solrCollection']) ? $data['solrCollection'] : null;
        $this->solrSocketTimeout = isset($data['solrSocketTimeout']) ? $data['solrSocketTimeout'] : null;
        $this->solrConnectionTimeout = isset($data['solrConnectionTimeout']) ? $data['solrConnectionTimeout'] : null;
        $this->solrShardsNo = isset($data['solrShardsNo']) ? $data['solrShardsNo'] : null;
        $this->solrReplicationFactor = isset($data['solrReplicationFactor']) ? $data['solrReplicationFactor'] : null;
        $this->solrConfDir = isset($data['solrConfDir']) ? $data['solrConfDir'] : null;
    }

    /**
     * Gets solrHttpUrl.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getSolrHttpUrl()
    {
        return $this->solrHttpUrl;
    }

    /**
     * Sets solrHttpUrl.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $solrHttpUrl
     *
     * @return $this
     */
    public function setSolrHttpUrl(ConfigNodePropertyString $solrHttpUrl = null)
    {
        $this->solrHttpUrl = $solrHttpUrl;

        return $this;
    }

    /**
     * Gets solrZkHost.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getSolrZkHost()
    {
        return $this->solrZkHost;
    }

    /**
     * Sets solrZkHost.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $solrZkHost
     *
     * @return $this
     */
    public function setSolrZkHost(ConfigNodePropertyString $solrZkHost = null)
    {
        $this->solrZkHost = $solrZkHost;

        return $this;
    }

    /**
     * Gets solrCollection.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getSolrCollection()
    {
        return $this->solrCollection;
    }

    /**
     * Sets solrCollection.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $solrCollection
     *
     * @return $this
     */
    public function setSolrCollection(ConfigNodePropertyString $solrCollection = null)
    {
        $this->solrCollection = $solrCollection;

        return $this;
    }

    /**
     * Gets solrSocketTimeout.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getSolrSocketTimeout()
    {
        return $this->solrSocketTimeout;
    }

    /**
     * Sets solrSocketTimeout.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $solrSocketTimeout
     *
     * @return $this
     */
    public function setSolrSocketTimeout(ConfigNodePropertyInteger $solrSocketTimeout = null)
    {
        $this->solrSocketTimeout = $solrSocketTimeout;

        return $this;
    }

    /**
     * Gets solrConnectionTimeout.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getSolrConnectionTimeout()
    {
        return $this->solrConnectionTimeout;
    }

    /**
     * Sets solrConnectionTimeout.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $solrConnectionTimeout
     *
     * @return $this
     */
    public function setSolrConnectionTimeout(ConfigNodePropertyInteger $solrConnectionTimeout = null)
    {
        $this->solrConnectionTimeout = $solrConnectionTimeout;

        return $this;
    }

    /**
     * Gets solrShardsNo.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getSolrShardsNo()
    {
        return $this->solrShardsNo;
    }

    /**
     * Sets solrShardsNo.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $solrShardsNo
     *
     * @return $this
     */
    public function setSolrShardsNo(ConfigNodePropertyInteger $solrShardsNo = null)
    {
        $this->solrShardsNo = $solrShardsNo;

        return $this;
    }

    /**
     * Gets solrReplicationFactor.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getSolrReplicationFactor()
    {
        return $this->solrReplicationFactor;
    }

    /**
     * Sets solrReplicationFactor.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $solrReplicationFactor
     *
     * @return $this
     */
    public function setSolrReplicationFactor(ConfigNodePropertyInteger $solrReplicationFactor = null)
    {
        $this->solrReplicationFactor = $solrReplicationFactor;

        return $this;
    }

    /**
     * Gets solrConfDir.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getSolrConfDir()
    {
        return $this->solrConfDir;
    }

    /**
     * Sets solrConfDir.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $solrConfDir
     *
     * @return $this
     */
    public function setSolrConfDir(ConfigNodePropertyString $solrConfDir = null)
    {
        $this->solrConfDir = $solrConfDir;

        return $this;
    }
}

