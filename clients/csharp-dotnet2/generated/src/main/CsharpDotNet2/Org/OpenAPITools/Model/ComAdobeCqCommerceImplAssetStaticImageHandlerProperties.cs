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
  public class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties {
    /// <summary>
    /// Gets or Sets CqCommerceAssetHandlerActive
    /// </summary>
    [DataMember(Name="cq.commerce.asset.handler.active", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.commerce.asset.handler.active")]
    public ConfigNodePropertyBoolean CqCommerceAssetHandlerActive { get; set; }

    /// <summary>
    /// Gets or Sets CqCommerceAssetHandlerName
    /// </summary>
    [DataMember(Name="cq.commerce.asset.handler.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.commerce.asset.handler.name")]
    public ConfigNodePropertyString CqCommerceAssetHandlerName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties {\n");
      sb.Append("  CqCommerceAssetHandlerActive: ").Append(CqCommerceAssetHandlerActive).Append("\n");
      sb.Append("  CqCommerceAssetHandlerName: ").Append(CqCommerceAssetHandlerName).Append("\n");
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
