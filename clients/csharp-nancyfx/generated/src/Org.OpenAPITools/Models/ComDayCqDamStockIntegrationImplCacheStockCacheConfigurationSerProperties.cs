using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties
    /// </summary>
    public sealed class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties:  IEquatable<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties>
    { 
        /// <summary>
        /// GetCacheExpirationUnit
        /// </summary>
        public ConfigNodePropertyDropDown GetCacheExpirationUnit { get; private set; }

        /// <summary>
        /// GetCacheExpirationValue
        /// </summary>
        public ConfigNodePropertyInteger GetCacheExpirationValue { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties()
        {
        }

        private ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(ConfigNodePropertyDropDown GetCacheExpirationUnit, ConfigNodePropertyInteger GetCacheExpirationValue)
        {
            
            this.GetCacheExpirationUnit = GetCacheExpirationUnit;
            
            this.GetCacheExpirationValue = GetCacheExpirationValue;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.
        /// </summary>
        /// <returns>ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder</returns>
        public static ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder Builder()
        {
            return new ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder</returns>
        public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder With()
        {
            return Builder()
                .GetCacheExpirationUnit(GetCacheExpirationUnit)
                .GetCacheExpirationValue(GetCacheExpirationValue);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties</param>
        /// <param name="right">Compared (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties left, ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties</param>
        /// <param name="right">Compared (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties left, ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.
        /// </summary>
        public sealed class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _GetCacheExpirationUnit;
            private ConfigNodePropertyInteger _GetCacheExpirationValue;

            internal ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.GetCacheExpirationUnit property.
            /// </summary>
            /// <param name="value">GetCacheExpirationUnit</param>
            public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder GetCacheExpirationUnit(ConfigNodePropertyDropDown value)
            {
                _GetCacheExpirationUnit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.GetCacheExpirationValue property.
            /// </summary>
            /// <param name="value">GetCacheExpirationValue</param>
            public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder GetCacheExpirationValue(ConfigNodePropertyInteger value)
            {
                _GetCacheExpirationValue = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.
            /// </summary>
            /// <returns>ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties</returns>
            public ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties Build()
            {
                Validate();
                return new ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(
                    GetCacheExpirationUnit: _GetCacheExpirationUnit,
                    GetCacheExpirationValue: _GetCacheExpirationValue
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}