using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsLogLogManagerProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsLogLogManagerProperties:  IEquatable<OrgApacheSlingCommonsLogLogManagerProperties>
    { 
        /// <summary>
        /// OrgApacheSlingCommonsLogLevel
        /// </summary>
        public ConfigNodePropertyDropDown OrgApacheSlingCommonsLogLevel { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogFile
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingCommonsLogFile { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogFileNumber
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheSlingCommonsLogFileNumber { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogFileSize
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingCommonsLogFileSize { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogPattern
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingCommonsLogPattern { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogConfigurationFile
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingCommonsLogConfigurationFile { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogPackagingDataEnabled
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheSlingCommonsLogPackagingDataEnabled { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogMaxCallerDataDepth
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheSlingCommonsLogMaxCallerDataDepth { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogMaxOldFileCountInDump
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheSlingCommonsLogMaxOldFileCountInDump { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogNumOfLines
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheSlingCommonsLogNumOfLines { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsLogLogManagerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsLogLogManagerProperties()
        {
        }

        private OrgApacheSlingCommonsLogLogManagerProperties(ConfigNodePropertyDropDown OrgApacheSlingCommonsLogLevel, ConfigNodePropertyString OrgApacheSlingCommonsLogFile, ConfigNodePropertyInteger OrgApacheSlingCommonsLogFileNumber, ConfigNodePropertyString OrgApacheSlingCommonsLogFileSize, ConfigNodePropertyString OrgApacheSlingCommonsLogPattern, ConfigNodePropertyString OrgApacheSlingCommonsLogConfigurationFile, ConfigNodePropertyBoolean OrgApacheSlingCommonsLogPackagingDataEnabled, ConfigNodePropertyInteger OrgApacheSlingCommonsLogMaxCallerDataDepth, ConfigNodePropertyInteger OrgApacheSlingCommonsLogMaxOldFileCountInDump, ConfigNodePropertyInteger OrgApacheSlingCommonsLogNumOfLines)
        {
            
            this.OrgApacheSlingCommonsLogLevel = OrgApacheSlingCommonsLogLevel;
            
            this.OrgApacheSlingCommonsLogFile = OrgApacheSlingCommonsLogFile;
            
            this.OrgApacheSlingCommonsLogFileNumber = OrgApacheSlingCommonsLogFileNumber;
            
            this.OrgApacheSlingCommonsLogFileSize = OrgApacheSlingCommonsLogFileSize;
            
            this.OrgApacheSlingCommonsLogPattern = OrgApacheSlingCommonsLogPattern;
            
            this.OrgApacheSlingCommonsLogConfigurationFile = OrgApacheSlingCommonsLogConfigurationFile;
            
            this.OrgApacheSlingCommonsLogPackagingDataEnabled = OrgApacheSlingCommonsLogPackagingDataEnabled;
            
            this.OrgApacheSlingCommonsLogMaxCallerDataDepth = OrgApacheSlingCommonsLogMaxCallerDataDepth;
            
            this.OrgApacheSlingCommonsLogMaxOldFileCountInDump = OrgApacheSlingCommonsLogMaxOldFileCountInDump;
            
            this.OrgApacheSlingCommonsLogNumOfLines = OrgApacheSlingCommonsLogNumOfLines;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsLogLogManagerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsLogLogManagerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsLogLogManagerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsLogLogManagerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerPropertiesBuilder</returns>
        public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheSlingCommonsLogLevel(OrgApacheSlingCommonsLogLevel)
                .OrgApacheSlingCommonsLogFile(OrgApacheSlingCommonsLogFile)
                .OrgApacheSlingCommonsLogFileNumber(OrgApacheSlingCommonsLogFileNumber)
                .OrgApacheSlingCommonsLogFileSize(OrgApacheSlingCommonsLogFileSize)
                .OrgApacheSlingCommonsLogPattern(OrgApacheSlingCommonsLogPattern)
                .OrgApacheSlingCommonsLogConfigurationFile(OrgApacheSlingCommonsLogConfigurationFile)
                .OrgApacheSlingCommonsLogPackagingDataEnabled(OrgApacheSlingCommonsLogPackagingDataEnabled)
                .OrgApacheSlingCommonsLogMaxCallerDataDepth(OrgApacheSlingCommonsLogMaxCallerDataDepth)
                .OrgApacheSlingCommonsLogMaxOldFileCountInDump(OrgApacheSlingCommonsLogMaxOldFileCountInDump)
                .OrgApacheSlingCommonsLogNumOfLines(OrgApacheSlingCommonsLogNumOfLines);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsLogLogManagerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsLogLogManagerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsLogLogManagerProperties left, OrgApacheSlingCommonsLogLogManagerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsLogLogManagerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsLogLogManagerProperties left, OrgApacheSlingCommonsLogLogManagerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsLogLogManagerProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsLogLogManagerPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _OrgApacheSlingCommonsLogLevel;
            private ConfigNodePropertyString _OrgApacheSlingCommonsLogFile;
            private ConfigNodePropertyInteger _OrgApacheSlingCommonsLogFileNumber;
            private ConfigNodePropertyString _OrgApacheSlingCommonsLogFileSize;
            private ConfigNodePropertyString _OrgApacheSlingCommonsLogPattern;
            private ConfigNodePropertyString _OrgApacheSlingCommonsLogConfigurationFile;
            private ConfigNodePropertyBoolean _OrgApacheSlingCommonsLogPackagingDataEnabled;
            private ConfigNodePropertyInteger _OrgApacheSlingCommonsLogMaxCallerDataDepth;
            private ConfigNodePropertyInteger _OrgApacheSlingCommonsLogMaxOldFileCountInDump;
            private ConfigNodePropertyInteger _OrgApacheSlingCommonsLogNumOfLines;

            internal OrgApacheSlingCommonsLogLogManagerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogLevel property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogLevel</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown value)
            {
                _OrgApacheSlingCommonsLogLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogFile property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogFile</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogFile(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsLogFile = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogFileNumber property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogFileNumber</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger value)
            {
                _OrgApacheSlingCommonsLogFileNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogFileSize property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogFileSize</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsLogFileSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogPattern property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogPattern</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogPattern(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsLogPattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogConfigurationFile property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogConfigurationFile</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsLogConfigurationFile = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogPackagingDataEnabled property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogPackagingDataEnabled</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean value)
            {
                _OrgApacheSlingCommonsLogPackagingDataEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogMaxCallerDataDepth property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogMaxCallerDataDepth</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger value)
            {
                _OrgApacheSlingCommonsLogMaxCallerDataDepth = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogMaxOldFileCountInDump property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogMaxOldFileCountInDump</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger value)
            {
                _OrgApacheSlingCommonsLogMaxOldFileCountInDump = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerProperties.OrgApacheSlingCommonsLogNumOfLines property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogNumOfLines</param>
            public OrgApacheSlingCommonsLogLogManagerPropertiesBuilder OrgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger value)
            {
                _OrgApacheSlingCommonsLogNumOfLines = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsLogLogManagerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsLogLogManagerProperties</returns>
            public OrgApacheSlingCommonsLogLogManagerProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsLogLogManagerProperties(
                    OrgApacheSlingCommonsLogLevel: _OrgApacheSlingCommonsLogLevel,
                    OrgApacheSlingCommonsLogFile: _OrgApacheSlingCommonsLogFile,
                    OrgApacheSlingCommonsLogFileNumber: _OrgApacheSlingCommonsLogFileNumber,
                    OrgApacheSlingCommonsLogFileSize: _OrgApacheSlingCommonsLogFileSize,
                    OrgApacheSlingCommonsLogPattern: _OrgApacheSlingCommonsLogPattern,
                    OrgApacheSlingCommonsLogConfigurationFile: _OrgApacheSlingCommonsLogConfigurationFile,
                    OrgApacheSlingCommonsLogPackagingDataEnabled: _OrgApacheSlingCommonsLogPackagingDataEnabled,
                    OrgApacheSlingCommonsLogMaxCallerDataDepth: _OrgApacheSlingCommonsLogMaxCallerDataDepth,
                    OrgApacheSlingCommonsLogMaxOldFileCountInDump: _OrgApacheSlingCommonsLogMaxOldFileCountInDump,
                    OrgApacheSlingCommonsLogNumOfLines: _OrgApacheSlingCommonsLogNumOfLines
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}