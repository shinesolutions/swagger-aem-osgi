# ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MessageProperties** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**MessageBoxSizeLimit** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MessageCountLimit** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**NotifyFailure** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**FailureMessageFrom** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FailureTemplatePath** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxRetries** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MinWaitBetweenRetries** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CountUpdatePoolSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**InboxPath** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SentitemsPath** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SupportAttachments** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SupportGroupMessaging** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MaxTotalRecipients** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BatchSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxTotalAttachmentSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AttachmentTypeBlacklist** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AllowedAttachmentTypes** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServiceSelector** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FieldWhitelist** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Methods

### NewComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties

`func NewComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties() *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties`

NewComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties instantiates a new ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesWithDefaults

`func NewComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesWithDefaults() *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties`

NewComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesWithDefaults instantiates a new ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessageProperties

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMessageProperties() ConfigNodePropertyArray`

GetMessageProperties returns the MessageProperties field if non-nil, zero value otherwise.

### GetMessagePropertiesOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMessagePropertiesOk() (*ConfigNodePropertyArray, bool)`

GetMessagePropertiesOk returns a tuple with the MessageProperties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageProperties

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetMessageProperties(v ConfigNodePropertyArray)`

SetMessageProperties sets MessageProperties field to given value.

### HasMessageProperties

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasMessageProperties() bool`

HasMessageProperties returns a boolean if a field has been set.

### GetMessageBoxSizeLimit

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMessageBoxSizeLimit() ConfigNodePropertyInteger`

GetMessageBoxSizeLimit returns the MessageBoxSizeLimit field if non-nil, zero value otherwise.

### GetMessageBoxSizeLimitOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMessageBoxSizeLimitOk() (*ConfigNodePropertyInteger, bool)`

GetMessageBoxSizeLimitOk returns a tuple with the MessageBoxSizeLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageBoxSizeLimit

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetMessageBoxSizeLimit(v ConfigNodePropertyInteger)`

SetMessageBoxSizeLimit sets MessageBoxSizeLimit field to given value.

### HasMessageBoxSizeLimit

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasMessageBoxSizeLimit() bool`

HasMessageBoxSizeLimit returns a boolean if a field has been set.

### GetMessageCountLimit

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMessageCountLimit() ConfigNodePropertyInteger`

GetMessageCountLimit returns the MessageCountLimit field if non-nil, zero value otherwise.

### GetMessageCountLimitOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMessageCountLimitOk() (*ConfigNodePropertyInteger, bool)`

GetMessageCountLimitOk returns a tuple with the MessageCountLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageCountLimit

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetMessageCountLimit(v ConfigNodePropertyInteger)`

SetMessageCountLimit sets MessageCountLimit field to given value.

### HasMessageCountLimit

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasMessageCountLimit() bool`

HasMessageCountLimit returns a boolean if a field has been set.

### GetNotifyFailure

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetNotifyFailure() ConfigNodePropertyBoolean`

GetNotifyFailure returns the NotifyFailure field if non-nil, zero value otherwise.

### GetNotifyFailureOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetNotifyFailureOk() (*ConfigNodePropertyBoolean, bool)`

GetNotifyFailureOk returns a tuple with the NotifyFailure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotifyFailure

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetNotifyFailure(v ConfigNodePropertyBoolean)`

SetNotifyFailure sets NotifyFailure field to given value.

### HasNotifyFailure

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasNotifyFailure() bool`

HasNotifyFailure returns a boolean if a field has been set.

### GetFailureMessageFrom

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetFailureMessageFrom() ConfigNodePropertyString`

GetFailureMessageFrom returns the FailureMessageFrom field if non-nil, zero value otherwise.

### GetFailureMessageFromOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetFailureMessageFromOk() (*ConfigNodePropertyString, bool)`

GetFailureMessageFromOk returns a tuple with the FailureMessageFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailureMessageFrom

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetFailureMessageFrom(v ConfigNodePropertyString)`

SetFailureMessageFrom sets FailureMessageFrom field to given value.

### HasFailureMessageFrom

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasFailureMessageFrom() bool`

HasFailureMessageFrom returns a boolean if a field has been set.

### GetFailureTemplatePath

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetFailureTemplatePath() ConfigNodePropertyString`

GetFailureTemplatePath returns the FailureTemplatePath field if non-nil, zero value otherwise.

### GetFailureTemplatePathOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetFailureTemplatePathOk() (*ConfigNodePropertyString, bool)`

GetFailureTemplatePathOk returns a tuple with the FailureTemplatePath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailureTemplatePath

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetFailureTemplatePath(v ConfigNodePropertyString)`

SetFailureTemplatePath sets FailureTemplatePath field to given value.

### HasFailureTemplatePath

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasFailureTemplatePath() bool`

HasFailureTemplatePath returns a boolean if a field has been set.

