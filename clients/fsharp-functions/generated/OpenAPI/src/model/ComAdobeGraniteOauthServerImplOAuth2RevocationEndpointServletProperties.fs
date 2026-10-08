namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties =

  //#region ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.paths")>]
    SlingServletPaths : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.revocation.active")>]
    OauthRevocationActive : ConfigNodePropertyBoolean;
  }

  //#endregion
