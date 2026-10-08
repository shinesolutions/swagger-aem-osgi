namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties =

  //#region OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties = {
    [<JsonProperty(PropertyName = "java.naming.factory.initial")>]
    JavaNamingFactoryInitial : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "java.naming.provider.url")>]
    JavaNamingProviderUrl : ConfigNodePropertyString;
  }

  //#endregion
