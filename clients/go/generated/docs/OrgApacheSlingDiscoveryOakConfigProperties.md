# OrgApacheSlingDiscoveryOakConfigProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConnectorPingTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ConnectorPingInterval** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DiscoveryLiteCheckInterval** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterSyncServiceTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterSyncServiceInterval** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**EnableSyncToken** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MinEventDelay** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SocketConnectTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SoTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TopologyConnectorUrls** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**TopologyConnectorWhitelist** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AutoStopLocalLoopEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GzipConnectorRequestsEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**HmacEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**EnableEncryption** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SharedKey** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HmacSharedKeyTTL** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BackoffStandbyFactor** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**BackoffStableFactor** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Methods

### NewOrgApacheSlingDiscoveryOakConfigProperties

`func NewOrgApacheSlingDiscoveryOakConfigProperties() *OrgApacheSlingDiscoveryOakConfigProperties`

NewOrgApacheSlingDiscoveryOakConfigProperties instantiates a new OrgApacheSlingDiscoveryOakConfigProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingDiscoveryOakConfigPropertiesWithDefaults

`func NewOrgApacheSlingDiscoveryOakConfigPropertiesWithDefaults() *OrgApacheSlingDiscoveryOakConfigProperties`

NewOrgApacheSlingDiscoveryOakConfigPropertiesWithDefaults instantiates a new OrgApacheSlingDiscoveryOakConfigProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConnectorPingTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetConnectorPingTimeout() ConfigNodePropertyInteger`

GetConnectorPingTimeout returns the ConnectorPingTimeout field if non-nil, zero value otherwise.

### GetConnectorPingTimeoutOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetConnectorPingTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetConnectorPingTimeoutOk returns a tuple with the ConnectorPingTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectorPingTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetConnectorPingTimeout(v ConfigNodePropertyInteger)`

SetConnectorPingTimeout sets ConnectorPingTimeout field to given value.

### HasConnectorPingTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasConnectorPingTimeout() bool`

HasConnectorPingTimeout returns a boolean if a field has been set.

### GetConnectorPingInterval

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetConnectorPingInterval() ConfigNodePropertyInteger`

GetConnectorPingInterval returns the ConnectorPingInterval field if non-nil, zero value otherwise.

### GetConnectorPingIntervalOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetConnectorPingIntervalOk() (*ConfigNodePropertyInteger, bool)`

GetConnectorPingIntervalOk returns a tuple with the ConnectorPingInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectorPingInterval

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetConnectorPingInterval(v ConfigNodePropertyInteger)`

SetConnectorPingInterval sets ConnectorPingInterval field to given value.

### HasConnectorPingInterval

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasConnectorPingInterval() bool`

HasConnectorPingInterval returns a boolean if a field has been set.

### GetDiscoveryLiteCheckInterval

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetDiscoveryLiteCheckInterval() ConfigNodePropertyInteger`

GetDiscoveryLiteCheckInterval returns the DiscoveryLiteCheckInterval field if non-nil, zero value otherwise.

### GetDiscoveryLiteCheckIntervalOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetDiscoveryLiteCheckIntervalOk() (*ConfigNodePropertyInteger, bool)`

GetDiscoveryLiteCheckIntervalOk returns a tuple with the DiscoveryLiteCheckInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscoveryLiteCheckInterval

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetDiscoveryLiteCheckInterval(v ConfigNodePropertyInteger)`

SetDiscoveryLiteCheckInterval sets DiscoveryLiteCheckInterval field to given value.

### HasDiscoveryLiteCheckInterval

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasDiscoveryLiteCheckInterval() bool`

HasDiscoveryLiteCheckInterval returns a boolean if a field has been set.

### GetClusterSyncServiceTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetClusterSyncServiceTimeout() ConfigNodePropertyInteger`

GetClusterSyncServiceTimeout returns the ClusterSyncServiceTimeout field if non-nil, zero value otherwise.

### GetClusterSyncServiceTimeoutOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetClusterSyncServiceTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetClusterSyncServiceTimeoutOk returns a tuple with the ClusterSyncServiceTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterSyncServiceTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetClusterSyncServiceTimeout(v ConfigNodePropertyInteger)`

SetClusterSyncServiceTimeout sets ClusterSyncServiceTimeout field to given value.

### HasClusterSyncServiceTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasClusterSyncServiceTimeout() bool`

HasClusterSyncServiceTimeout returns a boolean if a field has been set.

### GetClusterSyncServiceInterval

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetClusterSyncServiceInterval() ConfigNodePropertyInteger`

GetClusterSyncServiceInterval returns the ClusterSyncServiceInterval field if non-nil, zero value otherwise.

### GetClusterSyncServiceIntervalOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetClusterSyncServiceIntervalOk() (*ConfigNodePropertyInteger, bool)`

GetClusterSyncServiceIntervalOk returns a tuple with the ClusterSyncServiceInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterSyncServiceInterval

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetClusterSyncServiceInterval(v ConfigNodePropertyInteger)`

SetClusterSyncServiceInterval sets ClusterSyncServiceInterval field to given value.

### HasClusterSyncServiceInterval

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasClusterSyncServiceInterval() bool`

