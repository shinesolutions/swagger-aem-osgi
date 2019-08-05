using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEventJobsQueueConfigurationProperties
    /// </summary>
    public sealed class OrgApacheSlingEventJobsQueueConfigurationProperties:  IEquatable<OrgApacheSlingEventJobsQueueConfigurationProperties>
    { 
        /// <summary>
        /// QueueName
        /// </summary>
        public ConfigNodePropertyString QueueName { get; private set; }

        /// <summary>
        /// QueueTopics
        /// </summary>
        public ConfigNodePropertyArray QueueTopics { get; private set; }

        /// <summary>
        /// QueueType
        /// </summary>
        public ConfigNodePropertyDropDown QueueType { get; private set; }

        /// <summary>
        /// QueuePriority
        /// </summary>
        public ConfigNodePropertyDropDown QueuePriority { get; private set; }

        /// <summary>
        /// QueueRetries
        /// </summary>
        public ConfigNodePropertyInteger QueueRetries { get; private set; }

        /// <summary>
        /// QueueRetrydelay
        /// </summary>
        public ConfigNodePropertyInteger QueueRetrydelay { get; private set; }

        /// <summary>
        /// QueueMaxparallel
        /// </summary>
        public ConfigNodePropertyFloat QueueMaxparallel { get; private set; }

        /// <summary>
        /// QueueKeepJobs
        /// </summary>
        public ConfigNodePropertyBoolean QueueKeepJobs { get; private set; }

        /// <summary>
        /// QueuePreferRunOnCreationInstance
        /// </summary>
        public ConfigNodePropertyBoolean QueuePreferRunOnCreationInstance { get; private set; }

        /// <summary>
        /// QueueThreadPoolSize
        /// </summary>
        public ConfigNodePropertyInteger QueueThreadPoolSize { get; private set; }

        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEventJobsQueueConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEventJobsQueueConfigurationProperties()
        {
        }

        private OrgApacheSlingEventJobsQueueConfigurationProperties(ConfigNodePropertyString QueueName, ConfigNodePropertyArray QueueTopics, ConfigNodePropertyDropDown QueueType, ConfigNodePropertyDropDown QueuePriority, ConfigNodePropertyInteger QueueRetries, ConfigNodePropertyInteger QueueRetrydelay, ConfigNodePropertyFloat QueueMaxparallel, ConfigNodePropertyBoolean QueueKeepJobs, ConfigNodePropertyBoolean QueuePreferRunOnCreationInstance, ConfigNodePropertyInteger QueueThreadPoolSize, ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.QueueName = QueueName;
            
            this.QueueTopics = QueueTopics;
            
            this.QueueType = QueueType;
            
            this.QueuePriority = QueuePriority;
            
            this.QueueRetries = QueueRetries;
            
            this.QueueRetrydelay = QueueRetrydelay;
            
            this.QueueMaxparallel = QueueMaxparallel;
            
            this.QueueKeepJobs = QueueKeepJobs;
            
            this.QueuePreferRunOnCreationInstance = QueuePreferRunOnCreationInstance;
            
            this.QueueThreadPoolSize = QueueThreadPoolSize;
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEventJobsQueueConfigurationProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder</returns>
        public static OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder</returns>
        public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder With()
        {
            return Builder()
                .QueueName(QueueName)
                .QueueTopics(QueueTopics)
                .QueueType(QueueType)
                .QueuePriority(QueuePriority)
                .QueueRetries(QueueRetries)
                .QueueRetrydelay(QueueRetrydelay)
                .QueueMaxparallel(QueueMaxparallel)
                .QueueKeepJobs(QueueKeepJobs)
                .QueuePreferRunOnCreationInstance(QueuePreferRunOnCreationInstance)
                .QueueThreadPoolSize(QueueThreadPoolSize)
                .ServiceRanking(ServiceRanking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEventJobsQueueConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEventJobsQueueConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventJobsQueueConfigurationProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventJobsQueueConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEventJobsQueueConfigurationProperties left, OrgApacheSlingEventJobsQueueConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEventJobsQueueConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventJobsQueueConfigurationProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventJobsQueueConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEventJobsQueueConfigurationProperties left, OrgApacheSlingEventJobsQueueConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEventJobsQueueConfigurationProperties.
        /// </summary>
        public sealed class OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder
        {
            private ConfigNodePropertyString _QueueName;
            private ConfigNodePropertyArray _QueueTopics;
            private ConfigNodePropertyDropDown _QueueType;
            private ConfigNodePropertyDropDown _QueuePriority;
            private ConfigNodePropertyInteger _QueueRetries;
            private ConfigNodePropertyInteger _QueueRetrydelay;
            private ConfigNodePropertyFloat _QueueMaxparallel;
            private ConfigNodePropertyBoolean _QueueKeepJobs;
            private ConfigNodePropertyBoolean _QueuePreferRunOnCreationInstance;
            private ConfigNodePropertyInteger _QueueThreadPoolSize;
            private ConfigNodePropertyInteger _ServiceRanking;

            internal OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueueName property.
            /// </summary>
            /// <param name="value">QueueName</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueueName(ConfigNodePropertyString value)
            {
                _QueueName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueueTopics property.
            /// </summary>
            /// <param name="value">QueueTopics</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueueTopics(ConfigNodePropertyArray value)
            {
                _QueueTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueueType property.
            /// </summary>
            /// <param name="value">QueueType</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueueType(ConfigNodePropertyDropDown value)
            {
                _QueueType = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueuePriority property.
            /// </summary>
            /// <param name="value">QueuePriority</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueuePriority(ConfigNodePropertyDropDown value)
            {
                _QueuePriority = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueueRetries property.
            /// </summary>
            /// <param name="value">QueueRetries</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueueRetries(ConfigNodePropertyInteger value)
            {
                _QueueRetries = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueueRetrydelay property.
            /// </summary>
            /// <param name="value">QueueRetrydelay</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueueRetrydelay(ConfigNodePropertyInteger value)
            {
                _QueueRetrydelay = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueueMaxparallel property.
            /// </summary>
            /// <param name="value">QueueMaxparallel</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueueMaxparallel(ConfigNodePropertyFloat value)
            {
                _QueueMaxparallel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueueKeepJobs property.
            /// </summary>
            /// <param name="value">QueueKeepJobs</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueueKeepJobs(ConfigNodePropertyBoolean value)
            {
                _QueueKeepJobs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueuePreferRunOnCreationInstance property.
            /// </summary>
            /// <param name="value">QueuePreferRunOnCreationInstance</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueuePreferRunOnCreationInstance(ConfigNodePropertyBoolean value)
            {
                _QueuePreferRunOnCreationInstance = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.QueueThreadPoolSize property.
            /// </summary>
            /// <param name="value">QueueThreadPoolSize</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder QueueThreadPoolSize(ConfigNodePropertyInteger value)
            {
                _QueueThreadPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEventJobsQueueConfigurationProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEventJobsQueueConfigurationProperties</returns>
            public OrgApacheSlingEventJobsQueueConfigurationProperties Build()
            {
                Validate();
                return new OrgApacheSlingEventJobsQueueConfigurationProperties(
                    QueueName: _QueueName,
                    QueueTopics: _QueueTopics,
                    QueueType: _QueueType,
                    QueuePriority: _QueuePriority,
                    QueueRetries: _QueueRetries,
                    QueueRetrydelay: _QueueRetrydelay,
                    QueueMaxparallel: _QueueMaxparallel,
                    QueueKeepJobs: _QueueKeepJobs,
                    QueuePreferRunOnCreationInstance: _QueuePreferRunOnCreationInstance,
                    QueueThreadPoolSize: _QueueThreadPoolSize,
                    ServiceRanking: _ServiceRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}