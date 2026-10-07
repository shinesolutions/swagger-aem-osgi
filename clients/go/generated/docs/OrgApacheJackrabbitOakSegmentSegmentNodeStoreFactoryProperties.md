# OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties

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
**Role** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**RegisterDescriptors** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DispatchChanges** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Methods

### NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties

`func NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties() *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties`

NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties instantiates a new OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesWithDefaults

`func NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesWithDefaults() *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties`

NewOrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesWithDefaults instantiates a new OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRepositoryHome

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetRepositoryHome() ConfigNodePropertyString`

GetRepositoryHome returns the RepositoryHome field if non-nil, zero value otherwise.

### GetRepositoryHomeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetRepositoryHomeOk() (*ConfigNodePropertyString, bool)`

GetRepositoryHomeOk returns a tuple with the RepositoryHome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepositoryHome

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetRepositoryHome(v ConfigNodePropertyString)`

SetRepositoryHome sets RepositoryHome field to given value.

### HasRepositoryHome

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasRepositoryHome() bool`

HasRepositoryHome returns a boolean if a field has been set.

### GetTarmkMode

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetTarmkMode() ConfigNodePropertyString`

GetTarmkMode returns the TarmkMode field if non-nil, zero value otherwise.

### GetTarmkModeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetTarmkModeOk() (*ConfigNodePropertyString, bool)`

GetTarmkModeOk returns a tuple with the TarmkMode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTarmkMode

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetTarmkMode(v ConfigNodePropertyString)`

SetTarmkMode sets TarmkMode field to given value.

### HasTarmkMode

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasTarmkMode() bool`

HasTarmkMode returns a boolean if a field has been set.

### GetTarmkSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetTarmkSize() ConfigNodePropertyInteger`

GetTarmkSize returns the TarmkSize field if non-nil, zero value otherwise.

### GetTarmkSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetTarmkSizeOk() (*ConfigNodePropertyInteger, bool)`

GetTarmkSizeOk returns a tuple with the TarmkSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTarmkSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetTarmkSize(v ConfigNodePropertyInteger)`

SetTarmkSize sets TarmkSize field to given value.

### HasTarmkSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasTarmkSize() bool`

HasTarmkSize returns a boolean if a field has been set.

### GetSegmentCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetSegmentCacheSize() ConfigNodePropertyInteger`

GetSegmentCacheSize returns the SegmentCacheSize field if non-nil, zero value otherwise.

### GetSegmentCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetSegmentCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetSegmentCacheSizeOk returns a tuple with the SegmentCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSegmentCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetSegmentCacheSize(v ConfigNodePropertyInteger)`

SetSegmentCacheSize sets SegmentCacheSize field to given value.

### HasSegmentCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasSegmentCacheSize() bool`

HasSegmentCacheSize returns a boolean if a field has been set.

### GetStringCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetStringCacheSize() ConfigNodePropertyInteger`

GetStringCacheSize returns the StringCacheSize field if non-nil, zero value otherwise.

### GetStringCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetStringCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetStringCacheSizeOk returns a tuple with the StringCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStringCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetStringCacheSize(v ConfigNodePropertyInteger)`

SetStringCacheSize sets StringCacheSize field to given value.

### HasStringCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasStringCacheSize() bool`

HasStringCacheSize returns a boolean if a field has been set.

### GetTemplateCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetTemplateCacheSize() ConfigNodePropertyInteger`

GetTemplateCacheSize returns the TemplateCacheSize field if non-nil, zero value otherwise.

### GetTemplateCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetTemplateCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetTemplateCacheSizeOk returns a tuple with the TemplateCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetTemplateCacheSize(v ConfigNodePropertyInteger)`

SetTemplateCacheSize sets TemplateCacheSize field to given value.

### HasTemplateCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasTemplateCacheSize() bool`

HasTemplateCacheSize returns a boolean if a field has been set.

### GetStringDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetStringDeduplicationCacheSize() ConfigNodePropertyInteger`

GetStringDeduplicationCacheSize returns the StringDeduplicationCacheSize field if non-nil, zero value otherwise.

### GetStringDeduplicationCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetStringDeduplicationCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetStringDeduplicationCacheSizeOk returns a tuple with the StringDeduplicationCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStringDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetStringDeduplicationCacheSize(v ConfigNodePropertyInteger)`

SetStringDeduplicationCacheSize sets StringDeduplicationCacheSize field to given value.

### HasStringDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasStringDeduplicationCacheSize() bool`

HasStringDeduplicationCacheSize returns a boolean if a field has been set.

### GetTemplateDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetTemplateDeduplicationCacheSize() ConfigNodePropertyInteger`

GetTemplateDeduplicationCacheSize returns the TemplateDeduplicationCacheSize field if non-nil, zero value otherwise.

### GetTemplateDeduplicationCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetTemplateDeduplicationCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetTemplateDeduplicationCacheSizeOk returns a tuple with the TemplateDeduplicationCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetTemplateDeduplicationCacheSize(v ConfigNodePropertyInteger)`

SetTemplateDeduplicationCacheSize sets TemplateDeduplicationCacheSize field to given value.

### HasTemplateDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasTemplateDeduplicationCacheSize() bool`

HasTemplateDeduplicationCacheSize returns a boolean if a field has been set.

### GetNodeDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetNodeDeduplicationCacheSize() ConfigNodePropertyInteger`

GetNodeDeduplicationCacheSize returns the NodeDeduplicationCacheSize field if non-nil, zero value otherwise.

### GetNodeDeduplicationCacheSizeOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetNodeDeduplicationCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetNodeDeduplicationCacheSizeOk returns a tuple with the NodeDeduplicationCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNodeDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetNodeDeduplicationCacheSize(v ConfigNodePropertyInteger)`

SetNodeDeduplicationCacheSize sets NodeDeduplicationCacheSize field to given value.

### HasNodeDeduplicationCacheSize

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasNodeDeduplicationCacheSize() bool`

HasNodeDeduplicationCacheSize returns a boolean if a field has been set.

### GetPauseCompaction

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetPauseCompaction() ConfigNodePropertyBoolean`

GetPauseCompaction returns the PauseCompaction field if non-nil, zero value otherwise.

### GetPauseCompactionOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetPauseCompactionOk() (*ConfigNodePropertyBoolean, bool)`

GetPauseCompactionOk returns a tuple with the PauseCompaction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPauseCompaction

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetPauseCompaction(v ConfigNodePropertyBoolean)`

SetPauseCompaction sets PauseCompaction field to given value.

### HasPauseCompaction

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasPauseCompaction() bool`

HasPauseCompaction returns a boolean if a field has been set.

### GetCompactionRetryCount

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionRetryCount() ConfigNodePropertyInteger`

GetCompactionRetryCount returns the CompactionRetryCount field if non-nil, zero value otherwise.

### GetCompactionRetryCountOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionRetryCountOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionRetryCountOk returns a tuple with the CompactionRetryCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionRetryCount

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetCompactionRetryCount(v ConfigNodePropertyInteger)`

SetCompactionRetryCount sets CompactionRetryCount field to given value.

### HasCompactionRetryCount

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasCompactionRetryCount() bool`

HasCompactionRetryCount returns a boolean if a field has been set.

### GetCompactionForceTimeout

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionForceTimeout() ConfigNodePropertyInteger`

GetCompactionForceTimeout returns the CompactionForceTimeout field if non-nil, zero value otherwise.

### GetCompactionForceTimeoutOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionForceTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionForceTimeoutOk returns a tuple with the CompactionForceTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionForceTimeout

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetCompactionForceTimeout(v ConfigNodePropertyInteger)`

SetCompactionForceTimeout sets CompactionForceTimeout field to given value.

### HasCompactionForceTimeout

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasCompactionForceTimeout() bool`

HasCompactionForceTimeout returns a boolean if a field has been set.

### GetCompactionSizeDeltaEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionSizeDeltaEstimation() ConfigNodePropertyInteger`

GetCompactionSizeDeltaEstimation returns the CompactionSizeDeltaEstimation field if non-nil, zero value otherwise.

### GetCompactionSizeDeltaEstimationOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionSizeDeltaEstimationOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionSizeDeltaEstimationOk returns a tuple with the CompactionSizeDeltaEstimation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionSizeDeltaEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetCompactionSizeDeltaEstimation(v ConfigNodePropertyInteger)`

SetCompactionSizeDeltaEstimation sets CompactionSizeDeltaEstimation field to given value.

### HasCompactionSizeDeltaEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasCompactionSizeDeltaEstimation() bool`

HasCompactionSizeDeltaEstimation returns a boolean if a field has been set.

### GetCompactionDisableEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionDisableEstimation() ConfigNodePropertyBoolean`

GetCompactionDisableEstimation returns the CompactionDisableEstimation field if non-nil, zero value otherwise.

### GetCompactionDisableEstimationOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionDisableEstimationOk() (*ConfigNodePropertyBoolean, bool)`

