namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties =

  //#region ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties = {
    [<JsonProperty(PropertyName = "email.name")>]
    EmailName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "email.createPostFromReply")>]
    EmailCreatePostFromReply : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "email.addCommentIdTo")>]
    EmailAddCommentIdTo : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "email.subjectMaximumLength")>]
    EmailSubjectMaximumLength : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "email.replyToAddress")>]
    EmailReplyToAddress : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "email.replyToDelimiter")>]
    EmailReplyToDelimiter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "email.trackerIdPrefixInSubject")>]
    EmailTrackerIdPrefixInSubject : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "email.trackerIdPrefixInBody")>]
    EmailTrackerIdPrefixInBody : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "email.asHTML")>]
    EmailAsHTML : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "email.defaultUserName")>]
    EmailDefaultUserName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "email.templates.rootPath")>]
    EmailTemplatesRootPath : ConfigNodePropertyString;
  }

  //#endregion
