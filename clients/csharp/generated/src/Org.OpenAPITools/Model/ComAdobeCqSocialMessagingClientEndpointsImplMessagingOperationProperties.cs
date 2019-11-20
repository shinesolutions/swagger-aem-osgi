/* 
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
    /// </summary>
    [DataContract]
    public partial class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties :  IEquatable<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties" /> class.
        /// </summary>
        /// <param name="messageProperties">messageProperties.</param>
        /// <param name="messageBoxSizeLimit">messageBoxSizeLimit.</param>
        /// <param name="messageCountLimit">messageCountLimit.</param>
        /// <param name="notifyFailure">notifyFailure.</param>
        /// <param name="failureMessageFrom">failureMessageFrom.</param>
        /// <param name="failureTemplatePath">failureTemplatePath.</param>
        /// <param name="maxRetries">maxRetries.</param>
        /// <param name="minWaitBetweenRetries">minWaitBetweenRetries.</param>
        /// <param name="countUpdatePoolSize">countUpdatePoolSize.</param>
        /// <param name="inboxPath">inboxPath.</param>
        /// <param name="sentitemsPath">sentitemsPath.</param>
        /// <param name="supportAttachments">supportAttachments.</param>
        /// <param name="supportGroupMessaging">supportGroupMessaging.</param>
        /// <param name="maxTotalRecipients">maxTotalRecipients.</param>
        /// <param name="batchSize">batchSize.</param>
        /// <param name="maxTotalAttachmentSize">maxTotalAttachmentSize.</param>
        /// <param name="attachmentTypeBlacklist">attachmentTypeBlacklist.</param>
        /// <param name="allowedAttachmentTypes">allowedAttachmentTypes.</param>
        /// <param name="serviceSelector">serviceSelector.</param>
        /// <param name="fieldWhitelist">fieldWhitelist.</param>
        public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(ConfigNodePropertyArray messageProperties = default(ConfigNodePropertyArray), ConfigNodePropertyInteger messageBoxSizeLimit = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger messageCountLimit = default(ConfigNodePropertyInteger), ConfigNodePropertyBoolean notifyFailure = default(ConfigNodePropertyBoolean), ConfigNodePropertyString failureMessageFrom = default(ConfigNodePropertyString), ConfigNodePropertyString failureTemplatePath = default(ConfigNodePropertyString), ConfigNodePropertyInteger maxRetries = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger minWaitBetweenRetries = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger countUpdatePoolSize = default(ConfigNodePropertyInteger), ConfigNodePropertyString inboxPath = default(ConfigNodePropertyString), ConfigNodePropertyString sentitemsPath = default(ConfigNodePropertyString), ConfigNodePropertyBoolean supportAttachments = default(ConfigNodePropertyBoolean), ConfigNodePropertyBoolean supportGroupMessaging = default(ConfigNodePropertyBoolean), ConfigNodePropertyInteger maxTotalRecipients = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger batchSize = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger maxTotalAttachmentSize = default(ConfigNodePropertyInteger), ConfigNodePropertyArray attachmentTypeBlacklist = default(ConfigNodePropertyArray), ConfigNodePropertyArray allowedAttachmentTypes = default(ConfigNodePropertyArray), ConfigNodePropertyString serviceSelector = default(ConfigNodePropertyString), ConfigNodePropertyArray fieldWhitelist = default(ConfigNodePropertyArray))
        {
            this.MessageProperties = messageProperties;
            this.MessageBoxSizeLimit = messageBoxSizeLimit;
            this.MessageCountLimit = messageCountLimit;
            this.NotifyFailure = notifyFailure;
            this.FailureMessageFrom = failureMessageFrom;
            this.FailureTemplatePath = failureTemplatePath;
            this.MaxRetries = maxRetries;
            this.MinWaitBetweenRetries = minWaitBetweenRetries;
            this.CountUpdatePoolSize = countUpdatePoolSize;
            this.InboxPath = inboxPath;
            this.SentitemsPath = sentitemsPath;
            this.SupportAttachments = supportAttachments;
            this.SupportGroupMessaging = supportGroupMessaging;
            this.MaxTotalRecipients = maxTotalRecipients;
            this.BatchSize = batchSize;
            this.MaxTotalAttachmentSize = maxTotalAttachmentSize;
            this.AttachmentTypeBlacklist = attachmentTypeBlacklist;
            this.AllowedAttachmentTypes = allowedAttachmentTypes;
            this.ServiceSelector = serviceSelector;
            this.FieldWhitelist = fieldWhitelist;
        }
        
        /// <summary>
        /// Gets or Sets MessageProperties
        /// </summary>
        [DataMember(Name="message.properties", EmitDefaultValue=false)]
        public ConfigNodePropertyArray MessageProperties { get; set; }

        /// <summary>
        /// Gets or Sets MessageBoxSizeLimit
        /// </summary>
        [DataMember(Name="messageBoxSizeLimit", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger MessageBoxSizeLimit { get; set; }

        /// <summary>
        /// Gets or Sets MessageCountLimit
        /// </summary>
        [DataMember(Name="messageCountLimit", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger MessageCountLimit { get; set; }

        /// <summary>
        /// Gets or Sets NotifyFailure
        /// </summary>
        [DataMember(Name="notifyFailure", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean NotifyFailure { get; set; }

        /// <summary>
        /// Gets or Sets FailureMessageFrom
        /// </summary>
        [DataMember(Name="failureMessageFrom", EmitDefaultValue=false)]
        public ConfigNodePropertyString FailureMessageFrom { get; set; }

        /// <summary>
        /// Gets or Sets FailureTemplatePath
        /// </summary>
        [DataMember(Name="failureTemplatePath", EmitDefaultValue=false)]
        public ConfigNodePropertyString FailureTemplatePath { get; set; }

        /// <summary>
        /// Gets or Sets MaxRetries
        /// </summary>
        [DataMember(Name="maxRetries", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger MaxRetries { get; set; }

        /// <summary>
        /// Gets or Sets MinWaitBetweenRetries
        /// </summary>
        [DataMember(Name="minWaitBetweenRetries", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger MinWaitBetweenRetries { get; set; }

        /// <summary>
        /// Gets or Sets CountUpdatePoolSize
        /// </summary>
        [DataMember(Name="countUpdatePoolSize", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger CountUpdatePoolSize { get; set; }

        /// <summary>
        /// Gets or Sets InboxPath
        /// </summary>
        [DataMember(Name="inbox.path", EmitDefaultValue=false)]
        public ConfigNodePropertyString InboxPath { get; set; }

        /// <summary>
        /// Gets or Sets SentitemsPath
        /// </summary>
        [DataMember(Name="sentitems.path", EmitDefaultValue=false)]
        public ConfigNodePropertyString SentitemsPath { get; set; }

        /// <summary>
        /// Gets or Sets SupportAttachments
        /// </summary>
        [DataMember(Name="supportAttachments", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean SupportAttachments { get; set; }

        /// <summary>
        /// Gets or Sets SupportGroupMessaging
        /// </summary>
        [DataMember(Name="supportGroupMessaging", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean SupportGroupMessaging { get; set; }

        /// <summary>
        /// Gets or Sets MaxTotalRecipients
        /// </summary>
        [DataMember(Name="maxTotalRecipients", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger MaxTotalRecipients { get; set; }

        /// <summary>
        /// Gets or Sets BatchSize
        /// </summary>
        [DataMember(Name="batchSize", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger BatchSize { get; set; }

        /// <summary>
        /// Gets or Sets MaxTotalAttachmentSize
        /// </summary>
        [DataMember(Name="maxTotalAttachmentSize", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger MaxTotalAttachmentSize { get; set; }

        /// <summary>
        /// Gets or Sets AttachmentTypeBlacklist
        /// </summary>
        [DataMember(Name="attachmentTypeBlacklist", EmitDefaultValue=false)]
        public ConfigNodePropertyArray AttachmentTypeBlacklist { get; set; }

        /// <summary>
        /// Gets or Sets AllowedAttachmentTypes
        /// </summary>
        [DataMember(Name="allowedAttachmentTypes", EmitDefaultValue=false)]
        public ConfigNodePropertyArray AllowedAttachmentTypes { get; set; }

        /// <summary>
        /// Gets or Sets ServiceSelector
        /// </summary>
        [DataMember(Name="serviceSelector", EmitDefaultValue=false)]
        public ConfigNodePropertyString ServiceSelector { get; set; }

        /// <summary>
        /// Gets or Sets FieldWhitelist
        /// </summary>
        [DataMember(Name="fieldWhitelist", EmitDefaultValue=false)]
        public ConfigNodePropertyArray FieldWhitelist { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
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
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties);
        }

        /// <summary>
        /// Returns true if ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MessageProperties == input.MessageProperties ||
                    (this.MessageProperties != null &&
                    this.MessageProperties.Equals(input.MessageProperties))
                ) && 
                (
                    this.MessageBoxSizeLimit == input.MessageBoxSizeLimit ||
                    (this.MessageBoxSizeLimit != null &&
                    this.MessageBoxSizeLimit.Equals(input.MessageBoxSizeLimit))
                ) && 
                (
                    this.MessageCountLimit == input.MessageCountLimit ||
                    (this.MessageCountLimit != null &&
                    this.MessageCountLimit.Equals(input.MessageCountLimit))
                ) && 
                (
                    this.NotifyFailure == input.NotifyFailure ||
                    (this.NotifyFailure != null &&
                    this.NotifyFailure.Equals(input.NotifyFailure))
                ) && 
                (
                    this.FailureMessageFrom == input.FailureMessageFrom ||
                    (this.FailureMessageFrom != null &&
                    this.FailureMessageFrom.Equals(input.FailureMessageFrom))
                ) && 
                (
                    this.FailureTemplatePath == input.FailureTemplatePath ||
                    (this.FailureTemplatePath != null &&
                    this.FailureTemplatePath.Equals(input.FailureTemplatePath))
                ) && 
                (
                    this.MaxRetries == input.MaxRetries ||
                    (this.MaxRetries != null &&
                    this.MaxRetries.Equals(input.MaxRetries))
                ) && 
                (
                    this.MinWaitBetweenRetries == input.MinWaitBetweenRetries ||
                    (this.MinWaitBetweenRetries != null &&
                    this.MinWaitBetweenRetries.Equals(input.MinWaitBetweenRetries))
                ) && 
                (
                    this.CountUpdatePoolSize == input.CountUpdatePoolSize ||
                    (this.CountUpdatePoolSize != null &&
                    this.CountUpdatePoolSize.Equals(input.CountUpdatePoolSize))
                ) && 
                (
                    this.InboxPath == input.InboxPath ||
                    (this.InboxPath != null &&
                    this.InboxPath.Equals(input.InboxPath))
                ) && 
                (
                    this.SentitemsPath == input.SentitemsPath ||
                    (this.SentitemsPath != null &&
                    this.SentitemsPath.Equals(input.SentitemsPath))
                ) && 
                (
                    this.SupportAttachments == input.SupportAttachments ||
                    (this.SupportAttachments != null &&
                    this.SupportAttachments.Equals(input.SupportAttachments))
                ) && 
                (
                    this.SupportGroupMessaging == input.SupportGroupMessaging ||
                    (this.SupportGroupMessaging != null &&
                    this.SupportGroupMessaging.Equals(input.SupportGroupMessaging))
                ) && 
                (
                    this.MaxTotalRecipients == input.MaxTotalRecipients ||
                    (this.MaxTotalRecipients != null &&
                    this.MaxTotalRecipients.Equals(input.MaxTotalRecipients))
                ) && 
                (
                    this.BatchSize == input.BatchSize ||
                    (this.BatchSize != null &&
                    this.BatchSize.Equals(input.BatchSize))
                ) && 
                (
                    this.MaxTotalAttachmentSize == input.MaxTotalAttachmentSize ||
                    (this.MaxTotalAttachmentSize != null &&
                    this.MaxTotalAttachmentSize.Equals(input.MaxTotalAttachmentSize))
                ) && 
                (
                    this.AttachmentTypeBlacklist == input.AttachmentTypeBlacklist ||
                    (this.AttachmentTypeBlacklist != null &&
                    this.AttachmentTypeBlacklist.Equals(input.AttachmentTypeBlacklist))
                ) && 
                (
                    this.AllowedAttachmentTypes == input.AllowedAttachmentTypes ||
                    (this.AllowedAttachmentTypes != null &&
                    this.AllowedAttachmentTypes.Equals(input.AllowedAttachmentTypes))
                ) && 
                (
                    this.ServiceSelector == input.ServiceSelector ||
                    (this.ServiceSelector != null &&
                    this.ServiceSelector.Equals(input.ServiceSelector))
                ) && 
                (
                    this.FieldWhitelist == input.FieldWhitelist ||
                    (this.FieldWhitelist != null &&
                    this.FieldWhitelist.Equals(input.FieldWhitelist))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.MessageProperties != null)
                    hashCode = hashCode * 59 + this.MessageProperties.GetHashCode();
                if (this.MessageBoxSizeLimit != null)
                    hashCode = hashCode * 59 + this.MessageBoxSizeLimit.GetHashCode();
                if (this.MessageCountLimit != null)
                    hashCode = hashCode * 59 + this.MessageCountLimit.GetHashCode();
                if (this.NotifyFailure != null)
                    hashCode = hashCode * 59 + this.NotifyFailure.GetHashCode();
                if (this.FailureMessageFrom != null)
                    hashCode = hashCode * 59 + this.FailureMessageFrom.GetHashCode();
                if (this.FailureTemplatePath != null)
                    hashCode = hashCode * 59 + this.FailureTemplatePath.GetHashCode();
                if (this.MaxRetries != null)
                    hashCode = hashCode * 59 + this.MaxRetries.GetHashCode();
                if (this.MinWaitBetweenRetries != null)
                    hashCode = hashCode * 59 + this.MinWaitBetweenRetries.GetHashCode();
                if (this.CountUpdatePoolSize != null)
                    hashCode = hashCode * 59 + this.CountUpdatePoolSize.GetHashCode();
                if (this.InboxPath != null)
                    hashCode = hashCode * 59 + this.InboxPath.GetHashCode();
                if (this.SentitemsPath != null)
                    hashCode = hashCode * 59 + this.SentitemsPath.GetHashCode();
                if (this.SupportAttachments != null)
                    hashCode = hashCode * 59 + this.SupportAttachments.GetHashCode();
                if (this.SupportGroupMessaging != null)
                    hashCode = hashCode * 59 + this.SupportGroupMessaging.GetHashCode();
                if (this.MaxTotalRecipients != null)
                    hashCode = hashCode * 59 + this.MaxTotalRecipients.GetHashCode();
                if (this.BatchSize != null)
                    hashCode = hashCode * 59 + this.BatchSize.GetHashCode();
                if (this.MaxTotalAttachmentSize != null)
                    hashCode = hashCode * 59 + this.MaxTotalAttachmentSize.GetHashCode();
                if (this.AttachmentTypeBlacklist != null)
                    hashCode = hashCode * 59 + this.AttachmentTypeBlacklist.GetHashCode();
                if (this.AllowedAttachmentTypes != null)
                    hashCode = hashCode * 59 + this.AllowedAttachmentTypes.GetHashCode();
                if (this.ServiceSelector != null)
                    hashCode = hashCode * 59 + this.ServiceSelector.GetHashCode();
                if (this.FieldWhitelist != null)
                    hashCode = hashCode * 59 + this.FieldWhitelist.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}