using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
    /// </summary>
    public sealed class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties:  IEquatable<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties>
    { 
        /// <summary>
        /// FelixMemoryusageDumpThreshold
        /// </summary>
        public ConfigNodePropertyInteger FelixMemoryusageDumpThreshold { get; private set; }

        /// <summary>
        /// FelixMemoryusageDumpInterval
        /// </summary>
        public ConfigNodePropertyInteger FelixMemoryusageDumpInterval { get; private set; }

        /// <summary>
        /// FelixMemoryusageDumpLocation
        /// </summary>
        public ConfigNodePropertyString FelixMemoryusageDumpLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties()
        {
        }

        private OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(ConfigNodePropertyInteger FelixMemoryusageDumpThreshold, ConfigNodePropertyInteger FelixMemoryusageDumpInterval, ConfigNodePropertyString FelixMemoryusageDumpLocation)
        {
            
            this.FelixMemoryusageDumpThreshold = FelixMemoryusageDumpThreshold;
            
            this.FelixMemoryusageDumpInterval = FelixMemoryusageDumpInterval;
            
            this.FelixMemoryusageDumpLocation = FelixMemoryusageDumpLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder</returns>
        public static OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder Builder()
        {
            return new OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder</returns>
        public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder With()
        {
            return Builder()
                .FelixMemoryusageDumpThreshold(FelixMemoryusageDumpThreshold)
                .FelixMemoryusageDumpInterval(FelixMemoryusageDumpInterval)
                .FelixMemoryusageDumpLocation(FelixMemoryusageDumpLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties left, OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties left, OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.
        /// </summary>
        public sealed class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder
        {
            private ConfigNodePropertyInteger _FelixMemoryusageDumpThreshold;
            private ConfigNodePropertyInteger _FelixMemoryusageDumpInterval;
            private ConfigNodePropertyString _FelixMemoryusageDumpLocation;

            internal OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.FelixMemoryusageDumpThreshold property.
            /// </summary>
            /// <param name="value">FelixMemoryusageDumpThreshold</param>
            public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder FelixMemoryusageDumpThreshold(ConfigNodePropertyInteger value)
            {
                _FelixMemoryusageDumpThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.FelixMemoryusageDumpInterval property.
            /// </summary>
            /// <param name="value">FelixMemoryusageDumpInterval</param>
            public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder FelixMemoryusageDumpInterval(ConfigNodePropertyInteger value)
            {
                _FelixMemoryusageDumpInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.FelixMemoryusageDumpLocation property.
            /// </summary>
            /// <param name="value">FelixMemoryusageDumpLocation</param>
            public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder FelixMemoryusageDumpLocation(ConfigNodePropertyString value)
            {
                _FelixMemoryusageDumpLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.
            /// </summary>
            /// <returns>OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties</returns>
            public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties Build()
            {
                Validate();
                return new OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(
                    FelixMemoryusageDumpThreshold: _FelixMemoryusageDumpThreshold,
                    FelixMemoryusageDumpInterval: _FelixMemoryusageDumpInterval,
                    FelixMemoryusageDumpLocation: _FelixMemoryusageDumpLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}