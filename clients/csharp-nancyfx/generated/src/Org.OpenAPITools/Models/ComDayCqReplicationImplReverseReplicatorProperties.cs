using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplReverseReplicatorProperties
    /// </summary>
    public sealed class ComDayCqReplicationImplReverseReplicatorProperties:  IEquatable<ComDayCqReplicationImplReverseReplicatorProperties>
    { 
        /// <summary>
        /// SchedulerPeriod
        /// </summary>
        public ConfigNodePropertyInteger SchedulerPeriod { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplReverseReplicatorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplReverseReplicatorProperties()
        {
        }

        private ComDayCqReplicationImplReverseReplicatorProperties(ConfigNodePropertyInteger SchedulerPeriod)
        {
            
            this.SchedulerPeriod = SchedulerPeriod;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplReverseReplicatorProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReverseReplicatorPropertiesBuilder</returns>
        public static ComDayCqReplicationImplReverseReplicatorPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationImplReverseReplicatorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplReverseReplicatorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReverseReplicatorPropertiesBuilder</returns>
        public ComDayCqReplicationImplReverseReplicatorPropertiesBuilder With()
        {
            return Builder()
                .SchedulerPeriod(SchedulerPeriod);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationImplReverseReplicatorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplReverseReplicatorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReverseReplicatorProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReverseReplicatorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplReverseReplicatorProperties left, ComDayCqReplicationImplReverseReplicatorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplReverseReplicatorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReverseReplicatorProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReverseReplicatorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplReverseReplicatorProperties left, ComDayCqReplicationImplReverseReplicatorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplReverseReplicatorProperties.
        /// </summary>
        public sealed class ComDayCqReplicationImplReverseReplicatorPropertiesBuilder
        {
            private ConfigNodePropertyInteger _SchedulerPeriod;

            internal ComDayCqReplicationImplReverseReplicatorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReverseReplicatorProperties.SchedulerPeriod property.
            /// </summary>
            /// <param name="value">SchedulerPeriod</param>
            public ComDayCqReplicationImplReverseReplicatorPropertiesBuilder SchedulerPeriod(ConfigNodePropertyInteger value)
            {
                _SchedulerPeriod = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplReverseReplicatorProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationImplReverseReplicatorProperties</returns>
            public ComDayCqReplicationImplReverseReplicatorProperties Build()
            {
                Validate();
                return new ComDayCqReplicationImplReverseReplicatorProperties(
                    SchedulerPeriod: _SchedulerPeriod
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}