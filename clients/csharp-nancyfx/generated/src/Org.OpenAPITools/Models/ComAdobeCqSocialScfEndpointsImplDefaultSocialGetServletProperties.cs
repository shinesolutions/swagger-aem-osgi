using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties
    /// </summary>
    public sealed class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties:  IEquatable<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties>
    { 
        /// <summary>
        /// SlingServletSelectors
        /// </summary>
        public ConfigNodePropertyArray SlingServletSelectors { get; private set; }

        /// <summary>
        /// SlingServletExtensions
        /// </summary>
        public ConfigNodePropertyString SlingServletExtensions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties()
        {
        }

        private ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(ConfigNodePropertyArray SlingServletSelectors, ConfigNodePropertyString SlingServletExtensions)
        {
            
            this.SlingServletSelectors = SlingServletSelectors;
            
            this.SlingServletExtensions = SlingServletExtensions;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder</returns>
        public static ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder</returns>
        public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletSelectors(SlingServletSelectors)
                .SlingServletExtensions(SlingServletExtensions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties left, ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties left, ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _SlingServletSelectors;
            private ConfigNodePropertyString _SlingServletExtensions;

            internal ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.SlingServletSelectors property.
            /// </summary>
            /// <param name="value">SlingServletSelectors</param>
            public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder SlingServletSelectors(ConfigNodePropertyArray value)
            {
                _SlingServletSelectors = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.SlingServletExtensions property.
            /// </summary>
            /// <param name="value">SlingServletExtensions</param>
            public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder SlingServletExtensions(ConfigNodePropertyString value)
            {
                _SlingServletExtensions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties</returns>
            public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(
                    SlingServletSelectors: _SlingServletSelectors,
                    SlingServletExtensions: _SlingServletExtensions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}