namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties =

  //#region ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "jaas.controlFlag")>]
    JaasControlFlag : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.realmName")>]
    JaasRealmName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.ranking")>]
    JaasRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "headers")>]
    Headers : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cookies")>]
    Cookies : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "parameters")>]
    Parameters : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "usermap")>]
    Usermap : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "format")>]
    Format : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "trustedCredentialsAttribute")>]
    TrustedCredentialsAttribute : ConfigNodePropertyString;
  }

  //#endregion
