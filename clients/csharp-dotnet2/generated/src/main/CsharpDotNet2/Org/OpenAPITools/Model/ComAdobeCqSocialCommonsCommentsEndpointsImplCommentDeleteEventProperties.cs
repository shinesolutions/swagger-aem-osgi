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
  public class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties {
    /// <summary>
    /// Gets or Sets Ranking
    /// </summary>
    [DataMember(Name="ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ranking")]
    public ConfigNodePropertyInteger Ranking { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties {\n");
      sb.Append("  Ranking: ").Append(Ranking).Append("\n");
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
