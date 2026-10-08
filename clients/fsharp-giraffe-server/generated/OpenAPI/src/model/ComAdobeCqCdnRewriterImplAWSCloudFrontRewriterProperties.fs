namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties =

  //#region ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties


  type comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties = {
    ServiceRanking : ConfigNodePropertyInteger;
    KeypairId : ConfigNodePropertyString;
    KeypairAlias : ConfigNodePropertyString;
    CdnrewriterAttributes : ConfigNodePropertyArray;
    CdnRewriterDistributionDomain : ConfigNodePropertyString;
  }
  //#endregion
