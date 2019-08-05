using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
    /// </summary>
    public sealed class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties:  IEquatable<ComAdobeGraniteThreaddumpThreadDumpCollectorProperties>
    { 
        /// <summary>
        /// SchedulerPeriod
        /// </summary>
        public ConfigNodePropertyInteger SchedulerPeriod { get; private set; }

        /// <summary>
        /// SchedulerRunOn
        /// </summary>
        public ConfigNodePropertyDropDown SchedulerRunOn { get; private set; }

        /// <summary>
        /// GraniteThreaddumpEnabled
        /// </summary>
        public ConfigNodePropertyBoolean GraniteThreaddumpEnabled { get; private set; }

        /// <summary>
        /// GraniteThreaddumpDumpsPerFile
        /// </summary>
        public ConfigNodePropertyInteger GraniteThreaddumpDumpsPerFile { get; private set; }

        /// <summary>
        /// GraniteThreaddumpEnableGzipCompression
        /// </summary>
        public ConfigNodePropertyBoolean GraniteThreaddumpEnableGzipCompression { get; private set; }

        /// <summary>
        /// GraniteThreaddumpEnableDirectoriesCompression
        /// </summary>
        public ConfigNodePropertyBoolean GraniteThreaddumpEnableDirectoriesCompression { get; private set; }

        /// <summary>
        /// GraniteThreaddumpEnableJStack
        /// </summary>
        public ConfigNodePropertyBoolean GraniteThreaddumpEnableJStack { get; private set; }

        /// <summary>
        /// GraniteThreaddumpMaxBackupDays
        /// </summary>
        public ConfigNodePropertyInteger GraniteThreaddumpMaxBackupDays { get; private set; }

        /// <summary>
        /// GraniteThreaddumpBackupCleanTrigger
        /// </summary>
        public ConfigNodePropertyString GraniteThreaddumpBackupCleanTrigger { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties()
        {
        }

        private ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(ConfigNodePropertyInteger SchedulerPeriod, ConfigNodePropertyDropDown SchedulerRunOn, ConfigNodePropertyBoolean GraniteThreaddumpEnabled, ConfigNodePropertyInteger GraniteThreaddumpDumpsPerFile, ConfigNodePropertyBoolean GraniteThreaddumpEnableGzipCompression, ConfigNodePropertyBoolean GraniteThreaddumpEnableDirectoriesCompression, ConfigNodePropertyBoolean GraniteThreaddumpEnableJStack, ConfigNodePropertyInteger GraniteThreaddumpMaxBackupDays, ConfigNodePropertyString GraniteThreaddumpBackupCleanTrigger)
        {
            
            this.SchedulerPeriod = SchedulerPeriod;
            
            this.SchedulerRunOn = SchedulerRunOn;
            
            this.GraniteThreaddumpEnabled = GraniteThreaddumpEnabled;
            
            this.GraniteThreaddumpDumpsPerFile = GraniteThreaddumpDumpsPerFile;
            
            this.GraniteThreaddumpEnableGzipCompression = GraniteThreaddumpEnableGzipCompression;
            
            this.GraniteThreaddumpEnableDirectoriesCompression = GraniteThreaddumpEnableDirectoriesCompression;
            
            this.GraniteThreaddumpEnableJStack = GraniteThreaddumpEnableJStack;
            
            this.GraniteThreaddumpMaxBackupDays = GraniteThreaddumpMaxBackupDays;
            
            this.GraniteThreaddumpBackupCleanTrigger = GraniteThreaddumpBackupCleanTrigger;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder</returns>
        public static ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder</returns>
        public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder With()
        {
            return Builder()
                .SchedulerPeriod(SchedulerPeriod)
                .SchedulerRunOn(SchedulerRunOn)
                .GraniteThreaddumpEnabled(GraniteThreaddumpEnabled)
                .GraniteThreaddumpDumpsPerFile(GraniteThreaddumpDumpsPerFile)
                .GraniteThreaddumpEnableGzipCompression(GraniteThreaddumpEnableGzipCompression)
                .GraniteThreaddumpEnableDirectoriesCompression(GraniteThreaddumpEnableDirectoriesCompression)
                .GraniteThreaddumpEnableJStack(GraniteThreaddumpEnableJStack)
                .GraniteThreaddumpMaxBackupDays(GraniteThreaddumpMaxBackupDays)
                .GraniteThreaddumpBackupCleanTrigger(GraniteThreaddumpBackupCleanTrigger);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteThreaddumpThreadDumpCollectorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties left, ComAdobeGraniteThreaddumpThreadDumpCollectorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteThreaddumpThreadDumpCollectorProperties left, ComAdobeGraniteThreaddumpThreadDumpCollectorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.
        /// </summary>
        public sealed class ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder
        {
            private ConfigNodePropertyInteger _SchedulerPeriod;
            private ConfigNodePropertyDropDown _SchedulerRunOn;
            private ConfigNodePropertyBoolean _GraniteThreaddumpEnabled;
            private ConfigNodePropertyInteger _GraniteThreaddumpDumpsPerFile;
            private ConfigNodePropertyBoolean _GraniteThreaddumpEnableGzipCompression;
            private ConfigNodePropertyBoolean _GraniteThreaddumpEnableDirectoriesCompression;
            private ConfigNodePropertyBoolean _GraniteThreaddumpEnableJStack;
            private ConfigNodePropertyInteger _GraniteThreaddumpMaxBackupDays;
            private ConfigNodePropertyString _GraniteThreaddumpBackupCleanTrigger;

            internal ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.SchedulerPeriod property.
            /// </summary>
            /// <param name="value">SchedulerPeriod</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder SchedulerPeriod(ConfigNodePropertyInteger value)
            {
                _SchedulerPeriod = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.SchedulerRunOn property.
            /// </summary>
            /// <param name="value">SchedulerRunOn</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder SchedulerRunOn(ConfigNodePropertyDropDown value)
            {
                _SchedulerRunOn = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.GraniteThreaddumpEnabled property.
            /// </summary>
            /// <param name="value">GraniteThreaddumpEnabled</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder GraniteThreaddumpEnabled(ConfigNodePropertyBoolean value)
            {
                _GraniteThreaddumpEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.GraniteThreaddumpDumpsPerFile property.
            /// </summary>
            /// <param name="value">GraniteThreaddumpDumpsPerFile</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder GraniteThreaddumpDumpsPerFile(ConfigNodePropertyInteger value)
            {
                _GraniteThreaddumpDumpsPerFile = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.GraniteThreaddumpEnableGzipCompression property.
            /// </summary>
            /// <param name="value">GraniteThreaddumpEnableGzipCompression</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder GraniteThreaddumpEnableGzipCompression(ConfigNodePropertyBoolean value)
            {
                _GraniteThreaddumpEnableGzipCompression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.GraniteThreaddumpEnableDirectoriesCompression property.
            /// </summary>
            /// <param name="value">GraniteThreaddumpEnableDirectoriesCompression</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder GraniteThreaddumpEnableDirectoriesCompression(ConfigNodePropertyBoolean value)
            {
                _GraniteThreaddumpEnableDirectoriesCompression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.GraniteThreaddumpEnableJStack property.
            /// </summary>
            /// <param name="value">GraniteThreaddumpEnableJStack</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder GraniteThreaddumpEnableJStack(ConfigNodePropertyBoolean value)
            {
                _GraniteThreaddumpEnableJStack = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.GraniteThreaddumpMaxBackupDays property.
            /// </summary>
            /// <param name="value">GraniteThreaddumpMaxBackupDays</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder GraniteThreaddumpMaxBackupDays(ConfigNodePropertyInteger value)
            {
                _GraniteThreaddumpMaxBackupDays = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.GraniteThreaddumpBackupCleanTrigger property.
            /// </summary>
            /// <param name="value">GraniteThreaddumpBackupCleanTrigger</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder GraniteThreaddumpBackupCleanTrigger(ConfigNodePropertyString value)
            {
                _GraniteThreaddumpBackupCleanTrigger = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteThreaddumpThreadDumpCollectorProperties</returns>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties Build()
            {
                Validate();
                return new ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(
                    SchedulerPeriod: _SchedulerPeriod,
                    SchedulerRunOn: _SchedulerRunOn,
                    GraniteThreaddumpEnabled: _GraniteThreaddumpEnabled,
                    GraniteThreaddumpDumpsPerFile: _GraniteThreaddumpDumpsPerFile,
                    GraniteThreaddumpEnableGzipCompression: _GraniteThreaddumpEnableGzipCompression,
                    GraniteThreaddumpEnableDirectoriesCompression: _GraniteThreaddumpEnableDirectoriesCompression,
                    GraniteThreaddumpEnableJStack: _GraniteThreaddumpEnableJStack,
                    GraniteThreaddumpMaxBackupDays: _GraniteThreaddumpMaxBackupDays,
                    GraniteThreaddumpBackupCleanTrigger: _GraniteThreaddumpBackupCleanTrigger
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}