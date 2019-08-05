using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
    /// </summary>
    public sealed class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties:  IEquatable<OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties>
    { 
        /// <summary>
        /// JobConsumermanagerDisableDistribution
        /// </summary>
        public ConfigNodePropertyBoolean JobConsumermanagerDisableDistribution { get; private set; }

        /// <summary>
        /// StartupDelay
        /// </summary>
        public ConfigNodePropertyInteger StartupDelay { get; private set; }

        /// <summary>
        /// CleanupPeriod
        /// </summary>
        public ConfigNodePropertyInteger CleanupPeriod { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties()
        {
        }

        private OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(ConfigNodePropertyBoolean JobConsumermanagerDisableDistribution, ConfigNodePropertyInteger StartupDelay, ConfigNodePropertyInteger CleanupPeriod)
        {
            
            this.JobConsumermanagerDisableDistribution = JobConsumermanagerDisableDistribution;
            
            this.StartupDelay = StartupDelay;
            
            this.CleanupPeriod = CleanupPeriod;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder</returns>
        public static OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder</returns>
        public OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder With()
        {
            return Builder()
                .JobConsumermanagerDisableDistribution(JobConsumermanagerDisableDistribution)
                .StartupDelay(StartupDelay)
                .CleanupPeriod(CleanupPeriod);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties left, OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties left, OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.
        /// </summary>
        public sealed class OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _JobConsumermanagerDisableDistribution;
            private ConfigNodePropertyInteger _StartupDelay;
            private ConfigNodePropertyInteger _CleanupPeriod;

            internal OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.JobConsumermanagerDisableDistribution property.
            /// </summary>
            /// <param name="value">JobConsumermanagerDisableDistribution</param>
            public OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder JobConsumermanagerDisableDistribution(ConfigNodePropertyBoolean value)
            {
                _JobConsumermanagerDisableDistribution = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.StartupDelay property.
            /// </summary>
            /// <param name="value">StartupDelay</param>
            public OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder StartupDelay(ConfigNodePropertyInteger value)
            {
                _StartupDelay = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.CleanupPeriod property.
            /// </summary>
            /// <param name="value">CleanupPeriod</param>
            public OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder CleanupPeriod(ConfigNodePropertyInteger value)
            {
                _CleanupPeriod = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties</returns>
            public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties Build()
            {
                Validate();
                return new OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(
                    JobConsumermanagerDisableDistribution: _JobConsumermanagerDisableDistribution,
                    StartupDelay: _StartupDelay,
                    CleanupPeriod: _CleanupPeriod
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}