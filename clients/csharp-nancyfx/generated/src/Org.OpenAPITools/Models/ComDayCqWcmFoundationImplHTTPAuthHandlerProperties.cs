using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationImplHTTPAuthHandlerProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties:  IEquatable<ComDayCqWcmFoundationImplHTTPAuthHandlerProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// AuthHttpNologin
        /// </summary>
        public ConfigNodePropertyBoolean AuthHttpNologin { get; private set; }

        /// <summary>
        /// AuthHttpRealm
        /// </summary>
        public ConfigNodePropertyString AuthHttpRealm { get; private set; }

        /// <summary>
        /// AuthDefaultLoginpage
        /// </summary>
        public ConfigNodePropertyString AuthDefaultLoginpage { get; private set; }

        /// <summary>
        /// AuthCredForm
        /// </summary>
        public ConfigNodePropertyArray AuthCredForm { get; private set; }

        /// <summary>
        /// AuthCredUtf8
        /// </summary>
        public ConfigNodePropertyArray AuthCredUtf8 { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties()
        {
        }

        private ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(ConfigNodePropertyString Path, ConfigNodePropertyBoolean AuthHttpNologin, ConfigNodePropertyString AuthHttpRealm, ConfigNodePropertyString AuthDefaultLoginpage, ConfigNodePropertyArray AuthCredForm, ConfigNodePropertyArray AuthCredUtf8)
        {
            
            this.Path = Path;
            
            this.AuthHttpNologin = AuthHttpNologin;
            
            this.AuthHttpRealm = AuthHttpRealm;
            
            this.AuthDefaultLoginpage = AuthDefaultLoginpage;
            
            this.AuthCredForm = AuthCredForm;
            
            this.AuthCredUtf8 = AuthCredUtf8;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder</returns>
        public ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .AuthHttpNologin(AuthHttpNologin)
                .AuthHttpRealm(AuthHttpRealm)
                .AuthDefaultLoginpage(AuthDefaultLoginpage)
                .AuthCredForm(AuthCredForm)
                .AuthCredUtf8(AuthCredUtf8);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationImplHTTPAuthHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplHTTPAuthHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplHTTPAuthHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationImplHTTPAuthHandlerProperties left, ComDayCqWcmFoundationImplHTTPAuthHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplHTTPAuthHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplHTTPAuthHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationImplHTTPAuthHandlerProperties left, ComDayCqWcmFoundationImplHTTPAuthHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyBoolean _AuthHttpNologin;
            private ConfigNodePropertyString _AuthHttpRealm;
            private ConfigNodePropertyString _AuthDefaultLoginpage;
            private ConfigNodePropertyArray _AuthCredForm;
            private ConfigNodePropertyArray _AuthCredUtf8;

            internal ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.AuthHttpNologin property.
            /// </summary>
            /// <param name="value">AuthHttpNologin</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder AuthHttpNologin(ConfigNodePropertyBoolean value)
            {
                _AuthHttpNologin = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.AuthHttpRealm property.
            /// </summary>
            /// <param name="value">AuthHttpRealm</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder AuthHttpRealm(ConfigNodePropertyString value)
            {
                _AuthHttpRealm = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.AuthDefaultLoginpage property.
            /// </summary>
            /// <param name="value">AuthDefaultLoginpage</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder AuthDefaultLoginpage(ConfigNodePropertyString value)
            {
                _AuthDefaultLoginpage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.AuthCredForm property.
            /// </summary>
            /// <param name="value">AuthCredForm</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder AuthCredForm(ConfigNodePropertyArray value)
            {
                _AuthCredForm = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.AuthCredUtf8 property.
            /// </summary>
            /// <param name="value">AuthCredUtf8</param>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder AuthCredUtf8(ConfigNodePropertyArray value)
            {
                _AuthCredUtf8 = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationImplHTTPAuthHandlerProperties</returns>
            public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(
                    Path: _Path,
                    AuthHttpNologin: _AuthHttpNologin,
                    AuthHttpRealm: _AuthHttpRealm,
                    AuthDefaultLoginpage: _AuthDefaultLoginpage,
                    AuthCredForm: _AuthCredForm,
                    AuthCredUtf8: _AuthCredUtf8
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}