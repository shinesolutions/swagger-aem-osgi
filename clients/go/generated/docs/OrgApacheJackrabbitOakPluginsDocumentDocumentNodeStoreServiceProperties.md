# OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mongouri** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Db** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SocketKeepAlive** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Cache** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**NodeCachePercentage** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PrevDocCachePercentage** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ChildrenCachePercentage** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DiffCachePercentage** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheSegmentCount** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CacheStackMoveDistance** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlobCacheSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PersistentCache** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JournalCache** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CustomBlobStore** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**JournalGCInterval** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**JournalGCMaxAge** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PrefetchExternalChanges** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Role** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**VersionGcMaxAgeInSecs** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**VersionGCExpression** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**VersionGCTimeLimitInSecs** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlobGcMaxAgeInSecs** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlobTrackSnapshotIntervalInSecs** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RepositoryHome** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxReplicationLagInSecs** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DocumentStoreType** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**BundlingDisabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**UpdateLimit** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PersistentCacheIncludes** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**LeaseCheckMode** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Methods

### NewOrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties

`func NewOrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties() *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties`

NewOrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties instantiates a new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesWithDefaults

`func NewOrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesWithDefaults() *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties`

NewOrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesWithDefaults instantiates a new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMongouri

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetMongouri() ConfigNodePropertyString`

GetMongouri returns the Mongouri field if non-nil, zero value otherwise.

### GetMongouriOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetMongouriOk() (*ConfigNodePropertyString, bool)`

GetMongouriOk returns a tuple with the Mongouri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMongouri

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetMongouri(v ConfigNodePropertyString)`

SetMongouri sets Mongouri field to given value.

### HasMongouri

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasMongouri() bool`

HasMongouri returns a boolean if a field has been set.

### GetDb

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetDb() ConfigNodePropertyString`

GetDb returns the Db field if non-nil, zero value otherwise.

### GetDbOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetDbOk() (*ConfigNodePropertyString, bool)`

GetDbOk returns a tuple with the Db field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDb

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetDb(v ConfigNodePropertyString)`

SetDb sets Db field to given value.

### HasDb

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasDb() bool`

HasDb returns a boolean if a field has been set.

### GetSocketKeepAlive

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetSocketKeepAlive() ConfigNodePropertyBoolean`

GetSocketKeepAlive returns the SocketKeepAlive field if non-nil, zero value otherwise.

### GetSocketKeepAliveOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetSocketKeepAliveOk() (*ConfigNodePropertyBoolean, bool)`

GetSocketKeepAliveOk returns a tuple with the SocketKeepAlive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSocketKeepAlive

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetSocketKeepAlive(v ConfigNodePropertyBoolean)`

SetSocketKeepAlive sets SocketKeepAlive field to given value.

### HasSocketKeepAlive

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasSocketKeepAlive() bool`

HasSocketKeepAlive returns a boolean if a field has been set.

### GetCache

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetCache() ConfigNodePropertyInteger`

GetCache returns the Cache field if non-nil, zero value otherwise.

### GetCacheOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetCacheOk() (*ConfigNodePropertyInteger, bool)`

GetCacheOk returns a tuple with the Cache field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCache

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetCache(v ConfigNodePropertyInteger)`

SetCache sets Cache field to given value.

### HasCache

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasCache() bool`

HasCache returns a boolean if a field has been set.

### GetNodeCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetNodeCachePercentage() ConfigNodePropertyInteger`

GetNodeCachePercentage returns the NodeCachePercentage field if non-nil, zero value otherwise.

### GetNodeCachePercentageOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetNodeCachePercentageOk() (*ConfigNodePropertyInteger, bool)`

GetNodeCachePercentageOk returns a tuple with the NodeCachePercentage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNodeCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetNodeCachePercentage(v ConfigNodePropertyInteger)`

SetNodeCachePercentage sets NodeCachePercentage field to given value.

### HasNodeCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasNodeCachePercentage() bool`

HasNodeCachePercentage returns a boolean if a field has been set.

### GetPrevDocCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetPrevDocCachePercentage() ConfigNodePropertyInteger`

GetPrevDocCachePercentage returns the PrevDocCachePercentage field if non-nil, zero value otherwise.

### GetPrevDocCachePercentageOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetPrevDocCachePercentageOk() (*ConfigNodePropertyInteger, bool)`

GetPrevDocCachePercentageOk returns a tuple with the PrevDocCachePercentage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevDocCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetPrevDocCachePercentage(v ConfigNodePropertyInteger)`

SetPrevDocCachePercentage sets PrevDocCachePercentage field to given value.

### HasPrevDocCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasPrevDocCachePercentage() bool`

HasPrevDocCachePercentage returns a boolean if a field has been set.

### GetChildrenCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetChildrenCachePercentage() ConfigNodePropertyInteger`

GetChildrenCachePercentage returns the ChildrenCachePercentage field if non-nil, zero value otherwise.

### GetChildrenCachePercentageOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetChildrenCachePercentageOk() (*ConfigNodePropertyInteger, bool)`

GetChildrenCachePercentageOk returns a tuple with the ChildrenCachePercentage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChildrenCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetChildrenCachePercentage(v ConfigNodePropertyInteger)`

SetChildrenCachePercentage sets ChildrenCachePercentage field to given value.

### HasChildrenCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasChildrenCachePercentage() bool`

HasChildrenCachePercentage returns a boolean if a field has been set.

### GetDiffCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetDiffCachePercentage() ConfigNodePropertyInteger`

GetDiffCachePercentage returns the DiffCachePercentage field if non-nil, zero value otherwise.

### GetDiffCachePercentageOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetDiffCachePercentageOk() (*ConfigNodePropertyInteger, bool)`

GetDiffCachePercentageOk returns a tuple with the DiffCachePercentage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiffCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetDiffCachePercentage(v ConfigNodePropertyInteger)`

SetDiffCachePercentage sets DiffCachePercentage field to given value.

### HasDiffCachePercentage

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasDiffCachePercentage() bool`

HasDiffCachePercentage returns a boolean if a field has been set.

### GetCacheSegmentCount

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetCacheSegmentCount() ConfigNodePropertyInteger`

GetCacheSegmentCount returns the CacheSegmentCount field if non-nil, zero value otherwise.

### GetCacheSegmentCountOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetCacheSegmentCountOk() (*ConfigNodePropertyInteger, bool)`

GetCacheSegmentCountOk returns a tuple with the CacheSegmentCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCacheSegmentCount

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetCacheSegmentCount(v ConfigNodePropertyInteger)`

SetCacheSegmentCount sets CacheSegmentCount field to given value.

### HasCacheSegmentCount

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasCacheSegmentCount() bool`

HasCacheSegmentCount returns a boolean if a field has been set.

### GetCacheStackMoveDistance

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetCacheStackMoveDistance() ConfigNodePropertyInteger`

GetCacheStackMoveDistance returns the CacheStackMoveDistance field if non-nil, zero value otherwise.

### GetCacheStackMoveDistanceOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetCacheStackMoveDistanceOk() (*ConfigNodePropertyInteger, bool)`

GetCacheStackMoveDistanceOk returns a tuple with the CacheStackMoveDistance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCacheStackMoveDistance

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetCacheStackMoveDistance(v ConfigNodePropertyInteger)`

SetCacheStackMoveDistance sets CacheStackMoveDistance field to given value.

### HasCacheStackMoveDistance

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasCacheStackMoveDistance() bool`

HasCacheStackMoveDistance returns a boolean if a field has been set.

### GetBlobCacheSize

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetBlobCacheSize() ConfigNodePropertyInteger`

GetBlobCacheSize returns the BlobCacheSize field if non-nil, zero value otherwise.

### GetBlobCacheSizeOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetBlobCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetBlobCacheSizeOk returns a tuple with the BlobCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobCacheSize

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetBlobCacheSize(v ConfigNodePropertyInteger)`

SetBlobCacheSize sets BlobCacheSize field to given value.

### HasBlobCacheSize

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasBlobCacheSize() bool`

HasBlobCacheSize returns a boolean if a field has been set.

### GetPersistentCache

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetPersistentCache() ConfigNodePropertyString`

GetPersistentCache returns the PersistentCache field if non-nil, zero value otherwise.

### GetPersistentCacheOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetPersistentCacheOk() (*ConfigNodePropertyString, bool)`

