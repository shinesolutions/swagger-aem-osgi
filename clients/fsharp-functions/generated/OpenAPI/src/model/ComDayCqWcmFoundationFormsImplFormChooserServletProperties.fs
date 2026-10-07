namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmFoundationFormsImplFormChooserServletProperties =

  //#region ComDayCqWcmFoundationFormsImplFormChooserServletProperties

  [<CLIMutable>]
  type ComDayCqWcmFoundationFormsImplFormChooserServletProperties = {
    [<JsonProperty(PropertyName = "service.name")>]
    ServiceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.resourceTypes")>]
    SlingServletResourceTypes : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.selectors")>]
    SlingServletSelectors : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "forms.formchooserservlet.advansesearch.require")>]
    FormsFormchooserservletAdvansesearchRequire : ConfigNodePropertyBoolean;
  }

  //#endregion
