namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties =

  //#region ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties

  [<CLIMutable>]
  type ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "pathPrefix")>]
    PathPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "createVersion")>]
    CreateVersion : ConfigNodePropertyBoolean;
  }

  //#endregion
