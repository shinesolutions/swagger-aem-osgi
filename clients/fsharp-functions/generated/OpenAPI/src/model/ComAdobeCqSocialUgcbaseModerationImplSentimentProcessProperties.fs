namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties =

  //#region ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties = {
    [<JsonProperty(PropertyName = "watchwords.positive")>]
    WatchwordsPositive : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "watchwords.negative")>]
    WatchwordsNegative : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "watchwords.path")>]
    WatchwordsPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sentiment.path")>]
    SentimentPath : ConfigNodePropertyString;
  }

  //#endregion
