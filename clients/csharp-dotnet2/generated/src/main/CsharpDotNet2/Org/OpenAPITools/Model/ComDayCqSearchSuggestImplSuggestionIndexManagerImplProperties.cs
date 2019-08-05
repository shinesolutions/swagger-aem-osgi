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
  public class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {
    /// <summary>
    /// Gets or Sets PathBuilderTarget
    /// </summary>
    [DataMember(Name="pathBuilder.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pathBuilder.target")]
    public ConfigNodePropertyString PathBuilderTarget { get; set; }

    /// <summary>
    /// Gets or Sets SuggestBasepath
    /// </summary>
    [DataMember(Name="suggest.basepath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "suggest.basepath")]
    public ConfigNodePropertyString SuggestBasepath { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {\n");
      sb.Append("  PathBuilderTarget: ").Append(PathBuilderTarget).Append("\n");
      sb.Append("  SuggestBasepath: ").Append(SuggestBasepath).Append("\n");
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
