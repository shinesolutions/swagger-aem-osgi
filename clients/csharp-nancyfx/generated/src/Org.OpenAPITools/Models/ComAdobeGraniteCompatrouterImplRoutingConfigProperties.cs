using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCompatrouterImplRoutingConfigProperties
    /// </summary>
    public sealed class ComAdobeGraniteCompatrouterImplRoutingConfigProperties:  IEquatable<ComAdobeGraniteCompatrouterImplRoutingConfigProperties>
    { 
        /// <summary>
        /// Id
        /// </summary>
        public ConfigNodePropertyString Id { get; private set; }

        /// <summary>
        /// CompatPath
        /// </summary>
        public ConfigNodePropertyString CompatPath { get; private set; }

        /// <summary>
        /// NewPath
        /// </summary>
        public ConfigNodePropertyString NewPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCompatrouterImplRoutingConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCompatrouterImplRoutingConfigProperties()
        {
        }

        private ComAdobeGraniteCompatrouterImplRoutingConfigProperties(ConfigNodePropertyString Id, ConfigNodePropertyString CompatPath, ConfigNodePropertyString NewPath)
        {
            
            this.Id = Id;
            
            this.CompatPath = CompatPath;
            
            this.NewPath = NewPath;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCompatrouterImplRoutingConfigProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder</returns>
        public static ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder</returns>
        public ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder With()
        {
            return Builder()
                .Id(Id)
                .CompatPath(CompatPath)
                .NewPath(NewPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteCompatrouterImplRoutingConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCompatrouterImplRoutingConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplRoutingConfigProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplRoutingConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCompatrouterImplRoutingConfigProperties left, ComAdobeGraniteCompatrouterImplRoutingConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCompatrouterImplRoutingConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplRoutingConfigProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplRoutingConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCompatrouterImplRoutingConfigProperties left, ComAdobeGraniteCompatrouterImplRoutingConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCompatrouterImplRoutingConfigProperties.
        /// </summary>
        public sealed class ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder
        {
            private ConfigNodePropertyString _Id;
            private ConfigNodePropertyString _CompatPath;
            private ConfigNodePropertyString _NewPath;

            internal ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplRoutingConfigProperties.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder Id(ConfigNodePropertyString value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplRoutingConfigProperties.CompatPath property.
            /// </summary>
            /// <param name="value">CompatPath</param>
            public ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder CompatPath(ConfigNodePropertyString value)
            {
                _CompatPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplRoutingConfigProperties.NewPath property.
            /// </summary>
            /// <param name="value">NewPath</param>
            public ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder NewPath(ConfigNodePropertyString value)
            {
                _NewPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCompatrouterImplRoutingConfigProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteCompatrouterImplRoutingConfigProperties</returns>
            public ComAdobeGraniteCompatrouterImplRoutingConfigProperties Build()
            {
                Validate();
                return new ComAdobeGraniteCompatrouterImplRoutingConfigProperties(
                    Id: _Id,
                    CompatPath: _CompatPath,
                    NewPath: _NewPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}