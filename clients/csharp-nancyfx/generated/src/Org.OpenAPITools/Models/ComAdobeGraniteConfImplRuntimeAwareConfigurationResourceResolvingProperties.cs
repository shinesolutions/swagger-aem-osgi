using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties
    /// </summary>
    public sealed class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties:  IEquatable<ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// FallbackPaths
        /// </summary>
        public ConfigNodePropertyArray FallbackPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties()
        {
        }

        private ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties(ConfigNodePropertyBoolean Enabled, ConfigNodePropertyArray FallbackPaths)
        {
            
            this.Enabled = Enabled;
            
            this.FallbackPaths = FallbackPaths;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder</returns>
        public static ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder</returns>
        public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled)
                .FallbackPaths(FallbackPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties left, ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties left, ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.
        /// </summary>
        public sealed class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyArray _FallbackPaths;

            internal ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.FallbackPaths property.
            /// </summary>
            /// <param name="value">FallbackPaths</param>
            public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesBuilder FallbackPaths(ConfigNodePropertyArray value)
            {
                _FallbackPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties</returns>
            public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties Build()
            {
                Validate();
                return new ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties(
                    Enabled: _Enabled,
                    FallbackPaths: _FallbackPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}