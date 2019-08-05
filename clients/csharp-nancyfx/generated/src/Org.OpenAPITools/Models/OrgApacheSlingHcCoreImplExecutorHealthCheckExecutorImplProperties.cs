using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties:  IEquatable<OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties>
    { 
        /// <summary>
        /// TimeoutInMs
        /// </summary>
        public ConfigNodePropertyInteger TimeoutInMs { get; private set; }

        /// <summary>
        /// LongRunningFutureThresholdForCriticalMs
        /// </summary>
        public ConfigNodePropertyInteger LongRunningFutureThresholdForCriticalMs { get; private set; }

        /// <summary>
        /// ResultCacheTtlInMs
        /// </summary>
        public ConfigNodePropertyInteger ResultCacheTtlInMs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties()
        {
        }

        private OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(ConfigNodePropertyInteger TimeoutInMs, ConfigNodePropertyInteger LongRunningFutureThresholdForCriticalMs, ConfigNodePropertyInteger ResultCacheTtlInMs)
        {
            
            this.TimeoutInMs = TimeoutInMs;
            
            this.LongRunningFutureThresholdForCriticalMs = LongRunningFutureThresholdForCriticalMs;
            
            this.ResultCacheTtlInMs = ResultCacheTtlInMs;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder</returns>
        public static OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder</returns>
        public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder With()
        {
            return Builder()
                .TimeoutInMs(TimeoutInMs)
                .LongRunningFutureThresholdForCriticalMs(LongRunningFutureThresholdForCriticalMs)
                .ResultCacheTtlInMs(ResultCacheTtlInMs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties left, OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties left, OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _TimeoutInMs;
            private ConfigNodePropertyInteger _LongRunningFutureThresholdForCriticalMs;
            private ConfigNodePropertyInteger _ResultCacheTtlInMs;

            internal OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.TimeoutInMs property.
            /// </summary>
            /// <param name="value">TimeoutInMs</param>
            public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder TimeoutInMs(ConfigNodePropertyInteger value)
            {
                _TimeoutInMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.LongRunningFutureThresholdForCriticalMs property.
            /// </summary>
            /// <param name="value">LongRunningFutureThresholdForCriticalMs</param>
            public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder LongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger value)
            {
                _LongRunningFutureThresholdForCriticalMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.ResultCacheTtlInMs property.
            /// </summary>
            /// <param name="value">ResultCacheTtlInMs</param>
            public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder ResultCacheTtlInMs(ConfigNodePropertyInteger value)
            {
                _ResultCacheTtlInMs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties</returns>
            public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(
                    TimeoutInMs: _TimeoutInMs,
                    LongRunningFutureThresholdForCriticalMs: _LongRunningFutureThresholdForCriticalMs,
                    ResultCacheTtlInMs: _ResultCacheTtlInMs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}