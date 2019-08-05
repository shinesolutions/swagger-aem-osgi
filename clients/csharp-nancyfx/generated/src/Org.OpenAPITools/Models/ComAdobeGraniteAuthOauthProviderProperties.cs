using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthProviderProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthProviderProperties:  IEquatable<ComAdobeGraniteAuthOauthProviderProperties>
    { 
        /// <summary>
        /// OauthConfigId
        /// </summary>
        public ConfigNodePropertyString OauthConfigId { get; private set; }

        /// <summary>
        /// OauthClientId
        /// </summary>
        public ConfigNodePropertyString OauthClientId { get; private set; }

        /// <summary>
        /// OauthClientSecret
        /// </summary>
        public ConfigNodePropertyString OauthClientSecret { get; private set; }

        /// <summary>
        /// OauthScope
        /// </summary>
        public ConfigNodePropertyArray OauthScope { get; private set; }

        /// <summary>
        /// OauthConfigProviderId
        /// </summary>
        public ConfigNodePropertyString OauthConfigProviderId { get; private set; }

        /// <summary>
        /// OauthCreateUsers
        /// </summary>
        public ConfigNodePropertyBoolean OauthCreateUsers { get; private set; }

        /// <summary>
        /// OauthUseridProperty
        /// </summary>
        public ConfigNodePropertyString OauthUseridProperty { get; private set; }

        /// <summary>
        /// ForceStrictUsernameMatching
        /// </summary>
        public ConfigNodePropertyBoolean ForceStrictUsernameMatching { get; private set; }

        /// <summary>
        /// OauthEncodeUserids
        /// </summary>
        public ConfigNodePropertyBoolean OauthEncodeUserids { get; private set; }

        /// <summary>
        /// OauthHashUserids
        /// </summary>
        public ConfigNodePropertyBoolean OauthHashUserids { get; private set; }

        /// <summary>
        /// OauthCallBackUrl
        /// </summary>
        public ConfigNodePropertyString OauthCallBackUrl { get; private set; }

        /// <summary>
        /// OauthAccessTokenPersist
        /// </summary>
        public ConfigNodePropertyBoolean OauthAccessTokenPersist { get; private set; }

        /// <summary>
        /// OauthAccessTokenPersistCookie
        /// </summary>
        public ConfigNodePropertyBoolean OauthAccessTokenPersistCookie { get; private set; }

        /// <summary>
        /// OauthCsrfStateProtection
        /// </summary>
        public ConfigNodePropertyBoolean OauthCsrfStateProtection { get; private set; }

        /// <summary>
        /// OauthRedirectRequestParams
        /// </summary>
        public ConfigNodePropertyBoolean OauthRedirectRequestParams { get; private set; }

        /// <summary>
        /// OauthConfigSiblingsAllow
        /// </summary>
        public ConfigNodePropertyBoolean OauthConfigSiblingsAllow { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthProviderProperties()
        {
        }

        private ComAdobeGraniteAuthOauthProviderProperties(ConfigNodePropertyString OauthConfigId, ConfigNodePropertyString OauthClientId, ConfigNodePropertyString OauthClientSecret, ConfigNodePropertyArray OauthScope, ConfigNodePropertyString OauthConfigProviderId, ConfigNodePropertyBoolean OauthCreateUsers, ConfigNodePropertyString OauthUseridProperty, ConfigNodePropertyBoolean ForceStrictUsernameMatching, ConfigNodePropertyBoolean OauthEncodeUserids, ConfigNodePropertyBoolean OauthHashUserids, ConfigNodePropertyString OauthCallBackUrl, ConfigNodePropertyBoolean OauthAccessTokenPersist, ConfigNodePropertyBoolean OauthAccessTokenPersistCookie, ConfigNodePropertyBoolean OauthCsrfStateProtection, ConfigNodePropertyBoolean OauthRedirectRequestParams, ConfigNodePropertyBoolean OauthConfigSiblingsAllow)
        {
            
            this.OauthConfigId = OauthConfigId;
            
            this.OauthClientId = OauthClientId;
            
            this.OauthClientSecret = OauthClientSecret;
            
            this.OauthScope = OauthScope;
            
            this.OauthConfigProviderId = OauthConfigProviderId;
            
            this.OauthCreateUsers = OauthCreateUsers;
            
            this.OauthUseridProperty = OauthUseridProperty;
            
            this.ForceStrictUsernameMatching = ForceStrictUsernameMatching;
            
            this.OauthEncodeUserids = OauthEncodeUserids;
            
            this.OauthHashUserids = OauthHashUserids;
            
            this.OauthCallBackUrl = OauthCallBackUrl;
            
            this.OauthAccessTokenPersist = OauthAccessTokenPersist;
            
            this.OauthAccessTokenPersistCookie = OauthAccessTokenPersistCookie;
            
            this.OauthCsrfStateProtection = OauthCsrfStateProtection;
            
            this.OauthRedirectRequestParams = OauthRedirectRequestParams;
            
            this.OauthConfigSiblingsAllow = OauthConfigSiblingsAllow;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthProviderProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthProviderPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthProviderPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthProviderPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthProviderPropertiesBuilder With()
        {
            return Builder()
                .OauthConfigId(OauthConfigId)
                .OauthClientId(OauthClientId)
                .OauthClientSecret(OauthClientSecret)
                .OauthScope(OauthScope)
                .OauthConfigProviderId(OauthConfigProviderId)
                .OauthCreateUsers(OauthCreateUsers)
                .OauthUseridProperty(OauthUseridProperty)
                .ForceStrictUsernameMatching(ForceStrictUsernameMatching)
                .OauthEncodeUserids(OauthEncodeUserids)
                .OauthHashUserids(OauthHashUserids)
                .OauthCallBackUrl(OauthCallBackUrl)
                .OauthAccessTokenPersist(OauthAccessTokenPersist)
                .OauthAccessTokenPersistCookie(OauthAccessTokenPersistCookie)
                .OauthCsrfStateProtection(OauthCsrfStateProtection)
                .OauthRedirectRequestParams(OauthRedirectRequestParams)
                .OauthConfigSiblingsAllow(OauthConfigSiblingsAllow);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthOauthProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthProviderProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthProviderProperties left, ComAdobeGraniteAuthOauthProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthProviderProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthProviderProperties left, ComAdobeGraniteAuthOauthProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthProviderProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthProviderPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthConfigId;
            private ConfigNodePropertyString _OauthClientId;
            private ConfigNodePropertyString _OauthClientSecret;
            private ConfigNodePropertyArray _OauthScope;
            private ConfigNodePropertyString _OauthConfigProviderId;
            private ConfigNodePropertyBoolean _OauthCreateUsers;
            private ConfigNodePropertyString _OauthUseridProperty;
            private ConfigNodePropertyBoolean _ForceStrictUsernameMatching;
            private ConfigNodePropertyBoolean _OauthEncodeUserids;
            private ConfigNodePropertyBoolean _OauthHashUserids;
            private ConfigNodePropertyString _OauthCallBackUrl;
            private ConfigNodePropertyBoolean _OauthAccessTokenPersist;
            private ConfigNodePropertyBoolean _OauthAccessTokenPersistCookie;
            private ConfigNodePropertyBoolean _OauthCsrfStateProtection;
            private ConfigNodePropertyBoolean _OauthRedirectRequestParams;
            private ConfigNodePropertyBoolean _OauthConfigSiblingsAllow;

            internal ComAdobeGraniteAuthOauthProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthConfigId property.
            /// </summary>
            /// <param name="value">OauthConfigId</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthConfigId(ConfigNodePropertyString value)
            {
                _OauthConfigId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthClientId property.
            /// </summary>
            /// <param name="value">OauthClientId</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthClientId(ConfigNodePropertyString value)
            {
                _OauthClientId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthClientSecret property.
            /// </summary>
            /// <param name="value">OauthClientSecret</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthClientSecret(ConfigNodePropertyString value)
            {
                _OauthClientSecret = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthScope property.
            /// </summary>
            /// <param name="value">OauthScope</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthScope(ConfigNodePropertyArray value)
            {
                _OauthScope = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthConfigProviderId property.
            /// </summary>
            /// <param name="value">OauthConfigProviderId</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthConfigProviderId(ConfigNodePropertyString value)
            {
                _OauthConfigProviderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthCreateUsers property.
            /// </summary>
            /// <param name="value">OauthCreateUsers</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthCreateUsers(ConfigNodePropertyBoolean value)
            {
                _OauthCreateUsers = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthUseridProperty property.
            /// </summary>
            /// <param name="value">OauthUseridProperty</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthUseridProperty(ConfigNodePropertyString value)
            {
                _OauthUseridProperty = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.ForceStrictUsernameMatching property.
            /// </summary>
            /// <param name="value">ForceStrictUsernameMatching</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder ForceStrictUsernameMatching(ConfigNodePropertyBoolean value)
            {
                _ForceStrictUsernameMatching = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthEncodeUserids property.
            /// </summary>
            /// <param name="value">OauthEncodeUserids</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthEncodeUserids(ConfigNodePropertyBoolean value)
            {
                _OauthEncodeUserids = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthHashUserids property.
            /// </summary>
            /// <param name="value">OauthHashUserids</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthHashUserids(ConfigNodePropertyBoolean value)
            {
                _OauthHashUserids = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthCallBackUrl property.
            /// </summary>
            /// <param name="value">OauthCallBackUrl</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthCallBackUrl(ConfigNodePropertyString value)
            {
                _OauthCallBackUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthAccessTokenPersist property.
            /// </summary>
            /// <param name="value">OauthAccessTokenPersist</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthAccessTokenPersist(ConfigNodePropertyBoolean value)
            {
                _OauthAccessTokenPersist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthAccessTokenPersistCookie property.
            /// </summary>
            /// <param name="value">OauthAccessTokenPersistCookie</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthAccessTokenPersistCookie(ConfigNodePropertyBoolean value)
            {
                _OauthAccessTokenPersistCookie = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthCsrfStateProtection property.
            /// </summary>
            /// <param name="value">OauthCsrfStateProtection</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthCsrfStateProtection(ConfigNodePropertyBoolean value)
            {
                _OauthCsrfStateProtection = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthRedirectRequestParams property.
            /// </summary>
            /// <param name="value">OauthRedirectRequestParams</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthRedirectRequestParams(ConfigNodePropertyBoolean value)
            {
                _OauthRedirectRequestParams = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderProperties.OauthConfigSiblingsAllow property.
            /// </summary>
            /// <param name="value">OauthConfigSiblingsAllow</param>
            public ComAdobeGraniteAuthOauthProviderPropertiesBuilder OauthConfigSiblingsAllow(ConfigNodePropertyBoolean value)
            {
                _OauthConfigSiblingsAllow = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthProviderProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthProviderProperties</returns>
            public ComAdobeGraniteAuthOauthProviderProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthProviderProperties(
                    OauthConfigId: _OauthConfigId,
                    OauthClientId: _OauthClientId,
                    OauthClientSecret: _OauthClientSecret,
                    OauthScope: _OauthScope,
                    OauthConfigProviderId: _OauthConfigProviderId,
                    OauthCreateUsers: _OauthCreateUsers,
                    OauthUseridProperty: _OauthUseridProperty,
                    ForceStrictUsernameMatching: _ForceStrictUsernameMatching,
                    OauthEncodeUserids: _OauthEncodeUserids,
                    OauthHashUserids: _OauthHashUserids,
                    OauthCallBackUrl: _OauthCallBackUrl,
                    OauthAccessTokenPersist: _OauthAccessTokenPersist,
                    OauthAccessTokenPersistCookie: _OauthAccessTokenPersistCookie,
                    OauthCsrfStateProtection: _OauthCsrfStateProtection,
                    OauthRedirectRequestParams: _OauthRedirectRequestParams,
                    OauthConfigSiblingsAllow: _OauthConfigSiblingsAllow
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}