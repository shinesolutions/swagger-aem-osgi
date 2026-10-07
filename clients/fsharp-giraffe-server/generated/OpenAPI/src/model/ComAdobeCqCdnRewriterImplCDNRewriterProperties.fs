namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqCdnRewriterImplCDNRewriterProperties =

  //#region ComAdobeCqCdnRewriterImplCDNRewriterProperties


  type comAdobeCqCdnRewriterImplCDNRewriterProperties = {
    ServiceRanking : ConfigNodePropertyInteger;
    CdnrewriterAttributes : ConfigNodePropertyArray;
    CdnRewriterDistributionDomain : ConfigNodePropertyString;
  }
  //#endregion
