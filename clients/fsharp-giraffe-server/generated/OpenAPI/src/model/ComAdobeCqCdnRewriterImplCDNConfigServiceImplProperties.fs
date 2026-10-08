namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties =

  //#region ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties


  type comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties = {
    CdnConfigDistributionDomain : ConfigNodePropertyString;
    CdnConfigEnableRewriting : ConfigNodePropertyBoolean;
    CdnConfigPathPrefixes : ConfigNodePropertyArray;
    CdnConfigCdnttl : ConfigNodePropertyInteger;
    CdnConfigApplicationProtocol : ConfigNodePropertyString;
  }
  //#endregion
