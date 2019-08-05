using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties:  IEquatable<OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties>
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
        /// OrgApacheSlingCommonsLogPattern
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingCommonsLogPattern { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogNames
        /// </summary>
        public ConfigNodePropertyArray OrgApacheSlingCommonsLogNames { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogAdditiv
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheSlingCommonsLogAdditiv { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties()
        {
        }

        private OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(ConfigNodePropertyDropDown OrgApacheSlingCommonsLogLevel, ConfigNodePropertyString OrgApacheSlingCommonsLogFile, ConfigNodePropertyString OrgApacheSlingCommonsLogPattern, ConfigNodePropertyArray OrgApacheSlingCommonsLogNames, ConfigNodePropertyBoolean OrgApacheSlingCommonsLogAdditiv)
        {
            
            this.OrgApacheSlingCommonsLogLevel = OrgApacheSlingCommonsLogLevel;
            
            this.OrgApacheSlingCommonsLogFile = OrgApacheSlingCommonsLogFile;
            
            this.OrgApacheSlingCommonsLogPattern = OrgApacheSlingCommonsLogPattern;
            
            this.OrgApacheSlingCommonsLogNames = OrgApacheSlingCommonsLogNames;
            
            this.OrgApacheSlingCommonsLogAdditiv = OrgApacheSlingCommonsLogAdditiv;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder</returns>
        public OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheSlingCommonsLogLevel(OrgApacheSlingCommonsLogLevel)
                .OrgApacheSlingCommonsLogFile(OrgApacheSlingCommonsLogFile)
                .OrgApacheSlingCommonsLogPattern(OrgApacheSlingCommonsLogPattern)
                .OrgApacheSlingCommonsLogNames(OrgApacheSlingCommonsLogNames)
                .OrgApacheSlingCommonsLogAdditiv(OrgApacheSlingCommonsLogAdditiv);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties left, OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties left, OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _OrgApacheSlingCommonsLogLevel;
            private ConfigNodePropertyString _OrgApacheSlingCommonsLogFile;
            private ConfigNodePropertyString _OrgApacheSlingCommonsLogPattern;
            private ConfigNodePropertyArray _OrgApacheSlingCommonsLogNames;
            private ConfigNodePropertyBoolean _OrgApacheSlingCommonsLogAdditiv;

            internal OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.OrgApacheSlingCommonsLogLevel property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogLevel</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder OrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown value)
            {
                _OrgApacheSlingCommonsLogLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.OrgApacheSlingCommonsLogFile property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogFile</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder OrgApacheSlingCommonsLogFile(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsLogFile = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.OrgApacheSlingCommonsLogPattern property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogPattern</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder OrgApacheSlingCommonsLogPattern(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsLogPattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.OrgApacheSlingCommonsLogNames property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogNames</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder OrgApacheSlingCommonsLogNames(ConfigNodePropertyArray value)
            {
                _OrgApacheSlingCommonsLogNames = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.OrgApacheSlingCommonsLogAdditiv property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogAdditiv</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder OrgApacheSlingCommonsLogAdditiv(ConfigNodePropertyBoolean value)
            {
                _OrgApacheSlingCommonsLogAdditiv = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties</returns>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(
                    OrgApacheSlingCommonsLogLevel: _OrgApacheSlingCommonsLogLevel,
                    OrgApacheSlingCommonsLogFile: _OrgApacheSlingCommonsLogFile,
                    OrgApacheSlingCommonsLogPattern: _OrgApacheSlingCommonsLogPattern,
                    OrgApacheSlingCommonsLogNames: _OrgApacheSlingCommonsLogNames,
                    OrgApacheSlingCommonsLogAdditiv: _OrgApacheSlingCommonsLogAdditiv
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}