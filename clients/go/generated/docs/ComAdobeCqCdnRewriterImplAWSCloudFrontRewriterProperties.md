# ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServiceRanking** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**KeypairId** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**KeypairAlias** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CdnrewriterAttributes** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**CdnRewriterDistributionDomain** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Methods

### NewComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties

`func NewComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties() *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties`

NewComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties instantiates a new ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesWithDefaults

`func NewComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesWithDefaults() *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties`

NewComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesWithDefaults instantiates a new ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetServiceRanking

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetServiceRanking() ConfigNodePropertyInteger`

GetServiceRanking returns the ServiceRanking field if non-nil, zero value otherwise.

### GetServiceRankingOk

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetServiceRankingOk() (*ConfigNodePropertyInteger, bool)`

GetServiceRankingOk returns a tuple with the ServiceRanking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceRanking

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) SetServiceRanking(v ConfigNodePropertyInteger)`

SetServiceRanking sets ServiceRanking field to given value.

### HasServiceRanking

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) HasServiceRanking() bool`

HasServiceRanking returns a boolean if a field has been set.

### GetKeypairId

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetKeypairId() ConfigNodePropertyString`

GetKeypairId returns the KeypairId field if non-nil, zero value otherwise.

### GetKeypairIdOk

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetKeypairIdOk() (*ConfigNodePropertyString, bool)`

GetKeypairIdOk returns a tuple with the KeypairId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeypairId

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) SetKeypairId(v ConfigNodePropertyString)`

SetKeypairId sets KeypairId field to given value.

### HasKeypairId

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) HasKeypairId() bool`

HasKeypairId returns a boolean if a field has been set.

### GetKeypairAlias

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetKeypairAlias() ConfigNodePropertyString`

GetKeypairAlias returns the KeypairAlias field if non-nil, zero value otherwise.

### GetKeypairAliasOk

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetKeypairAliasOk() (*ConfigNodePropertyString, bool)`

GetKeypairAliasOk returns a tuple with the KeypairAlias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeypairAlias

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) SetKeypairAlias(v ConfigNodePropertyString)`

SetKeypairAlias sets KeypairAlias field to given value.

### HasKeypairAlias

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) HasKeypairAlias() bool`

HasKeypairAlias returns a boolean if a field has been set.

### GetCdnrewriterAttributes

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetCdnrewriterAttributes() ConfigNodePropertyArray`

GetCdnrewriterAttributes returns the CdnrewriterAttributes field if non-nil, zero value otherwise.

### GetCdnrewriterAttributesOk

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetCdnrewriterAttributesOk() (*ConfigNodePropertyArray, bool)`

GetCdnrewriterAttributesOk returns a tuple with the CdnrewriterAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCdnrewriterAttributes

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) SetCdnrewriterAttributes(v ConfigNodePropertyArray)`

SetCdnrewriterAttributes sets CdnrewriterAttributes field to given value.

### HasCdnrewriterAttributes

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) HasCdnrewriterAttributes() bool`

HasCdnrewriterAttributes returns a boolean if a field has been set.

### GetCdnRewriterDistributionDomain

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetCdnRewriterDistributionDomain() ConfigNodePropertyString`

GetCdnRewriterDistributionDomain returns the CdnRewriterDistributionDomain field if non-nil, zero value otherwise.

### GetCdnRewriterDistributionDomainOk

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) GetCdnRewriterDistributionDomainOk() (*ConfigNodePropertyString, bool)`

GetCdnRewriterDistributionDomainOk returns a tuple with the CdnRewriterDistributionDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCdnRewriterDistributionDomain

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) SetCdnRewriterDistributionDomain(v ConfigNodePropertyString)`

SetCdnRewriterDistributionDomain sets CdnRewriterDistributionDomain field to given value.

### HasCdnRewriterDistributionDomain

`func (o *ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) HasCdnRewriterDistributionDomain() bool`

HasCdnRewriterDistributionDomain returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


