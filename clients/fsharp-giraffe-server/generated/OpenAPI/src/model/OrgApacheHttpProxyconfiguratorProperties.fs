namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheHttpProxyconfiguratorProperties =

  //#region OrgApacheHttpProxyconfiguratorProperties


  type orgApacheHttpProxyconfiguratorProperties = {
    ProxyEnabled : ConfigNodePropertyBoolean;
    ProxyHost : ConfigNodePropertyString;
    ProxyPort : ConfigNodePropertyInteger;
    ProxyUser : ConfigNodePropertyString;
    ProxyPassword : ConfigNodePropertyString;
    ProxyExceptions : ConfigNodePropertyArray;
  }
  //#endregion
