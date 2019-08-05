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
  public class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties {
    /// <summary>
    /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath")]
    public ConfigNodePropertyArray ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency")]
    public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout")]
    public ConfigNodePropertyInteger ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients")]
    public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver")]
    public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport")]
    public ConfigNodePropertyInteger ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls")]
    public ConfigNodePropertyBoolean ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username")]
    public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
    /// </summary>
    [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password")]
    public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties {\n");
      sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath).Append("\n");
      sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency).Append("\n");
      sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout).Append("\n");
      sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients).Append("\n");
      sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver).Append("\n");
      sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport).Append("\n");
      sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls).Append("\n");
      sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername).Append("\n");
      sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword).Append("\n");
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
