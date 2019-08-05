using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties:  IEquatable<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties>
    { 
        /// <summary>
        /// OauthIssuer
        /// </summary>
        public ConfigNodePropertyString OauthIssuer { get; private set; }

        /// <summary>
        /// OauthAccessTokenExpiresIn
        /// </summary>
        public ConfigNodePropertyString OauthAccessTokenExpiresIn { get; private set; }

        /// <summary>
        /// OsgiHttpWhiteboardServletPattern
        /// </summary>
        public ConfigNodePropertyString OsgiHttpWhiteboardServletPattern { get; private set; }

        /// <summary>
        /// OsgiHttpWhiteboardContextSelect
        /// </summary>
        public ConfigNodePropertyString OsgiHttpWhiteboardContextSelect { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties()
        {
        }

        private ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(ConfigNodePropertyString OauthIssuer, ConfigNodePropertyString OauthAccessTokenExpiresIn, ConfigNodePropertyString OsgiHttpWhiteboardServletPattern, ConfigNodePropertyString OsgiHttpWhiteboardContextSelect)
        {
            
            this.OauthIssuer = OauthIssuer;
            
            this.OauthAccessTokenExpiresIn = OauthAccessTokenExpiresIn;
            
            this.OsgiHttpWhiteboardServletPattern = OsgiHttpWhiteboardServletPattern;
            
            this.OsgiHttpWhiteboardContextSelect = OsgiHttpWhiteboardContextSelect;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder</returns>
        public static ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder</returns>
        public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder With()
        {
            return Builder()
                .OauthIssuer(OauthIssuer)
                .OauthAccessTokenExpiresIn(OauthAccessTokenExpiresIn)
                .OsgiHttpWhiteboardServletPattern(OsgiHttpWhiteboardServletPattern)
                .OsgiHttpWhiteboardContextSelect(OsgiHttpWhiteboardContextSelect);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties left, ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties left, ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthIssuer;
            private ConfigNodePropertyString _OauthAccessTokenExpiresIn;
            private ConfigNodePropertyString _OsgiHttpWhiteboardServletPattern;
            private ConfigNodePropertyString _OsgiHttpWhiteboardContextSelect;

            internal ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.OauthIssuer property.
            /// </summary>
            /// <param name="value">OauthIssuer</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder OauthIssuer(ConfigNodePropertyString value)
            {
                _OauthIssuer = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.OauthAccessTokenExpiresIn property.
            /// </summary>
            /// <param name="value">OauthAccessTokenExpiresIn</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder OauthAccessTokenExpiresIn(ConfigNodePropertyString value)
            {
                _OauthAccessTokenExpiresIn = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.OsgiHttpWhiteboardServletPattern property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardServletPattern</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder OsgiHttpWhiteboardServletPattern(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardServletPattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.OsgiHttpWhiteboardContextSelect property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardContextSelect</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder OsgiHttpWhiteboardContextSelect(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardContextSelect = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties</returns>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(
                    OauthIssuer: _OauthIssuer,
                    OauthAccessTokenExpiresIn: _OauthAccessTokenExpiresIn,
                    OsgiHttpWhiteboardServletPattern: _OsgiHttpWhiteboardServletPattern,
                    OsgiHttpWhiteboardContextSelect: _OsgiHttpWhiteboardContextSelect
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}