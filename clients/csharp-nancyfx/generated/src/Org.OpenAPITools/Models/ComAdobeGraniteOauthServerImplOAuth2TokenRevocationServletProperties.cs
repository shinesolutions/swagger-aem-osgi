using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties:  IEquatable<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties>
    { 
        /// <summary>
        /// OauthTokenRevocationActive
        /// </summary>
        public ConfigNodePropertyBoolean OauthTokenRevocationActive { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties()
        {
        }

        private ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(ConfigNodePropertyBoolean OauthTokenRevocationActive)
        {
            
            this.OauthTokenRevocationActive = OauthTokenRevocationActive;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder</returns>
        public static ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder</returns>
        public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder With()
        {
            return Builder()
                .OauthTokenRevocationActive(OauthTokenRevocationActive);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties left, ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties left, ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _OauthTokenRevocationActive;

            internal ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.OauthTokenRevocationActive property.
            /// </summary>
            /// <param name="value">OauthTokenRevocationActive</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder OauthTokenRevocationActive(ConfigNodePropertyBoolean value)
            {
                _OauthTokenRevocationActive = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties</returns>
            public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(
                    OauthTokenRevocationActive: _OauthTokenRevocationActive
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}