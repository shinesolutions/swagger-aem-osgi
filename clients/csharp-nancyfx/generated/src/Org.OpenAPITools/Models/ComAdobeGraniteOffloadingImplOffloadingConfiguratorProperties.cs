using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties
    /// </summary>
    public sealed class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties:  IEquatable<ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties>
    { 
        /// <summary>
        /// OffloadingTransporter
        /// </summary>
        public ConfigNodePropertyString OffloadingTransporter { get; private set; }

        /// <summary>
        /// OffloadingCleanupPayload
        /// </summary>
        public ConfigNodePropertyBoolean OffloadingCleanupPayload { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties()
        {
        }

        private ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(ConfigNodePropertyString OffloadingTransporter, ConfigNodePropertyBoolean OffloadingCleanupPayload)
        {
            
            this.OffloadingTransporter = OffloadingTransporter;
            
            this.OffloadingCleanupPayload = OffloadingCleanupPayload;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder</returns>
        public static ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder</returns>
        public ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder With()
        {
            return Builder()
                .OffloadingTransporter(OffloadingTransporter)
                .OffloadingCleanupPayload(OffloadingCleanupPayload);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties left, ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties left, ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder
        {
            private ConfigNodePropertyString _OffloadingTransporter;
            private ConfigNodePropertyBoolean _OffloadingCleanupPayload;

            internal ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.OffloadingTransporter property.
            /// </summary>
            /// <param name="value">OffloadingTransporter</param>
            public ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder OffloadingTransporter(ConfigNodePropertyString value)
            {
                _OffloadingTransporter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.OffloadingCleanupPayload property.
            /// </summary>
            /// <param name="value">OffloadingCleanupPayload</param>
            public ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder OffloadingCleanupPayload(ConfigNodePropertyBoolean value)
            {
                _OffloadingCleanupPayload = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties</returns>
            public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(
                    OffloadingTransporter: _OffloadingTransporter,
                    OffloadingCleanupPayload: _OffloadingCleanupPayload
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}