using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEventImplJobsDefaultJobManagerProperties
    /// </summary>
    public sealed class OrgApacheSlingEventImplJobsDefaultJobManagerProperties:  IEquatable<OrgApacheSlingEventImplJobsDefaultJobManagerProperties>
    { 
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
        public ConfigNodePropertyInteger QueueMaxparallel { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEventImplJobsDefaultJobManagerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEventImplJobsDefaultJobManagerProperties()
        {
        }

        private OrgApacheSlingEventImplJobsDefaultJobManagerProperties(ConfigNodePropertyDropDown QueuePriority, ConfigNodePropertyInteger QueueRetries, ConfigNodePropertyInteger QueueRetrydelay, ConfigNodePropertyInteger QueueMaxparallel)
        {
            
            this.QueuePriority = QueuePriority;
            
            this.QueueRetries = QueueRetries;
            
            this.QueueRetrydelay = QueueRetrydelay;
            
            this.QueueMaxparallel = QueueMaxparallel;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEventImplJobsDefaultJobManagerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder</returns>
        public static OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder</returns>
        public OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder With()
        {
            return Builder()
                .QueuePriority(QueuePriority)
                .QueueRetries(QueueRetries)
                .QueueRetrydelay(QueueRetrydelay)
                .QueueMaxparallel(QueueMaxparallel);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEventImplJobsDefaultJobManagerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEventImplJobsDefaultJobManagerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsDefaultJobManagerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsDefaultJobManagerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEventImplJobsDefaultJobManagerProperties left, OrgApacheSlingEventImplJobsDefaultJobManagerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEventImplJobsDefaultJobManagerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsDefaultJobManagerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsDefaultJobManagerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEventImplJobsDefaultJobManagerProperties left, OrgApacheSlingEventImplJobsDefaultJobManagerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEventImplJobsDefaultJobManagerProperties.
        /// </summary>
        public sealed class OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _QueuePriority;
            private ConfigNodePropertyInteger _QueueRetries;
            private ConfigNodePropertyInteger _QueueRetrydelay;
            private ConfigNodePropertyInteger _QueueMaxparallel;

            internal OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsDefaultJobManagerProperties.QueuePriority property.
            /// </summary>
            /// <param name="value">QueuePriority</param>
            public OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder QueuePriority(ConfigNodePropertyDropDown value)
            {
                _QueuePriority = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsDefaultJobManagerProperties.QueueRetries property.
            /// </summary>
            /// <param name="value">QueueRetries</param>
            public OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder QueueRetries(ConfigNodePropertyInteger value)
            {
                _QueueRetries = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsDefaultJobManagerProperties.QueueRetrydelay property.
            /// </summary>
            /// <param name="value">QueueRetrydelay</param>
            public OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder QueueRetrydelay(ConfigNodePropertyInteger value)
            {
                _QueueRetrydelay = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsDefaultJobManagerProperties.QueueMaxparallel property.
            /// </summary>
            /// <param name="value">QueueMaxparallel</param>
            public OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder QueueMaxparallel(ConfigNodePropertyInteger value)
            {
                _QueueMaxparallel = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEventImplJobsDefaultJobManagerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEventImplJobsDefaultJobManagerProperties</returns>
            public OrgApacheSlingEventImplJobsDefaultJobManagerProperties Build()
            {
                Validate();
                return new OrgApacheSlingEventImplJobsDefaultJobManagerProperties(
                    QueuePriority: _QueuePriority,
                    QueueRetries: _QueueRetries,
                    QueueRetrydelay: _QueueRetrydelay,
                    QueueMaxparallel: _QueueMaxparallel
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}