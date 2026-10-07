namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties =

  //#region OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties

  [<CLIMutable>]
  type OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties = {
    [<JsonProperty(PropertyName = "manager.root")>]
    ManagerRoot : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "http.service.filter")>]
    HttpServiceFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "default.render")>]
    DefaultRender : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "realm")>]
    Realm : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "username")>]
    Username : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "password")>]
    Password : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "category")>]
    Category : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "locale")>]
    Locale : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "loglevel")>]
    Loglevel : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "plugins")>]
    Plugins : ConfigNodePropertyDropDown;
  }

  //#endregion
