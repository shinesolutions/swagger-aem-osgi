using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties:  IEquatable<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties>
    { 
        /// <summary>
        /// DimDefaultMode
        /// </summary>
        public ConfigNodePropertyDropDown DimDefaultMode { get; private set; }

        /// <summary>
        /// DimAppcacheEnabled
        /// </summary>
        public ConfigNodePropertyBoolean DimAppcacheEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties()
        {
        }

        private ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(ConfigNodePropertyDropDown DimDefaultMode, ConfigNodePropertyBoolean DimAppcacheEnabled)
        {
            
            this.DimDefaultMode = DimDefaultMode;
            
            this.DimAppcacheEnabled = DimAppcacheEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder With()
        {
            return Builder()
                .DimDefaultMode(DimDefaultMode)
                .DimAppcacheEnabled(DimAppcacheEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties left, ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties left, ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _DimDefaultMode;
            private ConfigNodePropertyBoolean _DimAppcacheEnabled;

            internal ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.DimDefaultMode property.
            /// </summary>
            /// <param name="value">DimDefaultMode</param>
            public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder DimDefaultMode(ConfigNodePropertyDropDown value)
            {
                _DimDefaultMode = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.DimAppcacheEnabled property.
            /// </summary>
            /// <param name="value">DimAppcacheEnabled</param>
            public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder DimAppcacheEnabled(ConfigNodePropertyBoolean value)
            {
                _DimAppcacheEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties</returns>
            public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(
                    DimDefaultMode: _DimDefaultMode,
                    DimAppcacheEnabled: _DimAppcacheEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}