namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties

module ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo =

  //#region ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo

  [<CLIMutable>]
  type ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties;
  }

  //#endregion