### GetMaxRetries

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMaxRetries() ConfigNodePropertyInteger`

GetMaxRetries returns the MaxRetries field if non-nil, zero value otherwise.

### GetMaxRetriesOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMaxRetriesOk() (*ConfigNodePropertyInteger, bool)`

GetMaxRetriesOk returns a tuple with the MaxRetries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxRetries

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetMaxRetries(v ConfigNodePropertyInteger)`

SetMaxRetries sets MaxRetries field to given value.

### HasMaxRetries

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasMaxRetries() bool`

HasMaxRetries returns a boolean if a field has been set.

### GetMinWaitBetweenRetries

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMinWaitBetweenRetries() ConfigNodePropertyInteger`

GetMinWaitBetweenRetries returns the MinWaitBetweenRetries field if non-nil, zero value otherwise.

### GetMinWaitBetweenRetriesOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMinWaitBetweenRetriesOk() (*ConfigNodePropertyInteger, bool)`

GetMinWaitBetweenRetriesOk returns a tuple with the MinWaitBetweenRetries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinWaitBetweenRetries

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetMinWaitBetweenRetries(v ConfigNodePropertyInteger)`

SetMinWaitBetweenRetries sets MinWaitBetweenRetries field to given value.

### HasMinWaitBetweenRetries

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasMinWaitBetweenRetries() bool`

HasMinWaitBetweenRetries returns a boolean if a field has been set.

### GetCountUpdatePoolSize

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetCountUpdatePoolSize() ConfigNodePropertyInteger`

GetCountUpdatePoolSize returns the CountUpdatePoolSize field if non-nil, zero value otherwise.

### GetCountUpdatePoolSizeOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetCountUpdatePoolSizeOk() (*ConfigNodePropertyInteger, bool)`

GetCountUpdatePoolSizeOk returns a tuple with the CountUpdatePoolSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountUpdatePoolSize

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetCountUpdatePoolSize(v ConfigNodePropertyInteger)`

SetCountUpdatePoolSize sets CountUpdatePoolSize field to given value.

### HasCountUpdatePoolSize

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasCountUpdatePoolSize() bool`

HasCountUpdatePoolSize returns a boolean if a field has been set.

### GetInboxPath

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetInboxPath() ConfigNodePropertyString`

GetInboxPath returns the InboxPath field if non-nil, zero value otherwise.

### GetInboxPathOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetInboxPathOk() (*ConfigNodePropertyString, bool)`

GetInboxPathOk returns a tuple with the InboxPath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInboxPath

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetInboxPath(v ConfigNodePropertyString)`

SetInboxPath sets InboxPath field to given value.

### HasInboxPath

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasInboxPath() bool`

HasInboxPath returns a boolean if a field has been set.

### GetSentitemsPath

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetSentitemsPath() ConfigNodePropertyString`

GetSentitemsPath returns the SentitemsPath field if non-nil, zero value otherwise.

### GetSentitemsPathOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetSentitemsPathOk() (*ConfigNodePropertyString, bool)`

GetSentitemsPathOk returns a tuple with the SentitemsPath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSentitemsPath

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetSentitemsPath(v ConfigNodePropertyString)`

SetSentitemsPath sets SentitemsPath field to given value.

### HasSentitemsPath

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasSentitemsPath() bool`

HasSentitemsPath returns a boolean if a field has been set.

### GetSupportAttachments

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetSupportAttachments() ConfigNodePropertyBoolean`

GetSupportAttachments returns the SupportAttachments field if non-nil, zero value otherwise.

### GetSupportAttachmentsOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetSupportAttachmentsOk() (*ConfigNodePropertyBoolean, bool)`

GetSupportAttachmentsOk returns a tuple with the SupportAttachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportAttachments

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetSupportAttachments(v ConfigNodePropertyBoolean)`

SetSupportAttachments sets SupportAttachments field to given value.

### HasSupportAttachments

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasSupportAttachments() bool`

HasSupportAttachments returns a boolean if a field has been set.

### GetSupportGroupMessaging

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetSupportGroupMessaging() ConfigNodePropertyBoolean`

GetSupportGroupMessaging returns the SupportGroupMessaging field if non-nil, zero value otherwise.

### GetSupportGroupMessagingOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetSupportGroupMessagingOk() (*ConfigNodePropertyBoolean, bool)`

GetSupportGroupMessagingOk returns a tuple with the SupportGroupMessaging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportGroupMessaging

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetSupportGroupMessaging(v ConfigNodePropertyBoolean)`

SetSupportGroupMessaging sets SupportGroupMessaging field to given value.

### HasSupportGroupMessaging

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasSupportGroupMessaging() bool`

HasSupportGroupMessaging returns a boolean if a field has been set.

### GetMaxTotalRecipients

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMaxTotalRecipients() ConfigNodePropertyInteger`

GetMaxTotalRecipients returns the MaxTotalRecipients field if non-nil, zero value otherwise.

### GetMaxTotalRecipientsOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMaxTotalRecipientsOk() (*ConfigNodePropertyInteger, bool)`

