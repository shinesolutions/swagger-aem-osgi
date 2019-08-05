using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties:  IEquatable<OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties>
    { 
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
        /// Use OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties()
        {
        }

        private OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(ConfigNodePropertyBoolean Enabled, ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.Enabled = Enabled;
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder</returns>
        public static OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder</returns>
        public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder With()
        {
            return Builder()
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

        public bool Equals(OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties left, OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties left, OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyInteger _ServiceRanking;

            internal OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties</returns>
            public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(
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