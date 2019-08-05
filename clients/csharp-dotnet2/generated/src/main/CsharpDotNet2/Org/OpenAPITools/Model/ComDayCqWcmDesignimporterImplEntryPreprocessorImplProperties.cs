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
  public class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties {
    /// <summary>
    /// Gets or Sets SearchPattern
    /// </summary>
    [DataMember(Name="search.pattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "search.pattern")]
    public ConfigNodePropertyString SearchPattern { get; set; }

    /// <summary>
    /// Gets or Sets ReplacePattern
    /// </summary>
    [DataMember(Name="replace.pattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "replace.pattern")]
    public ConfigNodePropertyString ReplacePattern { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties {\n");
      sb.Append("  SearchPattern: ").Append(SearchPattern).Append("\n");
      sb.Append("  ReplacePattern: ").Append(ReplacePattern).Append("\n");
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
