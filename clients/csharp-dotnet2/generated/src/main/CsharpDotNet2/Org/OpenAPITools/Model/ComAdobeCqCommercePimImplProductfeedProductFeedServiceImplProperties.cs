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
  public class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties {
    /// <summary>
    /// Gets or Sets FeedGeneratorAlgorithm
    /// </summary>
    [DataMember(Name="Feed generator algorithm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Feed generator algorithm")]
    public ConfigNodePropertyDropDown FeedGeneratorAlgorithm { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties {\n");
      sb.Append("  FeedGeneratorAlgorithm: ").Append(FeedGeneratorAlgorithm).Append("\n");
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
