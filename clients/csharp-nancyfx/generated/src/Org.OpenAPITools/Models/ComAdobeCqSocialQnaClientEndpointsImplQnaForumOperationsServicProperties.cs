using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties
    /// </summary>
    public sealed class ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties:  IEquatable<ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties>
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
        /// Use ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties()
        {
        }

        private ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties(ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray AttachmentTypeBlacklist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder</returns>
        public static ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder</returns>
        public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties left, ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties left, ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;

            internal ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties</returns>
            public ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties(
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