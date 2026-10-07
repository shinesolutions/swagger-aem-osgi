namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqAuditPurgeReplicationProperties =

  //#region ComAdobeCqAuditPurgeReplicationProperties

  [<CLIMutable>]
  type ComAdobeCqAuditPurgeReplicationProperties = {
    [<JsonProperty(PropertyName = "auditlog.rule.name")>]
    AuditlogRuleName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auditlog.rule.contentpath")>]
    AuditlogRuleContentpath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auditlog.rule.minimumage")>]
    AuditlogRuleMinimumage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "auditlog.rule.types")>]
    AuditlogRuleTypes : ConfigNodePropertyDropDown;
  }

  //#endregion
