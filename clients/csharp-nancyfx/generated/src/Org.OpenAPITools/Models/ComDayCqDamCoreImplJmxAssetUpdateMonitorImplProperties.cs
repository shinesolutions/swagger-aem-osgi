using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties:  IEquatable<ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties>
    { 
        /// <summary>
        /// JmxObjectname
        /// </summary>
        public ConfigNodePropertyString JmxObjectname { get; private set; }

        /// <summary>
        /// Active
        /// </summary>
        public ConfigNodePropertyBoolean Active { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties()
        {
        }

        private ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(ConfigNodePropertyString JmxObjectname, ConfigNodePropertyBoolean Active)
        {
            
            this.JmxObjectname = JmxObjectname;
            
            this.Active = Active;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder</returns>
        public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder With()
        {
            return Builder()
                .JmxObjectname(JmxObjectname)
                .Active(Active);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties left, ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties left, ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder
        {
            private ConfigNodePropertyString _JmxObjectname;
            private ConfigNodePropertyBoolean _Active;

            internal ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.JmxObjectname property.
            /// </summary>
            /// <param name="value">JmxObjectname</param>
            public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder JmxObjectname(ConfigNodePropertyString value)
            {
                _JmxObjectname = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.Active property.
            /// </summary>
            /// <param name="value">Active</param>
            public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder Active(ConfigNodePropertyBoolean value)
            {
                _Active = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties</returns>
            public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(
                    JmxObjectname: _JmxObjectname,
                    Active: _Active
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}