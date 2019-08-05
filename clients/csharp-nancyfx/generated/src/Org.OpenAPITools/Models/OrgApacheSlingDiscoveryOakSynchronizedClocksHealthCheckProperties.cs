using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties
    /// </summary>
    public sealed class OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties:  IEquatable<OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties>
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
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties()
        {
        }

        private OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties(ConfigNodePropertyString HcName, ConfigNodePropertyArray HcTags, ConfigNodePropertyString HcMbeanName)
        {
            
            this.HcName = HcName;
            
            this.HcTags = HcTags;
            
            this.HcMbeanName = HcMbeanName;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder</returns>
        public static OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder</returns>
        public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcName(HcName)
                .HcTags(HcTags)
                .HcMbeanName(HcMbeanName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties left, OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties left, OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.
        /// </summary>
        public sealed class OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyString _HcName;
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _HcMbeanName;

            internal OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.HcName property.
            /// </summary>
            /// <param name="value">HcName</param>
            public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder HcName(ConfigNodePropertyString value)
            {
                _HcName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.HcMbeanName property.
            /// </summary>
            /// <param name="value">HcMbeanName</param>
            public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesBuilder HcMbeanName(ConfigNodePropertyString value)
            {
                _HcMbeanName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties</returns>
            public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties Build()
            {
                Validate();
                return new OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties(
                    HcName: _HcName,
                    HcTags: _HcTags,
                    HcMbeanName: _HcMbeanName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}