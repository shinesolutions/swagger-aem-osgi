using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
    /// </summary>
    public sealed class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties:  IEquatable<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// TokenRequiredAttr
        /// </summary>
        public ConfigNodePropertyDropDown TokenRequiredAttr { get; private set; }

        /// <summary>
        /// TokenAlternateUrl
        /// </summary>
        public ConfigNodePropertyString TokenAlternateUrl { get; private set; }

        /// <summary>
        /// TokenEncapsulated
        /// </summary>
        public ConfigNodePropertyBoolean TokenEncapsulated { get; private set; }

        /// <summary>
        /// SkipTokenRefresh
        /// </summary>
        public ConfigNodePropertyArray SkipTokenRefresh { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties()
        {
        }

        private ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(ConfigNodePropertyString Path, ConfigNodePropertyDropDown TokenRequiredAttr, ConfigNodePropertyString TokenAlternateUrl, ConfigNodePropertyBoolean TokenEncapsulated, ConfigNodePropertyArray SkipTokenRefresh)
        {
            
            this.Path = Path;
            
            this.TokenRequiredAttr = TokenRequiredAttr;
            
            this.TokenAlternateUrl = TokenAlternateUrl;
            
            this.TokenEncapsulated = TokenEncapsulated;
            
            this.SkipTokenRefresh = SkipTokenRefresh;
            
        }

        /// <summary>
        /// Returns builder of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.
        /// </summary>
        /// <returns>ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder</returns>
        public static ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder Builder()
        {
            return new ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder</returns>
        public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .TokenRequiredAttr(TokenRequiredAttr)
                .TokenAlternateUrl(TokenAlternateUrl)
                .TokenEncapsulated(TokenEncapsulated)
                .SkipTokenRefresh(SkipTokenRefresh);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties left, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties left, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.
        /// </summary>
        public sealed class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyDropDown _TokenRequiredAttr;
            private ConfigNodePropertyString _TokenAlternateUrl;
            private ConfigNodePropertyBoolean _TokenEncapsulated;
            private ConfigNodePropertyArray _SkipTokenRefresh;

            internal ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.TokenRequiredAttr property.
            /// </summary>
            /// <param name="value">TokenRequiredAttr</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder TokenRequiredAttr(ConfigNodePropertyDropDown value)
            {
                _TokenRequiredAttr = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.TokenAlternateUrl property.
            /// </summary>
            /// <param name="value">TokenAlternateUrl</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder TokenAlternateUrl(ConfigNodePropertyString value)
            {
                _TokenAlternateUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.TokenEncapsulated property.
            /// </summary>
            /// <param name="value">TokenEncapsulated</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder TokenEncapsulated(ConfigNodePropertyBoolean value)
            {
                _TokenEncapsulated = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.SkipTokenRefresh property.
            /// </summary>
            /// <param name="value">SkipTokenRefresh</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder SkipTokenRefresh(ConfigNodePropertyArray value)
            {
                _SkipTokenRefresh = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.
            /// </summary>
            /// <returns>ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties</returns>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties Build()
            {
                Validate();
                return new ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(
                    Path: _Path,
                    TokenRequiredAttr: _TokenRequiredAttr,
                    TokenAlternateUrl: _TokenAlternateUrl,
                    TokenEncapsulated: _TokenEncapsulated,
                    SkipTokenRefresh: _SkipTokenRefresh
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}