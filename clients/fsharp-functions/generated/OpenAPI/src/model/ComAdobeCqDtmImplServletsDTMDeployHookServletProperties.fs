namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqDtmImplServletsDTMDeployHookServletProperties =

  //#region ComAdobeCqDtmImplServletsDTMDeployHookServletProperties

  [<CLIMutable>]
  type ComAdobeCqDtmImplServletsDTMDeployHookServletProperties = {
    [<JsonProperty(PropertyName = "dtm.staging.ip.whitelist")>]
    DtmStagingIpWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "dtm.production.ip.whitelist")>]
    DtmProductionIpWhitelist : ConfigNodePropertyArray;
  }

  //#endregion
