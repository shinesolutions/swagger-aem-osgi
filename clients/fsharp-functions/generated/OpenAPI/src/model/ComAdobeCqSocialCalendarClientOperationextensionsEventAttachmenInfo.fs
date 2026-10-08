namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties

module ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo =

  //#region ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties;
  }

  //#endregion
