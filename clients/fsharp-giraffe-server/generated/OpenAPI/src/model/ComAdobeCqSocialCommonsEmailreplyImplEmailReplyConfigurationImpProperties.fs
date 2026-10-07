namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties =

  //#region ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties


  type comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties = {
    EmailName : ConfigNodePropertyString;
    EmailCreatePostFromReply : ConfigNodePropertyBoolean;
    EmailAddCommentIdTo : ConfigNodePropertyDropDown;
    EmailSubjectMaximumLength : ConfigNodePropertyInteger;
    EmailReplyToAddress : ConfigNodePropertyString;
    EmailReplyToDelimiter : ConfigNodePropertyString;
    EmailTrackerIdPrefixInSubject : ConfigNodePropertyString;
    EmailTrackerIdPrefixInBody : ConfigNodePropertyString;
    EmailAsHTML : ConfigNodePropertyBoolean;
    EmailDefaultUserName : ConfigNodePropertyString;
    EmailTemplatesRootPath : ConfigNodePropertyString;
  }
  //#endregion
