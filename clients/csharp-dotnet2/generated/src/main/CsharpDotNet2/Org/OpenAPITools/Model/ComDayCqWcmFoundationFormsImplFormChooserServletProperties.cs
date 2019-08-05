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
  public class ComDayCqWcmFoundationFormsImplFormChooserServletProperties {
    /// <summary>
    /// Gets or Sets ServiceName
    /// </summary>
    [DataMember(Name="service.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.name")]
    public ConfigNodePropertyString ServiceName { get; set; }

    /// <summary>
    /// Gets or Sets SlingServletResourceTypes
    /// </summary>
    [DataMember(Name="sling.servlet.resourceTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.resourceTypes")]
    public ConfigNodePropertyString SlingServletResourceTypes { get; set; }

    /// <summary>
    /// Gets or Sets SlingServletSelectors
    /// </summary>
    [DataMember(Name="sling.servlet.selectors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.selectors")]
    public ConfigNodePropertyString SlingServletSelectors { get; set; }

    /// <summary>
    /// Gets or Sets SlingServletMethods
    /// </summary>
    [DataMember(Name="sling.servlet.methods", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.methods")]
    public ConfigNodePropertyArray SlingServletMethods { get; set; }

    /// <summary>
    /// Gets or Sets FormsFormchooserservletAdvansesearchRequire
    /// </summary>
    [DataMember(Name="forms.formchooserservlet.advansesearch.require", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "forms.formchooserservlet.advansesearch.require")]
    public ConfigNodePropertyBoolean FormsFormchooserservletAdvansesearchRequire { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmFoundationFormsImplFormChooserServletProperties {\n");
      sb.Append("  ServiceName: ").Append(ServiceName).Append("\n");
      sb.Append("  SlingServletResourceTypes: ").Append(SlingServletResourceTypes).Append("\n");
      sb.Append("  SlingServletSelectors: ").Append(SlingServletSelectors).Append("\n");
      sb.Append("  SlingServletMethods: ").Append(SlingServletMethods).Append("\n");
      sb.Append("  FormsFormchooserservletAdvansesearchRequire: ").Append(FormsFormchooserservletAdvansesearchRequire).Append("\n");
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
