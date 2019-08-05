using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplIMSProviderImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplIMSProviderImplProperties:  IEquatable<ComAdobeGraniteAuthImsImplIMSProviderImplProperties>
    { 
        /// <summary>
        /// OauthProviderId
        /// </summary>
        public ConfigNodePropertyString OauthProviderId { get; private set; }

        /// <summary>
        /// OauthProviderImsAuthorizationUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderImsAuthorizationUrl { get; private set; }

        /// <summary>
        /// OauthProviderImsTokenUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderImsTokenUrl { get; private set; }

        /// <summary>
        /// OauthProviderImsProfileUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderImsProfileUrl { get; private set; }

        /// <summary>
        /// OauthProviderImsExtendedDetailsUrls
        /// </summary>
        public ConfigNodePropertyArray OauthProviderImsExtendedDetailsUrls { get; private set; }

        /// <summary>
        /// OauthProviderImsValidateTokenUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderImsValidateTokenUrl { get; private set; }

        /// <summary>
        /// OauthProviderImsSessionProperty
        /// </summary>
        public ConfigNodePropertyString OauthProviderImsSessionProperty { get; private set; }

        /// <summary>
        /// OauthProviderImsServiceTokenClientId
        /// </summary>
        public ConfigNodePropertyString OauthProviderImsServiceTokenClientId { get; private set; }

        /// <summary>
        /// OauthProviderImsServiceTokenClientSecret
        /// </summary>
        public ConfigNodePropertyString OauthProviderImsServiceTokenClientSecret { get; private set; }

        /// <summary>
        /// OauthProviderImsServiceToken
        /// </summary>
        public ConfigNodePropertyString OauthProviderImsServiceToken { get; private set; }

        /// <summary>
        /// ImsOrgRef
        /// </summary>
        public ConfigNodePropertyString ImsOrgRef { get; private set; }

        /// <summary>
        /// ImsGroupMapping
        /// </summary>
        public ConfigNodePropertyArray ImsGroupMapping { get; private set; }

        /// <summary>
        /// OauthProviderImsOnlyLicenseGroup
        /// </summary>
        public ConfigNodePropertyBoolean OauthProviderImsOnlyLicenseGroup { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplIMSProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplIMSProviderImplProperties()
        {
        }

        private ComAdobeGraniteAuthImsImplIMSProviderImplProperties(ConfigNodePropertyString OauthProviderId, ConfigNodePropertyString OauthProviderImsAuthorizationUrl, ConfigNodePropertyString OauthProviderImsTokenUrl, ConfigNodePropertyString OauthProviderImsProfileUrl, ConfigNodePropertyArray OauthProviderImsExtendedDetailsUrls, ConfigNodePropertyString OauthProviderImsValidateTokenUrl, ConfigNodePropertyString OauthProviderImsSessionProperty, ConfigNodePropertyString OauthProviderImsServiceTokenClientId, ConfigNodePropertyString OauthProviderImsServiceTokenClientSecret, ConfigNodePropertyString OauthProviderImsServiceToken, ConfigNodePropertyString ImsOrgRef, ConfigNodePropertyArray ImsGroupMapping, ConfigNodePropertyBoolean OauthProviderImsOnlyLicenseGroup)
        {
            
            this.OauthProviderId = OauthProviderId;
            
            this.OauthProviderImsAuthorizationUrl = OauthProviderImsAuthorizationUrl;
            
            this.OauthProviderImsTokenUrl = OauthProviderImsTokenUrl;
            
            this.OauthProviderImsProfileUrl = OauthProviderImsProfileUrl;
            
            this.OauthProviderImsExtendedDetailsUrls = OauthProviderImsExtendedDetailsUrls;
            
            this.OauthProviderImsValidateTokenUrl = OauthProviderImsValidateTokenUrl;
            
            this.OauthProviderImsSessionProperty = OauthProviderImsSessionProperty;
            
            this.OauthProviderImsServiceTokenClientId = OauthProviderImsServiceTokenClientId;
            
            this.OauthProviderImsServiceTokenClientSecret = OauthProviderImsServiceTokenClientSecret;
            
            this.OauthProviderImsServiceToken = OauthProviderImsServiceToken;
            
            this.ImsOrgRef = ImsOrgRef;
            
            this.ImsGroupMapping = ImsGroupMapping;
            
            this.OauthProviderImsOnlyLicenseGroup = OauthProviderImsOnlyLicenseGroup;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplIMSProviderImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder</returns>
        public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder With()
        {
            return Builder()
                .OauthProviderId(OauthProviderId)
                .OauthProviderImsAuthorizationUrl(OauthProviderImsAuthorizationUrl)
                .OauthProviderImsTokenUrl(OauthProviderImsTokenUrl)
                .OauthProviderImsProfileUrl(OauthProviderImsProfileUrl)
                .OauthProviderImsExtendedDetailsUrls(OauthProviderImsExtendedDetailsUrls)
                .OauthProviderImsValidateTokenUrl(OauthProviderImsValidateTokenUrl)
                .OauthProviderImsSessionProperty(OauthProviderImsSessionProperty)
                .OauthProviderImsServiceTokenClientId(OauthProviderImsServiceTokenClientId)
                .OauthProviderImsServiceTokenClientSecret(OauthProviderImsServiceTokenClientSecret)
                .OauthProviderImsServiceToken(OauthProviderImsServiceToken)
                .ImsOrgRef(ImsOrgRef)
                .ImsGroupMapping(ImsGroupMapping)
                .OauthProviderImsOnlyLicenseGroup(OauthProviderImsOnlyLicenseGroup);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthImsImplIMSProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplIMSProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplIMSProviderImplProperties left, ComAdobeGraniteAuthImsImplIMSProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplIMSProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplIMSProviderImplProperties left, ComAdobeGraniteAuthImsImplIMSProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplIMSProviderImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthProviderId;
            private ConfigNodePropertyString _OauthProviderImsAuthorizationUrl;
            private ConfigNodePropertyString _OauthProviderImsTokenUrl;
            private ConfigNodePropertyString _OauthProviderImsProfileUrl;
            private ConfigNodePropertyArray _OauthProviderImsExtendedDetailsUrls;
            private ConfigNodePropertyString _OauthProviderImsValidateTokenUrl;
            private ConfigNodePropertyString _OauthProviderImsSessionProperty;
            private ConfigNodePropertyString _OauthProviderImsServiceTokenClientId;
            private ConfigNodePropertyString _OauthProviderImsServiceTokenClientSecret;
            private ConfigNodePropertyString _OauthProviderImsServiceToken;
            private ConfigNodePropertyString _ImsOrgRef;
            private ConfigNodePropertyArray _ImsGroupMapping;
            private ConfigNodePropertyBoolean _OauthProviderImsOnlyLicenseGroup;

            internal ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderId property.
            /// </summary>
            /// <param name="value">OauthProviderId</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderId(ConfigNodePropertyString value)
            {
                _OauthProviderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsAuthorizationUrl property.
            /// </summary>
            /// <param name="value">OauthProviderImsAuthorizationUrl</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsAuthorizationUrl(ConfigNodePropertyString value)
            {
                _OauthProviderImsAuthorizationUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsTokenUrl property.
            /// </summary>
            /// <param name="value">OauthProviderImsTokenUrl</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsTokenUrl(ConfigNodePropertyString value)
            {
                _OauthProviderImsTokenUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsProfileUrl property.
            /// </summary>
            /// <param name="value">OauthProviderImsProfileUrl</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsProfileUrl(ConfigNodePropertyString value)
            {
                _OauthProviderImsProfileUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsExtendedDetailsUrls property.
            /// </summary>
            /// <param name="value">OauthProviderImsExtendedDetailsUrls</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsExtendedDetailsUrls(ConfigNodePropertyArray value)
            {
                _OauthProviderImsExtendedDetailsUrls = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsValidateTokenUrl property.
            /// </summary>
            /// <param name="value">OauthProviderImsValidateTokenUrl</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsValidateTokenUrl(ConfigNodePropertyString value)
            {
                _OauthProviderImsValidateTokenUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsSessionProperty property.
            /// </summary>
            /// <param name="value">OauthProviderImsSessionProperty</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsSessionProperty(ConfigNodePropertyString value)
            {
                _OauthProviderImsSessionProperty = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsServiceTokenClientId property.
            /// </summary>
            /// <param name="value">OauthProviderImsServiceTokenClientId</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsServiceTokenClientId(ConfigNodePropertyString value)
            {
                _OauthProviderImsServiceTokenClientId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsServiceTokenClientSecret property.
            /// </summary>
            /// <param name="value">OauthProviderImsServiceTokenClientSecret</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsServiceTokenClientSecret(ConfigNodePropertyString value)
            {
                _OauthProviderImsServiceTokenClientSecret = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsServiceToken property.
            /// </summary>
            /// <param name="value">OauthProviderImsServiceToken</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsServiceToken(ConfigNodePropertyString value)
            {
                _OauthProviderImsServiceToken = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.ImsOrgRef property.
            /// </summary>
            /// <param name="value">ImsOrgRef</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder ImsOrgRef(ConfigNodePropertyString value)
            {
                _ImsOrgRef = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.ImsGroupMapping property.
            /// </summary>
            /// <param name="value">ImsGroupMapping</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder ImsGroupMapping(ConfigNodePropertyArray value)
            {
                _ImsGroupMapping = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSProviderImplProperties.OauthProviderImsOnlyLicenseGroup property.
            /// </summary>
            /// <param name="value">OauthProviderImsOnlyLicenseGroup</param>
            public ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder OauthProviderImsOnlyLicenseGroup(ConfigNodePropertyBoolean value)
            {
                _OauthProviderImsOnlyLicenseGroup = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplIMSProviderImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplIMSProviderImplProperties</returns>
            public ComAdobeGraniteAuthImsImplIMSProviderImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplIMSProviderImplProperties(
                    OauthProviderId: _OauthProviderId,
                    OauthProviderImsAuthorizationUrl: _OauthProviderImsAuthorizationUrl,
                    OauthProviderImsTokenUrl: _OauthProviderImsTokenUrl,
                    OauthProviderImsProfileUrl: _OauthProviderImsProfileUrl,
                    OauthProviderImsExtendedDetailsUrls: _OauthProviderImsExtendedDetailsUrls,
                    OauthProviderImsValidateTokenUrl: _OauthProviderImsValidateTokenUrl,
                    OauthProviderImsSessionProperty: _OauthProviderImsSessionProperty,
                    OauthProviderImsServiceTokenClientId: _OauthProviderImsServiceTokenClientId,
                    OauthProviderImsServiceTokenClientSecret: _OauthProviderImsServiceTokenClientSecret,
                    OauthProviderImsServiceToken: _OauthProviderImsServiceToken,
                    ImsOrgRef: _ImsOrgRef,
                    ImsGroupMapping: _ImsGroupMapping,
                    OauthProviderImsOnlyLicenseGroup: _OauthProviderImsOnlyLicenseGroup
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}