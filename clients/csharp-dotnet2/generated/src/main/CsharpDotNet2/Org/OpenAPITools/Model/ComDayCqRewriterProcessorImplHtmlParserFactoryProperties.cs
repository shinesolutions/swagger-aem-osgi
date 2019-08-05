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
  public class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties {
    /// <summary>
    /// Gets or Sets HtmlparserProcessTags
    /// </summary>
    [DataMember(Name="htmlparser.processTags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmlparser.processTags")]
    public ConfigNodePropertyArray HtmlparserProcessTags { get; set; }

    /// <summary>
    /// Gets or Sets HtmlparserPreserveCamelCase
    /// </summary>
    [DataMember(Name="htmlparser.preserveCamelCase", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmlparser.preserveCamelCase")]
    public ConfigNodePropertyBoolean HtmlparserPreserveCamelCase { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties {\n");
      sb.Append("  HtmlparserProcessTags: ").Append(HtmlparserProcessTags).Append("\n");
      sb.Append("  HtmlparserPreserveCamelCase: ").Append(HtmlparserPreserveCamelCase).Append("\n");
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
