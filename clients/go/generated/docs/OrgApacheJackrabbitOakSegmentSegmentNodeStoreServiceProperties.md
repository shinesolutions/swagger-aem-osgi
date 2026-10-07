# OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RepositoryHome** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TarmkMode** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TarmkSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SegmentCacheSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**StringCacheSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TemplateCacheSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**StringDeduplicationCacheSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TemplateDeduplicationCacheSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**NodeDeduplicationCacheSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PauseCompaction** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CompactionRetryCount** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionForceTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionSizeDeltaEstimation** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionDisableEstimation** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CompactionRetainedGenerations** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionMemoryThreshold** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CompactionProgressLog** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Standby** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CustomBlobStore** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CustomSegmentStore** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SplitPersistence** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**RepositoryBackupDir** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**BlobGcMaxAgeInSecs** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlobTrackSnapshotIntervalInSecs** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Methods

### NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties

`func NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties() *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties`

NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties instantiates a new OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesWithDefaults

`func NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesWithDefaults() *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties`

NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesWithDefaults instantiates a new OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRepositoryHome

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetRepositoryHome() ConfigNodePropertyString`

GetRepositoryHome returns the RepositoryHome field if non-nil, zero value otherwise.

### GetRepositoryHomeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetRepositoryHomeOk() (*ConfigNodePropertyString, bool)`

GetRepositoryHomeOk returns a tuple with the RepositoryHome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepositoryHome

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetRepositoryHome(v ConfigNodePropertyString)`

SetRepositoryHome sets RepositoryHome field to given value.

### HasRepositoryHome

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasRepositoryHome() bool`

HasRepositoryHome returns a boolean if a field has been set.

### GetTarmkMode

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetTarmkMode() ConfigNodePropertyString`

GetTarmkMode returns the TarmkMode field if non-nil, zero value otherwise.

### GetTarmkModeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetTarmkModeOk() (*ConfigNodePropertyString, bool)`

GetTarmkModeOk returns a tuple with the TarmkMode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTarmkMode

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetTarmkMode(v ConfigNodePropertyString)`

SetTarmkMode sets TarmkMode field to given value.

### HasTarmkMode

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasTarmkMode() bool`

HasTarmkMode returns a boolean if a field has been set.

### GetTarmkSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetTarmkSize() ConfigNodePropertyInteger`

GetTarmkSize returns the TarmkSize field if non-nil, zero value otherwise.

### GetTarmkSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetTarmkSizeOk() (*ConfigNodePropertyInteger, bool)`

GetTarmkSizeOk returns a tuple with the TarmkSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTarmkSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetTarmkSize(v ConfigNodePropertyInteger)`

SetTarmkSize sets TarmkSize field to given value.

### HasTarmkSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasTarmkSize() bool`

HasTarmkSize returns a boolean if a field has been set.

### GetSegmentCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetSegmentCacheSize() ConfigNodePropertyInteger`

GetSegmentCacheSize returns the SegmentCacheSize field if non-nil, zero value otherwise.

### GetSegmentCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetSegmentCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetSegmentCacheSizeOk returns a tuple with the SegmentCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSegmentCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetSegmentCacheSize(v ConfigNodePropertyInteger)`

SetSegmentCacheSize sets SegmentCacheSize field to given value.

### HasSegmentCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasSegmentCacheSize() bool`

HasSegmentCacheSize returns a boolean if a field has been set.

### GetStringCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetStringCacheSize() ConfigNodePropertyInteger`

GetStringCacheSize returns the StringCacheSize field if non-nil, zero value otherwise.

### GetStringCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetStringCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetStringCacheSizeOk returns a tuple with the StringCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStringCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetStringCacheSize(v ConfigNodePropertyInteger)`

SetStringCacheSize sets StringCacheSize field to given value.

### HasStringCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasStringCacheSize() bool`

HasStringCacheSize returns a boolean if a field has been set.

### GetTemplateCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetTemplateCacheSize() ConfigNodePropertyInteger`

GetTemplateCacheSize returns the TemplateCacheSize field if non-nil, zero value otherwise.

### GetTemplateCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetTemplateCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetTemplateCacheSizeOk returns a tuple with the TemplateCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetTemplateCacheSize(v ConfigNodePropertyInteger)`

