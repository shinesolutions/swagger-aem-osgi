# OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Title** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Details** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Enabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LogLevel** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**QueueProcessingEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PackageExporterEndpoints** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PullItems** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**HttpConnTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RequestAuthorizationStrategyTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TransportSecretProviderTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageBuilderTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TriggersTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Methods

### NewOrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties

`func NewOrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties() *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties`

NewOrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties instantiates a new OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesWithDefaults

`func NewOrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesWithDefaults() *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties`

NewOrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesWithDefaults instantiates a new OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetName() ConfigNodePropertyString`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetNameOk() (*ConfigNodePropertyString, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetName(v ConfigNodePropertyString)`

SetName sets Name field to given value.

### HasName

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTitle

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetTitle() ConfigNodePropertyString`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetTitleOk() (*ConfigNodePropertyString, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetTitle(v ConfigNodePropertyString)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetDetails

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetDetails() ConfigNodePropertyString`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetDetailsOk() (*ConfigNodePropertyString, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetDetails(v ConfigNodePropertyString)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### GetEnabled

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetEnabled() ConfigNodePropertyBoolean`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetEnabled(v ConfigNodePropertyBoolean)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetServiceName

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetServiceName() ConfigNodePropertyString`

GetServiceName returns the ServiceName field if non-nil, zero value otherwise.

### GetServiceNameOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetServiceNameOk() (*ConfigNodePropertyString, bool)`

GetServiceNameOk returns a tuple with the ServiceName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceName

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetServiceName(v ConfigNodePropertyString)`

SetServiceName sets ServiceName field to given value.

### HasServiceName

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasServiceName() bool`

HasServiceName returns a boolean if a field has been set.

### GetLogLevel

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetLogLevel() ConfigNodePropertyDropDown`

GetLogLevel returns the LogLevel field if non-nil, zero value otherwise.

### GetLogLevelOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetLogLevelOk() (*ConfigNodePropertyDropDown, bool)`

GetLogLevelOk returns a tuple with the LogLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogLevel

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetLogLevel(v ConfigNodePropertyDropDown)`

SetLogLevel sets LogLevel field to given value.

### HasLogLevel

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasLogLevel() bool`

HasLogLevel returns a boolean if a field has been set.

### GetQueueProcessingEnabled

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetQueueProcessingEnabled() ConfigNodePropertyBoolean`

GetQueueProcessingEnabled returns the QueueProcessingEnabled field if non-nil, zero value otherwise.

### GetQueueProcessingEnabledOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetQueueProcessingEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetQueueProcessingEnabledOk returns a tuple with the QueueProcessingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueProcessingEnabled

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetQueueProcessingEnabled(v ConfigNodePropertyBoolean)`

SetQueueProcessingEnabled sets QueueProcessingEnabled field to given value.

### HasQueueProcessingEnabled

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasQueueProcessingEnabled() bool`

HasQueueProcessingEnabled returns a boolean if a field has been set.

### GetPackageExporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetPackageExporterEndpoints() ConfigNodePropertyArray`

GetPackageExporterEndpoints returns the PackageExporterEndpoints field if non-nil, zero value otherwise.

### GetPackageExporterEndpointsOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetPackageExporterEndpointsOk() (*ConfigNodePropertyArray, bool)`

GetPackageExporterEndpointsOk returns a tuple with the PackageExporterEndpoints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageExporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetPackageExporterEndpoints(v ConfigNodePropertyArray)`

SetPackageExporterEndpoints sets PackageExporterEndpoints field to given value.

### HasPackageExporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasPackageExporterEndpoints() bool`

HasPackageExporterEndpoints returns a boolean if a field has been set.

### GetPullItems

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetPullItems() ConfigNodePropertyInteger`

GetPullItems returns the PullItems field if non-nil, zero value otherwise.

### GetPullItemsOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetPullItemsOk() (*ConfigNodePropertyInteger, bool)`

GetPullItemsOk returns a tuple with the PullItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPullItems

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetPullItems(v ConfigNodePropertyInteger)`

SetPullItems sets PullItems field to given value.

### HasPullItems

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasPullItems() bool`

HasPullItems returns a boolean if a field has been set.

### GetHttpConnTimeout

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetHttpConnTimeout() ConfigNodePropertyInteger`

GetHttpConnTimeout returns the HttpConnTimeout field if non-nil, zero value otherwise.

### GetHttpConnTimeoutOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetHttpConnTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetHttpConnTimeoutOk returns a tuple with the HttpConnTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHttpConnTimeout

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetHttpConnTimeout(v ConfigNodePropertyInteger)`

SetHttpConnTimeout sets HttpConnTimeout field to given value.

### HasHttpConnTimeout

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasHttpConnTimeout() bool`

HasHttpConnTimeout returns a boolean if a field has been set.

### GetRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetRequestAuthorizationStrategyTarget() ConfigNodePropertyString`

GetRequestAuthorizationStrategyTarget returns the RequestAuthorizationStrategyTarget field if non-nil, zero value otherwise.

### GetRequestAuthorizationStrategyTargetOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetRequestAuthorizationStrategyTargetOk() (*ConfigNodePropertyString, bool)`

GetRequestAuthorizationStrategyTargetOk returns a tuple with the RequestAuthorizationStrategyTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetRequestAuthorizationStrategyTarget(v ConfigNodePropertyString)`

SetRequestAuthorizationStrategyTarget sets RequestAuthorizationStrategyTarget field to given value.

### HasRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasRequestAuthorizationStrategyTarget() bool`

HasRequestAuthorizationStrategyTarget returns a boolean if a field has been set.

### GetTransportSecretProviderTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetTransportSecretProviderTarget() ConfigNodePropertyString`

GetTransportSecretProviderTarget returns the TransportSecretProviderTarget field if non-nil, zero value otherwise.

### GetTransportSecretProviderTargetOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetTransportSecretProviderTargetOk() (*ConfigNodePropertyString, bool)`

GetTransportSecretProviderTargetOk returns a tuple with the TransportSecretProviderTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransportSecretProviderTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetTransportSecretProviderTarget(v ConfigNodePropertyString)`

SetTransportSecretProviderTarget sets TransportSecretProviderTarget field to given value.

### HasTransportSecretProviderTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasTransportSecretProviderTarget() bool`

HasTransportSecretProviderTarget returns a boolean if a field has been set.

### GetPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetPackageBuilderTarget() ConfigNodePropertyString`

GetPackageBuilderTarget returns the PackageBuilderTarget field if non-nil, zero value otherwise.

### GetPackageBuilderTargetOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetPackageBuilderTargetOk() (*ConfigNodePropertyString, bool)`

GetPackageBuilderTargetOk returns a tuple with the PackageBuilderTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetPackageBuilderTarget(v ConfigNodePropertyString)`

SetPackageBuilderTarget sets PackageBuilderTarget field to given value.

### HasPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasPackageBuilderTarget() bool`

HasPackageBuilderTarget returns a boolean if a field has been set.

### GetTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetTriggersTarget() ConfigNodePropertyString`

GetTriggersTarget returns the TriggersTarget field if non-nil, zero value otherwise.

### GetTriggersTargetOk

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) GetTriggersTargetOk() (*ConfigNodePropertyString, bool)`

GetTriggersTargetOk returns a tuple with the TriggersTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) SetTriggersTarget(v ConfigNodePropertyString)`

SetTriggersTarget sets TriggersTarget field to given value.

### HasTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties) HasTriggersTarget() bool`

HasTriggersTarget returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


