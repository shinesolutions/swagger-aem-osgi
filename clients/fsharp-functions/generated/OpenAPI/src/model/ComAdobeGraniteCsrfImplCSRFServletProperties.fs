namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteCsrfImplCSRFServletProperties =

  //#region ComAdobeGraniteCsrfImplCSRFServletProperties

  [<CLIMutable>]
  type ComAdobeGraniteCsrfImplCSRFServletProperties = {
    [<JsonProperty(PropertyName = "csrf.token.expires.in")>]
    CsrfTokenExpiresIn : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "sling.auth.requirements")>]
    SlingAuthRequirements : ConfigNodePropertyString;
  }

  //#endregion
