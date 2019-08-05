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
  public class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {
    /// <summary>
    /// Gets or Sets MessageProperties
    /// </summary>
    [DataMember(Name="message.properties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message.properties")]
    public ConfigNodePropertyArray MessageProperties { get; set; }

    /// <summary>
    /// Gets or Sets MessageBoxSizeLimit
    /// </summary>
    [DataMember(Name="messageBoxSizeLimit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "messageBoxSizeLimit")]
    public ConfigNodePropertyInteger MessageBoxSizeLimit { get; set; }

    /// <summary>
    /// Gets or Sets MessageCountLimit
    /// </summary>
    [DataMember(Name="messageCountLimit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "messageCountLimit")]
    public ConfigNodePropertyInteger MessageCountLimit { get; set; }

    /// <summary>
    /// Gets or Sets NotifyFailure
    /// </summary>
    [DataMember(Name="notifyFailure", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notifyFailure")]
    public ConfigNodePropertyBoolean NotifyFailure { get; set; }

    /// <summary>
    /// Gets or Sets FailureMessageFrom
    /// </summary>
    [DataMember(Name="failureMessageFrom", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "failureMessageFrom")]
    public ConfigNodePropertyString FailureMessageFrom { get; set; }

    /// <summary>
    /// Gets or Sets FailureTemplatePath
    /// </summary>
    [DataMember(Name="failureTemplatePath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "failureTemplatePath")]
    public ConfigNodePropertyString FailureTemplatePath { get; set; }

    /// <summary>
    /// Gets or Sets MaxRetries
    /// </summary>
    [DataMember(Name="maxRetries", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxRetries")]
    public ConfigNodePropertyInteger MaxRetries { get; set; }

    /// <summary>
    /// Gets or Sets MinWaitBetweenRetries
    /// </summary>
    [DataMember(Name="minWaitBetweenRetries", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "minWaitBetweenRetries")]
    public ConfigNodePropertyInteger MinWaitBetweenRetries { get; set; }

    /// <summary>
    /// Gets or Sets CountUpdatePoolSize
    /// </summary>
    [DataMember(Name="countUpdatePoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "countUpdatePoolSize")]
    public ConfigNodePropertyInteger CountUpdatePoolSize { get; set; }

    /// <summary>
    /// Gets or Sets InboxPath
    /// </summary>
    [DataMember(Name="inbox.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inbox.path")]
    public ConfigNodePropertyString InboxPath { get; set; }

    /// <summary>
    /// Gets or Sets SentitemsPath
    /// </summary>
    [DataMember(Name="sentitems.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sentitems.path")]
    public ConfigNodePropertyString SentitemsPath { get; set; }

    /// <summary>
    /// Gets or Sets SupportAttachments
    /// </summary>
    [DataMember(Name="supportAttachments", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "supportAttachments")]
    public ConfigNodePropertyBoolean SupportAttachments { get; set; }

    /// <summary>
    /// Gets or Sets SupportGroupMessaging
    /// </summary>
    [DataMember(Name="supportGroupMessaging", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "supportGroupMessaging")]
    public ConfigNodePropertyBoolean SupportGroupMessaging { get; set; }

    /// <summary>
    /// Gets or Sets MaxTotalRecipients
    /// </summary>
    [DataMember(Name="maxTotalRecipients", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxTotalRecipients")]
    public ConfigNodePropertyInteger MaxTotalRecipients { get; set; }

    /// <summary>
    /// Gets or Sets BatchSize
    /// </summary>
    [DataMember(Name="batchSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "batchSize")]
    public ConfigNodePropertyInteger BatchSize { get; set; }

    /// <summary>
    /// Gets or Sets MaxTotalAttachmentSize
    /// </summary>
    [DataMember(Name="maxTotalAttachmentSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxTotalAttachmentSize")]
    public ConfigNodePropertyInteger MaxTotalAttachmentSize { get; set; }

    /// <summary>
    /// Gets or Sets AttachmentTypeBlacklist
    /// </summary>
    [DataMember(Name="attachmentTypeBlacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "attachmentTypeBlacklist")]
    public ConfigNodePropertyArray AttachmentTypeBlacklist { get; set; }

    /// <summary>
    /// Gets or Sets AllowedAttachmentTypes
    /// </summary>
    [DataMember(Name="allowedAttachmentTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allowedAttachmentTypes")]
    public ConfigNodePropertyArray AllowedAttachmentTypes { get; set; }

    /// <summary>
    /// Gets or Sets ServiceSelector
    /// </summary>
    [DataMember(Name="serviceSelector", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceSelector")]
    public ConfigNodePropertyString ServiceSelector { get; set; }

    /// <summary>
    /// Gets or Sets FieldWhitelist
    /// </summary>
    [DataMember(Name="fieldWhitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fieldWhitelist")]
    public ConfigNodePropertyArray FieldWhitelist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {\n");
      sb.Append("  MessageProperties: ").Append(MessageProperties).Append("\n");
      sb.Append("  MessageBoxSizeLimit: ").Append(MessageBoxSizeLimit).Append("\n");
      sb.Append("  MessageCountLimit: ").Append(MessageCountLimit).Append("\n");
      sb.Append("  NotifyFailure: ").Append(NotifyFailure).Append("\n");
      sb.Append("  FailureMessageFrom: ").Append(FailureMessageFrom).Append("\n");
      sb.Append("  FailureTemplatePath: ").Append(FailureTemplatePath).Append("\n");
      sb.Append("  MaxRetries: ").Append(MaxRetries).Append("\n");
      sb.Append("  MinWaitBetweenRetries: ").Append(MinWaitBetweenRetries).Append("\n");
      sb.Append("  CountUpdatePoolSize: ").Append(CountUpdatePoolSize).Append("\n");
      sb.Append("  InboxPath: ").Append(InboxPath).Append("\n");
      sb.Append("  SentitemsPath: ").Append(SentitemsPath).Append("\n");
      sb.Append("  SupportAttachments: ").Append(SupportAttachments).Append("\n");
      sb.Append("  SupportGroupMessaging: ").Append(SupportGroupMessaging).Append("\n");
      sb.Append("  MaxTotalRecipients: ").Append(MaxTotalRecipients).Append("\n");
      sb.Append("  BatchSize: ").Append(BatchSize).Append("\n");
      sb.Append("  MaxTotalAttachmentSize: ").Append(MaxTotalAttachmentSize).Append("\n");
      sb.Append("  AttachmentTypeBlacklist: ").Append(AttachmentTypeBlacklist).Append("\n");
      sb.Append("  AllowedAttachmentTypes: ").Append(AllowedAttachmentTypes).Append("\n");
      sb.Append("  ServiceSelector: ").Append(ServiceSelector).Append("\n");
      sb.Append("  FieldWhitelist: ").Append(FieldWhitelist).Append("\n");
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
