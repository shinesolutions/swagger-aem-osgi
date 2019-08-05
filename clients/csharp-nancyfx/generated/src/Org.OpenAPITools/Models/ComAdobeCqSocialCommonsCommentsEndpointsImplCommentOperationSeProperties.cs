using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties:  IEquatable<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties>
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
        /// Use ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties()
        {
        }

        private ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties(ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray AttachmentTypeBlacklist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties left, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties left, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;

            internal ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties</returns>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties(
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