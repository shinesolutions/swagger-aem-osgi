# OrgApacheSlingDatasourceDataSourceFactoryProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DatasourceName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DatasourceSvcPropName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DriverClassName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Url** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Username** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Password** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultAutoCommit** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**DefaultReadOnly** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**DefaultTransactionIsolation** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**DefaultCatalog** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxActive** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxIdle** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MinIdle** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**InitialSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxWait** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxAge** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TestOnBorrow** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**TestOnReturn** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**TestWhileIdle** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ValidationQuery** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ValidationQueryTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**TimeBetweenEvictionRunsMillis** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MinEvictableIdleTimeMillis** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ConnectionProperties** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**InitSQL** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**JdbcInterceptors** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ValidationInterval** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LogValidationErrors** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DatasourceSvcProperties** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Methods

### NewOrgApacheSlingDatasourceDataSourceFactoryProperties

`func NewOrgApacheSlingDatasourceDataSourceFactoryProperties() *OrgApacheSlingDatasourceDataSourceFactoryProperties`

NewOrgApacheSlingDatasourceDataSourceFactoryProperties instantiates a new OrgApacheSlingDatasourceDataSourceFactoryProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingDatasourceDataSourceFactoryPropertiesWithDefaults

`func NewOrgApacheSlingDatasourceDataSourceFactoryPropertiesWithDefaults() *OrgApacheSlingDatasourceDataSourceFactoryProperties`

NewOrgApacheSlingDatasourceDataSourceFactoryPropertiesWithDefaults instantiates a new OrgApacheSlingDatasourceDataSourceFactoryProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDatasourceName

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDatasourceName() ConfigNodePropertyString`

GetDatasourceName returns the DatasourceName field if non-nil, zero value otherwise.

### GetDatasourceNameOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDatasourceNameOk() (*ConfigNodePropertyString, bool)`

GetDatasourceNameOk returns a tuple with the DatasourceName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatasourceName

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetDatasourceName(v ConfigNodePropertyString)`

SetDatasourceName sets DatasourceName field to given value.

### HasDatasourceName

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasDatasourceName() bool`

HasDatasourceName returns a boolean if a field has been set.

### GetDatasourceSvcPropName

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDatasourceSvcPropName() ConfigNodePropertyString`

GetDatasourceSvcPropName returns the DatasourceSvcPropName field if non-nil, zero value otherwise.

### GetDatasourceSvcPropNameOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDatasourceSvcPropNameOk() (*ConfigNodePropertyString, bool)`

GetDatasourceSvcPropNameOk returns a tuple with the DatasourceSvcPropName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatasourceSvcPropName

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetDatasourceSvcPropName(v ConfigNodePropertyString)`

SetDatasourceSvcPropName sets DatasourceSvcPropName field to given value.

### HasDatasourceSvcPropName

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasDatasourceSvcPropName() bool`

HasDatasourceSvcPropName returns a boolean if a field has been set.

### GetDriverClassName

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDriverClassName() ConfigNodePropertyString`

GetDriverClassName returns the DriverClassName field if non-nil, zero value otherwise.

### GetDriverClassNameOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDriverClassNameOk() (*ConfigNodePropertyString, bool)`

GetDriverClassNameOk returns a tuple with the DriverClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDriverClassName

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetDriverClassName(v ConfigNodePropertyString)`

SetDriverClassName sets DriverClassName field to given value.

### HasDriverClassName

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasDriverClassName() bool`

HasDriverClassName returns a boolean if a field has been set.

