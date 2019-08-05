using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties
    /// </summary>
    public sealed class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties:  IEquatable<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }

        /// <summary>
        /// SchedulerConcurrent
        /// </summary>
        public ConfigNodePropertyBoolean SchedulerConcurrent { get; private set; }

        /// <summary>
        /// ChunkCleanupAge
        /// </summary>
        public ConfigNodePropertyInteger ChunkCleanupAge { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties()
        {
        }

        private OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties(ConfigNodePropertyString SchedulerExpression, ConfigNodePropertyBoolean SchedulerConcurrent, ConfigNodePropertyInteger ChunkCleanupAge)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
            this.SchedulerConcurrent = SchedulerConcurrent;
            
            this.ChunkCleanupAge = ChunkCleanupAge;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder</returns>
        public static OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder Builder()
        {
            return new OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder</returns>
        public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder With()
        {
            return Builder()
                .SchedulerExpression(SchedulerExpression)
                .SchedulerConcurrent(SchedulerConcurrent)
                .ChunkCleanupAge(ChunkCleanupAge);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties left, OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties left, OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.
        /// </summary>
        public sealed class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;
            private ConfigNodePropertyBoolean _SchedulerConcurrent;
            private ConfigNodePropertyInteger _ChunkCleanupAge;

            internal OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.SchedulerConcurrent property.
            /// </summary>
            /// <param name="value">SchedulerConcurrent</param>
            public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder SchedulerConcurrent(ConfigNodePropertyBoolean value)
            {
                _SchedulerConcurrent = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.ChunkCleanupAge property.
            /// </summary>
            /// <param name="value">ChunkCleanupAge</param>
            public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder ChunkCleanupAge(ConfigNodePropertyInteger value)
            {
                _ChunkCleanupAge = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.
            /// </summary>
            /// <returns>OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties</returns>
            public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties Build()
            {
                Validate();
                return new OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties(
                    SchedulerExpression: _SchedulerExpression,
                    SchedulerConcurrent: _SchedulerConcurrent,
                    ChunkCleanupAge: _ChunkCleanupAge
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}