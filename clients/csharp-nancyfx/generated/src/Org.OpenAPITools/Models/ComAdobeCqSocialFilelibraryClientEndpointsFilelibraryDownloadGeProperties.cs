using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties
    /// </summary>
    public sealed class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties:  IEquatable<ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties>
    { 
        /// <summary>
        /// SlingServletSelectors
        /// </summary>
        public ConfigNodePropertyString SlingServletSelectors { get; private set; }

        /// <summary>
        /// SlingServletExtensions
        /// </summary>
        public ConfigNodePropertyString SlingServletExtensions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties()
        {
        }

        private ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties(ConfigNodePropertyString SlingServletSelectors, ConfigNodePropertyString SlingServletExtensions)
        {
            
            this.SlingServletSelectors = SlingServletSelectors;
            
            this.SlingServletExtensions = SlingServletExtensions;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder</returns>
        public static ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder</returns>
        public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties left, ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties left, ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder
        {
            private ConfigNodePropertyString _SlingServletSelectors;
            private ConfigNodePropertyString _SlingServletExtensions;

            internal ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.SlingServletSelectors property.
            /// </summary>
            /// <param name="value">SlingServletSelectors</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder SlingServletSelectors(ConfigNodePropertyString value)
            {
                _SlingServletSelectors = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.SlingServletExtensions property.
            /// </summary>
            /// <param name="value">SlingServletExtensions</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder SlingServletExtensions(ConfigNodePropertyString value)
            {
                _SlingServletExtensions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties</returns>
            public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties(
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