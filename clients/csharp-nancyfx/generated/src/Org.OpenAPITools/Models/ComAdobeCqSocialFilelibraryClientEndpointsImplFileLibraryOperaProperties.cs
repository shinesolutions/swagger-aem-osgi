using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties
    /// </summary>
    public sealed class ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties:  IEquatable<ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties>
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
        /// Use ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties()
        {
        }

        private ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties(ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray AttachmentTypeBlacklist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder</returns>
        public static ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder</returns>
        public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties left, ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties left, ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;

            internal ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties</returns>
            public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties(
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