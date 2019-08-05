using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties:  IEquatable<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

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
        /// Headers
        /// </summary>
        public ConfigNodePropertyArray Headers { get; private set; }

        /// <summary>
        /// Cookies
        /// </summary>
        public ConfigNodePropertyArray Cookies { get; private set; }

        /// <summary>
        /// Parameters
        /// </summary>
        public ConfigNodePropertyArray Parameters { get; private set; }

        /// <summary>
        /// Usermap
        /// </summary>
        public ConfigNodePropertyArray Usermap { get; private set; }

        /// <summary>
        /// Format
        /// </summary>
        public ConfigNodePropertyString Format { get; private set; }

        /// <summary>
        /// TrustedCredentialsAttribute
        /// </summary>
        public ConfigNodePropertyString TrustedCredentialsAttribute { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties()
        {
        }

        private ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(ConfigNodePropertyString Path, ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString JaasControlFlag, ConfigNodePropertyString JaasRealmName, ConfigNodePropertyInteger JaasRanking, ConfigNodePropertyArray Headers, ConfigNodePropertyArray Cookies, ConfigNodePropertyArray Parameters, ConfigNodePropertyArray Usermap, ConfigNodePropertyString Format, ConfigNodePropertyString TrustedCredentialsAttribute)
        {
            
            this.Path = Path;
            
            this.ServiceRanking = ServiceRanking;
            
            this.JaasControlFlag = JaasControlFlag;
            
            this.JaasRealmName = JaasRealmName;
            
            this.JaasRanking = JaasRanking;
            
            this.Headers = Headers;
            
            this.Cookies = Cookies;
            
            this.Parameters = Parameters;
            
            this.Usermap = Usermap;
            
            this.Format = Format;
            
            this.TrustedCredentialsAttribute = TrustedCredentialsAttribute;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder</returns>
        public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .ServiceRanking(ServiceRanking)
                .JaasControlFlag(JaasControlFlag)
                .JaasRealmName(JaasRealmName)
                .JaasRanking(JaasRanking)
                .Headers(Headers)
                .Cookies(Cookies)
                .Parameters(Parameters)
                .Usermap(Usermap)
                .Format(Format)
                .TrustedCredentialsAttribute(TrustedCredentialsAttribute);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties left, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties left, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _JaasControlFlag;
            private ConfigNodePropertyString _JaasRealmName;
            private ConfigNodePropertyInteger _JaasRanking;
            private ConfigNodePropertyArray _Headers;
            private ConfigNodePropertyArray _Cookies;
            private ConfigNodePropertyArray _Parameters;
            private ConfigNodePropertyArray _Usermap;
            private ConfigNodePropertyString _Format;
            private ConfigNodePropertyString _TrustedCredentialsAttribute;

            internal ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.JaasControlFlag property.
            /// </summary>
            /// <param name="value">JaasControlFlag</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder JaasControlFlag(ConfigNodePropertyString value)
            {
                _JaasControlFlag = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.JaasRealmName property.
            /// </summary>
            /// <param name="value">JaasRealmName</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder JaasRealmName(ConfigNodePropertyString value)
            {
                _JaasRealmName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.JaasRanking property.
            /// </summary>
            /// <param name="value">JaasRanking</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder JaasRanking(ConfigNodePropertyInteger value)
            {
                _JaasRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.Headers property.
            /// </summary>
            /// <param name="value">Headers</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder Headers(ConfigNodePropertyArray value)
            {
                _Headers = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.Cookies property.
            /// </summary>
            /// <param name="value">Cookies</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder Cookies(ConfigNodePropertyArray value)
            {
                _Cookies = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.Parameters property.
            /// </summary>
            /// <param name="value">Parameters</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder Parameters(ConfigNodePropertyArray value)
            {
                _Parameters = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.Usermap property.
            /// </summary>
            /// <param name="value">Usermap</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder Usermap(ConfigNodePropertyArray value)
            {
                _Usermap = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.Format property.
            /// </summary>
            /// <param name="value">Format</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder Format(ConfigNodePropertyString value)
            {
                _Format = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.TrustedCredentialsAttribute property.
            /// </summary>
            /// <param name="value">TrustedCredentialsAttribute</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder TrustedCredentialsAttribute(ConfigNodePropertyString value)
            {
                _TrustedCredentialsAttribute = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties</returns>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(
                    Path: _Path,
                    ServiceRanking: _ServiceRanking,
                    JaasControlFlag: _JaasControlFlag,
                    JaasRealmName: _JaasRealmName,
                    JaasRanking: _JaasRanking,
                    Headers: _Headers,
                    Cookies: _Cookies,
                    Parameters: _Parameters,
                    Usermap: _Usermap,
                    Format: _Format,
                    TrustedCredentialsAttribute: _TrustedCredentialsAttribute
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}