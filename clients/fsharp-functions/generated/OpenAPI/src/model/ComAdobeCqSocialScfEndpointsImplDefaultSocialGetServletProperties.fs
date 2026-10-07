namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties =

  //#region ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties

  [<CLIMutable>]
  type ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.selectors")>]
    SlingServletSelectors : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.servlet.extensions")>]
    SlingServletExtensions : ConfigNodePropertyString;
  }

  //#endregion
