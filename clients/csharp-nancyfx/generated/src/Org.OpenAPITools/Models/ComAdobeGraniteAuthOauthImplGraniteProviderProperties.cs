using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplGraniteProviderProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplGraniteProviderProperties:  IEquatable<ComAdobeGraniteAuthOauthImplGraniteProviderProperties>
    { 
        /// <summary>
        /// OauthProviderId
        /// </summary>
        public ConfigNodePropertyString OauthProviderId { get; private set; }

        /// <summary>
        /// OauthProviderGraniteAuthorizationUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderGraniteAuthorizationUrl { get; private set; }

        /// <summary>
        /// OauthProviderGraniteTokenUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderGraniteTokenUrl { get; private set; }

        /// <summary>
        /// OauthProviderGraniteProfileUrl
        /// </summary>
        public ConfigNodePropertyString OauthProviderGraniteProfileUrl { get; private set; }

        /// <summary>
        /// OauthProviderGraniteExtendedDetailsUrls
        /// </summary>
        public ConfigNodePropertyString OauthProviderGraniteExtendedDetailsUrls { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplGraniteProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplGraniteProviderProperties()
        {
        }

        private ComAdobeGraniteAuthOauthImplGraniteProviderProperties(ConfigNodePropertyString OauthProviderId, ConfigNodePropertyString OauthProviderGraniteAuthorizationUrl, ConfigNodePropertyString OauthProviderGraniteTokenUrl, ConfigNodePropertyString OauthProviderGraniteProfileUrl, ConfigNodePropertyString OauthProviderGraniteExtendedDetailsUrls)
        {
            
            this.OauthProviderId = OauthProviderId;
            
            this.OauthProviderGraniteAuthorizationUrl = OauthProviderGraniteAuthorizationUrl;
            
            this.OauthProviderGraniteTokenUrl = OauthProviderGraniteTokenUrl;
            
            this.OauthProviderGraniteProfileUrl = OauthProviderGraniteProfileUrl;
            
            this.OauthProviderGraniteExtendedDetailsUrls = OauthProviderGraniteExtendedDetailsUrls;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplGraniteProviderProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder With()
        {
            return Builder()
                .OauthProviderId(OauthProviderId)
                .OauthProviderGraniteAuthorizationUrl(OauthProviderGraniteAuthorizationUrl)
                .OauthProviderGraniteTokenUrl(OauthProviderGraniteTokenUrl)
                .OauthProviderGraniteProfileUrl(OauthProviderGraniteProfileUrl)
                .OauthProviderGraniteExtendedDetailsUrls(OauthProviderGraniteExtendedDetailsUrls);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthOauthImplGraniteProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplGraniteProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplGraniteProviderProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplGraniteProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplGraniteProviderProperties left, ComAdobeGraniteAuthOauthImplGraniteProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplGraniteProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplGraniteProviderProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplGraniteProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplGraniteProviderProperties left, ComAdobeGraniteAuthOauthImplGraniteProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplGraniteProviderProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthProviderId;
            private ConfigNodePropertyString _OauthProviderGraniteAuthorizationUrl;
            private ConfigNodePropertyString _OauthProviderGraniteTokenUrl;
            private ConfigNodePropertyString _OauthProviderGraniteProfileUrl;
            private ConfigNodePropertyString _OauthProviderGraniteExtendedDetailsUrls;

            internal ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGraniteProviderProperties.OauthProviderId property.
            /// </summary>
            /// <param name="value">OauthProviderId</param>
            public ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder OauthProviderId(ConfigNodePropertyString value)
            {
                _OauthProviderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGraniteProviderProperties.OauthProviderGraniteAuthorizationUrl property.
            /// </summary>
            /// <param name="value">OauthProviderGraniteAuthorizationUrl</param>
            public ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder OauthProviderGraniteAuthorizationUrl(ConfigNodePropertyString value)
            {
                _OauthProviderGraniteAuthorizationUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGraniteProviderProperties.OauthProviderGraniteTokenUrl property.
            /// </summary>
            /// <param name="value">OauthProviderGraniteTokenUrl</param>
            public ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder OauthProviderGraniteTokenUrl(ConfigNodePropertyString value)
            {
                _OauthProviderGraniteTokenUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGraniteProviderProperties.OauthProviderGraniteProfileUrl property.
            /// </summary>
            /// <param name="value">OauthProviderGraniteProfileUrl</param>
            public ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder OauthProviderGraniteProfileUrl(ConfigNodePropertyString value)
            {
                _OauthProviderGraniteProfileUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGraniteProviderProperties.OauthProviderGraniteExtendedDetailsUrls property.
            /// </summary>
            /// <param name="value">OauthProviderGraniteExtendedDetailsUrls</param>
            public ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder OauthProviderGraniteExtendedDetailsUrls(ConfigNodePropertyString value)
            {
                _OauthProviderGraniteExtendedDetailsUrls = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplGraniteProviderProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplGraniteProviderProperties</returns>
            public ComAdobeGraniteAuthOauthImplGraniteProviderProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplGraniteProviderProperties(
                    OauthProviderId: _OauthProviderId,
                    OauthProviderGraniteAuthorizationUrl: _OauthProviderGraniteAuthorizationUrl,
                    OauthProviderGraniteTokenUrl: _OauthProviderGraniteTokenUrl,
                    OauthProviderGraniteProfileUrl: _OauthProviderGraniteProfileUrl,
                    OauthProviderGraniteExtendedDetailsUrls: _OauthProviderGraniteExtendedDetailsUrls
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}