SetTemplateCacheSize sets TemplateCacheSize field to given value.

### HasTemplateCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasTemplateCacheSize() bool`

HasTemplateCacheSize returns a boolean if a field has been set.

### GetStringDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetStringDeduplicationCacheSize() ConfigNodePropertyInteger`

GetStringDeduplicationCacheSize returns the StringDeduplicationCacheSize field if non-nil, zero value otherwise.

### GetStringDeduplicationCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetStringDeduplicationCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetStringDeduplicationCacheSizeOk returns a tuple with the StringDeduplicationCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStringDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetStringDeduplicationCacheSize(v ConfigNodePropertyInteger)`

SetStringDeduplicationCacheSize sets StringDeduplicationCacheSize field to given value.

### HasStringDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasStringDeduplicationCacheSize() bool`

HasStringDeduplicationCacheSize returns a boolean if a field has been set.

### GetTemplateDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetTemplateDeduplicationCacheSize() ConfigNodePropertyInteger`

GetTemplateDeduplicationCacheSize returns the TemplateDeduplicationCacheSize field if non-nil, zero value otherwise.

### GetTemplateDeduplicationCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetTemplateDeduplicationCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetTemplateDeduplicationCacheSizeOk returns a tuple with the TemplateDeduplicationCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetTemplateDeduplicationCacheSize(v ConfigNodePropertyInteger)`

SetTemplateDeduplicationCacheSize sets TemplateDeduplicationCacheSize field to given value.

### HasTemplateDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasTemplateDeduplicationCacheSize() bool`

HasTemplateDeduplicationCacheSize returns a boolean if a field has been set.

### GetNodeDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetNodeDeduplicationCacheSize() ConfigNodePropertyInteger`

GetNodeDeduplicationCacheSize returns the NodeDeduplicationCacheSize field if non-nil, zero value otherwise.

### GetNodeDeduplicationCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetNodeDeduplicationCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetNodeDeduplicationCacheSizeOk returns a tuple with the NodeDeduplicationCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNodeDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetNodeDeduplicationCacheSize(v ConfigNodePropertyInteger)`

SetNodeDeduplicationCacheSize sets NodeDeduplicationCacheSize field to given value.

### HasNodeDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasNodeDeduplicationCacheSize() bool`

HasNodeDeduplicationCacheSize returns a boolean if a field has been set.

### GetPauseCompaction

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetPauseCompaction() ConfigNodePropertyBoolean`

GetPauseCompaction returns the PauseCompaction field if non-nil, zero value otherwise.

### GetPauseCompactionOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetPauseCompactionOk() (*ConfigNodePropertyBoolean, bool)`

GetPauseCompactionOk returns a tuple with the PauseCompaction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPauseCompaction

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetPauseCompaction(v ConfigNodePropertyBoolean)`

SetPauseCompaction sets PauseCompaction field to given value.

### HasPauseCompaction

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasPauseCompaction() bool`

HasPauseCompaction returns a boolean if a field has been set.

### GetCompactionRetryCount

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionRetryCount() ConfigNodePropertyInteger`

GetCompactionRetryCount returns the CompactionRetryCount field if non-nil, zero value otherwise.

### GetCompactionRetryCountOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionRetryCountOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionRetryCountOk returns a tuple with the CompactionRetryCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionRetryCount

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetCompactionRetryCount(v ConfigNodePropertyInteger)`

SetCompactionRetryCount sets CompactionRetryCount field to given value.

### HasCompactionRetryCount

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasCompactionRetryCount() bool`

HasCompactionRetryCount returns a boolean if a field has been set.

### GetCompactionForceTimeout

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionForceTimeout() ConfigNodePropertyInteger`

GetCompactionForceTimeout returns the CompactionForceTimeout field if non-nil, zero value otherwise.

### GetCompactionForceTimeoutOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionForceTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionForceTimeoutOk returns a tuple with the CompactionForceTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionForceTimeout

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetCompactionForceTimeout(v ConfigNodePropertyInteger)`

SetCompactionForceTimeout sets CompactionForceTimeout field to given value.

### HasCompactionForceTimeout

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasCompactionForceTimeout() bool`

HasCompactionForceTimeout returns a boolean if a field has been set.

### GetCompactionSizeDeltaEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionSizeDeltaEstimation() ConfigNodePropertyInteger`

GetCompactionSizeDeltaEstimation returns the CompactionSizeDeltaEstimation field if non-nil, zero value otherwise.

### GetCompactionSizeDeltaEstimationOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionSizeDeltaEstimationOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionSizeDeltaEstimationOk returns a tuple with the CompactionSizeDeltaEstimation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionSizeDeltaEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetCompactionSizeDeltaEstimation(v ConfigNodePropertyInteger)`

SetCompactionSizeDeltaEstimation sets CompactionSizeDeltaEstimation field to given value.

### HasCompactionSizeDeltaEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasCompactionSizeDeltaEstimation() bool`

HasCompactionSizeDeltaEstimation returns a boolean if a field has been set.

### GetCompactionDisableEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionDisableEstimation() ConfigNodePropertyBoolean`

GetCompactionDisableEstimation returns the CompactionDisableEstimation field if non-nil, zero value otherwise.

### GetCompactionDisableEstimationOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionDisableEstimationOk() (*ConfigNodePropertyBoolean, bool)`

GetCompactionDisableEstimationOk returns a tuple with the CompactionDisableEstimation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionDisableEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetCompactionDisableEstimation(v ConfigNodePropertyBoolean)`

SetCompactionDisableEstimation sets CompactionDisableEstimation field to given value.

### HasCompactionDisableEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasCompactionDisableEstimation() bool`

HasCompactionDisableEstimation returns a boolean if a field has been set.

### GetCompactionRetainedGenerations

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionRetainedGenerations() ConfigNodePropertyInteger`

GetCompactionRetainedGenerations returns the CompactionRetainedGenerations field if non-nil, zero value otherwise.

### GetCompactionRetainedGenerationsOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionRetainedGenerationsOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionRetainedGenerationsOk returns a tuple with the CompactionRetainedGenerations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionRetainedGenerations

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetCompactionRetainedGenerations(v ConfigNodePropertyInteger)`

SetCompactionRetainedGenerations sets CompactionRetainedGenerations field to given value.

### HasCompactionRetainedGenerations

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasCompactionRetainedGenerations() bool`

HasCompactionRetainedGenerations returns a boolean if a field has been set.

### GetCompactionMemoryThreshold

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionMemoryThreshold() ConfigNodePropertyInteger`

GetCompactionMemoryThreshold returns the CompactionMemoryThreshold field if non-nil, zero value otherwise.

### GetCompactionMemoryThresholdOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionMemoryThresholdOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionMemoryThresholdOk returns a tuple with the CompactionMemoryThreshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionMemoryThreshold

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetCompactionMemoryThreshold(v ConfigNodePropertyInteger)`

SetCompactionMemoryThreshold sets CompactionMemoryThreshold field to given value.

### HasCompactionMemoryThreshold

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasCompactionMemoryThreshold() bool`

HasCompactionMemoryThreshold returns a boolean if a field has been set.

### GetCompactionProgressLog

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionProgressLog() ConfigNodePropertyInteger`

GetCompactionProgressLog returns the CompactionProgressLog field if non-nil, zero value otherwise.

### GetCompactionProgressLogOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCompactionProgressLogOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionProgressLogOk returns a tuple with the CompactionProgressLog field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionProgressLog

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetCompactionProgressLog(v ConfigNodePropertyInteger)`

SetCompactionProgressLog sets CompactionProgressLog field to given value.

### HasCompactionProgressLog

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasCompactionProgressLog() bool`

HasCompactionProgressLog returns a boolean if a field has been set.

### GetStandby

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetStandby() ConfigNodePropertyBoolean`

GetStandby returns the Standby field if non-nil, zero value otherwise.

### GetStandbyOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetStandbyOk() (*ConfigNodePropertyBoolean, bool)`

GetStandbyOk returns a tuple with the Standby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStandby

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetStandby(v ConfigNodePropertyBoolean)`

SetStandby sets Standby field to given value.

### HasStandby

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasStandby() bool`

HasStandby returns a boolean if a field has been set.

### GetCustomBlobStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCustomBlobStore() ConfigNodePropertyBoolean`

GetCustomBlobStore returns the CustomBlobStore field if non-nil, zero value otherwise.

### GetCustomBlobStoreOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCustomBlobStoreOk() (*ConfigNodePropertyBoolean, bool)`

GetCustomBlobStoreOk returns a tuple with the CustomBlobStore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomBlobStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetCustomBlobStore(v ConfigNodePropertyBoolean)`

SetCustomBlobStore sets CustomBlobStore field to given value.

### HasCustomBlobStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasCustomBlobStore() bool`

HasCustomBlobStore returns a boolean if a field has been set.

### GetCustomSegmentStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCustomSegmentStore() ConfigNodePropertyBoolean`

GetCustomSegmentStore returns the CustomSegmentStore field if non-nil, zero value otherwise.

### GetCustomSegmentStoreOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetCustomSegmentStoreOk() (*ConfigNodePropertyBoolean, bool)`

GetCustomSegmentStoreOk returns a tuple with the CustomSegmentStore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomSegmentStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetCustomSegmentStore(v ConfigNodePropertyBoolean)`

SetCustomSegmentStore sets CustomSegmentStore field to given value.

### HasCustomSegmentStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasCustomSegmentStore() bool`

HasCustomSegmentStore returns a boolean if a field has been set.

### GetSplitPersistence

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetSplitPersistence() ConfigNodePropertyBoolean`

GetSplitPersistence returns the SplitPersistence field if non-nil, zero value otherwise.

### GetSplitPersistenceOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetSplitPersistenceOk() (*ConfigNodePropertyBoolean, bool)`

GetSplitPersistenceOk returns a tuple with the SplitPersistence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSplitPersistence

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetSplitPersistence(v ConfigNodePropertyBoolean)`

SetSplitPersistence sets SplitPersistence field to given value.

### HasSplitPersistence

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasSplitPersistence() bool`

HasSplitPersistence returns a boolean if a field has been set.

### GetRepositoryBackupDir

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetRepositoryBackupDir() ConfigNodePropertyString`

GetRepositoryBackupDir returns the RepositoryBackupDir field if non-nil, zero value otherwise.

### GetRepositoryBackupDirOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetRepositoryBackupDirOk() (*ConfigNodePropertyString, bool)`

GetRepositoryBackupDirOk returns a tuple with the RepositoryBackupDir field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepositoryBackupDir

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetRepositoryBackupDir(v ConfigNodePropertyString)`

SetRepositoryBackupDir sets RepositoryBackupDir field to given value.

### HasRepositoryBackupDir

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasRepositoryBackupDir() bool`

HasRepositoryBackupDir returns a boolean if a field has been set.

### GetBlobGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetBlobGcMaxAgeInSecs() ConfigNodePropertyInteger`

GetBlobGcMaxAgeInSecs returns the BlobGcMaxAgeInSecs field if non-nil, zero value otherwise.

### GetBlobGcMaxAgeInSecsOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetBlobGcMaxAgeInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetBlobGcMaxAgeInSecsOk returns a tuple with the BlobGcMaxAgeInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetBlobGcMaxAgeInSecs(v ConfigNodePropertyInteger)`

SetBlobGcMaxAgeInSecs sets BlobGcMaxAgeInSecs field to given value.

### HasBlobGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasBlobGcMaxAgeInSecs() bool`

HasBlobGcMaxAgeInSecs returns a boolean if a field has been set.

### GetBlobTrackSnapshotIntervalInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetBlobTrackSnapshotIntervalInSecs() ConfigNodePropertyInteger`

GetBlobTrackSnapshotIntervalInSecs returns the BlobTrackSnapshotIntervalInSecs field if non-nil, zero value otherwise.

### GetBlobTrackSnapshotIntervalInSecsOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) GetBlobTrackSnapshotIntervalInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetBlobTrackSnapshotIntervalInSecsOk returns a tuple with the BlobTrackSnapshotIntervalInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobTrackSnapshotIntervalInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) SetBlobTrackSnapshotIntervalInSecs(v ConfigNodePropertyInteger)`

SetBlobTrackSnapshotIntervalInSecs sets BlobTrackSnapshotIntervalInSecs field to given value.

### HasBlobTrackSnapshotIntervalInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties) HasBlobTrackSnapshotIntervalInSecs() bool`

HasBlobTrackSnapshotIntervalInSecs returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


