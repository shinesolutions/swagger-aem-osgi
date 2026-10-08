namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteCsrfImplCSRFFilterProperties =

  //#region ComAdobeGraniteCsrfImplCSRFFilterProperties

  [<CLIMutable>]
  type ComAdobeGraniteCsrfImplCSRFFilterProperties = {
    [<JsonProperty(PropertyName = "filter.methods")>]
    FilterMethods : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "filter.enable.safe.user.agents")>]
    FilterEnableSafeUserAgents : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "filter.safe.user.agents")>]
    FilterSafeUserAgents : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "filter.excluded.paths")>]
    FilterExcludedPaths : ConfigNodePropertyArray;
  }

  //#endregion
