namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqExtwidgetServletsImageSpriteServletProperties =

  //#region ComDayCqExtwidgetServletsImageSpriteServletProperties

  [<CLIMutable>]
  type ComDayCqExtwidgetServletsImageSpriteServletProperties = {
    [<JsonProperty(PropertyName = "maxWidth")>]
    MaxWidth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxHeight")>]
    MaxHeight : ConfigNodePropertyInteger;
  }

  //#endregion
