namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties =

  //#region ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties = {
    [<JsonProperty(PropertyName = "cdn.config.distribution.domain")>]
    CdnConfigDistributionDomain : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cdn.config.enable.rewriting")>]
    CdnConfigEnableRewriting : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cdn.config.path.prefixes")>]
    CdnConfigPathPrefixes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cdn.config.cdnttl")>]
    CdnConfigCdnttl : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cdn.config.application.protocol")>]
    CdnConfigApplicationProtocol : ConfigNodePropertyString;
  }

  //#endregion
