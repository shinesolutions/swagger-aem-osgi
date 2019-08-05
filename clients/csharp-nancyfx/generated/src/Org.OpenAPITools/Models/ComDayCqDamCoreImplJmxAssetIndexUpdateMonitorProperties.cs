using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties:  IEquatable<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties>
    { 
        /// <summary>
        /// JmxObjectname
        /// </summary>
        public ConfigNodePropertyString JmxObjectname { get; private set; }

        /// <summary>
        /// PropertyMeasureEnabled
        /// </summary>
        public ConfigNodePropertyBoolean PropertyMeasureEnabled { get; private set; }

        /// <summary>
        /// PropertyName
        /// </summary>
        public ConfigNodePropertyString PropertyName { get; private set; }

        /// <summary>
        /// PropertyMaxWaitMs
        /// </summary>
        public ConfigNodePropertyInteger PropertyMaxWaitMs { get; private set; }

        /// <summary>
        /// PropertyMaxRate
        /// </summary>
        public ConfigNodePropertyFloat PropertyMaxRate { get; private set; }

        /// <summary>
        /// FulltextMeasureEnabled
        /// </summary>
        public ConfigNodePropertyBoolean FulltextMeasureEnabled { get; private set; }

        /// <summary>
        /// FulltextName
        /// </summary>
        public ConfigNodePropertyString FulltextName { get; private set; }

        /// <summary>
        /// FulltextMaxWaitMs
        /// </summary>
        public ConfigNodePropertyInteger FulltextMaxWaitMs { get; private set; }

        /// <summary>
        /// FulltextMaxRate
        /// </summary>
        public ConfigNodePropertyFloat FulltextMaxRate { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties()
        {
        }

        private ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(ConfigNodePropertyString JmxObjectname, ConfigNodePropertyBoolean PropertyMeasureEnabled, ConfigNodePropertyString PropertyName, ConfigNodePropertyInteger PropertyMaxWaitMs, ConfigNodePropertyFloat PropertyMaxRate, ConfigNodePropertyBoolean FulltextMeasureEnabled, ConfigNodePropertyString FulltextName, ConfigNodePropertyInteger FulltextMaxWaitMs, ConfigNodePropertyFloat FulltextMaxRate)
        {
            
            this.JmxObjectname = JmxObjectname;
            
            this.PropertyMeasureEnabled = PropertyMeasureEnabled;
            
            this.PropertyName = PropertyName;
            
            this.PropertyMaxWaitMs = PropertyMaxWaitMs;
            
            this.PropertyMaxRate = PropertyMaxRate;
            
            this.FulltextMeasureEnabled = FulltextMeasureEnabled;
            
            this.FulltextName = FulltextName;
            
            this.FulltextMaxWaitMs = FulltextMaxWaitMs;
            
            this.FulltextMaxRate = FulltextMaxRate;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder</returns>
        public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder With()
        {
            return Builder()
                .JmxObjectname(JmxObjectname)
                .PropertyMeasureEnabled(PropertyMeasureEnabled)
                .PropertyName(PropertyName)
                .PropertyMaxWaitMs(PropertyMaxWaitMs)
                .PropertyMaxRate(PropertyMaxRate)
                .FulltextMeasureEnabled(FulltextMeasureEnabled)
                .FulltextName(FulltextName)
                .FulltextMaxWaitMs(FulltextMaxWaitMs)
                .FulltextMaxRate(FulltextMaxRate);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties left, ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties left, ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder
        {
            private ConfigNodePropertyString _JmxObjectname;
            private ConfigNodePropertyBoolean _PropertyMeasureEnabled;
            private ConfigNodePropertyString _PropertyName;
            private ConfigNodePropertyInteger _PropertyMaxWaitMs;
            private ConfigNodePropertyFloat _PropertyMaxRate;
            private ConfigNodePropertyBoolean _FulltextMeasureEnabled;
            private ConfigNodePropertyString _FulltextName;
            private ConfigNodePropertyInteger _FulltextMaxWaitMs;
            private ConfigNodePropertyFloat _FulltextMaxRate;

            internal ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.JmxObjectname property.
            /// </summary>
            /// <param name="value">JmxObjectname</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder JmxObjectname(ConfigNodePropertyString value)
            {
                _JmxObjectname = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.PropertyMeasureEnabled property.
            /// </summary>
            /// <param name="value">PropertyMeasureEnabled</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder PropertyMeasureEnabled(ConfigNodePropertyBoolean value)
            {
                _PropertyMeasureEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.PropertyName property.
            /// </summary>
            /// <param name="value">PropertyName</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder PropertyName(ConfigNodePropertyString value)
            {
                _PropertyName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.PropertyMaxWaitMs property.
            /// </summary>
            /// <param name="value">PropertyMaxWaitMs</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder PropertyMaxWaitMs(ConfigNodePropertyInteger value)
            {
                _PropertyMaxWaitMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.PropertyMaxRate property.
            /// </summary>
            /// <param name="value">PropertyMaxRate</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder PropertyMaxRate(ConfigNodePropertyFloat value)
            {
                _PropertyMaxRate = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.FulltextMeasureEnabled property.
            /// </summary>
            /// <param name="value">FulltextMeasureEnabled</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder FulltextMeasureEnabled(ConfigNodePropertyBoolean value)
            {
                _FulltextMeasureEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.FulltextName property.
            /// </summary>
            /// <param name="value">FulltextName</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder FulltextName(ConfigNodePropertyString value)
            {
                _FulltextName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.FulltextMaxWaitMs property.
            /// </summary>
            /// <param name="value">FulltextMaxWaitMs</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder FulltextMaxWaitMs(ConfigNodePropertyInteger value)
            {
                _FulltextMaxWaitMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.FulltextMaxRate property.
            /// </summary>
            /// <param name="value">FulltextMaxRate</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder FulltextMaxRate(ConfigNodePropertyFloat value)
            {
                _FulltextMaxRate = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties</returns>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(
                    JmxObjectname: _JmxObjectname,
                    PropertyMeasureEnabled: _PropertyMeasureEnabled,
                    PropertyName: _PropertyName,
                    PropertyMaxWaitMs: _PropertyMaxWaitMs,
                    PropertyMaxRate: _PropertyMaxRate,
                    FulltextMeasureEnabled: _FulltextMeasureEnabled,
                    FulltextName: _FulltextName,
                    FulltextMaxWaitMs: _FulltextMaxWaitMs,
                    FulltextMaxRate: _FulltextMaxRate
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}