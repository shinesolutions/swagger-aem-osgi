<?php
/**
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
 */
class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $mongouri */
    private $mongouri;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $db */
    private $db;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $socketKeepAlive */
    private $socketKeepAlive;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $cache */
    private $cache;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $nodeCachePercentage */
    private $nodeCachePercentage;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $prevDocCachePercentage */
    private $prevDocCachePercentage;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $childrenCachePercentage */
    private $childrenCachePercentage;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $diffCachePercentage */
    private $diffCachePercentage;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $cacheSegmentCount */
    private $cacheSegmentCount;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $cacheStackMoveDistance */
    private $cacheStackMoveDistance;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $blobCacheSize */
    private $blobCacheSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $persistentCache */
    private $persistentCache;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $journalCache */
    private $journalCache;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $customBlobStore */
    private $customBlobStore;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $journalGCInterval */
    private $journalGCInterval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $journalGCMaxAge */
    private $journalGCMaxAge;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $prefetchExternalChanges */
    private $prefetchExternalChanges;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $role */
    private $role;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $versionGcMaxAgeInSecs */
    private $versionGcMaxAgeInSecs;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $versionGCExpression */
    private $versionGCExpression;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $versionGCTimeLimitInSecs */
    private $versionGCTimeLimitInSecs;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $blobGcMaxAgeInSecs */
    private $blobGcMaxAgeInSecs;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $blobTrackSnapshotIntervalInSecs */
    private $blobTrackSnapshotIntervalInSecs;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $repositoryHome */
    private $repositoryHome;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxReplicationLagInSecs */
    private $maxReplicationLagInSecs;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $documentStoreType */
    private $documentStoreType;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $bundlingDisabled */
    private $bundlingDisabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $updateLimit */
    private $updateLimit;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $persistentCacheIncludes */
    private $persistentCacheIncludes;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $leaseCheckMode */
    private $leaseCheckMode;

}