### GetUrl

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetUrl() ConfigNodePropertyString`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetUrlOk() (*ConfigNodePropertyString, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetUrl(v ConfigNodePropertyString)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetUsername

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetUsername() ConfigNodePropertyString`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetUsernameOk() (*ConfigNodePropertyString, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetUsername(v ConfigNodePropertyString)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### GetPassword

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetPassword() ConfigNodePropertyString`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetPasswordOk() (*ConfigNodePropertyString, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetPassword(v ConfigNodePropertyString)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetDefaultAutoCommit

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDefaultAutoCommit() ConfigNodePropertyDropDown`

GetDefaultAutoCommit returns the DefaultAutoCommit field if non-nil, zero value otherwise.

### GetDefaultAutoCommitOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDefaultAutoCommitOk() (*ConfigNodePropertyDropDown, bool)`

GetDefaultAutoCommitOk returns a tuple with the DefaultAutoCommit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAutoCommit

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetDefaultAutoCommit(v ConfigNodePropertyDropDown)`

SetDefaultAutoCommit sets DefaultAutoCommit field to given value.

### HasDefaultAutoCommit

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasDefaultAutoCommit() bool`

HasDefaultAutoCommit returns a boolean if a field has been set.

### GetDefaultReadOnly

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDefaultReadOnly() ConfigNodePropertyDropDown`

GetDefaultReadOnly returns the DefaultReadOnly field if non-nil, zero value otherwise.

### GetDefaultReadOnlyOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDefaultReadOnlyOk() (*ConfigNodePropertyDropDown, bool)`

GetDefaultReadOnlyOk returns a tuple with the DefaultReadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultReadOnly

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetDefaultReadOnly(v ConfigNodePropertyDropDown)`

SetDefaultReadOnly sets DefaultReadOnly field to given value.

### HasDefaultReadOnly

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasDefaultReadOnly() bool`

HasDefaultReadOnly returns a boolean if a field has been set.

### GetDefaultTransactionIsolation

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDefaultTransactionIsolation() ConfigNodePropertyDropDown`

GetDefaultTransactionIsolation returns the DefaultTransactionIsolation field if non-nil, zero value otherwise.

### GetDefaultTransactionIsolationOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDefaultTransactionIsolationOk() (*ConfigNodePropertyDropDown, bool)`

GetDefaultTransactionIsolationOk returns a tuple with the DefaultTransactionIsolation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultTransactionIsolation

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetDefaultTransactionIsolation(v ConfigNodePropertyDropDown)`

SetDefaultTransactionIsolation sets DefaultTransactionIsolation field to given value.

### HasDefaultTransactionIsolation

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasDefaultTransactionIsolation() bool`

HasDefaultTransactionIsolation returns a boolean if a field has been set.

### GetDefaultCatalog

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDefaultCatalog() ConfigNodePropertyString`

GetDefaultCatalog returns the DefaultCatalog field if non-nil, zero value otherwise.

### GetDefaultCatalogOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDefaultCatalogOk() (*ConfigNodePropertyString, bool)`

GetDefaultCatalogOk returns a tuple with the DefaultCatalog field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultCatalog

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetDefaultCatalog(v ConfigNodePropertyString)`

SetDefaultCatalog sets DefaultCatalog field to given value.

### HasDefaultCatalog

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasDefaultCatalog() bool`

HasDefaultCatalog returns a boolean if a field has been set.

### GetMaxActive

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMaxActive() ConfigNodePropertyInteger`

GetMaxActive returns the MaxActive field if non-nil, zero value otherwise.

### GetMaxActiveOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMaxActiveOk() (*ConfigNodePropertyInteger, bool)`

GetMaxActiveOk returns a tuple with the MaxActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxActive

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetMaxActive(v ConfigNodePropertyInteger)`

SetMaxActive sets MaxActive field to given value.

### HasMaxActive

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasMaxActive() bool`

HasMaxActive returns a boolean if a field has been set.

### GetMaxIdle

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMaxIdle() ConfigNodePropertyInteger`

GetMaxIdle returns the MaxIdle field if non-nil, zero value otherwise.

### GetMaxIdleOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMaxIdleOk() (*ConfigNodePropertyInteger, bool)`

GetMaxIdleOk returns a tuple with the MaxIdle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxIdle

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetMaxIdle(v ConfigNodePropertyInteger)`

SetMaxIdle sets MaxIdle field to given value.

### HasMaxIdle

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasMaxIdle() bool`

HasMaxIdle returns a boolean if a field has been set.

### GetMinIdle

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMinIdle() ConfigNodePropertyInteger`

GetMinIdle returns the MinIdle field if non-nil, zero value otherwise.

### GetMinIdleOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMinIdleOk() (*ConfigNodePropertyInteger, bool)`

GetMinIdleOk returns a tuple with the MinIdle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinIdle

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetMinIdle(v ConfigNodePropertyInteger)`

SetMinIdle sets MinIdle field to given value.

### HasMinIdle

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasMinIdle() bool`

HasMinIdle returns a boolean if a field has been set.

### GetInitialSize

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetInitialSize() ConfigNodePropertyInteger`

GetInitialSize returns the InitialSize field if non-nil, zero value otherwise.

### GetInitialSizeOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetInitialSizeOk() (*ConfigNodePropertyInteger, bool)`

GetInitialSizeOk returns a tuple with the InitialSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInitialSize

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetInitialSize(v ConfigNodePropertyInteger)`

SetInitialSize sets InitialSize field to given value.

### HasInitialSize

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasInitialSize() bool`

HasInitialSize returns a boolean if a field has been set.

### GetMaxWait

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMaxWait() ConfigNodePropertyInteger`

GetMaxWait returns the MaxWait field if non-nil, zero value otherwise.

### GetMaxWaitOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMaxWaitOk() (*ConfigNodePropertyInteger, bool)`

GetMaxWaitOk returns a tuple with the MaxWait field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxWait

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetMaxWait(v ConfigNodePropertyInteger)`

SetMaxWait sets MaxWait field to given value.

### HasMaxWait

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasMaxWait() bool`

HasMaxWait returns a boolean if a field has been set.

### GetMaxAge

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMaxAge() ConfigNodePropertyInteger`

GetMaxAge returns the MaxAge field if non-nil, zero value otherwise.

### GetMaxAgeOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMaxAgeOk() (*ConfigNodePropertyInteger, bool)`

GetMaxAgeOk returns a tuple with the MaxAge field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxAge

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetMaxAge(v ConfigNodePropertyInteger)`

SetMaxAge sets MaxAge field to given value.

### HasMaxAge

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasMaxAge() bool`

HasMaxAge returns a boolean if a field has been set.

### GetTestOnBorrow

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetTestOnBorrow() ConfigNodePropertyBoolean`

GetTestOnBorrow returns the TestOnBorrow field if non-nil, zero value otherwise.

### GetTestOnBorrowOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetTestOnBorrowOk() (*ConfigNodePropertyBoolean, bool)`

GetTestOnBorrowOk returns a tuple with the TestOnBorrow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTestOnBorrow

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetTestOnBorrow(v ConfigNodePropertyBoolean)`

SetTestOnBorrow sets TestOnBorrow field to given value.

### HasTestOnBorrow

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasTestOnBorrow() bool`

HasTestOnBorrow returns a boolean if a field has been set.

### GetTestOnReturn

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetTestOnReturn() ConfigNodePropertyBoolean`

GetTestOnReturn returns the TestOnReturn field if non-nil, zero value otherwise.

### GetTestOnReturnOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetTestOnReturnOk() (*ConfigNodePropertyBoolean, bool)`

GetTestOnReturnOk returns a tuple with the TestOnReturn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTestOnReturn

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetTestOnReturn(v ConfigNodePropertyBoolean)`

SetTestOnReturn sets TestOnReturn field to given value.

### HasTestOnReturn

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasTestOnReturn() bool`

HasTestOnReturn returns a boolean if a field has been set.

### GetTestWhileIdle

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetTestWhileIdle() ConfigNodePropertyBoolean`

GetTestWhileIdle returns the TestWhileIdle field if non-nil, zero value otherwise.

### GetTestWhileIdleOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetTestWhileIdleOk() (*ConfigNodePropertyBoolean, bool)`

GetTestWhileIdleOk returns a tuple with the TestWhileIdle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTestWhileIdle

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetTestWhileIdle(v ConfigNodePropertyBoolean)`

SetTestWhileIdle sets TestWhileIdle field to given value.

### HasTestWhileIdle

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasTestWhileIdle() bool`

HasTestWhileIdle returns a boolean if a field has been set.

### GetValidationQuery

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetValidationQuery() ConfigNodePropertyString`

GetValidationQuery returns the ValidationQuery field if non-nil, zero value otherwise.

### GetValidationQueryOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetValidationQueryOk() (*ConfigNodePropertyString, bool)`

GetValidationQueryOk returns a tuple with the ValidationQuery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationQuery

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetValidationQuery(v ConfigNodePropertyString)`

SetValidationQuery sets ValidationQuery field to given value.

### HasValidationQuery

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasValidationQuery() bool`

HasValidationQuery returns a boolean if a field has been set.

### GetValidationQueryTimeout

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetValidationQueryTimeout() ConfigNodePropertyInteger`

GetValidationQueryTimeout returns the ValidationQueryTimeout field if non-nil, zero value otherwise.

### GetValidationQueryTimeoutOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetValidationQueryTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetValidationQueryTimeoutOk returns a tuple with the ValidationQueryTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationQueryTimeout

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetValidationQueryTimeout(v ConfigNodePropertyInteger)`

SetValidationQueryTimeout sets ValidationQueryTimeout field to given value.

### HasValidationQueryTimeout

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasValidationQueryTimeout() bool`

HasValidationQueryTimeout returns a boolean if a field has been set.

### GetTimeBetweenEvictionRunsMillis

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetTimeBetweenEvictionRunsMillis() ConfigNodePropertyInteger`

GetTimeBetweenEvictionRunsMillis returns the TimeBetweenEvictionRunsMillis field if non-nil, zero value otherwise.

### GetTimeBetweenEvictionRunsMillisOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetTimeBetweenEvictionRunsMillisOk() (*ConfigNodePropertyInteger, bool)`

GetTimeBetweenEvictionRunsMillisOk returns a tuple with the TimeBetweenEvictionRunsMillis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeBetweenEvictionRunsMillis

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetTimeBetweenEvictionRunsMillis(v ConfigNodePropertyInteger)`

SetTimeBetweenEvictionRunsMillis sets TimeBetweenEvictionRunsMillis field to given value.

### HasTimeBetweenEvictionRunsMillis

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasTimeBetweenEvictionRunsMillis() bool`

HasTimeBetweenEvictionRunsMillis returns a boolean if a field has been set.

### GetMinEvictableIdleTimeMillis

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMinEvictableIdleTimeMillis() ConfigNodePropertyInteger`

GetMinEvictableIdleTimeMillis returns the MinEvictableIdleTimeMillis field if non-nil, zero value otherwise.

### GetMinEvictableIdleTimeMillisOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetMinEvictableIdleTimeMillisOk() (*ConfigNodePropertyInteger, bool)`

GetMinEvictableIdleTimeMillisOk returns a tuple with the MinEvictableIdleTimeMillis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinEvictableIdleTimeMillis

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetMinEvictableIdleTimeMillis(v ConfigNodePropertyInteger)`

SetMinEvictableIdleTimeMillis sets MinEvictableIdleTimeMillis field to given value.

### HasMinEvictableIdleTimeMillis

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasMinEvictableIdleTimeMillis() bool`

HasMinEvictableIdleTimeMillis returns a boolean if a field has been set.

### GetConnectionProperties

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetConnectionProperties() ConfigNodePropertyString`

GetConnectionProperties returns the ConnectionProperties field if non-nil, zero value otherwise.

### GetConnectionPropertiesOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetConnectionPropertiesOk() (*ConfigNodePropertyString, bool)`

GetConnectionPropertiesOk returns a tuple with the ConnectionProperties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectionProperties

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetConnectionProperties(v ConfigNodePropertyString)`

SetConnectionProperties sets ConnectionProperties field to given value.

### HasConnectionProperties

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasConnectionProperties() bool`

HasConnectionProperties returns a boolean if a field has been set.

### GetInitSQL

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetInitSQL() ConfigNodePropertyString`

GetInitSQL returns the InitSQL field if non-nil, zero value otherwise.

### GetInitSQLOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetInitSQLOk() (*ConfigNodePropertyString, bool)`

GetInitSQLOk returns a tuple with the InitSQL field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInitSQL

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetInitSQL(v ConfigNodePropertyString)`

SetInitSQL sets InitSQL field to given value.

### HasInitSQL

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasInitSQL() bool`

HasInitSQL returns a boolean if a field has been set.

### GetJdbcInterceptors

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetJdbcInterceptors() ConfigNodePropertyString`

GetJdbcInterceptors returns the JdbcInterceptors field if non-nil, zero value otherwise.

### GetJdbcInterceptorsOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetJdbcInterceptorsOk() (*ConfigNodePropertyString, bool)`

GetJdbcInterceptorsOk returns a tuple with the JdbcInterceptors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJdbcInterceptors

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetJdbcInterceptors(v ConfigNodePropertyString)`

SetJdbcInterceptors sets JdbcInterceptors field to given value.

### HasJdbcInterceptors

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasJdbcInterceptors() bool`

HasJdbcInterceptors returns a boolean if a field has been set.

### GetValidationInterval

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetValidationInterval() ConfigNodePropertyInteger`

GetValidationInterval returns the ValidationInterval field if non-nil, zero value otherwise.

### GetValidationIntervalOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetValidationIntervalOk() (*ConfigNodePropertyInteger, bool)`

GetValidationIntervalOk returns a tuple with the ValidationInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationInterval

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetValidationInterval(v ConfigNodePropertyInteger)`

SetValidationInterval sets ValidationInterval field to given value.

### HasValidationInterval

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasValidationInterval() bool`

HasValidationInterval returns a boolean if a field has been set.

### GetLogValidationErrors

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetLogValidationErrors() ConfigNodePropertyBoolean`

GetLogValidationErrors returns the LogValidationErrors field if non-nil, zero value otherwise.

### GetLogValidationErrorsOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetLogValidationErrorsOk() (*ConfigNodePropertyBoolean, bool)`

GetLogValidationErrorsOk returns a tuple with the LogValidationErrors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogValidationErrors

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetLogValidationErrors(v ConfigNodePropertyBoolean)`

SetLogValidationErrors sets LogValidationErrors field to given value.

### HasLogValidationErrors

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasLogValidationErrors() bool`

HasLogValidationErrors returns a boolean if a field has been set.

### GetDatasourceSvcProperties

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDatasourceSvcProperties() ConfigNodePropertyArray`

GetDatasourceSvcProperties returns the DatasourceSvcProperties field if non-nil, zero value otherwise.

### GetDatasourceSvcPropertiesOk

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) GetDatasourceSvcPropertiesOk() (*ConfigNodePropertyArray, bool)`

GetDatasourceSvcPropertiesOk returns a tuple with the DatasourceSvcProperties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatasourceSvcProperties

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) SetDatasourceSvcProperties(v ConfigNodePropertyArray)`

SetDatasourceSvcProperties sets DatasourceSvcProperties field to given value.

### HasDatasourceSvcProperties

`func (o *OrgApacheSlingDatasourceDataSourceFactoryProperties) HasDatasourceSvcProperties() bool`

HasDatasourceSvcProperties returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


