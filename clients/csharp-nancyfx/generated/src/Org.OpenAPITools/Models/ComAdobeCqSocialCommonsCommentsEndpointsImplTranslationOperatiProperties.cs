using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties:  IEquatable<ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties>
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
        /// Use ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties()
        {
        }

        private ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties(ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray AttachmentTypeBlacklist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties left, ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties left, ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;

            internal ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties</returns>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties(
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