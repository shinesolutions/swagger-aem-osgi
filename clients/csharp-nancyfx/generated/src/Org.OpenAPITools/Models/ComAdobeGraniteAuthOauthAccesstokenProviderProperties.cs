using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthAccesstokenProviderProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthAccesstokenProviderProperties:  IEquatable<ComAdobeGraniteAuthOauthAccesstokenProviderProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// AuthTokenProviderTitle
        /// </summary>
        public ConfigNodePropertyString AuthTokenProviderTitle { get; private set; }

        /// <summary>
        /// AuthTokenProviderDefaultClaims
        /// </summary>
        public ConfigNodePropertyArray AuthTokenProviderDefaultClaims { get; private set; }

        /// <summary>
        /// AuthTokenProviderEndpoint
        /// </summary>
        public ConfigNodePropertyString AuthTokenProviderEndpoint { get; private set; }

        /// <summary>
        /// AuthAccessTokenRequest
        /// </summary>
        public ConfigNodePropertyString AuthAccessTokenRequest { get; private set; }

        /// <summary>
        /// AuthTokenProviderKeypairAlias
        /// </summary>
        public ConfigNodePropertyString AuthTokenProviderKeypairAlias { get; private set; }

        /// <summary>
        /// AuthTokenProviderConnTimeout
        /// </summary>
        public ConfigNodePropertyInteger AuthTokenProviderConnTimeout { get; private set; }

        /// <summary>
        /// AuthTokenProviderSoTimeout
        /// </summary>
        public ConfigNodePropertyInteger AuthTokenProviderSoTimeout { get; private set; }

        /// <summary>
        /// AuthTokenProviderClientId
        /// </summary>
        public ConfigNodePropertyString AuthTokenProviderClientId { get; private set; }

        /// <summary>
        /// AuthTokenProviderScope
        /// </summary>
        public ConfigNodePropertyString AuthTokenProviderScope { get; private set; }

        /// <summary>
        /// AuthTokenProviderReuseAccessToken
        /// </summary>
        public ConfigNodePropertyBoolean AuthTokenProviderReuseAccessToken { get; private set; }

        /// <summary>
        /// AuthTokenProviderRelaxedSsl
        /// </summary>
        public ConfigNodePropertyBoolean AuthTokenProviderRelaxedSsl { get; private set; }

        /// <summary>
        /// TokenRequestCustomizerType
        /// </summary>
        public ConfigNodePropertyString TokenRequestCustomizerType { get; private set; }

        /// <summary>
        /// AuthTokenValidatorType
        /// </summary>
        public ConfigNodePropertyString AuthTokenValidatorType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthAccesstokenProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthAccesstokenProviderProperties()
        {
        }

        private ComAdobeGraniteAuthOauthAccesstokenProviderProperties(ConfigNodePropertyString Name, ConfigNodePropertyString AuthTokenProviderTitle, ConfigNodePropertyArray AuthTokenProviderDefaultClaims, ConfigNodePropertyString AuthTokenProviderEndpoint, ConfigNodePropertyString AuthAccessTokenRequest, ConfigNodePropertyString AuthTokenProviderKeypairAlias, ConfigNodePropertyInteger AuthTokenProviderConnTimeout, ConfigNodePropertyInteger AuthTokenProviderSoTimeout, ConfigNodePropertyString AuthTokenProviderClientId, ConfigNodePropertyString AuthTokenProviderScope, ConfigNodePropertyBoolean AuthTokenProviderReuseAccessToken, ConfigNodePropertyBoolean AuthTokenProviderRelaxedSsl, ConfigNodePropertyString TokenRequestCustomizerType, ConfigNodePropertyString AuthTokenValidatorType)
        {
            
            this.Name = Name;
            
            this.AuthTokenProviderTitle = AuthTokenProviderTitle;
            
            this.AuthTokenProviderDefaultClaims = AuthTokenProviderDefaultClaims;
            
            this.AuthTokenProviderEndpoint = AuthTokenProviderEndpoint;
            
            this.AuthAccessTokenRequest = AuthAccessTokenRequest;
            
            this.AuthTokenProviderKeypairAlias = AuthTokenProviderKeypairAlias;
            
            this.AuthTokenProviderConnTimeout = AuthTokenProviderConnTimeout;
            
            this.AuthTokenProviderSoTimeout = AuthTokenProviderSoTimeout;
            
            this.AuthTokenProviderClientId = AuthTokenProviderClientId;
            
            this.AuthTokenProviderScope = AuthTokenProviderScope;
            
            this.AuthTokenProviderReuseAccessToken = AuthTokenProviderReuseAccessToken;
            
            this.AuthTokenProviderRelaxedSsl = AuthTokenProviderRelaxedSsl;
            
            this.TokenRequestCustomizerType = TokenRequestCustomizerType;
            
            this.AuthTokenValidatorType = AuthTokenValidatorType;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthAccesstokenProviderProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .AuthTokenProviderTitle(AuthTokenProviderTitle)
                .AuthTokenProviderDefaultClaims(AuthTokenProviderDefaultClaims)
                .AuthTokenProviderEndpoint(AuthTokenProviderEndpoint)
                .AuthAccessTokenRequest(AuthAccessTokenRequest)
                .AuthTokenProviderKeypairAlias(AuthTokenProviderKeypairAlias)
                .AuthTokenProviderConnTimeout(AuthTokenProviderConnTimeout)
                .AuthTokenProviderSoTimeout(AuthTokenProviderSoTimeout)
                .AuthTokenProviderClientId(AuthTokenProviderClientId)
                .AuthTokenProviderScope(AuthTokenProviderScope)
                .AuthTokenProviderReuseAccessToken(AuthTokenProviderReuseAccessToken)
                .AuthTokenProviderRelaxedSsl(AuthTokenProviderRelaxedSsl)
                .TokenRequestCustomizerType(TokenRequestCustomizerType)
                .AuthTokenValidatorType(AuthTokenValidatorType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthOauthAccesstokenProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthAccesstokenProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthAccesstokenProviderProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthAccesstokenProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthAccesstokenProviderProperties left, ComAdobeGraniteAuthOauthAccesstokenProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthAccesstokenProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthAccesstokenProviderProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthAccesstokenProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthAccesstokenProviderProperties left, ComAdobeGraniteAuthOauthAccesstokenProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthAccesstokenProviderProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _AuthTokenProviderTitle;
            private ConfigNodePropertyArray _AuthTokenProviderDefaultClaims;
            private ConfigNodePropertyString _AuthTokenProviderEndpoint;
            private ConfigNodePropertyString _AuthAccessTokenRequest;
            private ConfigNodePropertyString _AuthTokenProviderKeypairAlias;
            private ConfigNodePropertyInteger _AuthTokenProviderConnTimeout;
            private ConfigNodePropertyInteger _AuthTokenProviderSoTimeout;
            private ConfigNodePropertyString _AuthTokenProviderClientId;
            private ConfigNodePropertyString _AuthTokenProviderScope;
            private ConfigNodePropertyBoolean _AuthTokenProviderReuseAccessToken;
            private ConfigNodePropertyBoolean _AuthTokenProviderRelaxedSsl;
            private ConfigNodePropertyString _TokenRequestCustomizerType;
            private ConfigNodePropertyString _AuthTokenValidatorType;

            internal ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderTitle property.
            /// </summary>
            /// <param name="value">AuthTokenProviderTitle</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderTitle(ConfigNodePropertyString value)
            {
                _AuthTokenProviderTitle = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderDefaultClaims property.
            /// </summary>
            /// <param name="value">AuthTokenProviderDefaultClaims</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderDefaultClaims(ConfigNodePropertyArray value)
            {
                _AuthTokenProviderDefaultClaims = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderEndpoint property.
            /// </summary>
            /// <param name="value">AuthTokenProviderEndpoint</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderEndpoint(ConfigNodePropertyString value)
            {
                _AuthTokenProviderEndpoint = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthAccessTokenRequest property.
            /// </summary>
            /// <param name="value">AuthAccessTokenRequest</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthAccessTokenRequest(ConfigNodePropertyString value)
            {
                _AuthAccessTokenRequest = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderKeypairAlias property.
            /// </summary>
            /// <param name="value">AuthTokenProviderKeypairAlias</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderKeypairAlias(ConfigNodePropertyString value)
            {
                _AuthTokenProviderKeypairAlias = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderConnTimeout property.
            /// </summary>
            /// <param name="value">AuthTokenProviderConnTimeout</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderConnTimeout(ConfigNodePropertyInteger value)
            {
                _AuthTokenProviderConnTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderSoTimeout property.
            /// </summary>
            /// <param name="value">AuthTokenProviderSoTimeout</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderSoTimeout(ConfigNodePropertyInteger value)
            {
                _AuthTokenProviderSoTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderClientId property.
            /// </summary>
            /// <param name="value">AuthTokenProviderClientId</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderClientId(ConfigNodePropertyString value)
            {
                _AuthTokenProviderClientId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderScope property.
            /// </summary>
            /// <param name="value">AuthTokenProviderScope</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderScope(ConfigNodePropertyString value)
            {
                _AuthTokenProviderScope = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderReuseAccessToken property.
            /// </summary>
            /// <param name="value">AuthTokenProviderReuseAccessToken</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderReuseAccessToken(ConfigNodePropertyBoolean value)
            {
                _AuthTokenProviderReuseAccessToken = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenProviderRelaxedSsl property.
            /// </summary>
            /// <param name="value">AuthTokenProviderRelaxedSsl</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenProviderRelaxedSsl(ConfigNodePropertyBoolean value)
            {
                _AuthTokenProviderRelaxedSsl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.TokenRequestCustomizerType property.
            /// </summary>
            /// <param name="value">TokenRequestCustomizerType</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder TokenRequestCustomizerType(ConfigNodePropertyString value)
            {
                _TokenRequestCustomizerType = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderProperties.AuthTokenValidatorType property.
            /// </summary>
            /// <param name="value">AuthTokenValidatorType</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder AuthTokenValidatorType(ConfigNodePropertyString value)
            {
                _AuthTokenValidatorType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthAccesstokenProviderProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthAccesstokenProviderProperties</returns>
            public ComAdobeGraniteAuthOauthAccesstokenProviderProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthAccesstokenProviderProperties(
                    Name: _Name,
                    AuthTokenProviderTitle: _AuthTokenProviderTitle,
                    AuthTokenProviderDefaultClaims: _AuthTokenProviderDefaultClaims,
                    AuthTokenProviderEndpoint: _AuthTokenProviderEndpoint,
                    AuthAccessTokenRequest: _AuthAccessTokenRequest,
                    AuthTokenProviderKeypairAlias: _AuthTokenProviderKeypairAlias,
                    AuthTokenProviderConnTimeout: _AuthTokenProviderConnTimeout,
                    AuthTokenProviderSoTimeout: _AuthTokenProviderSoTimeout,
                    AuthTokenProviderClientId: _AuthTokenProviderClientId,
                    AuthTokenProviderScope: _AuthTokenProviderScope,
                    AuthTokenProviderReuseAccessToken: _AuthTokenProviderReuseAccessToken,
                    AuthTokenProviderRelaxedSsl: _AuthTokenProviderRelaxedSsl,
                    TokenRequestCustomizerType: _TokenRequestCustomizerType,
                    AuthTokenValidatorType: _AuthTokenValidatorType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}