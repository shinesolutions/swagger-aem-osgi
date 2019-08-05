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
  public class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties {
    /// <summary>
    /// Gets or Sets ComAdobeCqScreensAnalyticsImplUrl
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.analytics.impl.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.url")]
    public ConfigNodePropertyString ComAdobeCqScreensAnalyticsImplUrl { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensAnalyticsImplApikey
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.analytics.impl.apikey", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.apikey")]
    public ConfigNodePropertyString ComAdobeCqScreensAnalyticsImplApikey { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensAnalyticsImplProject
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.analytics.impl.project", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.project")]
    public ConfigNodePropertyString ComAdobeCqScreensAnalyticsImplProject { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensAnalyticsImplEnvironment
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.analytics.impl.environment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.environment")]
    public ConfigNodePropertyDropDown ComAdobeCqScreensAnalyticsImplEnvironment { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensAnalyticsImplSendFrequency
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.analytics.impl.sendFrequency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.sendFrequency")]
    public ConfigNodePropertyInteger ComAdobeCqScreensAnalyticsImplSendFrequency { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties {\n");
      sb.Append("  ComAdobeCqScreensAnalyticsImplUrl: ").Append(ComAdobeCqScreensAnalyticsImplUrl).Append("\n");
      sb.Append("  ComAdobeCqScreensAnalyticsImplApikey: ").Append(ComAdobeCqScreensAnalyticsImplApikey).Append("\n");
      sb.Append("  ComAdobeCqScreensAnalyticsImplProject: ").Append(ComAdobeCqScreensAnalyticsImplProject).Append("\n");
      sb.Append("  ComAdobeCqScreensAnalyticsImplEnvironment: ").Append(ComAdobeCqScreensAnalyticsImplEnvironment).Append("\n");
      sb.Append("  ComAdobeCqScreensAnalyticsImplSendFrequency: ").Append(ComAdobeCqScreensAnalyticsImplSendFrequency).Append("\n");
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
