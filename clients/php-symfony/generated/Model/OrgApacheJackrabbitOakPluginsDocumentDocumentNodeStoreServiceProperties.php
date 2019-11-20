<?php
/**
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
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
 * Class representing the OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties 
{
        /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("mongouri")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $mongouri;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("db")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $db;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("socketKeepAlive")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $socketKeepAlive;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("cache")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $cache;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("nodeCachePercentage")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $nodeCachePercentage;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("prevDocCachePercentage")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $prevDocCachePercentage;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("childrenCachePercentage")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $childrenCachePercentage;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("diffCachePercentage")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $diffCachePercentage;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("cacheSegmentCount")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $cacheSegmentCount;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("cacheStackMoveDistance")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $cacheStackMoveDistance;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("blobCacheSize")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $blobCacheSize;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("persistentCache")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $persistentCache;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("journalCache")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $journalCache;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("customBlobStore")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $customBlobStore;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("journalGCInterval")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $journalGCInterval;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("journalGCMaxAge")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $journalGCMaxAge;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("prefetchExternalChanges")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $prefetchExternalChanges;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("role")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $role;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("versionGcMaxAgeInSecs")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $versionGcMaxAgeInSecs;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("versionGCExpression")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $versionGCExpression;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("versionGCTimeLimitInSecs")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $versionGCTimeLimitInSecs;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("blobGcMaxAgeInSecs")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $blobGcMaxAgeInSecs;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("blobTrackSnapshotIntervalInSecs")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $blobTrackSnapshotIntervalInSecs;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyString|null
     * @SerializedName("repository.home")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyString")
     */
    protected $repositoryHome;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("maxReplicationLagInSecs")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $maxReplicationLagInSecs;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     * @SerializedName("documentStoreType")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     */
    protected $documentStoreType;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     * @SerializedName("bundlingDisabled")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyBoolean")
     */
    protected $bundlingDisabled;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     * @SerializedName("updateLimit")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyInteger")
     */
    protected $updateLimit;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyArray|null
     * @SerializedName("persistentCacheIncludes")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyArray")
     */
    protected $persistentCacheIncludes;

    /**
     * @var OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     * @SerializedName("leaseCheckMode")
     * @Assert\Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     * @Type("OpenAPI\Server\Model\ConfigNodePropertyDropDown")
     */
    protected $leaseCheckMode;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->mongouri = isset($data['mongouri']) ? $data['mongouri'] : null;
        $this->db = isset($data['db']) ? $data['db'] : null;
        $this->socketKeepAlive = isset($data['socketKeepAlive']) ? $data['socketKeepAlive'] : null;
        $this->cache = isset($data['cache']) ? $data['cache'] : null;
        $this->nodeCachePercentage = isset($data['nodeCachePercentage']) ? $data['nodeCachePercentage'] : null;
        $this->prevDocCachePercentage = isset($data['prevDocCachePercentage']) ? $data['prevDocCachePercentage'] : null;
        $this->childrenCachePercentage = isset($data['childrenCachePercentage']) ? $data['childrenCachePercentage'] : null;
        $this->diffCachePercentage = isset($data['diffCachePercentage']) ? $data['diffCachePercentage'] : null;
        $this->cacheSegmentCount = isset($data['cacheSegmentCount']) ? $data['cacheSegmentCount'] : null;
        $this->cacheStackMoveDistance = isset($data['cacheStackMoveDistance']) ? $data['cacheStackMoveDistance'] : null;
        $this->blobCacheSize = isset($data['blobCacheSize']) ? $data['blobCacheSize'] : null;
        $this->persistentCache = isset($data['persistentCache']) ? $data['persistentCache'] : null;
        $this->journalCache = isset($data['journalCache']) ? $data['journalCache'] : null;
        $this->customBlobStore = isset($data['customBlobStore']) ? $data['customBlobStore'] : null;
        $this->journalGCInterval = isset($data['journalGCInterval']) ? $data['journalGCInterval'] : null;
        $this->journalGCMaxAge = isset($data['journalGCMaxAge']) ? $data['journalGCMaxAge'] : null;
        $this->prefetchExternalChanges = isset($data['prefetchExternalChanges']) ? $data['prefetchExternalChanges'] : null;
        $this->role = isset($data['role']) ? $data['role'] : null;
        $this->versionGcMaxAgeInSecs = isset($data['versionGcMaxAgeInSecs']) ? $data['versionGcMaxAgeInSecs'] : null;
        $this->versionGCExpression = isset($data['versionGCExpression']) ? $data['versionGCExpression'] : null;
        $this->versionGCTimeLimitInSecs = isset($data['versionGCTimeLimitInSecs']) ? $data['versionGCTimeLimitInSecs'] : null;
        $this->blobGcMaxAgeInSecs = isset($data['blobGcMaxAgeInSecs']) ? $data['blobGcMaxAgeInSecs'] : null;
        $this->blobTrackSnapshotIntervalInSecs = isset($data['blobTrackSnapshotIntervalInSecs']) ? $data['blobTrackSnapshotIntervalInSecs'] : null;
        $this->repositoryHome = isset($data['repositoryHome']) ? $data['repositoryHome'] : null;
        $this->maxReplicationLagInSecs = isset($data['maxReplicationLagInSecs']) ? $data['maxReplicationLagInSecs'] : null;
        $this->documentStoreType = isset($data['documentStoreType']) ? $data['documentStoreType'] : null;
        $this->bundlingDisabled = isset($data['bundlingDisabled']) ? $data['bundlingDisabled'] : null;
        $this->updateLimit = isset($data['updateLimit']) ? $data['updateLimit'] : null;
        $this->persistentCacheIncludes = isset($data['persistentCacheIncludes']) ? $data['persistentCacheIncludes'] : null;
        $this->leaseCheckMode = isset($data['leaseCheckMode']) ? $data['leaseCheckMode'] : null;
    }

    /**
     * Gets mongouri.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getMongouri()
    {
        return $this->mongouri;
    }

    /**
     * Sets mongouri.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $mongouri
     *
     * @return $this
     */
    public function setMongouri(ConfigNodePropertyString $mongouri = null)
    {
        $this->mongouri = $mongouri;

        return $this;
    }

    /**
     * Gets db.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getDb()
    {
        return $this->db;
    }

    /**
     * Sets db.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $db
     *
     * @return $this
     */
    public function setDb(ConfigNodePropertyString $db = null)
    {
        $this->db = $db;

        return $this;
    }

    /**
     * Gets socketKeepAlive.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getSocketKeepAlive()
    {
        return $this->socketKeepAlive;
    }

    /**
     * Sets socketKeepAlive.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $socketKeepAlive
     *
     * @return $this
     */
    public function setSocketKeepAlive(ConfigNodePropertyBoolean $socketKeepAlive = null)
    {
        $this->socketKeepAlive = $socketKeepAlive;

        return $this;
    }

    /**
     * Gets cache.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getCache()
    {
        return $this->cache;
    }

    /**
     * Sets cache.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $cache
     *
     * @return $this
     */
    public function setCache(ConfigNodePropertyInteger $cache = null)
    {
        $this->cache = $cache;

        return $this;
    }

    /**
     * Gets nodeCachePercentage.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getNodeCachePercentage()
    {
        return $this->nodeCachePercentage;
    }

    /**
     * Sets nodeCachePercentage.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $nodeCachePercentage
     *
     * @return $this
     */
    public function setNodeCachePercentage(ConfigNodePropertyInteger $nodeCachePercentage = null)
    {
        $this->nodeCachePercentage = $nodeCachePercentage;

        return $this;
    }

    /**
     * Gets prevDocCachePercentage.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getPrevDocCachePercentage()
    {
        return $this->prevDocCachePercentage;
    }

    /**
     * Sets prevDocCachePercentage.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $prevDocCachePercentage
     *
     * @return $this
     */
    public function setPrevDocCachePercentage(ConfigNodePropertyInteger $prevDocCachePercentage = null)
    {
        $this->prevDocCachePercentage = $prevDocCachePercentage;

        return $this;
    }

    /**
     * Gets childrenCachePercentage.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getChildrenCachePercentage()
    {
        return $this->childrenCachePercentage;
    }

    /**
     * Sets childrenCachePercentage.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $childrenCachePercentage
     *
     * @return $this
     */
    public function setChildrenCachePercentage(ConfigNodePropertyInteger $childrenCachePercentage = null)
    {
        $this->childrenCachePercentage = $childrenCachePercentage;

        return $this;
    }

    /**
     * Gets diffCachePercentage.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getDiffCachePercentage()
    {
        return $this->diffCachePercentage;
    }

    /**
     * Sets diffCachePercentage.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $diffCachePercentage
     *
     * @return $this
     */
    public function setDiffCachePercentage(ConfigNodePropertyInteger $diffCachePercentage = null)
    {
        $this->diffCachePercentage = $diffCachePercentage;

        return $this;
    }

    /**
     * Gets cacheSegmentCount.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getCacheSegmentCount()
    {
        return $this->cacheSegmentCount;
    }

    /**
     * Sets cacheSegmentCount.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $cacheSegmentCount
     *
     * @return $this
     */
    public function setCacheSegmentCount(ConfigNodePropertyInteger $cacheSegmentCount = null)
    {
        $this->cacheSegmentCount = $cacheSegmentCount;

        return $this;
    }

    /**
     * Gets cacheStackMoveDistance.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getCacheStackMoveDistance()
    {
        return $this->cacheStackMoveDistance;
    }

    /**
     * Sets cacheStackMoveDistance.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $cacheStackMoveDistance
     *
     * @return $this
     */
    public function setCacheStackMoveDistance(ConfigNodePropertyInteger $cacheStackMoveDistance = null)
    {
        $this->cacheStackMoveDistance = $cacheStackMoveDistance;

        return $this;
    }

    /**
     * Gets blobCacheSize.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getBlobCacheSize()
    {
        return $this->blobCacheSize;
    }

    /**
     * Sets blobCacheSize.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $blobCacheSize
     *
     * @return $this
     */
    public function setBlobCacheSize(ConfigNodePropertyInteger $blobCacheSize = null)
    {
        $this->blobCacheSize = $blobCacheSize;

        return $this;
    }

    /**
     * Gets persistentCache.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getPersistentCache()
    {
        return $this->persistentCache;
    }

    /**
     * Sets persistentCache.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $persistentCache
     *
     * @return $this
     */
    public function setPersistentCache(ConfigNodePropertyString $persistentCache = null)
    {
        $this->persistentCache = $persistentCache;

        return $this;
    }

    /**
     * Gets journalCache.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getJournalCache()
    {
        return $this->journalCache;
    }

    /**
     * Sets journalCache.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $journalCache
     *
     * @return $this
     */
    public function setJournalCache(ConfigNodePropertyString $journalCache = null)
    {
        $this->journalCache = $journalCache;

        return $this;
    }

    /**
     * Gets customBlobStore.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getCustomBlobStore()
    {
        return $this->customBlobStore;
    }

    /**
     * Sets customBlobStore.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $customBlobStore
     *
     * @return $this
     */
    public function setCustomBlobStore(ConfigNodePropertyBoolean $customBlobStore = null)
    {
        $this->customBlobStore = $customBlobStore;

        return $this;
    }

    /**
     * Gets journalGCInterval.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getJournalGCInterval()
    {
        return $this->journalGCInterval;
    }

    /**
     * Sets journalGCInterval.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $journalGCInterval
     *
     * @return $this
     */
    public function setJournalGCInterval(ConfigNodePropertyInteger $journalGCInterval = null)
    {
        $this->journalGCInterval = $journalGCInterval;

        return $this;
    }

    /**
     * Gets journalGCMaxAge.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getJournalGCMaxAge()
    {
        return $this->journalGCMaxAge;
    }

    /**
     * Sets journalGCMaxAge.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $journalGCMaxAge
     *
     * @return $this
     */
    public function setJournalGCMaxAge(ConfigNodePropertyInteger $journalGCMaxAge = null)
    {
        $this->journalGCMaxAge = $journalGCMaxAge;

        return $this;
    }

    /**
     * Gets prefetchExternalChanges.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getPrefetchExternalChanges()
    {
        return $this->prefetchExternalChanges;
    }

    /**
     * Sets prefetchExternalChanges.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $prefetchExternalChanges
     *
     * @return $this
     */
    public function setPrefetchExternalChanges(ConfigNodePropertyBoolean $prefetchExternalChanges = null)
    {
        $this->prefetchExternalChanges = $prefetchExternalChanges;

        return $this;
    }

    /**
     * Gets role.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getRole()
    {
        return $this->role;
    }

    /**
     * Sets role.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $role
     *
     * @return $this
     */
    public function setRole(ConfigNodePropertyString $role = null)
    {
        $this->role = $role;

        return $this;
    }

    /**
     * Gets versionGcMaxAgeInSecs.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getVersionGcMaxAgeInSecs()
    {
        return $this->versionGcMaxAgeInSecs;
    }

    /**
     * Sets versionGcMaxAgeInSecs.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $versionGcMaxAgeInSecs
     *
     * @return $this
     */
    public function setVersionGcMaxAgeInSecs(ConfigNodePropertyInteger $versionGcMaxAgeInSecs = null)
    {
        $this->versionGcMaxAgeInSecs = $versionGcMaxAgeInSecs;

        return $this;
    }

    /**
     * Gets versionGCExpression.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getVersionGCExpression()
    {
        return $this->versionGCExpression;
    }

    /**
     * Sets versionGCExpression.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $versionGCExpression
     *
     * @return $this
     */
    public function setVersionGCExpression(ConfigNodePropertyString $versionGCExpression = null)
    {
        $this->versionGCExpression = $versionGCExpression;

        return $this;
    }

    /**
     * Gets versionGCTimeLimitInSecs.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getVersionGCTimeLimitInSecs()
    {
        return $this->versionGCTimeLimitInSecs;
    }

    /**
     * Sets versionGCTimeLimitInSecs.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $versionGCTimeLimitInSecs
     *
     * @return $this
     */
    public function setVersionGCTimeLimitInSecs(ConfigNodePropertyInteger $versionGCTimeLimitInSecs = null)
    {
        $this->versionGCTimeLimitInSecs = $versionGCTimeLimitInSecs;

        return $this;
    }

    /**
     * Gets blobGcMaxAgeInSecs.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getBlobGcMaxAgeInSecs()
    {
        return $this->blobGcMaxAgeInSecs;
    }

    /**
     * Sets blobGcMaxAgeInSecs.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $blobGcMaxAgeInSecs
     *
     * @return $this
     */
    public function setBlobGcMaxAgeInSecs(ConfigNodePropertyInteger $blobGcMaxAgeInSecs = null)
    {
        $this->blobGcMaxAgeInSecs = $blobGcMaxAgeInSecs;

        return $this;
    }

    /**
     * Gets blobTrackSnapshotIntervalInSecs.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getBlobTrackSnapshotIntervalInSecs()
    {
        return $this->blobTrackSnapshotIntervalInSecs;
    }

    /**
     * Sets blobTrackSnapshotIntervalInSecs.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $blobTrackSnapshotIntervalInSecs
     *
     * @return $this
     */
    public function setBlobTrackSnapshotIntervalInSecs(ConfigNodePropertyInteger $blobTrackSnapshotIntervalInSecs = null)
    {
        $this->blobTrackSnapshotIntervalInSecs = $blobTrackSnapshotIntervalInSecs;

        return $this;
    }

    /**
     * Gets repositoryHome.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyString|null
     */
    public function getRepositoryHome()
    {
        return $this->repositoryHome;
    }

    /**
     * Sets repositoryHome.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyString|null $repositoryHome
     *
     * @return $this
     */
    public function setRepositoryHome(ConfigNodePropertyString $repositoryHome = null)
    {
        $this->repositoryHome = $repositoryHome;

        return $this;
    }

    /**
     * Gets maxReplicationLagInSecs.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getMaxReplicationLagInSecs()
    {
        return $this->maxReplicationLagInSecs;
    }

    /**
     * Sets maxReplicationLagInSecs.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $maxReplicationLagInSecs
     *
     * @return $this
     */
    public function setMaxReplicationLagInSecs(ConfigNodePropertyInteger $maxReplicationLagInSecs = null)
    {
        $this->maxReplicationLagInSecs = $maxReplicationLagInSecs;

        return $this;
    }

    /**
     * Gets documentStoreType.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     */
    public function getDocumentStoreType()
    {
        return $this->documentStoreType;
    }

    /**
     * Sets documentStoreType.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyDropDown|null $documentStoreType
     *
     * @return $this
     */
    public function setDocumentStoreType(ConfigNodePropertyDropDown $documentStoreType = null)
    {
        $this->documentStoreType = $documentStoreType;

        return $this;
    }

    /**
     * Gets bundlingDisabled.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyBoolean|null
     */
    public function getBundlingDisabled()
    {
        return $this->bundlingDisabled;
    }

    /**
     * Sets bundlingDisabled.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyBoolean|null $bundlingDisabled
     *
     * @return $this
     */
    public function setBundlingDisabled(ConfigNodePropertyBoolean $bundlingDisabled = null)
    {
        $this->bundlingDisabled = $bundlingDisabled;

        return $this;
    }

    /**
     * Gets updateLimit.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyInteger|null
     */
    public function getUpdateLimit()
    {
        return $this->updateLimit;
    }

    /**
     * Sets updateLimit.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyInteger|null $updateLimit
     *
     * @return $this
     */
    public function setUpdateLimit(ConfigNodePropertyInteger $updateLimit = null)
    {
        $this->updateLimit = $updateLimit;

        return $this;
    }

    /**
     * Gets persistentCacheIncludes.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyArray|null
     */
    public function getPersistentCacheIncludes()
    {
        return $this->persistentCacheIncludes;
    }

    /**
     * Sets persistentCacheIncludes.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyArray|null $persistentCacheIncludes
     *
     * @return $this
     */
    public function setPersistentCacheIncludes(ConfigNodePropertyArray $persistentCacheIncludes = null)
    {
        $this->persistentCacheIncludes = $persistentCacheIncludes;

        return $this;
    }

    /**
     * Gets leaseCheckMode.
     *
     * @return OpenAPI\Server\Model\ConfigNodePropertyDropDown|null
     */
    public function getLeaseCheckMode()
    {
        return $this->leaseCheckMode;
    }

    /**
     * Sets leaseCheckMode.
     *
     * @param OpenAPI\Server\Model\ConfigNodePropertyDropDown|null $leaseCheckMode
     *
     * @return $this
     */
    public function setLeaseCheckMode(ConfigNodePropertyDropDown $leaseCheckMode = null)
    {
        $this->leaseCheckMode = $leaseCheckMode;

        return $this;
    }
}

