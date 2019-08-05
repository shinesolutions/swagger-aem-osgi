using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties:  IEquatable<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties>
    { 
        /// <summary>
        /// SlingServletPaths
        /// </summary>
        public ConfigNodePropertyString SlingServletPaths { get; private set; }

        /// <summary>
        /// OauthRevocationActive
        /// </summary>
        public ConfigNodePropertyBoolean OauthRevocationActive { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties()
        {
        }

        private ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(ConfigNodePropertyString SlingServletPaths, ConfigNodePropertyBoolean OauthRevocationActive)
        {
            
            this.SlingServletPaths = SlingServletPaths;
            
            this.OauthRevocationActive = OauthRevocationActive;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder</returns>
        public static ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder</returns>
        public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletPaths(SlingServletPaths)
                .OauthRevocationActive(OauthRevocationActive);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties left, ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties left, ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingServletPaths;
            private ConfigNodePropertyBoolean _OauthRevocationActive;

            internal ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.SlingServletPaths property.
            /// </summary>
            /// <param name="value">SlingServletPaths</param>
            public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder SlingServletPaths(ConfigNodePropertyString value)
            {
                _SlingServletPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.OauthRevocationActive property.
            /// </summary>
            /// <param name="value">OauthRevocationActive</param>
            public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder OauthRevocationActive(ConfigNodePropertyBoolean value)
            {
                _OauthRevocationActive = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties</returns>
            public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(
                    SlingServletPaths: _SlingServletPaths,
                    OauthRevocationActive: _OauthRevocationActive
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}