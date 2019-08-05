using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties:  IEquatable<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties>
    { 
        /// <summary>
        /// OrgApacheSlingInstallerConfigurationPersist
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheSlingInstallerConfigurationPersist { get; private set; }

        /// <summary>
        /// Mode
        /// </summary>
        public ConfigNodePropertyDropDown Mode { get; private set; }

        /// <summary>
        /// Port
        /// </summary>
        public ConfigNodePropertyInteger Port { get; private set; }

        /// <summary>
        /// PrimaryHost
        /// </summary>
        public ConfigNodePropertyString PrimaryHost { get; private set; }

        /// <summary>
        /// Interval
        /// </summary>
        public ConfigNodePropertyInteger Interval { get; private set; }

        /// <summary>
        /// PrimaryAllowedClientIpRanges
        /// </summary>
        public ConfigNodePropertyArray PrimaryAllowedClientIpRanges { get; private set; }

        /// <summary>
        /// Secure
        /// </summary>
        public ConfigNodePropertyBoolean Secure { get; private set; }

        /// <summary>
        /// StandbyReadtimeout
        /// </summary>
        public ConfigNodePropertyInteger StandbyReadtimeout { get; private set; }

        /// <summary>
        /// StandbyAutoclean
        /// </summary>
        public ConfigNodePropertyBoolean StandbyAutoclean { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties()
        {
        }

        private OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(ConfigNodePropertyBoolean OrgApacheSlingInstallerConfigurationPersist, ConfigNodePropertyDropDown Mode, ConfigNodePropertyInteger Port, ConfigNodePropertyString PrimaryHost, ConfigNodePropertyInteger Interval, ConfigNodePropertyArray PrimaryAllowedClientIpRanges, ConfigNodePropertyBoolean Secure, ConfigNodePropertyInteger StandbyReadtimeout, ConfigNodePropertyBoolean StandbyAutoclean)
        {
            
            this.OrgApacheSlingInstallerConfigurationPersist = OrgApacheSlingInstallerConfigurationPersist;
            
            this.Mode = Mode;
            
            this.Port = Port;
            
            this.PrimaryHost = PrimaryHost;
            
            this.Interval = Interval;
            
            this.PrimaryAllowedClientIpRanges = PrimaryAllowedClientIpRanges;
            
            this.Secure = Secure;
            
            this.StandbyReadtimeout = StandbyReadtimeout;
            
            this.StandbyAutoclean = StandbyAutoclean;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder With()
        {
            return Builder()
                .OrgApacheSlingInstallerConfigurationPersist(OrgApacheSlingInstallerConfigurationPersist)
                .Mode(Mode)
                .Port(Port)
                .PrimaryHost(PrimaryHost)
                .Interval(Interval)
                .PrimaryAllowedClientIpRanges(PrimaryAllowedClientIpRanges)
                .Secure(Secure)
                .StandbyReadtimeout(StandbyReadtimeout)
                .StandbyAutoclean(StandbyAutoclean);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties left, OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties left, OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder
        {
            private ConfigNodePropertyBoolean _OrgApacheSlingInstallerConfigurationPersist;
            private ConfigNodePropertyDropDown _Mode;
            private ConfigNodePropertyInteger _Port;
            private ConfigNodePropertyString _PrimaryHost;
            private ConfigNodePropertyInteger _Interval;
            private ConfigNodePropertyArray _PrimaryAllowedClientIpRanges;
            private ConfigNodePropertyBoolean _Secure;
            private ConfigNodePropertyInteger _StandbyReadtimeout;
            private ConfigNodePropertyBoolean _StandbyAutoclean;

            internal OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.OrgApacheSlingInstallerConfigurationPersist property.
            /// </summary>
            /// <param name="value">OrgApacheSlingInstallerConfigurationPersist</param>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder OrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean value)
            {
                _OrgApacheSlingInstallerConfigurationPersist = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.Mode property.
            /// </summary>
            /// <param name="value">Mode</param>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder Mode(ConfigNodePropertyDropDown value)
            {
                _Mode = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.Port property.
            /// </summary>
            /// <param name="value">Port</param>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder Port(ConfigNodePropertyInteger value)
            {
                _Port = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.PrimaryHost property.
            /// </summary>
            /// <param name="value">PrimaryHost</param>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder PrimaryHost(ConfigNodePropertyString value)
            {
                _PrimaryHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.Interval property.
            /// </summary>
            /// <param name="value">Interval</param>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder Interval(ConfigNodePropertyInteger value)
            {
                _Interval = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.PrimaryAllowedClientIpRanges property.
            /// </summary>
            /// <param name="value">PrimaryAllowedClientIpRanges</param>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder PrimaryAllowedClientIpRanges(ConfigNodePropertyArray value)
            {
                _PrimaryAllowedClientIpRanges = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.Secure property.
            /// </summary>
            /// <param name="value">Secure</param>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder Secure(ConfigNodePropertyBoolean value)
            {
                _Secure = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.StandbyReadtimeout property.
            /// </summary>
            /// <param name="value">StandbyReadtimeout</param>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder StandbyReadtimeout(ConfigNodePropertyInteger value)
            {
                _StandbyReadtimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.StandbyAutoclean property.
            /// </summary>
            /// <param name="value">StandbyAutoclean</param>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder StandbyAutoclean(ConfigNodePropertyBoolean value)
            {
                _StandbyAutoclean = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties</returns>
            public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(
                    OrgApacheSlingInstallerConfigurationPersist: _OrgApacheSlingInstallerConfigurationPersist,
                    Mode: _Mode,
                    Port: _Port,
                    PrimaryHost: _PrimaryHost,
                    Interval: _Interval,
                    PrimaryAllowedClientIpRanges: _PrimaryAllowedClientIpRanges,
                    Secure: _Secure,
                    StandbyReadtimeout: _StandbyReadtimeout,
                    StandbyAutoclean: _StandbyAutoclean
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}