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
  public class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {
    /// <summary>
    /// Gets or Sets CqContentsyncPathrewritertransformerMappingLinks
    /// </summary>
    [DataMember(Name="cq.contentsync.pathrewritertransformer.mapping.links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.mapping.links")]
    public ConfigNodePropertyArray CqContentsyncPathrewritertransformerMappingLinks { get; set; }

    /// <summary>
    /// Gets or Sets CqContentsyncPathrewritertransformerMappingClientlibs
    /// </summary>
    [DataMember(Name="cq.contentsync.pathrewritertransformer.mapping.clientlibs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.mapping.clientlibs")]
    public ConfigNodePropertyArray CqContentsyncPathrewritertransformerMappingClientlibs { get; set; }

    /// <summary>
    /// Gets or Sets CqContentsyncPathrewritertransformerMappingImages
    /// </summary>
    [DataMember(Name="cq.contentsync.pathrewritertransformer.mapping.images", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.mapping.images")]
    public ConfigNodePropertyArray CqContentsyncPathrewritertransformerMappingImages { get; set; }

    /// <summary>
    /// Gets or Sets CqContentsyncPathrewritertransformerAttributePattern
    /// </summary>
    [DataMember(Name="cq.contentsync.pathrewritertransformer.attribute.pattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.attribute.pattern")]
    public ConfigNodePropertyString CqContentsyncPathrewritertransformerAttributePattern { get; set; }

    /// <summary>
    /// Gets or Sets CqContentsyncPathrewritertransformerClientlibraryPattern
    /// </summary>
    [DataMember(Name="cq.contentsync.pathrewritertransformer.clientlibrary.pattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.clientlibrary.pattern")]
    public ConfigNodePropertyString CqContentsyncPathrewritertransformerClientlibraryPattern { get; set; }

    /// <summary>
    /// Gets or Sets CqContentsyncPathrewritertransformerClientlibraryReplace
    /// </summary>
    [DataMember(Name="cq.contentsync.pathrewritertransformer.clientlibrary.replace", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.contentsync.pathrewritertransformer.clientlibrary.replace")]
    public ConfigNodePropertyString CqContentsyncPathrewritertransformerClientlibraryReplace { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {\n");
      sb.Append("  CqContentsyncPathrewritertransformerMappingLinks: ").Append(CqContentsyncPathrewritertransformerMappingLinks).Append("\n");
      sb.Append("  CqContentsyncPathrewritertransformerMappingClientlibs: ").Append(CqContentsyncPathrewritertransformerMappingClientlibs).Append("\n");
      sb.Append("  CqContentsyncPathrewritertransformerMappingImages: ").Append(CqContentsyncPathrewritertransformerMappingImages).Append("\n");
      sb.Append("  CqContentsyncPathrewritertransformerAttributePattern: ").Append(CqContentsyncPathrewritertransformerAttributePattern).Append("\n");
      sb.Append("  CqContentsyncPathrewritertransformerClientlibraryPattern: ").Append(CqContentsyncPathrewritertransformerClientlibraryPattern).Append("\n");
      sb.Append("  CqContentsyncPathrewritertransformerClientlibraryReplace: ").Append(CqContentsyncPathrewritertransformerClientlibraryReplace).Append("\n");
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
