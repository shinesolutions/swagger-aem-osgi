# ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JdbcDriverClass** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcConnectionUri** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcUsername** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcPassword** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcValidationQuery** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultReadonly** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DefaultAutocommit** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PoolSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PoolMaxWaitMsec** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DatasourceName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DatasourceSvcProperties** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Methods

### NewComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties

`func NewComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties() *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties`

NewComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties instantiates a new ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesWithDefaults

`func NewComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesWithDefaults() *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties`

NewComDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesWithDefaults instantiates a new ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetJdbcDriverClass

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcDriverClass() ConfigNodePropertyString`

GetJdbcDriverClass returns the JdbcDriverClass field if non-nil, zero value otherwise.

### GetJdbcDriverClassOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcDriverClassOk() (*ConfigNodePropertyString, bool)`

GetJdbcDriverClassOk returns a tuple with the JdbcDriverClass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJdbcDriverClass

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetJdbcDriverClass(v ConfigNodePropertyString)`

SetJdbcDriverClass sets JdbcDriverClass field to given value.

### HasJdbcDriverClass

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasJdbcDriverClass() bool`

HasJdbcDriverClass returns a boolean if a field has been set.

### GetJdbcConnectionUri

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcConnectionUri() ConfigNodePropertyString`

GetJdbcConnectionUri returns the JdbcConnectionUri field if non-nil, zero value otherwise.

### GetJdbcConnectionUriOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcConnectionUriOk() (*ConfigNodePropertyString, bool)`

GetJdbcConnectionUriOk returns a tuple with the JdbcConnectionUri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJdbcConnectionUri

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetJdbcConnectionUri(v ConfigNodePropertyString)`

SetJdbcConnectionUri sets JdbcConnectionUri field to given value.

### HasJdbcConnectionUri

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasJdbcConnectionUri() bool`

HasJdbcConnectionUri returns a boolean if a field has been set.

### GetJdbcUsername

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcUsername() ConfigNodePropertyString`

GetJdbcUsername returns the JdbcUsername field if non-nil, zero value otherwise.

### GetJdbcUsernameOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcUsernameOk() (*ConfigNodePropertyString, bool)`

GetJdbcUsernameOk returns a tuple with the JdbcUsername field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJdbcUsername

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetJdbcUsername(v ConfigNodePropertyString)`

SetJdbcUsername sets JdbcUsername field to given value.

### HasJdbcUsername

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasJdbcUsername() bool`

HasJdbcUsername returns a boolean if a field has been set.

### GetJdbcPassword

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcPassword() ConfigNodePropertyString`

GetJdbcPassword returns the JdbcPassword field if non-nil, zero value otherwise.

### GetJdbcPasswordOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcPasswordOk() (*ConfigNodePropertyString, bool)`

GetJdbcPasswordOk returns a tuple with the JdbcPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJdbcPassword

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetJdbcPassword(v ConfigNodePropertyString)`

SetJdbcPassword sets JdbcPassword field to given value.

### HasJdbcPassword

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasJdbcPassword() bool`

HasJdbcPassword returns a boolean if a field has been set.

### GetJdbcValidationQuery

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcValidationQuery() ConfigNodePropertyString`

GetJdbcValidationQuery returns the JdbcValidationQuery field if non-nil, zero value otherwise.

### GetJdbcValidationQueryOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetJdbcValidationQueryOk() (*ConfigNodePropertyString, bool)`

GetJdbcValidationQueryOk returns a tuple with the JdbcValidationQuery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJdbcValidationQuery

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetJdbcValidationQuery(v ConfigNodePropertyString)`

SetJdbcValidationQuery sets JdbcValidationQuery field to given value.

### HasJdbcValidationQuery

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasJdbcValidationQuery() bool`

HasJdbcValidationQuery returns a boolean if a field has been set.

