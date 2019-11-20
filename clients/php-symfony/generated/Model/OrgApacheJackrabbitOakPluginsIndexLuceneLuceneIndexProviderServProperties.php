<?php
/**
 * OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties
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
 * Class representing the OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("disabled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $disabled;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("debug")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $debug;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("localIndexDir")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $localIndexDir;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("enableOpenIndexAsync")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $enableOpenIndexAsync;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("threadPoolSize")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $threadPoolSize;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("prefetchIndexFiles")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $prefetchIndexFiles;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("extractedTextCacheSizeInMB")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $extractedTextCacheSizeInMB;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("extractedTextCacheExpiryInSecs")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $extractedTextCacheExpiryInSecs;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("alwaysUsePreExtractedCache")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $alwaysUsePreExtractedCache;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("booleanClauseLimit")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $booleanClauseLimit;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("enableHybridIndexing")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $enableHybridIndexing;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("hybridQueueSize")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $hybridQueueSize;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("disableStoredIndexDefinition")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $disableStoredIndexDefinition;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("deletedBlobsCollectionEnabled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $deletedBlobsCollectionEnabled;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("propIndexCleanerIntervalInSecs")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $propIndexCleanerIntervalInSecs;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("enableSingleBlobIndexFiles")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $enableSingleBlobIndexFiles;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->disabled = isset($data['disabled']) ? $data['disabled'] : null;
        $this->debug = isset($data['debug']) ? $data['debug'] : null;
        $this->localIndexDir = isset($data['localIndexDir']) ? $data['localIndexDir'] : null;
        $this->enableOpenIndexAsync = isset($data['enableOpenIndexAsync']) ? $data['enableOpenIndexAsync'] : null;
        $this->threadPoolSize = isset($data['threadPoolSize']) ? $data['threadPoolSize'] : null;
        $this->prefetchIndexFiles = isset($data['prefetchIndexFiles']) ? $data['prefetchIndexFiles'] : null;
        $this->extractedTextCacheSizeInMB = isset($data['extractedTextCacheSizeInMB']) ? $data['extractedTextCacheSizeInMB'] : null;
        $this->extractedTextCacheExpiryInSecs = isset($data['extractedTextCacheExpiryInSecs']) ? $data['extractedTextCacheExpiryInSecs'] : null;
        $this->alwaysUsePreExtractedCache = isset($data['alwaysUsePreExtractedCache']) ? $data['alwaysUsePreExtractedCache'] : null;
        $this->booleanClauseLimit = isset($data['booleanClauseLimit']) ? $data['booleanClauseLimit'] : null;
        $this->enableHybridIndexing = isset($data['enableHybridIndexing']) ? $data['enableHybridIndexing'] : null;
        $this->hybridQueueSize = isset($data['hybridQueueSize']) ? $data['hybridQueueSize'] : null;
        $this->disableStoredIndexDefinition = isset($data['disableStoredIndexDefinition']) ? $data['disableStoredIndexDefinition'] : null;
        $this->deletedBlobsCollectionEnabled = isset($data['deletedBlobsCollectionEnabled']) ? $data['deletedBlobsCollectionEnabled'] : null;
        $this->propIndexCleanerIntervalInSecs = isset($data['propIndexCleanerIntervalInSecs']) ? $data['propIndexCleanerIntervalInSecs'] : null;
        $this->enableSingleBlobIndexFiles = isset($data['enableSingleBlobIndexFiles']) ? $data['enableSingleBlobIndexFiles'] : null;
    }

    /**
     * Gets disabled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getDisabled()
    {
        return $this->disabled;
    }

    /**
     * Sets disabled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $disabled
     *
     * @return $this
     */
    public function setDisabled(ConfigNodePropertyBoolean $disabled = null)
    {
        $this->disabled = $disabled;

        return $this;
    }

    /**
     * Gets debug.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getDebug()
    {
        return $this->debug;
    }

    /**
     * Sets debug.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $debug
     *
     * @return $this
     */
    public function setDebug(ConfigNodePropertyBoolean $debug = null)
    {
        $this->debug = $debug;

        return $this;
    }

    /**
     * Gets localIndexDir.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getLocalIndexDir()
    {
        return $this->localIndexDir;
    }

    /**
     * Sets localIndexDir.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $localIndexDir
     *
     * @return $this
     */
    public function setLocalIndexDir(ConfigNodePropertyString $localIndexDir = null)
    {
        $this->localIndexDir = $localIndexDir;

        return $this;
    }

    /**
     * Gets enableOpenIndexAsync.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getEnableOpenIndexAsync()
    {
        return $this->enableOpenIndexAsync;
    }

    /**
     * Sets enableOpenIndexAsync.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $enableOpenIndexAsync
     *
     * @return $this
     */
    public function setEnableOpenIndexAsync(ConfigNodePropertyBoolean $enableOpenIndexAsync = null)
    {
        $this->enableOpenIndexAsync = $enableOpenIndexAsync;

        return $this;
    }

    /**
     * Gets threadPoolSize.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getThreadPoolSize()
    {
        return $this->threadPoolSize;
    }

    /**
     * Sets threadPoolSize.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $threadPoolSize
     *
     * @return $this
     */
    public function setThreadPoolSize(ConfigNodePropertyInteger $threadPoolSize = null)
    {
        $this->threadPoolSize = $threadPoolSize;

        return $this;
    }

    /**
     * Gets prefetchIndexFiles.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getPrefetchIndexFiles()
    {
        return $this->prefetchIndexFiles;
    }

    /**
     * Sets prefetchIndexFiles.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $prefetchIndexFiles
     *
     * @return $this
     */
    public function setPrefetchIndexFiles(ConfigNodePropertyBoolean $prefetchIndexFiles = null)
    {
        $this->prefetchIndexFiles = $prefetchIndexFiles;

        return $this;
    }

    /**
     * Gets extractedTextCacheSizeInMB.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getExtractedTextCacheSizeInMB()
    {
        return $this->extractedTextCacheSizeInMB;
    }

    /**
     * Sets extractedTextCacheSizeInMB.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $extractedTextCacheSizeInMB
     *
     * @return $this
     */
    public function setExtractedTextCacheSizeInMB(ConfigNodePropertyInteger $extractedTextCacheSizeInMB = null)
    {
        $this->extractedTextCacheSizeInMB = $extractedTextCacheSizeInMB;

        return $this;
    }

    /**
     * Gets extractedTextCacheExpiryInSecs.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getExtractedTextCacheExpiryInSecs()
    {
        return $this->extractedTextCacheExpiryInSecs;
    }

    /**
     * Sets extractedTextCacheExpiryInSecs.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $extractedTextCacheExpiryInSecs
     *
     * @return $this
     */
    public function setExtractedTextCacheExpiryInSecs(ConfigNodePropertyInteger $extractedTextCacheExpiryInSecs = null)
    {
        $this->extractedTextCacheExpiryInSecs = $extractedTextCacheExpiryInSecs;

        return $this;
    }

    /**
     * Gets alwaysUsePreExtractedCache.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getAlwaysUsePreExtractedCache()
    {
        return $this->alwaysUsePreExtractedCache;
    }

    /**
     * Sets alwaysUsePreExtractedCache.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $alwaysUsePreExtractedCache
     *
     * @return $this
     */
    public function setAlwaysUsePreExtractedCache(ConfigNodePropertyBoolean $alwaysUsePreExtractedCache = null)
    {
        $this->alwaysUsePreExtractedCache = $alwaysUsePreExtractedCache;

        return $this;
    }

    /**
     * Gets booleanClauseLimit.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getBooleanClauseLimit()
    {
        return $this->booleanClauseLimit;
    }

    /**
     * Sets booleanClauseLimit.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $booleanClauseLimit
     *
     * @return $this
     */
    public function setBooleanClauseLimit(ConfigNodePropertyInteger $booleanClauseLimit = null)
    {
        $this->booleanClauseLimit = $booleanClauseLimit;

        return $this;
    }

    /**
     * Gets enableHybridIndexing.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getEnableHybridIndexing()
    {
        return $this->enableHybridIndexing;
    }

    /**
     * Sets enableHybridIndexing.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $enableHybridIndexing
     *
     * @return $this
     */
    public function setEnableHybridIndexing(ConfigNodePropertyBoolean $enableHybridIndexing = null)
    {
        $this->enableHybridIndexing = $enableHybridIndexing;

        return $this;
    }

    /**
     * Gets hybridQueueSize.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getHybridQueueSize()
    {
        return $this->hybridQueueSize;
    }

    /**
     * Sets hybridQueueSize.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $hybridQueueSize
     *
     * @return $this
     */
    public function setHybridQueueSize(ConfigNodePropertyInteger $hybridQueueSize = null)
    {
        $this->hybridQueueSize = $hybridQueueSize;

        return $this;
    }

    /**
     * Gets disableStoredIndexDefinition.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getDisableStoredIndexDefinition()
    {
        return $this->disableStoredIndexDefinition;
    }

    /**
     * Sets disableStoredIndexDefinition.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $disableStoredIndexDefinition
     *
     * @return $this
     */
    public function setDisableStoredIndexDefinition(ConfigNodePropertyBoolean $disableStoredIndexDefinition = null)
    {
        $this->disableStoredIndexDefinition = $disableStoredIndexDefinition;

        return $this;
    }

    /**
     * Gets deletedBlobsCollectionEnabled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getDeletedBlobsCollectionEnabled()
    {
        return $this->deletedBlobsCollectionEnabled;
    }

    /**
     * Sets deletedBlobsCollectionEnabled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $deletedBlobsCollectionEnabled
     *
     * @return $this
     */
    public function setDeletedBlobsCollectionEnabled(ConfigNodePropertyBoolean $deletedBlobsCollectionEnabled = null)
    {
        $this->deletedBlobsCollectionEnabled = $deletedBlobsCollectionEnabled;

        return $this;
    }

    /**
     * Gets propIndexCleanerIntervalInSecs.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getPropIndexCleanerIntervalInSecs()
    {
        return $this->propIndexCleanerIntervalInSecs;
    }

    /**
     * Sets propIndexCleanerIntervalInSecs.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $propIndexCleanerIntervalInSecs
     *
     * @return $this
     */
    public function setPropIndexCleanerIntervalInSecs(ConfigNodePropertyInteger $propIndexCleanerIntervalInSecs = null)
    {
        $this->propIndexCleanerIntervalInSecs = $propIndexCleanerIntervalInSecs;

        return $this;
    }

    /**
     * Gets enableSingleBlobIndexFiles.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getEnableSingleBlobIndexFiles()
    {
        return $this->enableSingleBlobIndexFiles;
    }

    /**
     * Sets enableSingleBlobIndexFiles.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $enableSingleBlobIndexFiles
     *
     * @return $this
     */
    public function setEnableSingleBlobIndexFiles(ConfigNodePropertyBoolean $enableSingleBlobIndexFiles = null)
    {
        $this->enableSingleBlobIndexFiles = $enableSingleBlobIndexFiles;

        return $this;
    }
}

