using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEventImplJobsJobConsumerManagerProperties
    /// </summary>
    public sealed class OrgApacheSlingEventImplJobsJobConsumerManagerProperties:  IEquatable<OrgApacheSlingEventImplJobsJobConsumerManagerProperties>
    { 
        /// <summary>
        /// OrgApacheSlingInstallerConfigurationPersist
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheSlingInstallerConfigurationPersist { get; private set; }

        /// <summary>
        /// JobConsumermanagerWhitelist
        /// </summary>
        public ConfigNodePropertyArray JobConsumermanagerWhitelist { get; private set; }

        /// <summary>
        /// JobConsumermanagerBlacklist
        /// </summary>
        public ConfigNodePropertyArray JobConsumermanagerBlacklist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEventImplJobsJobConsumerManagerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEventImplJobsJobConsumerManagerProperties()
        {
        }

        private OrgApacheSlingEventImplJobsJobConsumerManagerProperties(ConfigNodePropertyBoolean OrgApacheSlingInstallerConfigurationPersist, ConfigNodePropertyArray JobConsumermanagerWhitelist, ConfigNodePropertyArray JobConsumermanagerBlacklist)
        {
            
            this.OrgApacheSlingInstallerConfigurationPersist = OrgApacheSlingInstallerConfigurationPersist;
            
            this.JobConsumermanagerWhitelist = JobConsumermanagerWhitelist;
            
            this.JobConsumermanagerBlacklist = JobConsumermanagerBlacklist;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEventImplJobsJobConsumerManagerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder</returns>
        public static OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder</returns>
        public OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheSlingInstallerConfigurationPersist(OrgApacheSlingInstallerConfigurationPersist)
                .JobConsumermanagerWhitelist(JobConsumermanagerWhitelist)
                .JobConsumermanagerBlacklist(JobConsumermanagerBlacklist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEventImplJobsJobConsumerManagerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEventImplJobsJobConsumerManagerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsJobConsumerManagerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsJobConsumerManagerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEventImplJobsJobConsumerManagerProperties left, OrgApacheSlingEventImplJobsJobConsumerManagerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEventImplJobsJobConsumerManagerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsJobConsumerManagerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsJobConsumerManagerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEventImplJobsJobConsumerManagerProperties left, OrgApacheSlingEventImplJobsJobConsumerManagerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEventImplJobsJobConsumerManagerProperties.
        /// </summary>
        public sealed class OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _OrgApacheSlingInstallerConfigurationPersist;
            private ConfigNodePropertyArray _JobConsumermanagerWhitelist;
            private ConfigNodePropertyArray _JobConsumermanagerBlacklist;

            internal OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJobConsumerManagerProperties.OrgApacheSlingInstallerConfigurationPersist property.
            /// </summary>
            /// <param name="value">OrgApacheSlingInstallerConfigurationPersist</param>
            public OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder OrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean value)
            {
                _OrgApacheSlingInstallerConfigurationPersist = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJobConsumerManagerProperties.JobConsumermanagerWhitelist property.
            /// </summary>
            /// <param name="value">JobConsumermanagerWhitelist</param>
            public OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder JobConsumermanagerWhitelist(ConfigNodePropertyArray value)
            {
                _JobConsumermanagerWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJobConsumerManagerProperties.JobConsumermanagerBlacklist property.
            /// </summary>
            /// <param name="value">JobConsumermanagerBlacklist</param>
            public OrgApacheSlingEventImplJobsJobConsumerManagerPropertiesBuilder JobConsumermanagerBlacklist(ConfigNodePropertyArray value)
            {
                _JobConsumermanagerBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEventImplJobsJobConsumerManagerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEventImplJobsJobConsumerManagerProperties</returns>
            public OrgApacheSlingEventImplJobsJobConsumerManagerProperties Build()
            {
                Validate();
                return new OrgApacheSlingEventImplJobsJobConsumerManagerProperties(
                    OrgApacheSlingInstallerConfigurationPersist: _OrgApacheSlingInstallerConfigurationPersist,
                    JobConsumermanagerWhitelist: _JobConsumermanagerWhitelist,
                    JobConsumermanagerBlacklist: _JobConsumermanagerBlacklist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}