namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteSecurityUserUserPropertiesServiceProperties =

  //#region ComAdobeGraniteSecurityUserUserPropertiesServiceProperties

  [<CLIMutable>]
  type ComAdobeGraniteSecurityUserUserPropertiesServiceProperties = {
    [<JsonProperty(PropertyName = "adapter.condition")>]
    AdapterCondition : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "granite.userproperties.nodetypes")>]
    GraniteUserpropertiesNodetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "granite.userproperties.resourcetypes")>]
    GraniteUserpropertiesResourcetypes : ConfigNodePropertyArray;
  }

  //#endregion
