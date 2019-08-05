using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties:  IEquatable<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// JaasControlFlag
        /// </summary>
        public ConfigNodePropertyString JaasControlFlag { get; private set; }

        /// <summary>
        /// JaasRealmName
        /// </summary>
        public ConfigNodePropertyString JaasRealmName { get; private set; }

        /// <summary>
        /// JaasRanking
        /// </summary>
        public ConfigNodePropertyInteger JaasRanking { get; private set; }

        /// <summary>
        /// OauthOfflineValidation
        /// </summary>
        public ConfigNodePropertyBoolean OauthOfflineValidation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties()
        {
        }

        private ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(ConfigNodePropertyString Path, ConfigNodePropertyString JaasControlFlag, ConfigNodePropertyString JaasRealmName, ConfigNodePropertyInteger JaasRanking, ConfigNodePropertyBoolean OauthOfflineValidation)
        {
            
            this.Path = Path;
            
            this.JaasControlFlag = JaasControlFlag;
            
            this.JaasRealmName = JaasRealmName;
            
            this.JaasRanking = JaasRanking;
            
            this.OauthOfflineValidation = OauthOfflineValidation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder</returns>
        public static ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder</returns>
        public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .JaasControlFlag(JaasControlFlag)
                .JaasRealmName(JaasRealmName)
                .JaasRanking(JaasRanking)
                .OauthOfflineValidation(OauthOfflineValidation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties left, ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties left, ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder
        {
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyString _JaasControlFlag;
            private ConfigNodePropertyString _JaasRealmName;
            private ConfigNodePropertyInteger _JaasRanking;
            private ConfigNodePropertyBoolean _OauthOfflineValidation;

            internal ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.JaasControlFlag property.
            /// </summary>
            /// <param name="value">JaasControlFlag</param>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder JaasControlFlag(ConfigNodePropertyString value)
            {
                _JaasControlFlag = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.JaasRealmName property.
            /// </summary>
            /// <param name="value">JaasRealmName</param>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder JaasRealmName(ConfigNodePropertyString value)
            {
                _JaasRealmName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.JaasRanking property.
            /// </summary>
            /// <param name="value">JaasRanking</param>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder JaasRanking(ConfigNodePropertyInteger value)
            {
                _JaasRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.OauthOfflineValidation property.
            /// </summary>
            /// <param name="value">OauthOfflineValidation</param>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder OauthOfflineValidation(ConfigNodePropertyBoolean value)
            {
                _OauthOfflineValidation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties</returns>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(
                    Path: _Path,
                    JaasControlFlag: _JaasControlFlag,
                    JaasRealmName: _JaasRealmName,
                    JaasRanking: _JaasRanking,
                    OauthOfflineValidation: _OauthOfflineValidation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}