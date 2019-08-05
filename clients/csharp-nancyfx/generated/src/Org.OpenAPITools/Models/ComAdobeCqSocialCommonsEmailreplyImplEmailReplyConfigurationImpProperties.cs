using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties>
    { 
        /// <summary>
        /// EmailName
        /// </summary>
        public ConfigNodePropertyString EmailName { get; private set; }

        /// <summary>
        /// EmailCreatePostFromReply
        /// </summary>
        public ConfigNodePropertyBoolean EmailCreatePostFromReply { get; private set; }

        /// <summary>
        /// EmailAddCommentIdTo
        /// </summary>
        public ConfigNodePropertyDropDown EmailAddCommentIdTo { get; private set; }

        /// <summary>
        /// EmailSubjectMaximumLength
        /// </summary>
        public ConfigNodePropertyInteger EmailSubjectMaximumLength { get; private set; }

        /// <summary>
        /// EmailReplyToAddress
        /// </summary>
        public ConfigNodePropertyString EmailReplyToAddress { get; private set; }

        /// <summary>
        /// EmailReplyToDelimiter
        /// </summary>
        public ConfigNodePropertyString EmailReplyToDelimiter { get; private set; }

        /// <summary>
        /// EmailTrackerIdPrefixInSubject
        /// </summary>
        public ConfigNodePropertyString EmailTrackerIdPrefixInSubject { get; private set; }

        /// <summary>
        /// EmailTrackerIdPrefixInBody
        /// </summary>
        public ConfigNodePropertyString EmailTrackerIdPrefixInBody { get; private set; }

        /// <summary>
        /// EmailAsHTML
        /// </summary>
        public ConfigNodePropertyBoolean EmailAsHTML { get; private set; }

        /// <summary>
        /// EmailDefaultUserName
        /// </summary>
        public ConfigNodePropertyString EmailDefaultUserName { get; private set; }

        /// <summary>
        /// EmailTemplatesRootPath
        /// </summary>
        public ConfigNodePropertyString EmailTemplatesRootPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(ConfigNodePropertyString EmailName, ConfigNodePropertyBoolean EmailCreatePostFromReply, ConfigNodePropertyDropDown EmailAddCommentIdTo, ConfigNodePropertyInteger EmailSubjectMaximumLength, ConfigNodePropertyString EmailReplyToAddress, ConfigNodePropertyString EmailReplyToDelimiter, ConfigNodePropertyString EmailTrackerIdPrefixInSubject, ConfigNodePropertyString EmailTrackerIdPrefixInBody, ConfigNodePropertyBoolean EmailAsHTML, ConfigNodePropertyString EmailDefaultUserName, ConfigNodePropertyString EmailTemplatesRootPath)
        {
            
            this.EmailName = EmailName;
            
            this.EmailCreatePostFromReply = EmailCreatePostFromReply;
            
            this.EmailAddCommentIdTo = EmailAddCommentIdTo;
            
            this.EmailSubjectMaximumLength = EmailSubjectMaximumLength;
            
            this.EmailReplyToAddress = EmailReplyToAddress;
            
            this.EmailReplyToDelimiter = EmailReplyToDelimiter;
            
            this.EmailTrackerIdPrefixInSubject = EmailTrackerIdPrefixInSubject;
            
            this.EmailTrackerIdPrefixInBody = EmailTrackerIdPrefixInBody;
            
            this.EmailAsHTML = EmailAsHTML;
            
            this.EmailDefaultUserName = EmailDefaultUserName;
            
            this.EmailTemplatesRootPath = EmailTemplatesRootPath;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder With()
        {
            return Builder()
                .EmailName(EmailName)
                .EmailCreatePostFromReply(EmailCreatePostFromReply)
                .EmailAddCommentIdTo(EmailAddCommentIdTo)
                .EmailSubjectMaximumLength(EmailSubjectMaximumLength)
                .EmailReplyToAddress(EmailReplyToAddress)
                .EmailReplyToDelimiter(EmailReplyToDelimiter)
                .EmailTrackerIdPrefixInSubject(EmailTrackerIdPrefixInSubject)
                .EmailTrackerIdPrefixInBody(EmailTrackerIdPrefixInBody)
                .EmailAsHTML(EmailAsHTML)
                .EmailDefaultUserName(EmailDefaultUserName)
                .EmailTemplatesRootPath(EmailTemplatesRootPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties left, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties left, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder
        {
            private ConfigNodePropertyString _EmailName;
            private ConfigNodePropertyBoolean _EmailCreatePostFromReply;
            private ConfigNodePropertyDropDown _EmailAddCommentIdTo;
            private ConfigNodePropertyInteger _EmailSubjectMaximumLength;
            private ConfigNodePropertyString _EmailReplyToAddress;
            private ConfigNodePropertyString _EmailReplyToDelimiter;
            private ConfigNodePropertyString _EmailTrackerIdPrefixInSubject;
            private ConfigNodePropertyString _EmailTrackerIdPrefixInBody;
            private ConfigNodePropertyBoolean _EmailAsHTML;
            private ConfigNodePropertyString _EmailDefaultUserName;
            private ConfigNodePropertyString _EmailTemplatesRootPath;

            internal ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailName property.
            /// </summary>
            /// <param name="value">EmailName</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailName(ConfigNodePropertyString value)
            {
                _EmailName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailCreatePostFromReply property.
            /// </summary>
            /// <param name="value">EmailCreatePostFromReply</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailCreatePostFromReply(ConfigNodePropertyBoolean value)
            {
                _EmailCreatePostFromReply = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailAddCommentIdTo property.
            /// </summary>
            /// <param name="value">EmailAddCommentIdTo</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailAddCommentIdTo(ConfigNodePropertyDropDown value)
            {
                _EmailAddCommentIdTo = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailSubjectMaximumLength property.
            /// </summary>
            /// <param name="value">EmailSubjectMaximumLength</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailSubjectMaximumLength(ConfigNodePropertyInteger value)
            {
                _EmailSubjectMaximumLength = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailReplyToAddress property.
            /// </summary>
            /// <param name="value">EmailReplyToAddress</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailReplyToAddress(ConfigNodePropertyString value)
            {
                _EmailReplyToAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailReplyToDelimiter property.
            /// </summary>
            /// <param name="value">EmailReplyToDelimiter</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailReplyToDelimiter(ConfigNodePropertyString value)
            {
                _EmailReplyToDelimiter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailTrackerIdPrefixInSubject property.
            /// </summary>
            /// <param name="value">EmailTrackerIdPrefixInSubject</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailTrackerIdPrefixInSubject(ConfigNodePropertyString value)
            {
                _EmailTrackerIdPrefixInSubject = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailTrackerIdPrefixInBody property.
            /// </summary>
            /// <param name="value">EmailTrackerIdPrefixInBody</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailTrackerIdPrefixInBody(ConfigNodePropertyString value)
            {
                _EmailTrackerIdPrefixInBody = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailAsHTML property.
            /// </summary>
            /// <param name="value">EmailAsHTML</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailAsHTML(ConfigNodePropertyBoolean value)
            {
                _EmailAsHTML = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailDefaultUserName property.
            /// </summary>
            /// <param name="value">EmailDefaultUserName</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailDefaultUserName(ConfigNodePropertyString value)
            {
                _EmailDefaultUserName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.EmailTemplatesRootPath property.
            /// </summary>
            /// <param name="value">EmailTemplatesRootPath</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder EmailTemplatesRootPath(ConfigNodePropertyString value)
            {
                _EmailTemplatesRootPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(
                    EmailName: _EmailName,
                    EmailCreatePostFromReply: _EmailCreatePostFromReply,
                    EmailAddCommentIdTo: _EmailAddCommentIdTo,
                    EmailSubjectMaximumLength: _EmailSubjectMaximumLength,
                    EmailReplyToAddress: _EmailReplyToAddress,
                    EmailReplyToDelimiter: _EmailReplyToDelimiter,
                    EmailTrackerIdPrefixInSubject: _EmailTrackerIdPrefixInSubject,
                    EmailTrackerIdPrefixInBody: _EmailTrackerIdPrefixInBody,
                    EmailAsHTML: _EmailAsHTML,
                    EmailDefaultUserName: _EmailDefaultUserName,
                    EmailTemplatesRootPath: _EmailTemplatesRootPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}