using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixJaasConfigurationFactoryProperties
    /// </summary>
    public sealed class OrgApacheFelixJaasConfigurationFactoryProperties:  IEquatable<OrgApacheFelixJaasConfigurationFactoryProperties>
    { 
        /// <summary>
        /// JaasControlFlag
        /// </summary>
        public ConfigNodePropertyDropDown JaasControlFlag { get; private set; }

        /// <summary>
        /// JaasRanking
        /// </summary>
        public ConfigNodePropertyInteger JaasRanking { get; private set; }

        /// <summary>
        /// JaasRealmName
        /// </summary>
        public ConfigNodePropertyString JaasRealmName { get; private set; }

        /// <summary>
        /// JaasClassname
        /// </summary>
        public ConfigNodePropertyString JaasClassname { get; private set; }

        /// <summary>
        /// JaasOptions
        /// </summary>
        public ConfigNodePropertyArray JaasOptions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixJaasConfigurationFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixJaasConfigurationFactoryProperties()
        {
        }

        private OrgApacheFelixJaasConfigurationFactoryProperties(ConfigNodePropertyDropDown JaasControlFlag, ConfigNodePropertyInteger JaasRanking, ConfigNodePropertyString JaasRealmName, ConfigNodePropertyString JaasClassname, ConfigNodePropertyArray JaasOptions)
        {
            
            this.JaasControlFlag = JaasControlFlag;
            
            this.JaasRanking = JaasRanking;
            
            this.JaasRealmName = JaasRealmName;
            
            this.JaasClassname = JaasClassname;
            
            this.JaasOptions = JaasOptions;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixJaasConfigurationFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder</returns>
        public static OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder</returns>
        public OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder With()
        {
            return Builder()
                .JaasControlFlag(JaasControlFlag)
                .JaasRanking(JaasRanking)
                .JaasRealmName(JaasRealmName)
                .JaasClassname(JaasClassname)
                .JaasOptions(JaasOptions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixJaasConfigurationFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixJaasConfigurationFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixJaasConfigurationFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheFelixJaasConfigurationFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixJaasConfigurationFactoryProperties left, OrgApacheFelixJaasConfigurationFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixJaasConfigurationFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixJaasConfigurationFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheFelixJaasConfigurationFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixJaasConfigurationFactoryProperties left, OrgApacheFelixJaasConfigurationFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixJaasConfigurationFactoryProperties.
        /// </summary>
        public sealed class OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _JaasControlFlag;
            private ConfigNodePropertyInteger _JaasRanking;
            private ConfigNodePropertyString _JaasRealmName;
            private ConfigNodePropertyString _JaasClassname;
            private ConfigNodePropertyArray _JaasOptions;

            internal OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationFactoryProperties.JaasControlFlag property.
            /// </summary>
            /// <param name="value">JaasControlFlag</param>
            public OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder JaasControlFlag(ConfigNodePropertyDropDown value)
            {
                _JaasControlFlag = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationFactoryProperties.JaasRanking property.
            /// </summary>
            /// <param name="value">JaasRanking</param>
            public OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder JaasRanking(ConfigNodePropertyInteger value)
            {
                _JaasRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationFactoryProperties.JaasRealmName property.
            /// </summary>
            /// <param name="value">JaasRealmName</param>
            public OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder JaasRealmName(ConfigNodePropertyString value)
            {
                _JaasRealmName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationFactoryProperties.JaasClassname property.
            /// </summary>
            /// <param name="value">JaasClassname</param>
            public OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder JaasClassname(ConfigNodePropertyString value)
            {
                _JaasClassname = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationFactoryProperties.JaasOptions property.
            /// </summary>
            /// <param name="value">JaasOptions</param>
            public OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder JaasOptions(ConfigNodePropertyArray value)
            {
                _JaasOptions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixJaasConfigurationFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheFelixJaasConfigurationFactoryProperties</returns>
            public OrgApacheFelixJaasConfigurationFactoryProperties Build()
            {
                Validate();
                return new OrgApacheFelixJaasConfigurationFactoryProperties(
                    JaasControlFlag: _JaasControlFlag,
                    JaasRanking: _JaasRanking,
                    JaasRealmName: _JaasRealmName,
                    JaasClassname: _JaasClassname,
                    JaasOptions: _JaasOptions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}