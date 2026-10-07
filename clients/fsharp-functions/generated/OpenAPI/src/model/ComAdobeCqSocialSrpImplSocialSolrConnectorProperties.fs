namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialSrpImplSocialSolrConnectorProperties =

  //#region ComAdobeCqSocialSrpImplSocialSolrConnectorProperties

  [<CLIMutable>]
  type ComAdobeCqSocialSrpImplSocialSolrConnectorProperties = {
    [<JsonProperty(PropertyName = "srp.type")>]
    SrpType : ConfigNodePropertyString;
  }

  //#endregion