HasClusterSyncServiceInterval returns a boolean if a field has been set.

### GetEnableSyncToken

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetEnableSyncToken() ConfigNodePropertyBoolean`

GetEnableSyncToken returns the EnableSyncToken field if non-nil, zero value otherwise.

### GetEnableSyncTokenOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetEnableSyncTokenOk() (*ConfigNodePropertyBoolean, bool)`

GetEnableSyncTokenOk returns a tuple with the EnableSyncToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnableSyncToken

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetEnableSyncToken(v ConfigNodePropertyBoolean)`

SetEnableSyncToken sets EnableSyncToken field to given value.

### HasEnableSyncToken

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasEnableSyncToken() bool`

HasEnableSyncToken returns a boolean if a field has been set.

### GetMinEventDelay

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetMinEventDelay() ConfigNodePropertyInteger`

GetMinEventDelay returns the MinEventDelay field if non-nil, zero value otherwise.

### GetMinEventDelayOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetMinEventDelayOk() (*ConfigNodePropertyInteger, bool)`

GetMinEventDelayOk returns a tuple with the MinEventDelay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinEventDelay

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetMinEventDelay(v ConfigNodePropertyInteger)`

SetMinEventDelay sets MinEventDelay field to given value.

### HasMinEventDelay

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasMinEventDelay() bool`

HasMinEventDelay returns a boolean if a field has been set.

### GetSocketConnectTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetSocketConnectTimeout() ConfigNodePropertyInteger`

GetSocketConnectTimeout returns the SocketConnectTimeout field if non-nil, zero value otherwise.

### GetSocketConnectTimeoutOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetSocketConnectTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetSocketConnectTimeoutOk returns a tuple with the SocketConnectTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSocketConnectTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetSocketConnectTimeout(v ConfigNodePropertyInteger)`

SetSocketConnectTimeout sets SocketConnectTimeout field to given value.

### HasSocketConnectTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasSocketConnectTimeout() bool`

HasSocketConnectTimeout returns a boolean if a field has been set.

### GetSoTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetSoTimeout() ConfigNodePropertyInteger`

GetSoTimeout returns the SoTimeout field if non-nil, zero value otherwise.

### GetSoTimeoutOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetSoTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetSoTimeoutOk returns a tuple with the SoTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSoTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetSoTimeout(v ConfigNodePropertyInteger)`

SetSoTimeout sets SoTimeout field to given value.

### HasSoTimeout

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasSoTimeout() bool`

HasSoTimeout returns a boolean if a field has been set.

### GetTopologyConnectorUrls

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetTopologyConnectorUrls() ConfigNodePropertyArray`

GetTopologyConnectorUrls returns the TopologyConnectorUrls field if non-nil, zero value otherwise.

### GetTopologyConnectorUrlsOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetTopologyConnectorUrlsOk() (*ConfigNodePropertyArray, bool)`

GetTopologyConnectorUrlsOk returns a tuple with the TopologyConnectorUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopologyConnectorUrls

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetTopologyConnectorUrls(v ConfigNodePropertyArray)`

SetTopologyConnectorUrls sets TopologyConnectorUrls field to given value.

### HasTopologyConnectorUrls

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasTopologyConnectorUrls() bool`

HasTopologyConnectorUrls returns a boolean if a field has been set.

### GetTopologyConnectorWhitelist

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetTopologyConnectorWhitelist() ConfigNodePropertyArray`

GetTopologyConnectorWhitelist returns the TopologyConnectorWhitelist field if non-nil, zero value otherwise.

### GetTopologyConnectorWhitelistOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetTopologyConnectorWhitelistOk() (*ConfigNodePropertyArray, bool)`

GetTopologyConnectorWhitelistOk returns a tuple with the TopologyConnectorWhitelist field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopologyConnectorWhitelist

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetTopologyConnectorWhitelist(v ConfigNodePropertyArray)`

SetTopologyConnectorWhitelist sets TopologyConnectorWhitelist field to given value.

### HasTopologyConnectorWhitelist

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasTopologyConnectorWhitelist() bool`

HasTopologyConnectorWhitelist returns a boolean if a field has been set.

### GetAutoStopLocalLoopEnabled

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetAutoStopLocalLoopEnabled() ConfigNodePropertyBoolean`

GetAutoStopLocalLoopEnabled returns the AutoStopLocalLoopEnabled field if non-nil, zero value otherwise.

### GetAutoStopLocalLoopEnabledOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetAutoStopLocalLoopEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetAutoStopLocalLoopEnabledOk returns a tuple with the AutoStopLocalLoopEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoStopLocalLoopEnabled

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetAutoStopLocalLoopEnabled(v ConfigNodePropertyBoolean)`

SetAutoStopLocalLoopEnabled sets AutoStopLocalLoopEnabled field to given value.

