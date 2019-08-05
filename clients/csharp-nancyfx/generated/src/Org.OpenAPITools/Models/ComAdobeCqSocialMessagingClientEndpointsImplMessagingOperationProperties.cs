using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
    /// </summary>
    public sealed class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties:  IEquatable<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties>
    { 
        /// <summary>
        /// MessageProperties
        /// </summary>
        public ConfigNodePropertyArray MessageProperties { get; private set; }

        /// <summary>
        /// MessageBoxSizeLimit
        /// </summary>
        public ConfigNodePropertyInteger MessageBoxSizeLimit { get; private set; }

        /// <summary>
        /// MessageCountLimit
        /// </summary>
        public ConfigNodePropertyInteger MessageCountLimit { get; private set; }

        /// <summary>
        /// NotifyFailure
        /// </summary>
        public ConfigNodePropertyBoolean NotifyFailure { get; private set; }

        /// <summary>
        /// FailureMessageFrom
        /// </summary>
        public ConfigNodePropertyString FailureMessageFrom { get; private set; }

        /// <summary>
        /// FailureTemplatePath
        /// </summary>
        public ConfigNodePropertyString FailureTemplatePath { get; private set; }

        /// <summary>
        /// MaxRetries
        /// </summary>
        public ConfigNodePropertyInteger MaxRetries { get; private set; }

        /// <summary>
        /// MinWaitBetweenRetries
        /// </summary>
        public ConfigNodePropertyInteger MinWaitBetweenRetries { get; private set; }

        /// <summary>
        /// CountUpdatePoolSize
        /// </summary>
        public ConfigNodePropertyInteger CountUpdatePoolSize { get; private set; }

        /// <summary>
        /// InboxPath
        /// </summary>
        public ConfigNodePropertyString InboxPath { get; private set; }

        /// <summary>
        /// SentitemsPath
        /// </summary>
        public ConfigNodePropertyString SentitemsPath { get; private set; }

        /// <summary>
        /// SupportAttachments
        /// </summary>
        public ConfigNodePropertyBoolean SupportAttachments { get; private set; }

        /// <summary>
        /// SupportGroupMessaging
        /// </summary>
        public ConfigNodePropertyBoolean SupportGroupMessaging { get; private set; }

        /// <summary>
        /// MaxTotalRecipients
        /// </summary>
        public ConfigNodePropertyInteger MaxTotalRecipients { get; private set; }

        /// <summary>
        /// BatchSize
        /// </summary>
        public ConfigNodePropertyInteger BatchSize { get; private set; }

        /// <summary>
        /// MaxTotalAttachmentSize
        /// </summary>
        public ConfigNodePropertyInteger MaxTotalAttachmentSize { get; private set; }

        /// <summary>
        /// AttachmentTypeBlacklist
        /// </summary>
        public ConfigNodePropertyArray AttachmentTypeBlacklist { get; private set; }

        /// <summary>
        /// AllowedAttachmentTypes
        /// </summary>
        public ConfigNodePropertyArray AllowedAttachmentTypes { get; private set; }

        /// <summary>
        /// ServiceSelector
        /// </summary>
        public ConfigNodePropertyString ServiceSelector { get; private set; }

        /// <summary>
        /// FieldWhitelist
        /// </summary>
        public ConfigNodePropertyArray FieldWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties()
        {
        }

        private ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(ConfigNodePropertyArray MessageProperties, ConfigNodePropertyInteger MessageBoxSizeLimit, ConfigNodePropertyInteger MessageCountLimit, ConfigNodePropertyBoolean NotifyFailure, ConfigNodePropertyString FailureMessageFrom, ConfigNodePropertyString FailureTemplatePath, ConfigNodePropertyInteger MaxRetries, ConfigNodePropertyInteger MinWaitBetweenRetries, ConfigNodePropertyInteger CountUpdatePoolSize, ConfigNodePropertyString InboxPath, ConfigNodePropertyString SentitemsPath, ConfigNodePropertyBoolean SupportAttachments, ConfigNodePropertyBoolean SupportGroupMessaging, ConfigNodePropertyInteger MaxTotalRecipients, ConfigNodePropertyInteger BatchSize, ConfigNodePropertyInteger MaxTotalAttachmentSize, ConfigNodePropertyArray AttachmentTypeBlacklist, ConfigNodePropertyArray AllowedAttachmentTypes, ConfigNodePropertyString ServiceSelector, ConfigNodePropertyArray FieldWhitelist)
        {
            
            this.MessageProperties = MessageProperties;
            
            this.MessageBoxSizeLimit = MessageBoxSizeLimit;
            
            this.MessageCountLimit = MessageCountLimit;
            
            this.NotifyFailure = NotifyFailure;
            
            this.FailureMessageFrom = FailureMessageFrom;
            
            this.FailureTemplatePath = FailureTemplatePath;
            
            this.MaxRetries = MaxRetries;
            
            this.MinWaitBetweenRetries = MinWaitBetweenRetries;
            
            this.CountUpdatePoolSize = CountUpdatePoolSize;
            
            this.InboxPath = InboxPath;
            
            this.SentitemsPath = SentitemsPath;
            
            this.SupportAttachments = SupportAttachments;
            
            this.SupportGroupMessaging = SupportGroupMessaging;
            
            this.MaxTotalRecipients = MaxTotalRecipients;
            
            this.BatchSize = BatchSize;
            
            this.MaxTotalAttachmentSize = MaxTotalAttachmentSize;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
            this.AllowedAttachmentTypes = AllowedAttachmentTypes;
            
            this.ServiceSelector = ServiceSelector;
            
            this.FieldWhitelist = FieldWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder</returns>
        public static ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder</returns>
        public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder With()
        {
            return Builder()
                .MessageProperties(MessageProperties)
                .MessageBoxSizeLimit(MessageBoxSizeLimit)
                .MessageCountLimit(MessageCountLimit)
                .NotifyFailure(NotifyFailure)
                .FailureMessageFrom(FailureMessageFrom)
                .FailureTemplatePath(FailureTemplatePath)
                .MaxRetries(MaxRetries)
                .MinWaitBetweenRetries(MinWaitBetweenRetries)
                .CountUpdatePoolSize(CountUpdatePoolSize)
                .InboxPath(InboxPath)
                .SentitemsPath(SentitemsPath)
                .SupportAttachments(SupportAttachments)
                .SupportGroupMessaging(SupportGroupMessaging)
                .MaxTotalRecipients(MaxTotalRecipients)
                .BatchSize(BatchSize)
                .MaxTotalAttachmentSize(MaxTotalAttachmentSize)
                .AttachmentTypeBlacklist(AttachmentTypeBlacklist)
                .AllowedAttachmentTypes(AllowedAttachmentTypes)
                .ServiceSelector(ServiceSelector)
                .FieldWhitelist(FieldWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties left, ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties left, ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder
        {
            private ConfigNodePropertyArray _MessageProperties;
            private ConfigNodePropertyInteger _MessageBoxSizeLimit;
            private ConfigNodePropertyInteger _MessageCountLimit;
            private ConfigNodePropertyBoolean _NotifyFailure;
            private ConfigNodePropertyString _FailureMessageFrom;
            private ConfigNodePropertyString _FailureTemplatePath;
            private ConfigNodePropertyInteger _MaxRetries;
            private ConfigNodePropertyInteger _MinWaitBetweenRetries;
            private ConfigNodePropertyInteger _CountUpdatePoolSize;
            private ConfigNodePropertyString _InboxPath;
            private ConfigNodePropertyString _SentitemsPath;
            private ConfigNodePropertyBoolean _SupportAttachments;
            private ConfigNodePropertyBoolean _SupportGroupMessaging;
            private ConfigNodePropertyInteger _MaxTotalRecipients;
            private ConfigNodePropertyInteger _BatchSize;
            private ConfigNodePropertyInteger _MaxTotalAttachmentSize;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;
            private ConfigNodePropertyArray _AllowedAttachmentTypes;
            private ConfigNodePropertyString _ServiceSelector;
            private ConfigNodePropertyArray _FieldWhitelist;

            internal ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.MessageProperties property.
            /// </summary>
            /// <param name="value">MessageProperties</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder MessageProperties(ConfigNodePropertyArray value)
            {
                _MessageProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.MessageBoxSizeLimit property.
            /// </summary>
            /// <param name="value">MessageBoxSizeLimit</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder MessageBoxSizeLimit(ConfigNodePropertyInteger value)
            {
                _MessageBoxSizeLimit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.MessageCountLimit property.
            /// </summary>
            /// <param name="value">MessageCountLimit</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder MessageCountLimit(ConfigNodePropertyInteger value)
            {
                _MessageCountLimit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.NotifyFailure property.
            /// </summary>
            /// <param name="value">NotifyFailure</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder NotifyFailure(ConfigNodePropertyBoolean value)
            {
                _NotifyFailure = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.FailureMessageFrom property.
            /// </summary>
            /// <param name="value">FailureMessageFrom</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder FailureMessageFrom(ConfigNodePropertyString value)
            {
                _FailureMessageFrom = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.FailureTemplatePath property.
            /// </summary>
            /// <param name="value">FailureTemplatePath</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder FailureTemplatePath(ConfigNodePropertyString value)
            {
                _FailureTemplatePath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.MaxRetries property.
            /// </summary>
            /// <param name="value">MaxRetries</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder MaxRetries(ConfigNodePropertyInteger value)
            {
                _MaxRetries = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.MinWaitBetweenRetries property.
            /// </summary>
            /// <param name="value">MinWaitBetweenRetries</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder MinWaitBetweenRetries(ConfigNodePropertyInteger value)
            {
                _MinWaitBetweenRetries = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.CountUpdatePoolSize property.
            /// </summary>
            /// <param name="value">CountUpdatePoolSize</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder CountUpdatePoolSize(ConfigNodePropertyInteger value)
            {
                _CountUpdatePoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.InboxPath property.
            /// </summary>
            /// <param name="value">InboxPath</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder InboxPath(ConfigNodePropertyString value)
            {
                _InboxPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.SentitemsPath property.
            /// </summary>
            /// <param name="value">SentitemsPath</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder SentitemsPath(ConfigNodePropertyString value)
            {
                _SentitemsPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.SupportAttachments property.
            /// </summary>
            /// <param name="value">SupportAttachments</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder SupportAttachments(ConfigNodePropertyBoolean value)
            {
                _SupportAttachments = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.SupportGroupMessaging property.
            /// </summary>
            /// <param name="value">SupportGroupMessaging</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder SupportGroupMessaging(ConfigNodePropertyBoolean value)
            {
                _SupportGroupMessaging = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.MaxTotalRecipients property.
            /// </summary>
            /// <param name="value">MaxTotalRecipients</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder MaxTotalRecipients(ConfigNodePropertyInteger value)
            {
                _MaxTotalRecipients = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.BatchSize property.
            /// </summary>
            /// <param name="value">BatchSize</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder BatchSize(ConfigNodePropertyInteger value)
            {
                _BatchSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.MaxTotalAttachmentSize property.
            /// </summary>
            /// <param name="value">MaxTotalAttachmentSize</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder MaxTotalAttachmentSize(ConfigNodePropertyInteger value)
            {
                _MaxTotalAttachmentSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.AllowedAttachmentTypes property.
            /// </summary>
            /// <param name="value">AllowedAttachmentTypes</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder AllowedAttachmentTypes(ConfigNodePropertyArray value)
            {
                _AllowedAttachmentTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.ServiceSelector property.
            /// </summary>
            /// <param name="value">ServiceSelector</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder ServiceSelector(ConfigNodePropertyString value)
            {
                _ServiceSelector = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties</returns>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(
                    MessageProperties: _MessageProperties,
                    MessageBoxSizeLimit: _MessageBoxSizeLimit,
                    MessageCountLimit: _MessageCountLimit,
                    NotifyFailure: _NotifyFailure,
                    FailureMessageFrom: _FailureMessageFrom,
                    FailureTemplatePath: _FailureTemplatePath,
                    MaxRetries: _MaxRetries,
                    MinWaitBetweenRetries: _MinWaitBetweenRetries,
                    CountUpdatePoolSize: _CountUpdatePoolSize,
                    InboxPath: _InboxPath,
                    SentitemsPath: _SentitemsPath,
                    SupportAttachments: _SupportAttachments,
                    SupportGroupMessaging: _SupportGroupMessaging,
                    MaxTotalRecipients: _MaxTotalRecipients,
                    BatchSize: _BatchSize,
                    MaxTotalAttachmentSize: _MaxTotalAttachmentSize,
                    AttachmentTypeBlacklist: _AttachmentTypeBlacklist,
                    AllowedAttachmentTypes: _AllowedAttachmentTypes,
                    ServiceSelector: _ServiceSelector,
                    FieldWhitelist: _FieldWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}