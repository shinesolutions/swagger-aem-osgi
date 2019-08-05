using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties:  IEquatable<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties>
    { 
        /// <summary>
        /// MaxQuartzJobDurationAcceptable
        /// </summary>
        public ConfigNodePropertyInteger MaxQuartzJobDurationAcceptable { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties()
        {
        }

        private OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(ConfigNodePropertyInteger MaxQuartzJobDurationAcceptable)
        {
            
            this.MaxQuartzJobDurationAcceptable = MaxQuartzJobDurationAcceptable;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder</returns>
        public OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .MaxQuartzJobDurationAcceptable(MaxQuartzJobDurationAcceptable);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties left, OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties left, OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxQuartzJobDurationAcceptable;

            internal OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.MaxQuartzJobDurationAcceptable property.
            /// </summary>
            /// <param name="value">MaxQuartzJobDurationAcceptable</param>
            public OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder MaxQuartzJobDurationAcceptable(ConfigNodePropertyInteger value)
            {
                _MaxQuartzJobDurationAcceptable = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties</returns>
            public OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(
                    MaxQuartzJobDurationAcceptable: _MaxQuartzJobDurationAcceptable
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}