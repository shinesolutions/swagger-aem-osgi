namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties =

  //#region ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties


  type comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties = {
    MessageProperties : ConfigNodePropertyArray;
    MessageBoxSizeLimit : ConfigNodePropertyInteger;
    MessageCountLimit : ConfigNodePropertyInteger;
    NotifyFailure : ConfigNodePropertyBoolean;
    FailureMessageFrom : ConfigNodePropertyString;
    FailureTemplatePath : ConfigNodePropertyString;
    MaxRetries : ConfigNodePropertyInteger;
    MinWaitBetweenRetries : ConfigNodePropertyInteger;
    CountUpdatePoolSize : ConfigNodePropertyInteger;
    InboxPath : ConfigNodePropertyString;
    SentitemsPath : ConfigNodePropertyString;
    SupportAttachments : ConfigNodePropertyBoolean;
    SupportGroupMessaging : ConfigNodePropertyBoolean;
    MaxTotalRecipients : ConfigNodePropertyInteger;
    BatchSize : ConfigNodePropertyInteger;
    MaxTotalAttachmentSize : ConfigNodePropertyInteger;
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
    AllowedAttachmentTypes : ConfigNodePropertyArray;
    ServiceSelector : ConfigNodePropertyString;
    FieldWhitelist : ConfigNodePropertyArray;
  }
  //#endregion
