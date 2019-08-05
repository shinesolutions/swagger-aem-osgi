using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadySystemReadyMonitorProperties
    /// </summary>
    public sealed class OrgApacheFelixSystemreadySystemReadyMonitorProperties:  IEquatable<OrgApacheFelixSystemreadySystemReadyMonitorProperties>
    { 
        /// <summary>
        /// PollInterval
        /// </summary>
        public ConfigNodePropertyInteger PollInterval { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixSystemreadySystemReadyMonitorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadySystemReadyMonitorProperties()
        {
        }

        private OrgApacheFelixSystemreadySystemReadyMonitorProperties(ConfigNodePropertyInteger PollInterval)
        {
            
            this.PollInterval = PollInterval;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadySystemReadyMonitorProperties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder</returns>
        public static OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder Builder()
        {
            return new OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder</returns>
        public OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder With()
        {
            return Builder()
                .PollInterval(PollInterval);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixSystemreadySystemReadyMonitorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadySystemReadyMonitorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadySystemReadyMonitorProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadySystemReadyMonitorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadySystemReadyMonitorProperties left, OrgApacheFelixSystemreadySystemReadyMonitorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadySystemReadyMonitorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadySystemReadyMonitorProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadySystemReadyMonitorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadySystemReadyMonitorProperties left, OrgApacheFelixSystemreadySystemReadyMonitorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadySystemReadyMonitorProperties.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder
        {
            private ConfigNodePropertyInteger _PollInterval;

            internal OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadySystemReadyMonitorProperties.PollInterval property.
            /// </summary>
            /// <param name="value">PollInterval</param>
            public OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder PollInterval(ConfigNodePropertyInteger value)
            {
                _PollInterval = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadySystemReadyMonitorProperties.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadySystemReadyMonitorProperties</returns>
            public OrgApacheFelixSystemreadySystemReadyMonitorProperties Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadySystemReadyMonitorProperties(
                    PollInterval: _PollInterval
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}