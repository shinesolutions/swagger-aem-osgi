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
  public class ComAdobeCqAddressImplLocationLocationListServletProperties {
    /// <summary>
    /// Gets or Sets CqAddressLocationDefaultMaxResults
    /// </summary>
    [DataMember(Name="cq.address.location.default.maxResults", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.address.location.default.maxResults")]
    public ConfigNodePropertyInteger CqAddressLocationDefaultMaxResults { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqAddressImplLocationLocationListServletProperties {\n");
      sb.Append("  CqAddressLocationDefaultMaxResults: ").Append(CqAddressLocationDefaultMaxResults).Append("\n");
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
