namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties = {
    [<JsonProperty(PropertyName = "path.desc.field")>]
    PathDescField : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path.child.field")>]
    PathChildField : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path.parent.field")>]
    PathParentField : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path.exact.field")>]
    PathExactField : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "catch.all.field")>]
    CatchAllField : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "collapsed.path.field")>]
    CollapsedPathField : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path.depth.field")>]
    PathDepthField : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "commit.policy")>]
    CommitPolicy : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "rows")>]
    Rows : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "path.restrictions")>]
    PathRestrictions : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "property.restrictions")>]
    PropertyRestrictions : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "primarytypes.restrictions")>]
    PrimarytypesRestrictions : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "ignored.properties")>]
    IgnoredProperties : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "used.properties")>]
    UsedProperties : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "type.mappings")>]
    TypeMappings : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "property.mappings")>]
    PropertyMappings : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "collapse.jcrcontent.nodes")>]
    CollapseJcrcontentNodes : ConfigNodePropertyBoolean;
  }

  //#endregion
