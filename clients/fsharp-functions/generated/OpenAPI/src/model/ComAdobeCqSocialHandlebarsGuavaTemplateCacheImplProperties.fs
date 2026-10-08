namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties =

  //#region ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties = {
    [<JsonProperty(PropertyName = "parameter.guava.cache.enabled")>]
    ParameterGuavaCacheEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "parameter.guava.cache.params")>]
    ParameterGuavaCacheParams : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "parameter.guava.cache.reload")>]
    ParameterGuavaCacheReload : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
  }

  //#endregion
