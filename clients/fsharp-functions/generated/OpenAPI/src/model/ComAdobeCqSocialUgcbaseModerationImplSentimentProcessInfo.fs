namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties

module ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo =

  //#region ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties;
  }

  //#endregion
