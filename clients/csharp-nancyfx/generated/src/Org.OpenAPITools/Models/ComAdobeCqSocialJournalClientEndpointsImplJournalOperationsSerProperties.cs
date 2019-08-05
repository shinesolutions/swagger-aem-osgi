using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties
    /// </summary>
    public sealed class ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties:  IEquatable<ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties>
    { 
        /// <summary>
        /// FieldWhitelist
        /// </summary>
        public ConfigNodePropertyArray FieldWhitelist { get; private set; }

        /// <summary>
        /// AttachmentTypeBlacklist
        /// </summary>
        public ConfigNodePropertyArray AttachmentTypeBlacklist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties()
        {
        }

        private ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties(ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray AttachmentTypeBlacklist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder</returns>
        public static ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder</returns>
        public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder With()
        {
            return Builder()
                .FieldWhitelist(FieldWhitelist)
                .AttachmentTypeBlacklist(AttachmentTypeBlacklist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties left, ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties left, ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;

            internal ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties</returns>
            public ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties(
                    FieldWhitelist: _FieldWhitelist,
                    AttachmentTypeBlacklist: _AttachmentTypeBlacklist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}