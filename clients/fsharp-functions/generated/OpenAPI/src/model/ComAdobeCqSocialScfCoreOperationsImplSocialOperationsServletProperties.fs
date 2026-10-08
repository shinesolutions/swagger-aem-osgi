namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties =

  //#region ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties

  [<CLIMutable>]
  type ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.selectors")>]
    SlingServletSelectors : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.extensions")>]
    SlingServletExtensions : ConfigNodePropertyString;
  }

  //#endregion
