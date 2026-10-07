namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties =

  //#region ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties = {
    [<JsonProperty(PropertyName = "oauth.issuer")>]
    OauthIssuer : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.access.token.expires.in")>]
    OauthAccessTokenExpiresIn : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.servlet.pattern")>]
    OsgiHttpWhiteboardServletPattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.context.select")>]
    OsgiHttpWhiteboardContextSelect : ConfigNodePropertyString;
  }

  //#endregion
