namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties =

  //#region ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties

  [<CLIMutable>]
  type ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "keypair.id")>]
    KeypairId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "keypair.alias")>]
    KeypairAlias : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cdnrewriter.attributes")>]
    CdnrewriterAttributes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cdn.rewriter.distribution.domain")>]
    CdnRewriterDistributionDomain : ConfigNodePropertyString;
  }

  //#endregion
