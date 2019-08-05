using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties:  IEquatable<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// OauthClientIdsAllowed
        /// </summary>
        public ConfigNodePropertyArray OauthClientIdsAllowed { get; private set; }

        /// <summary>
        /// AuthBearerSyncIms
        /// </summary>
        public ConfigNodePropertyBoolean AuthBearerSyncIms { get; private set; }

        /// <summary>
        /// AuthTokenRequestParameter
        /// </summary>
        public ConfigNodePropertyString AuthTokenRequestParameter { get; private set; }

        /// <summary>
        /// OauthBearerConfigid
        /// </summary>
        public ConfigNodePropertyString OauthBearerConfigid { get; private set; }

        /// <summary>
        /// OauthJwtSupport
        /// </summary>
        public ConfigNodePropertyBoolean OauthJwtSupport { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties()
        {
        }

        private ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(ConfigNodePropertyString Path, ConfigNodePropertyArray OauthClientIdsAllowed, ConfigNodePropertyBoolean AuthBearerSyncIms, ConfigNodePropertyString AuthTokenRequestParameter, ConfigNodePropertyString OauthBearerConfigid, ConfigNodePropertyBoolean OauthJwtSupport)
        {
            
            this.Path = Path;
            
            this.OauthClientIdsAllowed = OauthClientIdsAllowed;
            
            this.AuthBearerSyncIms = AuthBearerSyncIms;
            
            this.AuthTokenRequestParameter = AuthTokenRequestParameter;
            
            this.OauthBearerConfigid = OauthBearerConfigid;
            
            this.OauthJwtSupport = OauthJwtSupport;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .OauthClientIdsAllowed(OauthClientIdsAllowed)
                .AuthBearerSyncIms(AuthBearerSyncIms)
                .AuthTokenRequestParameter(AuthTokenRequestParameter)
                .OauthBearerConfigid(OauthBearerConfigid)
                .OauthJwtSupport(OauthJwtSupport);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties left, ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties left, ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyArray _OauthClientIdsAllowed;
            private ConfigNodePropertyBoolean _AuthBearerSyncIms;
            private ConfigNodePropertyString _AuthTokenRequestParameter;
            private ConfigNodePropertyString _OauthBearerConfigid;
            private ConfigNodePropertyBoolean _OauthJwtSupport;

            internal ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.OauthClientIdsAllowed property.
            /// </summary>
            /// <param name="value">OauthClientIdsAllowed</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder OauthClientIdsAllowed(ConfigNodePropertyArray value)
            {
                _OauthClientIdsAllowed = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.AuthBearerSyncIms property.
            /// </summary>
            /// <param name="value">AuthBearerSyncIms</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder AuthBearerSyncIms(ConfigNodePropertyBoolean value)
            {
                _AuthBearerSyncIms = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.AuthTokenRequestParameter property.
            /// </summary>
            /// <param name="value">AuthTokenRequestParameter</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder AuthTokenRequestParameter(ConfigNodePropertyString value)
            {
                _AuthTokenRequestParameter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.OauthBearerConfigid property.
            /// </summary>
            /// <param name="value">OauthBearerConfigid</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder OauthBearerConfigid(ConfigNodePropertyString value)
            {
                _OauthBearerConfigid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.OauthJwtSupport property.
            /// </summary>
            /// <param name="value">OauthJwtSupport</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder OauthJwtSupport(ConfigNodePropertyBoolean value)
            {
                _OauthJwtSupport = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties</returns>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(
                    Path: _Path,
                    OauthClientIdsAllowed: _OauthClientIdsAllowed,
                    AuthBearerSyncIms: _AuthBearerSyncIms,
                    AuthTokenRequestParameter: _AuthTokenRequestParameter,
                    OauthBearerConfigid: _OauthBearerConfigid,
                    OauthJwtSupport: _OauthJwtSupport
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}