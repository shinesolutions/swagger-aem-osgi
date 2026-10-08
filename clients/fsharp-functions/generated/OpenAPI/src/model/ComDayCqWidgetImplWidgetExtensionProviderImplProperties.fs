namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqWidgetImplWidgetExtensionProviderImplProperties =

  //#region ComDayCqWidgetImplWidgetExtensionProviderImplProperties

  [<CLIMutable>]
  type ComDayCqWidgetImplWidgetExtensionProviderImplProperties = {
    [<JsonProperty(PropertyName = "extendable.widgets")>]
    ExtendableWidgets : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "widgetextensionprovider.debug")>]
    WidgetextensionproviderDebug : ConfigNodePropertyBoolean;
  }

  //#endregion
