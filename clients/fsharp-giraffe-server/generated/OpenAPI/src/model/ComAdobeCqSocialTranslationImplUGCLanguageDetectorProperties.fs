namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties =

  //#region ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties


  type comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties = {
    EventTopics : ConfigNodePropertyString;
    EventFilter : ConfigNodePropertyString;
    TranslateListenerType : ConfigNodePropertyArray;
    TranslatePropertyList : ConfigNodePropertyArray;
    PoolSize : ConfigNodePropertyInteger;
    MaxPoolSize : ConfigNodePropertyInteger;
    QueueSize : ConfigNodePropertyInteger;
    KeepAliveTime : ConfigNodePropertyInteger;
  }
  //#endregion
