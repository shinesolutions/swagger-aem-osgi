using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {
    /// <summary>
    /// Gets or Sets PathDescField
    /// </summary>
    [DataMember(Name="path.desc.field", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path.desc.field")]
    public ConfigNodePropertyString PathDescField { get; set; }

    /// <summary>
    /// Gets or Sets PathChildField
    /// </summary>
    [DataMember(Name="path.child.field", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path.child.field")]
    public ConfigNodePropertyString PathChildField { get; set; }

    /// <summary>
    /// Gets or Sets PathParentField
    /// </summary>
    [DataMember(Name="path.parent.field", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path.parent.field")]
    public ConfigNodePropertyString PathParentField { get; set; }

    /// <summary>
    /// Gets or Sets PathExactField
    /// </summary>
    [DataMember(Name="path.exact.field", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path.exact.field")]
    public ConfigNodePropertyString PathExactField { get; set; }

    /// <summary>
    /// Gets or Sets CatchAllField
    /// </summary>
    [DataMember(Name="catch.all.field", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "catch.all.field")]
    public ConfigNodePropertyString CatchAllField { get; set; }

    /// <summary>
    /// Gets or Sets CollapsedPathField
    /// </summary>
    [DataMember(Name="collapsed.path.field", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "collapsed.path.field")]
    public ConfigNodePropertyString CollapsedPathField { get; set; }

    /// <summary>
    /// Gets or Sets PathDepthField
    /// </summary>
    [DataMember(Name="path.depth.field", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path.depth.field")]
    public ConfigNodePropertyString PathDepthField { get; set; }

    /// <summary>
    /// Gets or Sets CommitPolicy
    /// </summary>
    [DataMember(Name="commit.policy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "commit.policy")]
    public ConfigNodePropertyDropDown CommitPolicy { get; set; }

    /// <summary>
    /// Gets or Sets Rows
    /// </summary>
    [DataMember(Name="rows", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rows")]
    public ConfigNodePropertyInteger Rows { get; set; }

    /// <summary>
    /// Gets or Sets PathRestrictions
    /// </summary>
    [DataMember(Name="path.restrictions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path.restrictions")]
    public ConfigNodePropertyBoolean PathRestrictions { get; set; }

    /// <summary>
    /// Gets or Sets PropertyRestrictions
    /// </summary>
    [DataMember(Name="property.restrictions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "property.restrictions")]
    public ConfigNodePropertyBoolean PropertyRestrictions { get; set; }

    /// <summary>
    /// Gets or Sets PrimarytypesRestrictions
    /// </summary>
    [DataMember(Name="primarytypes.restrictions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "primarytypes.restrictions")]
    public ConfigNodePropertyBoolean PrimarytypesRestrictions { get; set; }

    /// <summary>
    /// Gets or Sets IgnoredProperties
    /// </summary>
    [DataMember(Name="ignored.properties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ignored.properties")]
    public ConfigNodePropertyArray IgnoredProperties { get; set; }

    /// <summary>
    /// Gets or Sets UsedProperties
    /// </summary>
    [DataMember(Name="used.properties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "used.properties")]
    public ConfigNodePropertyArray UsedProperties { get; set; }

    /// <summary>
    /// Gets or Sets TypeMappings
    /// </summary>
    [DataMember(Name="type.mappings", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type.mappings")]
    public ConfigNodePropertyArray TypeMappings { get; set; }

    /// <summary>
    /// Gets or Sets PropertyMappings
    /// </summary>
    [DataMember(Name="property.mappings", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "property.mappings")]
    public ConfigNodePropertyArray PropertyMappings { get; set; }

    /// <summary>
    /// Gets or Sets CollapseJcrcontentNodes
    /// </summary>
    [DataMember(Name="collapse.jcrcontent.nodes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "collapse.jcrcontent.nodes")]
    public ConfigNodePropertyBoolean CollapseJcrcontentNodes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {\n");
      sb.Append("  PathDescField: ").Append(PathDescField).Append("\n");
      sb.Append("  PathChildField: ").Append(PathChildField).Append("\n");
      sb.Append("  PathParentField: ").Append(PathParentField).Append("\n");
      sb.Append("  PathExactField: ").Append(PathExactField).Append("\n");
      sb.Append("  CatchAllField: ").Append(CatchAllField).Append("\n");
      sb.Append("  CollapsedPathField: ").Append(CollapsedPathField).Append("\n");
      sb.Append("  PathDepthField: ").Append(PathDepthField).Append("\n");
      sb.Append("  CommitPolicy: ").Append(CommitPolicy).Append("\n");
      sb.Append("  Rows: ").Append(Rows).Append("\n");
      sb.Append("  PathRestrictions: ").Append(PathRestrictions).Append("\n");
      sb.Append("  PropertyRestrictions: ").Append(PropertyRestrictions).Append("\n");
      sb.Append("  PrimarytypesRestrictions: ").Append(PrimarytypesRestrictions).Append("\n");
      sb.Append("  IgnoredProperties: ").Append(IgnoredProperties).Append("\n");
      sb.Append("  UsedProperties: ").Append(UsedProperties).Append("\n");
      sb.Append("  TypeMappings: ").Append(TypeMappings).Append("\n");
      sb.Append("  PropertyMappings: ").Append(PropertyMappings).Append("\n");
      sb.Append("  CollapseJcrcontentNodes: ").Append(CollapseJcrcontentNodes).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
