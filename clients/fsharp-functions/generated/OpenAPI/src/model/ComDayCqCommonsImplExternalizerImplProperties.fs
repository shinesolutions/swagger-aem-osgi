namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqCommonsImplExternalizerImplProperties =

  //#region ComDayCqCommonsImplExternalizerImplProperties

  [<CLIMutable>]
  type ComDayCqCommonsImplExternalizerImplProperties = {
    [<JsonProperty(PropertyName = "externalizer.domains")>]
    ExternalizerDomains : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "externalizer.host")>]
    ExternalizerHost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "externalizer.contextpath")>]
    ExternalizerContextpath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "externalizer.encodedpath")>]
    ExternalizerEncodedpath : ConfigNodePropertyBoolean;
  }

  //#endregion
