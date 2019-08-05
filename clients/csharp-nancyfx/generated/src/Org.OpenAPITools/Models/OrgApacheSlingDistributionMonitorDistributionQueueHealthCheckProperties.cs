using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties:  IEquatable<OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties>
    { 
        /// <summary>
        /// HcName
        /// </summary>
        public ConfigNodePropertyString HcName { get; private set; }

        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// HcMbeanName
        /// </summary>
        public ConfigNodePropertyString HcMbeanName { get; private set; }

        /// <summary>
        /// NumberOfRetriesAllowed
        /// </summary>
        public ConfigNodePropertyInteger NumberOfRetriesAllowed { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties()
        {
        }

        private OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties(ConfigNodePropertyString HcName, ConfigNodePropertyArray HcTags, ConfigNodePropertyString HcMbeanName, ConfigNodePropertyInteger NumberOfRetriesAllowed)
        {
            
            this.HcName = HcName;
            
            this.HcTags = HcTags;
            
            this.HcMbeanName = HcMbeanName;
            
            this.NumberOfRetriesAllowed = NumberOfRetriesAllowed;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder</returns>
        public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcName(HcName)
                .HcTags(HcTags)
                .HcMbeanName(HcMbeanName)
                .NumberOfRetriesAllowed(NumberOfRetriesAllowed);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties left, OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties left, OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyString _HcName;
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _HcMbeanName;
            private ConfigNodePropertyInteger _NumberOfRetriesAllowed;

            internal OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.HcName property.
            /// </summary>
            /// <param name="value">HcName</param>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder HcName(ConfigNodePropertyString value)
            {
                _HcName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.HcMbeanName property.
            /// </summary>
            /// <param name="value">HcMbeanName</param>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder HcMbeanName(ConfigNodePropertyString value)
            {
                _HcMbeanName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.NumberOfRetriesAllowed property.
            /// </summary>
            /// <param name="value">NumberOfRetriesAllowed</param>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder NumberOfRetriesAllowed(ConfigNodePropertyInteger value)
            {
                _NumberOfRetriesAllowed = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties</returns>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties(
                    HcName: _HcName,
                    HcTags: _HcTags,
                    HcMbeanName: _HcMbeanName,
                    NumberOfRetriesAllowed: _NumberOfRetriesAllowed
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}