using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties
    /// </summary>
    public sealed class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties:  IEquatable<ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties>
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
        /// Use ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties()
        {
        }

        private ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties(ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray AttachmentTypeBlacklist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder</returns>
        public static ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder</returns>
        public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties left, ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties left, ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;

            internal ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties</returns>
            public ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties(
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