namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqCdnRewriterImplCDNRewriterProperties =

  //#region ComAdobeCqCdnRewriterImplCDNRewriterProperties

  [<CLIMutable>]
  type ComAdobeCqCdnRewriterImplCDNRewriterProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cdnrewriter.attributes")>]
    CdnrewriterAttributes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cdn.rewriter.distribution.domain")>]
    CdnRewriterDistributionDomain : ConfigNodePropertyString;
  }

  //#endregion
