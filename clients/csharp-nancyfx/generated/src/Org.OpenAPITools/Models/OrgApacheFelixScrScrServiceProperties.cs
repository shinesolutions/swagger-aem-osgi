using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixScrScrServiceProperties
    /// </summary>
    public sealed class OrgApacheFelixScrScrServiceProperties:  IEquatable<OrgApacheFelixScrScrServiceProperties>
    { 
        /// <summary>
        /// DsLoglevel
        /// </summary>
        public ConfigNodePropertyDropDown DsLoglevel { get; private set; }

        /// <summary>
        /// DsFactoryEnabled
        /// </summary>
        public ConfigNodePropertyBoolean DsFactoryEnabled { get; private set; }

        /// <summary>
        /// DsDelayedKeepInstances
        /// </summary>
        public ConfigNodePropertyBoolean DsDelayedKeepInstances { get; private set; }

        /// <summary>
        /// DsLockTimeoutMilliseconds
        /// </summary>
        public ConfigNodePropertyInteger DsLockTimeoutMilliseconds { get; private set; }

        /// <summary>
        /// DsStopTimeoutMilliseconds
        /// </summary>
        public ConfigNodePropertyInteger DsStopTimeoutMilliseconds { get; private set; }

        /// <summary>
        /// DsGlobalExtender
        /// </summary>
        public ConfigNodePropertyBoolean DsGlobalExtender { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixScrScrServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixScrScrServiceProperties()
        {
        }

        private OrgApacheFelixScrScrServiceProperties(ConfigNodePropertyDropDown DsLoglevel, ConfigNodePropertyBoolean DsFactoryEnabled, ConfigNodePropertyBoolean DsDelayedKeepInstances, ConfigNodePropertyInteger DsLockTimeoutMilliseconds, ConfigNodePropertyInteger DsStopTimeoutMilliseconds, ConfigNodePropertyBoolean DsGlobalExtender)
        {
            
            this.DsLoglevel = DsLoglevel;
            
            this.DsFactoryEnabled = DsFactoryEnabled;
            
            this.DsDelayedKeepInstances = DsDelayedKeepInstances;
            
            this.DsLockTimeoutMilliseconds = DsLockTimeoutMilliseconds;
            
            this.DsStopTimeoutMilliseconds = DsStopTimeoutMilliseconds;
            
            this.DsGlobalExtender = DsGlobalExtender;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixScrScrServiceProperties.
        /// </summary>
        /// <returns>OrgApacheFelixScrScrServicePropertiesBuilder</returns>
        public static OrgApacheFelixScrScrServicePropertiesBuilder Builder()
        {
            return new OrgApacheFelixScrScrServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixScrScrServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixScrScrServicePropertiesBuilder</returns>
        public OrgApacheFelixScrScrServicePropertiesBuilder With()
        {
            return Builder()
                .DsLoglevel(DsLoglevel)
                .DsFactoryEnabled(DsFactoryEnabled)
                .DsDelayedKeepInstances(DsDelayedKeepInstances)
                .DsLockTimeoutMilliseconds(DsLockTimeoutMilliseconds)
                .DsStopTimeoutMilliseconds(DsStopTimeoutMilliseconds)
                .DsGlobalExtender(DsGlobalExtender);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixScrScrServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixScrScrServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixScrScrServiceProperties</param>
        /// <param name="right">Compared (OrgApacheFelixScrScrServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixScrScrServiceProperties left, OrgApacheFelixScrScrServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixScrScrServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixScrScrServiceProperties</param>
        /// <param name="right">Compared (OrgApacheFelixScrScrServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixScrScrServiceProperties left, OrgApacheFelixScrScrServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixScrScrServiceProperties.
        /// </summary>
        public sealed class OrgApacheFelixScrScrServicePropertiesBuilder
        {
            private ConfigNodePropertyDropDown _DsLoglevel;
            private ConfigNodePropertyBoolean _DsFactoryEnabled;
            private ConfigNodePropertyBoolean _DsDelayedKeepInstances;
            private ConfigNodePropertyInteger _DsLockTimeoutMilliseconds;
            private ConfigNodePropertyInteger _DsStopTimeoutMilliseconds;
            private ConfigNodePropertyBoolean _DsGlobalExtender;

            internal OrgApacheFelixScrScrServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceProperties.DsLoglevel property.
            /// </summary>
            /// <param name="value">DsLoglevel</param>
            public OrgApacheFelixScrScrServicePropertiesBuilder DsLoglevel(ConfigNodePropertyDropDown value)
            {
                _DsLoglevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceProperties.DsFactoryEnabled property.
            /// </summary>
            /// <param name="value">DsFactoryEnabled</param>
            public OrgApacheFelixScrScrServicePropertiesBuilder DsFactoryEnabled(ConfigNodePropertyBoolean value)
            {
                _DsFactoryEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceProperties.DsDelayedKeepInstances property.
            /// </summary>
            /// <param name="value">DsDelayedKeepInstances</param>
            public OrgApacheFelixScrScrServicePropertiesBuilder DsDelayedKeepInstances(ConfigNodePropertyBoolean value)
            {
                _DsDelayedKeepInstances = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceProperties.DsLockTimeoutMilliseconds property.
            /// </summary>
            /// <param name="value">DsLockTimeoutMilliseconds</param>
            public OrgApacheFelixScrScrServicePropertiesBuilder DsLockTimeoutMilliseconds(ConfigNodePropertyInteger value)
            {
                _DsLockTimeoutMilliseconds = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceProperties.DsStopTimeoutMilliseconds property.
            /// </summary>
            /// <param name="value">DsStopTimeoutMilliseconds</param>
            public OrgApacheFelixScrScrServicePropertiesBuilder DsStopTimeoutMilliseconds(ConfigNodePropertyInteger value)
            {
                _DsStopTimeoutMilliseconds = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixScrScrServiceProperties.DsGlobalExtender property.
            /// </summary>
            /// <param name="value">DsGlobalExtender</param>
            public OrgApacheFelixScrScrServicePropertiesBuilder DsGlobalExtender(ConfigNodePropertyBoolean value)
            {
                _DsGlobalExtender = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixScrScrServiceProperties.
            /// </summary>
            /// <returns>OrgApacheFelixScrScrServiceProperties</returns>
            public OrgApacheFelixScrScrServiceProperties Build()
            {
                Validate();
                return new OrgApacheFelixScrScrServiceProperties(
                    DsLoglevel: _DsLoglevel,
                    DsFactoryEnabled: _DsFactoryEnabled,
                    DsDelayedKeepInstances: _DsDelayedKeepInstances,
                    DsLockTimeoutMilliseconds: _DsLockTimeoutMilliseconds,
                    DsStopTimeoutMilliseconds: _DsStopTimeoutMilliseconds,
                    DsGlobalExtender: _DsGlobalExtender
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}