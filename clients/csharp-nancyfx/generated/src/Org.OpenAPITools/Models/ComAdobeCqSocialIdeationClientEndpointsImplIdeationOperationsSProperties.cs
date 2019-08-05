using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties
    /// </summary>
    public sealed class ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties:  IEquatable<ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties>
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
        /// Use ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties()
        {
        }

        private ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties(ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray AttachmentTypeBlacklist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder</returns>
        public static ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder</returns>
        public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties left, ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties left, ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;

            internal ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties</returns>
            public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties(
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