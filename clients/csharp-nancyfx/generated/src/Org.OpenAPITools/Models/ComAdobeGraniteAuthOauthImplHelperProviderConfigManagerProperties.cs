using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties:  IEquatable<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties>
    { 
        /// <summary>
        /// OauthCookieLoginTimeout
        /// </summary>
        public ConfigNodePropertyString OauthCookieLoginTimeout { get; private set; }

        /// <summary>
        /// OauthCookieMaxAge
        /// </summary>
        public ConfigNodePropertyString OauthCookieMaxAge { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties()
        {
        }

        private ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties(ConfigNodePropertyString OauthCookieLoginTimeout, ConfigNodePropertyString OauthCookieMaxAge)
        {
            
            this.OauthCookieLoginTimeout = OauthCookieLoginTimeout;
            
            this.OauthCookieMaxAge = OauthCookieMaxAge;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder With()
        {
            return Builder()
                .OauthCookieLoginTimeout(OauthCookieLoginTimeout)
                .OauthCookieMaxAge(OauthCookieMaxAge);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties left, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties left, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthCookieLoginTimeout;
            private ConfigNodePropertyString _OauthCookieMaxAge;

            internal ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.OauthCookieLoginTimeout property.
            /// </summary>
            /// <param name="value">OauthCookieLoginTimeout</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder OauthCookieLoginTimeout(ConfigNodePropertyString value)
            {
                _OauthCookieLoginTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.OauthCookieMaxAge property.
            /// </summary>
            /// <param name="value">OauthCookieMaxAge</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder OauthCookieMaxAge(ConfigNodePropertyString value)
            {
                _OauthCookieMaxAge = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties</returns>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties(
                    OauthCookieLoginTimeout: _OauthCookieLoginTimeout,
                    OauthCookieMaxAge: _OauthCookieMaxAge
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}