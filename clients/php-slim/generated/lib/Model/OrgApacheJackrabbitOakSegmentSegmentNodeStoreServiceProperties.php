<?php
/**
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
 */
class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $repositoryHome */
    private $repositoryHome;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $tarmkMode */
    private $tarmkMode;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $tarmkSize */
    private $tarmkSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $segmentCacheSize */
    private $segmentCacheSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $stringCacheSize */
    private $stringCacheSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $templateCacheSize */
    private $templateCacheSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $stringDeduplicationCacheSize */
    private $stringDeduplicationCacheSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $templateDeduplicationCacheSize */
    private $templateDeduplicationCacheSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $nodeDeduplicationCacheSize */
    private $nodeDeduplicationCacheSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $pauseCompaction */
    private $pauseCompaction;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $compactionRetryCount */
    private $compactionRetryCount;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $compactionForceTimeout */
    private $compactionForceTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $compactionSizeDeltaEstimation */
    private $compactionSizeDeltaEstimation;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $compactionDisableEstimation */
    private $compactionDisableEstimation;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $compactionRetainedGenerations */
    private $compactionRetainedGenerations;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $compactionMemoryThreshold */
    private $compactionMemoryThreshold;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $compactionProgressLog */
    private $compactionProgressLog;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $standby */
    private $standby;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $customBlobStore */
    private $customBlobStore;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $customSegmentStore */
    private $customSegmentStore;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $splitPersistence */
    private $splitPersistence;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $repositoryBackupDir */
    private $repositoryBackupDir;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $blobGcMaxAgeInSecs */
    private $blobGcMaxAgeInSecs;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $blobTrackSnapshotIntervalInSecs */
    private $blobTrackSnapshotIntervalInSecs;

}
