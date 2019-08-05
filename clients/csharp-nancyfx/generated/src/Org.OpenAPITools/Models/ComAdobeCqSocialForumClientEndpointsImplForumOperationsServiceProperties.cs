using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties
    /// </summary>
    public sealed class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties:  IEquatable<ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties>
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
        /// Use ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties()
        {
        }

        private ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties(ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray AttachmentTypeBlacklist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder</returns>
        public static ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder</returns>
        public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties left, ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties left, ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;

            internal ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties</returns>
            public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties(
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