### HasAutoStopLocalLoopEnabled

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasAutoStopLocalLoopEnabled() bool`

HasAutoStopLocalLoopEnabled returns a boolean if a field has been set.

### GetGzipConnectorRequestsEnabled

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetGzipConnectorRequestsEnabled() ConfigNodePropertyBoolean`

GetGzipConnectorRequestsEnabled returns the GzipConnectorRequestsEnabled field if non-nil, zero value otherwise.

### GetGzipConnectorRequestsEnabledOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetGzipConnectorRequestsEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetGzipConnectorRequestsEnabledOk returns a tuple with the GzipConnectorRequestsEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGzipConnectorRequestsEnabled

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetGzipConnectorRequestsEnabled(v ConfigNodePropertyBoolean)`

SetGzipConnectorRequestsEnabled sets GzipConnectorRequestsEnabled field to given value.

### HasGzipConnectorRequestsEnabled

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasGzipConnectorRequestsEnabled() bool`

HasGzipConnectorRequestsEnabled returns a boolean if a field has been set.

### GetHmacEnabled

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetHmacEnabled() ConfigNodePropertyBoolean`

GetHmacEnabled returns the HmacEnabled field if non-nil, zero value otherwise.

### GetHmacEnabledOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetHmacEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetHmacEnabledOk returns a tuple with the HmacEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHmacEnabled

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetHmacEnabled(v ConfigNodePropertyBoolean)`

SetHmacEnabled sets HmacEnabled field to given value.

### HasHmacEnabled

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasHmacEnabled() bool`

HasHmacEnabled returns a boolean if a field has been set.

### GetEnableEncryption

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetEnableEncryption() ConfigNodePropertyBoolean`

GetEnableEncryption returns the EnableEncryption field if non-nil, zero value otherwise.

### GetEnableEncryptionOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetEnableEncryptionOk() (*ConfigNodePropertyBoolean, bool)`

GetEnableEncryptionOk returns a tuple with the EnableEncryption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnableEncryption

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetEnableEncryption(v ConfigNodePropertyBoolean)`

SetEnableEncryption sets EnableEncryption field to given value.

### HasEnableEncryption

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasEnableEncryption() bool`

HasEnableEncryption returns a boolean if a field has been set.

### GetSharedKey

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetSharedKey() ConfigNodePropertyString`

GetSharedKey returns the SharedKey field if non-nil, zero value otherwise.

### GetSharedKeyOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetSharedKeyOk() (*ConfigNodePropertyString, bool)`

GetSharedKeyOk returns a tuple with the SharedKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharedKey

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetSharedKey(v ConfigNodePropertyString)`

SetSharedKey sets SharedKey field to given value.

### HasSharedKey

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasSharedKey() bool`

HasSharedKey returns a boolean if a field has been set.

### GetHmacSharedKeyTTL

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetHmacSharedKeyTTL() ConfigNodePropertyInteger`

GetHmacSharedKeyTTL returns the HmacSharedKeyTTL field if non-nil, zero value otherwise.

### GetHmacSharedKeyTTLOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetHmacSharedKeyTTLOk() (*ConfigNodePropertyInteger, bool)`

GetHmacSharedKeyTTLOk returns a tuple with the HmacSharedKeyTTL field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHmacSharedKeyTTL

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetHmacSharedKeyTTL(v ConfigNodePropertyInteger)`

SetHmacSharedKeyTTL sets HmacSharedKeyTTL field to given value.

### HasHmacSharedKeyTTL

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasHmacSharedKeyTTL() bool`

HasHmacSharedKeyTTL returns a boolean if a field has been set.

### GetBackoffStandbyFactor

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetBackoffStandbyFactor() ConfigNodePropertyString`

GetBackoffStandbyFactor returns the BackoffStandbyFactor field if non-nil, zero value otherwise.

### GetBackoffStandbyFactorOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetBackoffStandbyFactorOk() (*ConfigNodePropertyString, bool)`

GetBackoffStandbyFactorOk returns a tuple with the BackoffStandbyFactor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackoffStandbyFactor

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetBackoffStandbyFactor(v ConfigNodePropertyString)`

SetBackoffStandbyFactor sets BackoffStandbyFactor field to given value.

### HasBackoffStandbyFactor

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasBackoffStandbyFactor() bool`

HasBackoffStandbyFactor returns a boolean if a field has been set.

### GetBackoffStableFactor

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetBackoffStableFactor() ConfigNodePropertyString`

GetBackoffStableFactor returns the BackoffStableFactor field if non-nil, zero value otherwise.

### GetBackoffStableFactorOk

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) GetBackoffStableFactorOk() (*ConfigNodePropertyString, bool)`

GetBackoffStableFactorOk returns a tuple with the BackoffStableFactor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackoffStableFactor

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) SetBackoffStableFactor(v ConfigNodePropertyString)`

SetBackoffStableFactor sets BackoffStableFactor field to given value.

### HasBackoffStableFactor

`func (o *OrgApacheSlingDiscoveryOakConfigProperties) HasBackoffStableFactor() bool`

HasBackoffStableFactor returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


