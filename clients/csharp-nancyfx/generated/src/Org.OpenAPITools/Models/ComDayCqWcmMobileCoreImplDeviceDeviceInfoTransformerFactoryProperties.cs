using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties
    /// </summary>
    public sealed class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties:  IEquatable<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties>
    { 
        /// <summary>
        /// DeviceInfoTransformerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean DeviceInfoTransformerEnabled { get; private set; }

        /// <summary>
        /// DeviceInfoTransformerCssStyle
        /// </summary>
        public ConfigNodePropertyString DeviceInfoTransformerCssStyle { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties()
        {
        }

        private ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(ConfigNodePropertyBoolean DeviceInfoTransformerEnabled, ConfigNodePropertyString DeviceInfoTransformerCssStyle)
        {
            
            this.DeviceInfoTransformerEnabled = DeviceInfoTransformerEnabled;
            
            this.DeviceInfoTransformerCssStyle = DeviceInfoTransformerCssStyle;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder</returns>
        public static ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder</returns>
        public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder With()
        {
            return Builder()
                .DeviceInfoTransformerEnabled(DeviceInfoTransformerEnabled)
                .DeviceInfoTransformerCssStyle(DeviceInfoTransformerCssStyle);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties left, ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties left, ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.
        /// </summary>
        public sealed class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _DeviceInfoTransformerEnabled;
            private ConfigNodePropertyString _DeviceInfoTransformerCssStyle;

            internal ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.DeviceInfoTransformerEnabled property.
            /// </summary>
            /// <param name="value">DeviceInfoTransformerEnabled</param>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder DeviceInfoTransformerEnabled(ConfigNodePropertyBoolean value)
            {
                _DeviceInfoTransformerEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.DeviceInfoTransformerCssStyle property.
            /// </summary>
            /// <param name="value">DeviceInfoTransformerCssStyle</param>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder DeviceInfoTransformerCssStyle(ConfigNodePropertyString value)
            {
                _DeviceInfoTransformerCssStyle = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties</returns>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties Build()
            {
                Validate();
                return new ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(
                    DeviceInfoTransformerEnabled: _DeviceInfoTransformerEnabled,
                    DeviceInfoTransformerCssStyle: _DeviceInfoTransformerCssStyle
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}