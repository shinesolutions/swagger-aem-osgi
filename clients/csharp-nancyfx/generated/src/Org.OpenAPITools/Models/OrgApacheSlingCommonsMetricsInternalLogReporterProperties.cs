using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsMetricsInternalLogReporterProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsMetricsInternalLogReporterProperties:  IEquatable<OrgApacheSlingCommonsMetricsInternalLogReporterProperties>
    { 
        /// <summary>
        /// Period
        /// </summary>
        public ConfigNodePropertyInteger Period { get; private set; }

        /// <summary>
        /// TimeUnit
        /// </summary>
        public ConfigNodePropertyDropDown TimeUnit { get; private set; }

        /// <summary>
        /// Level
        /// </summary>
        public ConfigNodePropertyDropDown Level { get; private set; }

        /// <summary>
        /// LoggerName
        /// </summary>
        public ConfigNodePropertyString LoggerName { get; private set; }

        /// <summary>
        /// Prefix
        /// </summary>
        public ConfigNodePropertyString Prefix { get; private set; }

        /// <summary>
        /// Pattern
        /// </summary>
        public ConfigNodePropertyString Pattern { get; private set; }

        /// <summary>
        /// RegistryName
        /// </summary>
        public ConfigNodePropertyString RegistryName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsMetricsInternalLogReporterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsMetricsInternalLogReporterProperties()
        {
        }

        private OrgApacheSlingCommonsMetricsInternalLogReporterProperties(ConfigNodePropertyInteger Period, ConfigNodePropertyDropDown TimeUnit, ConfigNodePropertyDropDown Level, ConfigNodePropertyString LoggerName, ConfigNodePropertyString Prefix, ConfigNodePropertyString Pattern, ConfigNodePropertyString RegistryName)
        {
            
            this.Period = Period;
            
            this.TimeUnit = TimeUnit;
            
            this.Level = Level;
            
            this.LoggerName = LoggerName;
            
            this.Prefix = Prefix;
            
            this.Pattern = Pattern;
            
            this.RegistryName = RegistryName;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsMetricsInternalLogReporterProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder</returns>
        public OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder With()
        {
            return Builder()
                .Period(Period)
                .TimeUnit(TimeUnit)
                .Level(Level)
                .LoggerName(LoggerName)
                .Prefix(Prefix)
                .Pattern(Pattern)
                .RegistryName(RegistryName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsMetricsInternalLogReporterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsMetricsInternalLogReporterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMetricsInternalLogReporterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMetricsInternalLogReporterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsMetricsInternalLogReporterProperties left, OrgApacheSlingCommonsMetricsInternalLogReporterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsMetricsInternalLogReporterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMetricsInternalLogReporterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMetricsInternalLogReporterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsMetricsInternalLogReporterProperties left, OrgApacheSlingCommonsMetricsInternalLogReporterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsMetricsInternalLogReporterProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Period;
            private ConfigNodePropertyDropDown _TimeUnit;
            private ConfigNodePropertyDropDown _Level;
            private ConfigNodePropertyString _LoggerName;
            private ConfigNodePropertyString _Prefix;
            private ConfigNodePropertyString _Pattern;
            private ConfigNodePropertyString _RegistryName;

            internal OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterProperties.Period property.
            /// </summary>
            /// <param name="value">Period</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder Period(ConfigNodePropertyInteger value)
            {
                _Period = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterProperties.TimeUnit property.
            /// </summary>
            /// <param name="value">TimeUnit</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder TimeUnit(ConfigNodePropertyDropDown value)
            {
                _TimeUnit = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterProperties.Level property.
            /// </summary>
            /// <param name="value">Level</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder Level(ConfigNodePropertyDropDown value)
            {
                _Level = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterProperties.LoggerName property.
            /// </summary>
            /// <param name="value">LoggerName</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder LoggerName(ConfigNodePropertyString value)
            {
                _LoggerName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterProperties.Prefix property.
            /// </summary>
            /// <param name="value">Prefix</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder Prefix(ConfigNodePropertyString value)
            {
                _Prefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterProperties.Pattern property.
            /// </summary>
            /// <param name="value">Pattern</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder Pattern(ConfigNodePropertyString value)
            {
                _Pattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterProperties.RegistryName property.
            /// </summary>
            /// <param name="value">RegistryName</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder RegistryName(ConfigNodePropertyString value)
            {
                _RegistryName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsMetricsInternalLogReporterProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsMetricsInternalLogReporterProperties</returns>
            public OrgApacheSlingCommonsMetricsInternalLogReporterProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsMetricsInternalLogReporterProperties(
                    Period: _Period,
                    TimeUnit: _TimeUnit,
                    Level: _Level,
                    LoggerName: _LoggerName,
                    Prefix: _Prefix,
                    Pattern: _Pattern,
                    RegistryName: _RegistryName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}