### GetDefaultReadonly

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetDefaultReadonly() ConfigNodePropertyBoolean`

GetDefaultReadonly returns the DefaultReadonly field if non-nil, zero value otherwise.

### GetDefaultReadonlyOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetDefaultReadonlyOk() (*ConfigNodePropertyBoolean, bool)`

GetDefaultReadonlyOk returns a tuple with the DefaultReadonly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultReadonly

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetDefaultReadonly(v ConfigNodePropertyBoolean)`

SetDefaultReadonly sets DefaultReadonly field to given value.

### HasDefaultReadonly

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasDefaultReadonly() bool`

HasDefaultReadonly returns a boolean if a field has been set.

### GetDefaultAutocommit

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetDefaultAutocommit() ConfigNodePropertyBoolean`

GetDefaultAutocommit returns the DefaultAutocommit field if non-nil, zero value otherwise.

### GetDefaultAutocommitOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetDefaultAutocommitOk() (*ConfigNodePropertyBoolean, bool)`

GetDefaultAutocommitOk returns a tuple with the DefaultAutocommit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAutocommit

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetDefaultAutocommit(v ConfigNodePropertyBoolean)`

SetDefaultAutocommit sets DefaultAutocommit field to given value.

### HasDefaultAutocommit

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasDefaultAutocommit() bool`

HasDefaultAutocommit returns a boolean if a field has been set.

### GetPoolSize

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetPoolSize() ConfigNodePropertyInteger`

GetPoolSize returns the PoolSize field if non-nil, zero value otherwise.

### GetPoolSizeOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetPoolSizeOk() (*ConfigNodePropertyInteger, bool)`

GetPoolSizeOk returns a tuple with the PoolSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoolSize

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetPoolSize(v ConfigNodePropertyInteger)`

SetPoolSize sets PoolSize field to given value.

### HasPoolSize

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasPoolSize() bool`

HasPoolSize returns a boolean if a field has been set.

### GetPoolMaxWaitMsec

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetPoolMaxWaitMsec() ConfigNodePropertyInteger`

GetPoolMaxWaitMsec returns the PoolMaxWaitMsec field if non-nil, zero value otherwise.

### GetPoolMaxWaitMsecOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetPoolMaxWaitMsecOk() (*ConfigNodePropertyInteger, bool)`

GetPoolMaxWaitMsecOk returns a tuple with the PoolMaxWaitMsec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoolMaxWaitMsec

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetPoolMaxWaitMsec(v ConfigNodePropertyInteger)`

SetPoolMaxWaitMsec sets PoolMaxWaitMsec field to given value.

### HasPoolMaxWaitMsec

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasPoolMaxWaitMsec() bool`

HasPoolMaxWaitMsec returns a boolean if a field has been set.

### GetDatasourceName

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetDatasourceName() ConfigNodePropertyString`

GetDatasourceName returns the DatasourceName field if non-nil, zero value otherwise.

### GetDatasourceNameOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetDatasourceNameOk() (*ConfigNodePropertyString, bool)`

GetDatasourceNameOk returns a tuple with the DatasourceName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatasourceName

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetDatasourceName(v ConfigNodePropertyString)`

SetDatasourceName sets DatasourceName field to given value.

### HasDatasourceName

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasDatasourceName() bool`

HasDatasourceName returns a boolean if a field has been set.

### GetDatasourceSvcProperties

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetDatasourceSvcProperties() ConfigNodePropertyArray`

GetDatasourceSvcProperties returns the DatasourceSvcProperties field if non-nil, zero value otherwise.

### GetDatasourceSvcPropertiesOk

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) GetDatasourceSvcPropertiesOk() (*ConfigNodePropertyArray, bool)`

GetDatasourceSvcPropertiesOk returns a tuple with the DatasourceSvcProperties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatasourceSvcProperties

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) SetDatasourceSvcProperties(v ConfigNodePropertyArray)`

SetDatasourceSvcProperties sets DatasourceSvcProperties field to given value.

### HasDatasourceSvcProperties

`func (o *ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) HasDatasourceSvcProperties() bool`

HasDatasourceSvcProperties returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


