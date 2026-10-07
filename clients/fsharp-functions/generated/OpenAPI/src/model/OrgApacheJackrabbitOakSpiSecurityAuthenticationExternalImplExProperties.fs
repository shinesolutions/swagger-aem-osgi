namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties =

  //#region OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties = {
    [<JsonProperty(PropertyName = "jaas.ranking")>]
    JaasRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "jaas.controlFlag")>]
    JaasControlFlag : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jaas.realmName")>]
    JaasRealmName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "idp.name")>]
    IdpName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sync.handlerName")>]
    SyncHandlerName : ConfigNodePropertyString;
  }

  //#endregion
