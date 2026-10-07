namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties

module ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo =

  //#region ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo

  [<CLIMutable>]
  type ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties;
  }

  //#endregion