GetMaxTotalRecipientsOk returns a tuple with the MaxTotalRecipients field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxTotalRecipients

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetMaxTotalRecipients(v ConfigNodePropertyInteger)`

SetMaxTotalRecipients sets MaxTotalRecipients field to given value.

### HasMaxTotalRecipients

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasMaxTotalRecipients() bool`

HasMaxTotalRecipients returns a boolean if a field has been set.

### GetBatchSize

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetBatchSize() ConfigNodePropertyInteger`

GetBatchSize returns the BatchSize field if non-nil, zero value otherwise.

### GetBatchSizeOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetBatchSizeOk() (*ConfigNodePropertyInteger, bool)`

GetBatchSizeOk returns a tuple with the BatchSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatchSize

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetBatchSize(v ConfigNodePropertyInteger)`

SetBatchSize sets BatchSize field to given value.

### HasBatchSize

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasBatchSize() bool`

HasBatchSize returns a boolean if a field has been set.

### GetMaxTotalAttachmentSize

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMaxTotalAttachmentSize() ConfigNodePropertyInteger`

GetMaxTotalAttachmentSize returns the MaxTotalAttachmentSize field if non-nil, zero value otherwise.

### GetMaxTotalAttachmentSizeOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetMaxTotalAttachmentSizeOk() (*ConfigNodePropertyInteger, bool)`

GetMaxTotalAttachmentSizeOk returns a tuple with the MaxTotalAttachmentSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxTotalAttachmentSize

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetMaxTotalAttachmentSize(v ConfigNodePropertyInteger)`

SetMaxTotalAttachmentSize sets MaxTotalAttachmentSize field to given value.

### HasMaxTotalAttachmentSize

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasMaxTotalAttachmentSize() bool`

HasMaxTotalAttachmentSize returns a boolean if a field has been set.

### GetAttachmentTypeBlacklist

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetAttachmentTypeBlacklist() ConfigNodePropertyArray`

GetAttachmentTypeBlacklist returns the AttachmentTypeBlacklist field if non-nil, zero value otherwise.

### GetAttachmentTypeBlacklistOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetAttachmentTypeBlacklistOk() (*ConfigNodePropertyArray, bool)`

GetAttachmentTypeBlacklistOk returns a tuple with the AttachmentTypeBlacklist field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachmentTypeBlacklist

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetAttachmentTypeBlacklist(v ConfigNodePropertyArray)`

SetAttachmentTypeBlacklist sets AttachmentTypeBlacklist field to given value.

### HasAttachmentTypeBlacklist

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasAttachmentTypeBlacklist() bool`

HasAttachmentTypeBlacklist returns a boolean if a field has been set.

### GetAllowedAttachmentTypes

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetAllowedAttachmentTypes() ConfigNodePropertyArray`

GetAllowedAttachmentTypes returns the AllowedAttachmentTypes field if non-nil, zero value otherwise.

### GetAllowedAttachmentTypesOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetAllowedAttachmentTypesOk() (*ConfigNodePropertyArray, bool)`

GetAllowedAttachmentTypesOk returns a tuple with the AllowedAttachmentTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowedAttachmentTypes

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetAllowedAttachmentTypes(v ConfigNodePropertyArray)`

SetAllowedAttachmentTypes sets AllowedAttachmentTypes field to given value.

### HasAllowedAttachmentTypes

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasAllowedAttachmentTypes() bool`

HasAllowedAttachmentTypes returns a boolean if a field has been set.

### GetServiceSelector

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetServiceSelector() ConfigNodePropertyString`

GetServiceSelector returns the ServiceSelector field if non-nil, zero value otherwise.

### GetServiceSelectorOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetServiceSelectorOk() (*ConfigNodePropertyString, bool)`

GetServiceSelectorOk returns a tuple with the ServiceSelector field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceSelector

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetServiceSelector(v ConfigNodePropertyString)`

SetServiceSelector sets ServiceSelector field to given value.

### HasServiceSelector

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasServiceSelector() bool`

HasServiceSelector returns a boolean if a field has been set.

### GetFieldWhitelist

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetFieldWhitelist() ConfigNodePropertyArray`

GetFieldWhitelist returns the FieldWhitelist field if non-nil, zero value otherwise.

### GetFieldWhitelistOk

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) GetFieldWhitelistOk() (*ConfigNodePropertyArray, bool)`

GetFieldWhitelistOk returns a tuple with the FieldWhitelist field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFieldWhitelist

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) SetFieldWhitelist(v ConfigNodePropertyArray)`

SetFieldWhitelist sets FieldWhitelist field to given value.

### HasFieldWhitelist

`func (o *ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) HasFieldWhitelist() bool`

HasFieldWhitelist returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


