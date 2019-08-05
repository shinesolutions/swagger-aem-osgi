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
  public class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {
    /// <summary>
    /// Gets or Sets CqCommerceAssetHandlerFallback
    /// </summary>
    [DataMember(Name="cq.commerce.asset.handler.fallback", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.commerce.asset.handler.fallback")]
    public ConfigNodePropertyString CqCommerceAssetHandlerFallback { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {\n");
      sb.Append("  CqCommerceAssetHandlerFallback: ").Append(CqCommerceAssetHandlerFallback).Append("\n");
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
