namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties =

  //#region ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties = {
    [<JsonProperty(PropertyName = "group2member.relationship.outgoing")>]
    Group2memberRelationshipOutgoing : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "group2member.excluded.outgoing")>]
    Group2memberExcludedOutgoing : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "group2member.relationship.incoming")>]
    Group2memberRelationshipIncoming : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "group2member.excluded.incoming")>]
    Group2memberExcludedIncoming : ConfigNodePropertyArray;
  }

  //#endregion