GetCompactionDisableEstimationOk returns a tuple with the CompactionDisableEstimation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionDisableEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetCompactionDisableEstimation(v ConfigNodePropertyBoolean)`

SetCompactionDisableEstimation sets CompactionDisableEstimation field to given value.

### HasCompactionDisableEstimation

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasCompactionDisableEstimation() bool`

HasCompactionDisableEstimation returns a boolean if a field has been set.

### GetCompactionRetainedGenerations

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionRetainedGenerations() ConfigNodePropertyInteger`

GetCompactionRetainedGenerations returns the CompactionRetainedGenerations field if non-nil, zero value otherwise.

### GetCompactionRetainedGenerationsOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionRetainedGenerationsOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionRetainedGenerationsOk returns a tuple with the CompactionRetainedGenerations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionRetainedGenerations

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetCompactionRetainedGenerations(v ConfigNodePropertyInteger)`

SetCompactionRetainedGenerations sets CompactionRetainedGenerations field to given value.

### HasCompactionRetainedGenerations

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasCompactionRetainedGenerations() bool`

HasCompactionRetainedGenerations returns a boolean if a field has been set.

### GetCompactionMemoryThreshold

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionMemoryThreshold() ConfigNodePropertyInteger`

GetCompactionMemoryThreshold returns the CompactionMemoryThreshold field if non-nil, zero value otherwise.

### GetCompactionMemoryThresholdOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionMemoryThresholdOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionMemoryThresholdOk returns a tuple with the CompactionMemoryThreshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionMemoryThreshold

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetCompactionMemoryThreshold(v ConfigNodePropertyInteger)`

SetCompactionMemoryThreshold sets CompactionMemoryThreshold field to given value.

### HasCompactionMemoryThreshold

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasCompactionMemoryThreshold() bool`

HasCompactionMemoryThreshold returns a boolean if a field has been set.

### GetCompactionProgressLog

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionProgressLog() ConfigNodePropertyInteger`

GetCompactionProgressLog returns the CompactionProgressLog field if non-nil, zero value otherwise.

### GetCompactionProgressLogOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCompactionProgressLogOk() (*ConfigNodePropertyInteger, bool)`

GetCompactionProgressLogOk returns a tuple with the CompactionProgressLog field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompactionProgressLog

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetCompactionProgressLog(v ConfigNodePropertyInteger)`

SetCompactionProgressLog sets CompactionProgressLog field to given value.

### HasCompactionProgressLog

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasCompactionProgressLog() bool`

HasCompactionProgressLog returns a boolean if a field has been set.

### GetStandby

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetStandby() ConfigNodePropertyBoolean`

GetStandby returns the Standby field if non-nil, zero value otherwise.

### GetStandbyOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetStandbyOk() (*ConfigNodePropertyBoolean, bool)`

GetStandbyOk returns a tuple with the Standby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStandby

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetStandby(v ConfigNodePropertyBoolean)`

SetStandby sets Standby field to given value.

### HasStandby

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasStandby() bool`

HasStandby returns a boolean if a field has been set.

### GetCustomBlobStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCustomBlobStore() ConfigNodePropertyBoolean`

GetCustomBlobStore returns the CustomBlobStore field if non-nil, zero value otherwise.

### GetCustomBlobStoreOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCustomBlobStoreOk() (*ConfigNodePropertyBoolean, bool)`

GetCustomBlobStoreOk returns a tuple with the CustomBlobStore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomBlobStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetCustomBlobStore(v ConfigNodePropertyBoolean)`

SetCustomBlobStore sets CustomBlobStore field to given value.

### HasCustomBlobStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasCustomBlobStore() bool`

HasCustomBlobStore returns a boolean if a field has been set.

### GetCustomSegmentStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCustomSegmentStore() ConfigNodePropertyBoolean`

GetCustomSegmentStore returns the CustomSegmentStore field if non-nil, zero value otherwise.

### GetCustomSegmentStoreOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetCustomSegmentStoreOk() (*ConfigNodePropertyBoolean, bool)`

GetCustomSegmentStoreOk returns a tuple with the CustomSegmentStore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomSegmentStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetCustomSegmentStore(v ConfigNodePropertyBoolean)`

SetCustomSegmentStore sets CustomSegmentStore field to given value.

### HasCustomSegmentStore

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasCustomSegmentStore() bool`

HasCustomSegmentStore returns a boolean if a field has been set.

### GetSplitPersistence

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetSplitPersistence() ConfigNodePropertyBoolean`

GetSplitPersistence returns the SplitPersistence field if non-nil, zero value otherwise.

### GetSplitPersistenceOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetSplitPersistenceOk() (*ConfigNodePropertyBoolean, bool)`

