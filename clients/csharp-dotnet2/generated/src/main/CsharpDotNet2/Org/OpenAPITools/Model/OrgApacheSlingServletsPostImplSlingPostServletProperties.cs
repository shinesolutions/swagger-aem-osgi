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
  public class OrgApacheSlingServletsPostImplSlingPostServletProperties {
    /// <summary>
    /// Gets or Sets ServletPostDateFormats
    /// </summary>
    [DataMember(Name="servlet.post.dateFormats", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servlet.post.dateFormats")]
    public ConfigNodePropertyArray ServletPostDateFormats { get; set; }

    /// <summary>
    /// Gets or Sets ServletPostNodeNameHints
    /// </summary>
    [DataMember(Name="servlet.post.nodeNameHints", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servlet.post.nodeNameHints")]
    public ConfigNodePropertyArray ServletPostNodeNameHints { get; set; }

    /// <summary>
    /// Gets or Sets ServletPostNodeNameMaxLength
    /// </summary>
    [DataMember(Name="servlet.post.nodeNameMaxLength", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servlet.post.nodeNameMaxLength")]
    public ConfigNodePropertyInteger ServletPostNodeNameMaxLength { get; set; }

    /// <summary>
    /// Gets or Sets ServletPostCheckinNewVersionableNodes
    /// </summary>
    [DataMember(Name="servlet.post.checkinNewVersionableNodes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servlet.post.checkinNewVersionableNodes")]
    public ConfigNodePropertyBoolean ServletPostCheckinNewVersionableNodes { get; set; }

    /// <summary>
    /// Gets or Sets ServletPostAutoCheckout
    /// </summary>
    [DataMember(Name="servlet.post.autoCheckout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servlet.post.autoCheckout")]
    public ConfigNodePropertyBoolean ServletPostAutoCheckout { get; set; }

    /// <summary>
    /// Gets or Sets ServletPostAutoCheckin
    /// </summary>
    [DataMember(Name="servlet.post.autoCheckin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servlet.post.autoCheckin")]
    public ConfigNodePropertyBoolean ServletPostAutoCheckin { get; set; }

    /// <summary>
    /// Gets or Sets ServletPostIgnorePattern
    /// </summary>
    [DataMember(Name="servlet.post.ignorePattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servlet.post.ignorePattern")]
    public ConfigNodePropertyString ServletPostIgnorePattern { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingServletsPostImplSlingPostServletProperties {\n");
      sb.Append("  ServletPostDateFormats: ").Append(ServletPostDateFormats).Append("\n");
      sb.Append("  ServletPostNodeNameHints: ").Append(ServletPostNodeNameHints).Append("\n");
      sb.Append("  ServletPostNodeNameMaxLength: ").Append(ServletPostNodeNameMaxLength).Append("\n");
      sb.Append("  ServletPostCheckinNewVersionableNodes: ").Append(ServletPostCheckinNewVersionableNodes).Append("\n");
      sb.Append("  ServletPostAutoCheckout: ").Append(ServletPostAutoCheckout).Append("\n");
      sb.Append("  ServletPostAutoCheckin: ").Append(ServletPostAutoCheckin).Append("\n");
      sb.Append("  ServletPostIgnorePattern: ").Append(ServletPostIgnorePattern).Append("\n");
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
