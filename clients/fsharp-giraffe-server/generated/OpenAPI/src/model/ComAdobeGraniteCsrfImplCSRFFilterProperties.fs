namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteCsrfImplCSRFFilterProperties =

  //#region ComAdobeGraniteCsrfImplCSRFFilterProperties


  type comAdobeGraniteCsrfImplCSRFFilterProperties = {
    FilterMethods : ConfigNodePropertyArray;
    FilterEnableSafeUserAgents : ConfigNodePropertyBoolean;
    FilterSafeUserAgents : ConfigNodePropertyArray;
    FilterExcludedPaths : ConfigNodePropertyArray;
  }
  //#endregion
