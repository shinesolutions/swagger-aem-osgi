using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties:  IEquatable<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties>
    { 
        /// <summary>
        /// Description
        /// </summary>
        public ConfigNodePropertyString Description { get; private set; }

        /// <summary>
        /// Overrides
        /// </summary>
        public ConfigNodePropertyArray Overrides { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties()
        {
        }

        private OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(ConfigNodePropertyString Description, ConfigNodePropertyArray Overrides, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.Description = Description;
            
            this.Overrides = Overrides;
            
            this.Enabled = Enabled;
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder</returns>
        public static OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder</returns>
        public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder With()
        {
            return Builder()
                .Description(Description)
                .Overrides(Overrides)
                .Enabled(Enabled)
                .ServiceRanking(ServiceRanking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties left, OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties left, OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder
        {
            private ConfigNodePropertyString _Description;
            private ConfigNodePropertyArray _Overrides;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyInteger _ServiceRanking;

            internal OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder Description(ConfigNodePropertyString value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.Overrides property.
            /// </summary>
            /// <param name="value">Overrides</param>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder Overrides(ConfigNodePropertyArray value)
            {
                _Overrides = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties</returns>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(
                    Description: _Description,
                    Overrides: _Overrides,
                    Enabled: _Enabled,
                    ServiceRanking: _ServiceRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}