namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties =

  //#region ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties

  [<CLIMutable>]
  type ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties = {
    [<JsonProperty(PropertyName = "message.properties")>]
    MessageProperties : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "messageBoxSizeLimit")>]
    MessageBoxSizeLimit : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "messageCountLimit")>]
    MessageCountLimit : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "notifyFailure")>]
    NotifyFailure : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "failureMessageFrom")>]
    FailureMessageFrom : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "failureTemplatePath")>]
    FailureTemplatePath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "maxRetries")>]
    MaxRetries : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "minWaitBetweenRetries")>]
    MinWaitBetweenRetries : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "countUpdatePoolSize")>]
    CountUpdatePoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "inbox.path")>]
    InboxPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sentitems.path")>]
    SentitemsPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "supportAttachments")>]
    SupportAttachments : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "supportGroupMessaging")>]
    SupportGroupMessaging : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "maxTotalRecipients")>]
    MaxTotalRecipients : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "batchSize")>]
    BatchSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxTotalAttachmentSize")>]
    MaxTotalAttachmentSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "allowedAttachmentTypes")>]
    AllowedAttachmentTypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "serviceSelector")>]
    ServiceSelector : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
  }

  //#endregion
