using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties:  IEquatable<OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties>
    { 
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
        /// OrgApacheSlingCommonsLogFileBuffered
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheSlingCommonsLogFileBuffered { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties()
        {
        }

        private OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(ConfigNodePropertyString OrgApacheSlingCommonsLogFile, ConfigNodePropertyInteger OrgApacheSlingCommonsLogFileNumber, ConfigNodePropertyString OrgApacheSlingCommonsLogFileSize, ConfigNodePropertyBoolean OrgApacheSlingCommonsLogFileBuffered)
        {
            
            this.OrgApacheSlingCommonsLogFile = OrgApacheSlingCommonsLogFile;
            
            this.OrgApacheSlingCommonsLogFileNumber = OrgApacheSlingCommonsLogFileNumber;
            
            this.OrgApacheSlingCommonsLogFileSize = OrgApacheSlingCommonsLogFileSize;
            
            this.OrgApacheSlingCommonsLogFileBuffered = OrgApacheSlingCommonsLogFileBuffered;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder</returns>
        public OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheSlingCommonsLogFile(OrgApacheSlingCommonsLogFile)
                .OrgApacheSlingCommonsLogFileNumber(OrgApacheSlingCommonsLogFileNumber)
                .OrgApacheSlingCommonsLogFileSize(OrgApacheSlingCommonsLogFileSize)
                .OrgApacheSlingCommonsLogFileBuffered(OrgApacheSlingCommonsLogFileBuffered);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties left, OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties left, OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder
        {
            private ConfigNodePropertyString _OrgApacheSlingCommonsLogFile;
            private ConfigNodePropertyInteger _OrgApacheSlingCommonsLogFileNumber;
            private ConfigNodePropertyString _OrgApacheSlingCommonsLogFileSize;
            private ConfigNodePropertyBoolean _OrgApacheSlingCommonsLogFileBuffered;

            internal OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.OrgApacheSlingCommonsLogFile property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogFile</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder OrgApacheSlingCommonsLogFile(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsLogFile = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.OrgApacheSlingCommonsLogFileNumber property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogFileNumber</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder OrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger value)
            {
                _OrgApacheSlingCommonsLogFileNumber = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.OrgApacheSlingCommonsLogFileSize property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogFileSize</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder OrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsLogFileSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.OrgApacheSlingCommonsLogFileBuffered property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogFileBuffered</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder OrgApacheSlingCommonsLogFileBuffered(ConfigNodePropertyBoolean value)
            {
                _OrgApacheSlingCommonsLogFileBuffered = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties</returns>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(
                    OrgApacheSlingCommonsLogFile: _OrgApacheSlingCommonsLogFile,
                    OrgApacheSlingCommonsLogFileNumber: _OrgApacheSlingCommonsLogFileNumber,
                    OrgApacheSlingCommonsLogFileSize: _OrgApacheSlingCommonsLogFileSize,
                    OrgApacheSlingCommonsLogFileBuffered: _OrgApacheSlingCommonsLogFileBuffered
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}