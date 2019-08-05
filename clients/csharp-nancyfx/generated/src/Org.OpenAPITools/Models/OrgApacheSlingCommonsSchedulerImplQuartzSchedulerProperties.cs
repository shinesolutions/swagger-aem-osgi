using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties:  IEquatable<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties>
    { 
        /// <summary>
        /// PoolName
        /// </summary>
        public ConfigNodePropertyString PoolName { get; private set; }

        /// <summary>
        /// AllowedPoolNames
        /// </summary>
        public ConfigNodePropertyArray AllowedPoolNames { get; private set; }

        /// <summary>
        /// SchedulerUseleaderforsingle
        /// </summary>
        public ConfigNodePropertyBoolean SchedulerUseleaderforsingle { get; private set; }

        /// <summary>
        /// MetricsFilters
        /// </summary>
        public ConfigNodePropertyArray MetricsFilters { get; private set; }

        /// <summary>
        /// SlowThresholdMillis
        /// </summary>
        public ConfigNodePropertyInteger SlowThresholdMillis { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties()
        {
        }

        private OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(ConfigNodePropertyString PoolName, ConfigNodePropertyArray AllowedPoolNames, ConfigNodePropertyBoolean SchedulerUseleaderforsingle, ConfigNodePropertyArray MetricsFilters, ConfigNodePropertyInteger SlowThresholdMillis)
        {
            
            this.PoolName = PoolName;
            
            this.AllowedPoolNames = AllowedPoolNames;
            
            this.SchedulerUseleaderforsingle = SchedulerUseleaderforsingle;
            
            this.MetricsFilters = MetricsFilters;
            
            this.SlowThresholdMillis = SlowThresholdMillis;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder</returns>
        public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder With()
        {
            return Builder()
                .PoolName(PoolName)
                .AllowedPoolNames(AllowedPoolNames)
                .SchedulerUseleaderforsingle(SchedulerUseleaderforsingle)
                .MetricsFilters(MetricsFilters)
                .SlowThresholdMillis(SlowThresholdMillis);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties left, OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties left, OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder
        {
            private ConfigNodePropertyString _PoolName;
            private ConfigNodePropertyArray _AllowedPoolNames;
            private ConfigNodePropertyBoolean _SchedulerUseleaderforsingle;
            private ConfigNodePropertyArray _MetricsFilters;
            private ConfigNodePropertyInteger _SlowThresholdMillis;

            internal OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.PoolName property.
            /// </summary>
            /// <param name="value">PoolName</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder PoolName(ConfigNodePropertyString value)
            {
                _PoolName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.AllowedPoolNames property.
            /// </summary>
            /// <param name="value">AllowedPoolNames</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder AllowedPoolNames(ConfigNodePropertyArray value)
            {
                _AllowedPoolNames = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.SchedulerUseleaderforsingle property.
            /// </summary>
            /// <param name="value">SchedulerUseleaderforsingle</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder SchedulerUseleaderforsingle(ConfigNodePropertyBoolean value)
            {
                _SchedulerUseleaderforsingle = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.MetricsFilters property.
            /// </summary>
            /// <param name="value">MetricsFilters</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder MetricsFilters(ConfigNodePropertyArray value)
            {
                _MetricsFilters = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.SlowThresholdMillis property.
            /// </summary>
            /// <param name="value">SlowThresholdMillis</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder SlowThresholdMillis(ConfigNodePropertyInteger value)
            {
                _SlowThresholdMillis = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties</returns>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(
                    PoolName: _PoolName,
                    AllowedPoolNames: _AllowedPoolNames,
                    SchedulerUseleaderforsingle: _SchedulerUseleaderforsingle,
                    MetricsFilters: _MetricsFilters,
                    SlowThresholdMillis: _SlowThresholdMillis
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}