GetSplitPersistenceOk returns a tuple with the SplitPersistence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSplitPersistence

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetSplitPersistence(v ConfigNodePropertyBoolean)`

SetSplitPersistence sets SplitPersistence field to given value.

### HasSplitPersistence

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasSplitPersistence() bool`

HasSplitPersistence returns a boolean if a field has been set.

### GetRepositoryBackupDir

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetRepositoryBackupDir() ConfigNodePropertyString`

GetRepositoryBackupDir returns the RepositoryBackupDir field if non-nil, zero value otherwise.

### GetRepositoryBackupDirOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetRepositoryBackupDirOk() (*ConfigNodePropertyString, bool)`

GetRepositoryBackupDirOk returns a tuple with the RepositoryBackupDir field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepositoryBackupDir

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetRepositoryBackupDir(v ConfigNodePropertyString)`

SetRepositoryBackupDir sets RepositoryBackupDir field to given value.

### HasRepositoryBackupDir

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasRepositoryBackupDir() bool`

HasRepositoryBackupDir returns a boolean if a field has been set.

### GetBlobGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetBlobGcMaxAgeInSecs() ConfigNodePropertyInteger`

GetBlobGcMaxAgeInSecs returns the BlobGcMaxAgeInSecs field if non-nil, zero value otherwise.

### GetBlobGcMaxAgeInSecsOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetBlobGcMaxAgeInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetBlobGcMaxAgeInSecsOk returns a tuple with the BlobGcMaxAgeInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetBlobGcMaxAgeInSecs(v ConfigNodePropertyInteger)`

SetBlobGcMaxAgeInSecs sets BlobGcMaxAgeInSecs field to given value.

### HasBlobGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasBlobGcMaxAgeInSecs() bool`

HasBlobGcMaxAgeInSecs returns a boolean if a field has been set.

### GetBlobTrackSnapshotIntervalInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetBlobTrackSnapshotIntervalInSecs() ConfigNodePropertyInteger`

GetBlobTrackSnapshotIntervalInSecs returns the BlobTrackSnapshotIntervalInSecs field if non-nil, zero value otherwise.

### GetBlobTrackSnapshotIntervalInSecsOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetBlobTrackSnapshotIntervalInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetBlobTrackSnapshotIntervalInSecsOk returns a tuple with the BlobTrackSnapshotIntervalInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobTrackSnapshotIntervalInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetBlobTrackSnapshotIntervalInSecs(v ConfigNodePropertyInteger)`

SetBlobTrackSnapshotIntervalInSecs sets BlobTrackSnapshotIntervalInSecs field to given value.

### HasBlobTrackSnapshotIntervalInSecs

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasBlobTrackSnapshotIntervalInSecs() bool`

HasBlobTrackSnapshotIntervalInSecs returns a boolean if a field has been set.

### GetRole

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetRole() ConfigNodePropertyString`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetRoleOk() (*ConfigNodePropertyString, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetRole(v ConfigNodePropertyString)`

SetRole sets Role field to given value.

### HasRole

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasRole() bool`

HasRole returns a boolean if a field has been set.

### GetRegisterDescriptors

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetRegisterDescriptors() ConfigNodePropertyBoolean`

GetRegisterDescriptors returns the RegisterDescriptors field if non-nil, zero value otherwise.

### GetRegisterDescriptorsOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetRegisterDescriptorsOk() (*ConfigNodePropertyBoolean, bool)`

GetRegisterDescriptorsOk returns a tuple with the RegisterDescriptors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegisterDescriptors

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetRegisterDescriptors(v ConfigNodePropertyBoolean)`

SetRegisterDescriptors sets RegisterDescriptors field to given value.

### HasRegisterDescriptors

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasRegisterDescriptors() bool`

HasRegisterDescriptors returns a boolean if a field has been set.

### GetDispatchChanges

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetDispatchChanges() ConfigNodePropertyBoolean`

GetDispatchChanges returns the DispatchChanges field if non-nil, zero value otherwise.

### GetDispatchChangesOk

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) GetDispatchChangesOk() (*ConfigNodePropertyBoolean, bool)`

GetDispatchChangesOk returns a tuple with the DispatchChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDispatchChanges

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) SetDispatchChanges(v ConfigNodePropertyBoolean)`

SetDispatchChanges sets DispatchChanges field to given value.

### HasDispatchChanges

`func (o *OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties) HasDispatchChanges() bool`

HasDispatchChanges returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


