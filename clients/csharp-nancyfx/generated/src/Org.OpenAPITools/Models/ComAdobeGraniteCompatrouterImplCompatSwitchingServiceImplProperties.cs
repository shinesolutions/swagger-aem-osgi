using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties:  IEquatable<ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties>
    { 
        /// <summary>
        /// Compatgroups
        /// </summary>
        public ConfigNodePropertyArray Compatgroups { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties()
        {
        }

        private ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties(ConfigNodePropertyArray Compatgroups, ConfigNodePropertyBoolean Enabled)
        {
            
            this.Compatgroups = Compatgroups;
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder</returns>
        public static ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder</returns>
        public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder With()
        {
            return Builder()
                .Compatgroups(Compatgroups)
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties left, ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties left, ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _Compatgroups;
            private ConfigNodePropertyBoolean _Enabled;

            internal ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.Compatgroups property.
            /// </summary>
            /// <param name="value">Compatgroups</param>
            public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder Compatgroups(ConfigNodePropertyArray value)
            {
                _Compatgroups = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties</returns>
            public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties(
                    Compatgroups: _Compatgroups,
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}