GetPersistentCacheOk returns a tuple with the PersistentCache field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPersistentCache

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetPersistentCache(v ConfigNodePropertyString)`

SetPersistentCache sets PersistentCache field to given value.

### HasPersistentCache

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasPersistentCache() bool`

HasPersistentCache returns a boolean if a field has been set.

### GetJournalCache

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetJournalCache() ConfigNodePropertyString`

GetJournalCache returns the JournalCache field if non-nil, zero value otherwise.

### GetJournalCacheOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetJournalCacheOk() (*ConfigNodePropertyString, bool)`

GetJournalCacheOk returns a tuple with the JournalCache field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJournalCache

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetJournalCache(v ConfigNodePropertyString)`

SetJournalCache sets JournalCache field to given value.

### HasJournalCache

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasJournalCache() bool`

HasJournalCache returns a boolean if a field has been set.

### GetCustomBlobStore

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetCustomBlobStore() ConfigNodePropertyBoolean`

GetCustomBlobStore returns the CustomBlobStore field if non-nil, zero value otherwise.

### GetCustomBlobStoreOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetCustomBlobStoreOk() (*ConfigNodePropertyBoolean, bool)`

GetCustomBlobStoreOk returns a tuple with the CustomBlobStore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomBlobStore

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetCustomBlobStore(v ConfigNodePropertyBoolean)`

SetCustomBlobStore sets CustomBlobStore field to given value.

### HasCustomBlobStore

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasCustomBlobStore() bool`

HasCustomBlobStore returns a boolean if a field has been set.

### GetJournalGCInterval

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetJournalGCInterval() ConfigNodePropertyInteger`

GetJournalGCInterval returns the JournalGCInterval field if non-nil, zero value otherwise.

### GetJournalGCIntervalOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetJournalGCIntervalOk() (*ConfigNodePropertyInteger, bool)`

GetJournalGCIntervalOk returns a tuple with the JournalGCInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJournalGCInterval

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetJournalGCInterval(v ConfigNodePropertyInteger)`

SetJournalGCInterval sets JournalGCInterval field to given value.

### HasJournalGCInterval

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasJournalGCInterval() bool`

HasJournalGCInterval returns a boolean if a field has been set.

### GetJournalGCMaxAge

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetJournalGCMaxAge() ConfigNodePropertyInteger`

GetJournalGCMaxAge returns the JournalGCMaxAge field if non-nil, zero value otherwise.

### GetJournalGCMaxAgeOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetJournalGCMaxAgeOk() (*ConfigNodePropertyInteger, bool)`

GetJournalGCMaxAgeOk returns a tuple with the JournalGCMaxAge field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJournalGCMaxAge

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetJournalGCMaxAge(v ConfigNodePropertyInteger)`

SetJournalGCMaxAge sets JournalGCMaxAge field to given value.

### HasJournalGCMaxAge

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasJournalGCMaxAge() bool`

HasJournalGCMaxAge returns a boolean if a field has been set.

### GetPrefetchExternalChanges

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetPrefetchExternalChanges() ConfigNodePropertyBoolean`

GetPrefetchExternalChanges returns the PrefetchExternalChanges field if non-nil, zero value otherwise.

### GetPrefetchExternalChangesOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetPrefetchExternalChangesOk() (*ConfigNodePropertyBoolean, bool)`

GetPrefetchExternalChangesOk returns a tuple with the PrefetchExternalChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrefetchExternalChanges

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetPrefetchExternalChanges(v ConfigNodePropertyBoolean)`

SetPrefetchExternalChanges sets PrefetchExternalChanges field to given value.

### HasPrefetchExternalChanges

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasPrefetchExternalChanges() bool`

HasPrefetchExternalChanges returns a boolean if a field has been set.

### GetRole

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetRole() ConfigNodePropertyString`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetRoleOk() (*ConfigNodePropertyString, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetRole(v ConfigNodePropertyString)`

SetRole sets Role field to given value.

### HasRole

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasRole() bool`

HasRole returns a boolean if a field has been set.

### GetVersionGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetVersionGcMaxAgeInSecs() ConfigNodePropertyInteger`

GetVersionGcMaxAgeInSecs returns the VersionGcMaxAgeInSecs field if non-nil, zero value otherwise.

### GetVersionGcMaxAgeInSecsOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetVersionGcMaxAgeInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetVersionGcMaxAgeInSecsOk returns a tuple with the VersionGcMaxAgeInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetVersionGcMaxAgeInSecs(v ConfigNodePropertyInteger)`

SetVersionGcMaxAgeInSecs sets VersionGcMaxAgeInSecs field to given value.

### HasVersionGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasVersionGcMaxAgeInSecs() bool`

HasVersionGcMaxAgeInSecs returns a boolean if a field has been set.

### GetVersionGCExpression

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetVersionGCExpression() ConfigNodePropertyString`

GetVersionGCExpression returns the VersionGCExpression field if non-nil, zero value otherwise.

### GetVersionGCExpressionOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetVersionGCExpressionOk() (*ConfigNodePropertyString, bool)`

GetVersionGCExpressionOk returns a tuple with the VersionGCExpression field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGCExpression

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetVersionGCExpression(v ConfigNodePropertyString)`

SetVersionGCExpression sets VersionGCExpression field to given value.

### HasVersionGCExpression

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasVersionGCExpression() bool`

HasVersionGCExpression returns a boolean if a field has been set.

### GetVersionGCTimeLimitInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetVersionGCTimeLimitInSecs() ConfigNodePropertyInteger`

GetVersionGCTimeLimitInSecs returns the VersionGCTimeLimitInSecs field if non-nil, zero value otherwise.

### GetVersionGCTimeLimitInSecsOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetVersionGCTimeLimitInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetVersionGCTimeLimitInSecsOk returns a tuple with the VersionGCTimeLimitInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGCTimeLimitInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetVersionGCTimeLimitInSecs(v ConfigNodePropertyInteger)`

SetVersionGCTimeLimitInSecs sets VersionGCTimeLimitInSecs field to given value.

### HasVersionGCTimeLimitInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasVersionGCTimeLimitInSecs() bool`

HasVersionGCTimeLimitInSecs returns a boolean if a field has been set.

### GetBlobGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetBlobGcMaxAgeInSecs() ConfigNodePropertyInteger`

GetBlobGcMaxAgeInSecs returns the BlobGcMaxAgeInSecs field if non-nil, zero value otherwise.

### GetBlobGcMaxAgeInSecsOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetBlobGcMaxAgeInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetBlobGcMaxAgeInSecsOk returns a tuple with the BlobGcMaxAgeInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetBlobGcMaxAgeInSecs(v ConfigNodePropertyInteger)`

SetBlobGcMaxAgeInSecs sets BlobGcMaxAgeInSecs field to given value.

### HasBlobGcMaxAgeInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasBlobGcMaxAgeInSecs() bool`

HasBlobGcMaxAgeInSecs returns a boolean if a field has been set.

### GetBlobTrackSnapshotIntervalInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetBlobTrackSnapshotIntervalInSecs() ConfigNodePropertyInteger`

GetBlobTrackSnapshotIntervalInSecs returns the BlobTrackSnapshotIntervalInSecs field if non-nil, zero value otherwise.

### GetBlobTrackSnapshotIntervalInSecsOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetBlobTrackSnapshotIntervalInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetBlobTrackSnapshotIntervalInSecsOk returns a tuple with the BlobTrackSnapshotIntervalInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobTrackSnapshotIntervalInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetBlobTrackSnapshotIntervalInSecs(v ConfigNodePropertyInteger)`

SetBlobTrackSnapshotIntervalInSecs sets BlobTrackSnapshotIntervalInSecs field to given value.

### HasBlobTrackSnapshotIntervalInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasBlobTrackSnapshotIntervalInSecs() bool`

HasBlobTrackSnapshotIntervalInSecs returns a boolean if a field has been set.

### GetRepositoryHome

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetRepositoryHome() ConfigNodePropertyString`

GetRepositoryHome returns the RepositoryHome field if non-nil, zero value otherwise.

### GetRepositoryHomeOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetRepositoryHomeOk() (*ConfigNodePropertyString, bool)`

GetRepositoryHomeOk returns a tuple with the RepositoryHome field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepositoryHome

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetRepositoryHome(v ConfigNodePropertyString)`

SetRepositoryHome sets RepositoryHome field to given value.

### HasRepositoryHome

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasRepositoryHome() bool`

