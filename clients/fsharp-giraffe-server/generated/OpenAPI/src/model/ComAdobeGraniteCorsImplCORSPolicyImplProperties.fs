namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteCorsImplCORSPolicyImplProperties =

  //#region ComAdobeGraniteCorsImplCORSPolicyImplProperties


  type comAdobeGraniteCorsImplCORSPolicyImplProperties = {
    Alloworigin : ConfigNodePropertyArray;
    Alloworiginregexp : ConfigNodePropertyArray;
    Allowedpaths : ConfigNodePropertyArray;
    Exposedheaders : ConfigNodePropertyArray;
    Maxage : ConfigNodePropertyInteger;
    Supportedheaders : ConfigNodePropertyArray;
    Supportedmethods : ConfigNodePropertyArray;
    Supportscredentials : ConfigNodePropertyBoolean;
  }
  //#endregion
