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
  public class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    /// <summary>
    /// Gets or Sets LinkcheckertransformerDisableRewriting
    /// </summary>
    [DataMember(Name="linkcheckertransformer.disableRewriting", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "linkcheckertransformer.disableRewriting")]
    public ConfigNodePropertyBoolean LinkcheckertransformerDisableRewriting { get; set; }

    /// <summary>
    /// Gets or Sets LinkcheckertransformerDisableChecking
    /// </summary>
    [DataMember(Name="linkcheckertransformer.disableChecking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "linkcheckertransformer.disableChecking")]
    public ConfigNodePropertyBoolean LinkcheckertransformerDisableChecking { get; set; }

    /// <summary>
    /// Gets or Sets LinkcheckertransformerMapCacheSize
    /// </summary>
    [DataMember(Name="linkcheckertransformer.mapCacheSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "linkcheckertransformer.mapCacheSize")]
    public ConfigNodePropertyInteger LinkcheckertransformerMapCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets LinkcheckertransformerStrictExtensionCheck
    /// </summary>
    [DataMember(Name="linkcheckertransformer.strictExtensionCheck", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "linkcheckertransformer.strictExtensionCheck")]
    public ConfigNodePropertyBoolean LinkcheckertransformerStrictExtensionCheck { get; set; }

    /// <summary>
    /// Gets or Sets LinkcheckertransformerStripHtmltExtension
    /// </summary>
    [DataMember(Name="linkcheckertransformer.stripHtmltExtension", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "linkcheckertransformer.stripHtmltExtension")]
    public ConfigNodePropertyBoolean LinkcheckertransformerStripHtmltExtension { get; set; }

    /// <summary>
    /// Gets or Sets LinkcheckertransformerRewriteElements
    /// </summary>
    [DataMember(Name="linkcheckertransformer.rewriteElements", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "linkcheckertransformer.rewriteElements")]
    public ConfigNodePropertyArray LinkcheckertransformerRewriteElements { get; set; }

    /// <summary>
    /// Gets or Sets LinkcheckertransformerStripExtensionPathBlacklist
    /// </summary>
    [DataMember(Name="linkcheckertransformer.stripExtensionPathBlacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "linkcheckertransformer.stripExtensionPathBlacklist")]
    public ConfigNodePropertyArray LinkcheckertransformerStripExtensionPathBlacklist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {\n");
      sb.Append("  LinkcheckertransformerDisableRewriting: ").Append(LinkcheckertransformerDisableRewriting).Append("\n");
      sb.Append("  LinkcheckertransformerDisableChecking: ").Append(LinkcheckertransformerDisableChecking).Append("\n");
      sb.Append("  LinkcheckertransformerMapCacheSize: ").Append(LinkcheckertransformerMapCacheSize).Append("\n");
      sb.Append("  LinkcheckertransformerStrictExtensionCheck: ").Append(LinkcheckertransformerStrictExtensionCheck).Append("\n");
      sb.Append("  LinkcheckertransformerStripHtmltExtension: ").Append(LinkcheckertransformerStripHtmltExtension).Append("\n");
      sb.Append("  LinkcheckertransformerRewriteElements: ").Append(LinkcheckertransformerRewriteElements).Append("\n");
      sb.Append("  LinkcheckertransformerStripExtensionPathBlacklist: ").Append(LinkcheckertransformerStripExtensionPathBlacklist).Append("\n");
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