HasRepositoryHome returns a boolean if a field has been set.

### GetMaxReplicationLagInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetMaxReplicationLagInSecs() ConfigNodePropertyInteger`

GetMaxReplicationLagInSecs returns the MaxReplicationLagInSecs field if non-nil, zero value otherwise.

### GetMaxReplicationLagInSecsOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetMaxReplicationLagInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetMaxReplicationLagInSecsOk returns a tuple with the MaxReplicationLagInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxReplicationLagInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetMaxReplicationLagInSecs(v ConfigNodePropertyInteger)`

SetMaxReplicationLagInSecs sets MaxReplicationLagInSecs field to given value.

### HasMaxReplicationLagInSecs

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasMaxReplicationLagInSecs() bool`

HasMaxReplicationLagInSecs returns a boolean if a field has been set.

### GetDocumentStoreType

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetDocumentStoreType() ConfigNodePropertyDropDown`

GetDocumentStoreType returns the DocumentStoreType field if non-nil, zero value otherwise.

### GetDocumentStoreTypeOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetDocumentStoreTypeOk() (*ConfigNodePropertyDropDown, bool)`

GetDocumentStoreTypeOk returns a tuple with the DocumentStoreType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentStoreType

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetDocumentStoreType(v ConfigNodePropertyDropDown)`

SetDocumentStoreType sets DocumentStoreType field to given value.

### HasDocumentStoreType

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasDocumentStoreType() bool`

HasDocumentStoreType returns a boolean if a field has been set.

### GetBundlingDisabled

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetBundlingDisabled() ConfigNodePropertyBoolean`

GetBundlingDisabled returns the BundlingDisabled field if non-nil, zero value otherwise.

### GetBundlingDisabledOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetBundlingDisabledOk() (*ConfigNodePropertyBoolean, bool)`

GetBundlingDisabledOk returns a tuple with the BundlingDisabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBundlingDisabled

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetBundlingDisabled(v ConfigNodePropertyBoolean)`

SetBundlingDisabled sets BundlingDisabled field to given value.

### HasBundlingDisabled

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasBundlingDisabled() bool`

HasBundlingDisabled returns a boolean if a field has been set.

### GetUpdateLimit

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetUpdateLimit() ConfigNodePropertyInteger`

GetUpdateLimit returns the UpdateLimit field if non-nil, zero value otherwise.

### GetUpdateLimitOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetUpdateLimitOk() (*ConfigNodePropertyInteger, bool)`

GetUpdateLimitOk returns a tuple with the UpdateLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateLimit

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetUpdateLimit(v ConfigNodePropertyInteger)`

SetUpdateLimit sets UpdateLimit field to given value.

### HasUpdateLimit

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasUpdateLimit() bool`

HasUpdateLimit returns a boolean if a field has been set.

### GetPersistentCacheIncludes

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetPersistentCacheIncludes() ConfigNodePropertyArray`

GetPersistentCacheIncludes returns the PersistentCacheIncludes field if non-nil, zero value otherwise.

### GetPersistentCacheIncludesOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetPersistentCacheIncludesOk() (*ConfigNodePropertyArray, bool)`

GetPersistentCacheIncludesOk returns a tuple with the PersistentCacheIncludes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPersistentCacheIncludes

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetPersistentCacheIncludes(v ConfigNodePropertyArray)`

SetPersistentCacheIncludes sets PersistentCacheIncludes field to given value.

### HasPersistentCacheIncludes

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasPersistentCacheIncludes() bool`

HasPersistentCacheIncludes returns a boolean if a field has been set.

### GetLeaseCheckMode

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetLeaseCheckMode() ConfigNodePropertyDropDown`

GetLeaseCheckMode returns the LeaseCheckMode field if non-nil, zero value otherwise.

### GetLeaseCheckModeOk

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) GetLeaseCheckModeOk() (*ConfigNodePropertyDropDown, bool)`

GetLeaseCheckModeOk returns a tuple with the LeaseCheckMode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeaseCheckMode

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) SetLeaseCheckMode(v ConfigNodePropertyDropDown)`

SetLeaseCheckMode sets LeaseCheckMode field to given value.

### HasLeaseCheckMode

`func (o *OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties) HasLeaseCheckMode() bool`

HasLeaseCheckMode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


