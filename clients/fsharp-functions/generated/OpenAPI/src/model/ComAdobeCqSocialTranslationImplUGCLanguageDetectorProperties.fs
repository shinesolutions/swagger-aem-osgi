namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties =

  //#region ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties

  [<CLIMutable>]
  type ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties = {
    [<JsonProperty(PropertyName = "event.topics")>]
    EventTopics : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "translate.listener.type")>]
    TranslateListenerType : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "translate.property.list")>]
    TranslatePropertyList : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "poolSize")>]
    PoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxPoolSize")>]
    MaxPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queueSize")>]
    QueueSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "keepAliveTime")>]
    KeepAliveTime : ConfigNodePropertyInteger;
  }

  //#endregion
