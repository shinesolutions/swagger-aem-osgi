namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties =

  //#region OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties = {
    [<JsonProperty(PropertyName = "org.apache.jackrabbit.oak.authentication.appName")>]
    OrgApacheJackrabbitOakAuthenticationAppName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.jackrabbit.oak.authentication.configSpiName")>]
    OrgApacheJackrabbitOakAuthenticationConfigSpiName : ConfigNodePropertyString;
  }

  //#endregion
