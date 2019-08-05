using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties:  IEquatable<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties>
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
        /// Use ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties()
        {
        }

        private ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties(ConfigNodePropertyString OauthCookieLoginTimeout, ConfigNodePropertyString OauthCookieMaxAge)
        {
            
            this.OauthCookieLoginTimeout = OauthCookieLoginTimeout;
            
            this.OauthCookieMaxAge = OauthCookieMaxAge;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties left, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties left, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthCookieLoginTimeout;
            private ConfigNodePropertyString _OauthCookieMaxAge;

            internal ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.OauthCookieLoginTimeout property.
            /// </summary>
            /// <param name="value">OauthCookieLoginTimeout</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder OauthCookieLoginTimeout(ConfigNodePropertyString value)
            {
                _OauthCookieLoginTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.OauthCookieMaxAge property.
            /// </summary>
            /// <param name="value">OauthCookieMaxAge</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder OauthCookieMaxAge(ConfigNodePropertyString value)
            {
                _OauthCookieMaxAge = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties</returns>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties(
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