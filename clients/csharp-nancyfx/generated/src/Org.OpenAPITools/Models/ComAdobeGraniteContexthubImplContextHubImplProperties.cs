using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteContexthubImplContextHubImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteContexthubImplContextHubImplProperties:  IEquatable<ComAdobeGraniteContexthubImplContextHubImplProperties>
    { 
        /// <summary>
        /// ComAdobeGraniteContexthubSilentMode
        /// </summary>
        public ConfigNodePropertyBoolean ComAdobeGraniteContexthubSilentMode { get; private set; }

        /// <summary>
        /// ComAdobeGraniteContexthubShowUi
        /// </summary>
        public ConfigNodePropertyBoolean ComAdobeGraniteContexthubShowUi { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteContexthubImplContextHubImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteContexthubImplContextHubImplProperties()
        {
        }

        private ComAdobeGraniteContexthubImplContextHubImplProperties(ConfigNodePropertyBoolean ComAdobeGraniteContexthubSilentMode, ConfigNodePropertyBoolean ComAdobeGraniteContexthubShowUi)
        {
            
            this.ComAdobeGraniteContexthubSilentMode = ComAdobeGraniteContexthubSilentMode;
            
            this.ComAdobeGraniteContexthubShowUi = ComAdobeGraniteContexthubShowUi;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteContexthubImplContextHubImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder</returns>
        public static ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder</returns>
        public ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeGraniteContexthubSilentMode(ComAdobeGraniteContexthubSilentMode)
                .ComAdobeGraniteContexthubShowUi(ComAdobeGraniteContexthubShowUi);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteContexthubImplContextHubImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteContexthubImplContextHubImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteContexthubImplContextHubImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteContexthubImplContextHubImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteContexthubImplContextHubImplProperties left, ComAdobeGraniteContexthubImplContextHubImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteContexthubImplContextHubImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteContexthubImplContextHubImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteContexthubImplContextHubImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteContexthubImplContextHubImplProperties left, ComAdobeGraniteContexthubImplContextHubImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteContexthubImplContextHubImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ComAdobeGraniteContexthubSilentMode;
            private ConfigNodePropertyBoolean _ComAdobeGraniteContexthubShowUi;

            internal ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteContexthubImplContextHubImplProperties.ComAdobeGraniteContexthubSilentMode property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteContexthubSilentMode</param>
            public ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder ComAdobeGraniteContexthubSilentMode(ConfigNodePropertyBoolean value)
            {
                _ComAdobeGraniteContexthubSilentMode = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteContexthubImplContextHubImplProperties.ComAdobeGraniteContexthubShowUi property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteContexthubShowUi</param>
            public ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder ComAdobeGraniteContexthubShowUi(ConfigNodePropertyBoolean value)
            {
                _ComAdobeGraniteContexthubShowUi = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteContexthubImplContextHubImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteContexthubImplContextHubImplProperties</returns>
            public ComAdobeGraniteContexthubImplContextHubImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteContexthubImplContextHubImplProperties(
                    ComAdobeGraniteContexthubSilentMode: _ComAdobeGraniteContexthubSilentMode,
                    ComAdobeGraniteContexthubShowUi: _ComAdobeGraniteContexthubShowUi
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}