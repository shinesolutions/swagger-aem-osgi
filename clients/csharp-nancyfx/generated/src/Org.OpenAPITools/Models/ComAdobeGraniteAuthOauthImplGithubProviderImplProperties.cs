using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties:  IEquatable<ComAdobeGraniteAuthOauthImplGithubProviderImplProperties>
    { 
        /// <summary>
        /// OauthProviderId
        /// </summary>
        public ConfigNodePropertyString OauthProviderId { get; private set; }

        /// <summary>
        /// OauthProviderGithubAuthorizationUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderGithubAuthorizationUrl { get; private set; }

        /// <summary>
        /// OauthProviderGithubTokenUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderGithubTokenUrl { get; private set; }

        /// <summary>
        /// OauthProviderGithubProfileUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderGithubProfileUrl { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties()
        {
        }

        private ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(ConfigNodePropertyString OauthProviderId, ConfigNodePropertyString OauthProviderGithubAuthorizationUrl, ConfigNodePropertyString OauthProviderGithubTokenUrl, ConfigNodePropertyString OauthProviderGithubProfileUrl)
        {
            
            this.OauthProviderId = OauthProviderId;
            
            this.OauthProviderGithubAuthorizationUrl = OauthProviderGithubAuthorizationUrl;
            
            this.OauthProviderGithubTokenUrl = OauthProviderGithubTokenUrl;
            
            this.OauthProviderGithubProfileUrl = OauthProviderGithubProfileUrl;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder With()
        {
            return Builder()
                .OauthProviderId(OauthProviderId)
                .OauthProviderGithubAuthorizationUrl(OauthProviderGithubAuthorizationUrl)
                .OauthProviderGithubTokenUrl(OauthProviderGithubTokenUrl)
                .OauthProviderGithubProfileUrl(OauthProviderGithubProfileUrl);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthOauthImplGithubProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplGithubProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplGithubProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplGithubProviderImplProperties left, ComAdobeGraniteAuthOauthImplGithubProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplGithubProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplGithubProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplGithubProviderImplProperties left, ComAdobeGraniteAuthOauthImplGithubProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthProviderId;
            private ConfigNodePropertyString _OauthProviderGithubAuthorizationUrl;
            private ConfigNodePropertyString _OauthProviderGithubTokenUrl;
            private ConfigNodePropertyString _OauthProviderGithubProfileUrl;

            internal ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.OauthProviderId property.
            /// </summary>
            /// <param name="value">OauthProviderId</param>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder OauthProviderId(ConfigNodePropertyString value)
            {
                _OauthProviderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.OauthProviderGithubAuthorizationUrl property.
            /// </summary>
            /// <param name="value">OauthProviderGithubAuthorizationUrl</param>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder OauthProviderGithubAuthorizationUrl(ConfigNodePropertyString value)
            {
                _OauthProviderGithubAuthorizationUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.OauthProviderGithubTokenUrl property.
            /// </summary>
            /// <param name="value">OauthProviderGithubTokenUrl</param>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder OauthProviderGithubTokenUrl(ConfigNodePropertyString value)
            {
                _OauthProviderGithubTokenUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.OauthProviderGithubProfileUrl property.
            /// </summary>
            /// <param name="value">OauthProviderGithubProfileUrl</param>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder OauthProviderGithubProfileUrl(ConfigNodePropertyString value)
            {
                _OauthProviderGithubProfileUrl = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplGithubProviderImplProperties</returns>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(
                    OauthProviderId: _OauthProviderId,
                    OauthProviderGithubAuthorizationUrl: _OauthProviderGithubAuthorizationUrl,
                    OauthProviderGithubTokenUrl: _OauthProviderGithubTokenUrl,
                    OauthProviderGithubProfileUrl: _OauthProviderGithubProfileUrl
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}