using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReportingImplConfigServiceImplProperties
    /// </summary>
    public sealed class ComDayCqReportingImplConfigServiceImplProperties:  IEquatable<ComDayCqReportingImplConfigServiceImplProperties>
    { 
        /// <summary>
        /// RepconfTimezone
        /// </summary>
        public ConfigNodePropertyString RepconfTimezone { get; private set; }

        /// <summary>
        /// RepconfLocale
        /// </summary>
        public ConfigNodePropertyString RepconfLocale { get; private set; }

        /// <summary>
        /// RepconfSnapshots
        /// </summary>
        public ConfigNodePropertyString RepconfSnapshots { get; private set; }

        /// <summary>
        /// RepconfRepdir
        /// </summary>
        public ConfigNodePropertyString RepconfRepdir { get; private set; }

        /// <summary>
        /// RepconfHourofday
        /// </summary>
        public ConfigNodePropertyInteger RepconfHourofday { get; private set; }

        /// <summary>
        /// RepconfMinofhour
        /// </summary>
        public ConfigNodePropertyInteger RepconfMinofhour { get; private set; }

        /// <summary>
        /// RepconfMaxrows
        /// </summary>
        public ConfigNodePropertyInteger RepconfMaxrows { get; private set; }

        /// <summary>
        /// RepconfFakedata
        /// </summary>
        public ConfigNodePropertyBoolean RepconfFakedata { get; private set; }

        /// <summary>
        /// RepconfSnapshotuser
        /// </summary>
        public ConfigNodePropertyString RepconfSnapshotuser { get; private set; }

        /// <summary>
        /// RepconfEnforcesnapshotuser
        /// </summary>
        public ConfigNodePropertyBoolean RepconfEnforcesnapshotuser { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReportingImplConfigServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReportingImplConfigServiceImplProperties()
        {
        }

        private ComDayCqReportingImplConfigServiceImplProperties(ConfigNodePropertyString RepconfTimezone, ConfigNodePropertyString RepconfLocale, ConfigNodePropertyString RepconfSnapshots, ConfigNodePropertyString RepconfRepdir, ConfigNodePropertyInteger RepconfHourofday, ConfigNodePropertyInteger RepconfMinofhour, ConfigNodePropertyInteger RepconfMaxrows, ConfigNodePropertyBoolean RepconfFakedata, ConfigNodePropertyString RepconfSnapshotuser, ConfigNodePropertyBoolean RepconfEnforcesnapshotuser)
        {
            
            this.RepconfTimezone = RepconfTimezone;
            
            this.RepconfLocale = RepconfLocale;
            
            this.RepconfSnapshots = RepconfSnapshots;
            
            this.RepconfRepdir = RepconfRepdir;
            
            this.RepconfHourofday = RepconfHourofday;
            
            this.RepconfMinofhour = RepconfMinofhour;
            
            this.RepconfMaxrows = RepconfMaxrows;
            
            this.RepconfFakedata = RepconfFakedata;
            
            this.RepconfSnapshotuser = RepconfSnapshotuser;
            
            this.RepconfEnforcesnapshotuser = RepconfEnforcesnapshotuser;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReportingImplConfigServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqReportingImplConfigServiceImplPropertiesBuilder</returns>
        public static ComDayCqReportingImplConfigServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqReportingImplConfigServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReportingImplConfigServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReportingImplConfigServiceImplPropertiesBuilder</returns>
        public ComDayCqReportingImplConfigServiceImplPropertiesBuilder With()
        {
            return Builder()
                .RepconfTimezone(RepconfTimezone)
                .RepconfLocale(RepconfLocale)
                .RepconfSnapshots(RepconfSnapshots)
                .RepconfRepdir(RepconfRepdir)
                .RepconfHourofday(RepconfHourofday)
                .RepconfMinofhour(RepconfMinofhour)
                .RepconfMaxrows(RepconfMaxrows)
                .RepconfFakedata(RepconfFakedata)
                .RepconfSnapshotuser(RepconfSnapshotuser)
                .RepconfEnforcesnapshotuser(RepconfEnforcesnapshotuser);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReportingImplConfigServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReportingImplConfigServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplConfigServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqReportingImplConfigServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReportingImplConfigServiceImplProperties left, ComDayCqReportingImplConfigServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReportingImplConfigServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplConfigServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqReportingImplConfigServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReportingImplConfigServiceImplProperties left, ComDayCqReportingImplConfigServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReportingImplConfigServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqReportingImplConfigServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _RepconfTimezone;
            private ConfigNodePropertyString _RepconfLocale;
            private ConfigNodePropertyString _RepconfSnapshots;
            private ConfigNodePropertyString _RepconfRepdir;
            private ConfigNodePropertyInteger _RepconfHourofday;
            private ConfigNodePropertyInteger _RepconfMinofhour;
            private ConfigNodePropertyInteger _RepconfMaxrows;
            private ConfigNodePropertyBoolean _RepconfFakedata;
            private ConfigNodePropertyString _RepconfSnapshotuser;
            private ConfigNodePropertyBoolean _RepconfEnforcesnapshotuser;

            internal ComDayCqReportingImplConfigServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfTimezone property.
            /// </summary>
            /// <param name="value">RepconfTimezone</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfTimezone(ConfigNodePropertyString value)
            {
                _RepconfTimezone = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfLocale property.
            /// </summary>
            /// <param name="value">RepconfLocale</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfLocale(ConfigNodePropertyString value)
            {
                _RepconfLocale = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfSnapshots property.
            /// </summary>
            /// <param name="value">RepconfSnapshots</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfSnapshots(ConfigNodePropertyString value)
            {
                _RepconfSnapshots = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfRepdir property.
            /// </summary>
            /// <param name="value">RepconfRepdir</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfRepdir(ConfigNodePropertyString value)
            {
                _RepconfRepdir = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfHourofday property.
            /// </summary>
            /// <param name="value">RepconfHourofday</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfHourofday(ConfigNodePropertyInteger value)
            {
                _RepconfHourofday = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfMinofhour property.
            /// </summary>
            /// <param name="value">RepconfMinofhour</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfMinofhour(ConfigNodePropertyInteger value)
            {
                _RepconfMinofhour = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfMaxrows property.
            /// </summary>
            /// <param name="value">RepconfMaxrows</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfMaxrows(ConfigNodePropertyInteger value)
            {
                _RepconfMaxrows = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfFakedata property.
            /// </summary>
            /// <param name="value">RepconfFakedata</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfFakedata(ConfigNodePropertyBoolean value)
            {
                _RepconfFakedata = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfSnapshotuser property.
            /// </summary>
            /// <param name="value">RepconfSnapshotuser</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfSnapshotuser(ConfigNodePropertyString value)
            {
                _RepconfSnapshotuser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplConfigServiceImplProperties.RepconfEnforcesnapshotuser property.
            /// </summary>
            /// <param name="value">RepconfEnforcesnapshotuser</param>
            public ComDayCqReportingImplConfigServiceImplPropertiesBuilder RepconfEnforcesnapshotuser(ConfigNodePropertyBoolean value)
            {
                _RepconfEnforcesnapshotuser = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReportingImplConfigServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqReportingImplConfigServiceImplProperties</returns>
            public ComDayCqReportingImplConfigServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqReportingImplConfigServiceImplProperties(
                    RepconfTimezone: _RepconfTimezone,
                    RepconfLocale: _RepconfLocale,
                    RepconfSnapshots: _RepconfSnapshots,
                    RepconfRepdir: _RepconfRepdir,
                    RepconfHourofday: _RepconfHourofday,
                    RepconfMinofhour: _RepconfMinofhour,
                    RepconfMaxrows: _RepconfMaxrows,
                    RepconfFakedata: _RepconfFakedata,
                    RepconfSnapshotuser: _RepconfSnapshotuser,
                    RepconfEnforcesnapshotuser: _RepconfEnforcesnapshotuser
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}