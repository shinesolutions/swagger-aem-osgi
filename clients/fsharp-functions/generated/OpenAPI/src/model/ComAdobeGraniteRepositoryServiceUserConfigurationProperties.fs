namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteRepositoryServiceUserConfigurationProperties =

  //#region ComAdobeGraniteRepositoryServiceUserConfigurationProperties

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryServiceUserConfigurationProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "serviceusers.simpleSubjectPopulation")>]
    ServiceusersSimpleSubjectPopulation : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "serviceusers.list")>]
    ServiceusersList : ConfigNodePropertyArray;
  }

  //#endregion
