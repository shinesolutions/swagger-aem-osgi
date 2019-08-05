using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixJaasConfigurationSpiProperties
    /// </summary>
    public sealed class OrgApacheFelixJaasConfigurationSpiProperties:  IEquatable<OrgApacheFelixJaasConfigurationSpiProperties>
    { 
        /// <summary>
        /// JaasDefaultRealmName
        /// </summary>
        public ConfigNodePropertyString JaasDefaultRealmName { get; private set; }

        /// <summary>
        /// JaasConfigProviderName
        /// </summary>
        public ConfigNodePropertyString JaasConfigProviderName { get; private set; }

        /// <summary>
        /// JaasGlobalConfigPolicy
        /// </summary>
        public ConfigNodePropertyDropDown JaasGlobalConfigPolicy { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixJaasConfigurationSpiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixJaasConfigurationSpiProperties()
        {
        }

        private OrgApacheFelixJaasConfigurationSpiProperties(ConfigNodePropertyString JaasDefaultRealmName, ConfigNodePropertyString JaasConfigProviderName, ConfigNodePropertyDropDown JaasGlobalConfigPolicy)
        {
            
            this.JaasDefaultRealmName = JaasDefaultRealmName;
            
            this.JaasConfigProviderName = JaasConfigProviderName;
            
            this.JaasGlobalConfigPolicy = JaasGlobalConfigPolicy;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixJaasConfigurationSpiProperties.
        /// </summary>
        /// <returns>OrgApacheFelixJaasConfigurationSpiPropertiesBuilder</returns>
        public static OrgApacheFelixJaasConfigurationSpiPropertiesBuilder Builder()
        {
            return new OrgApacheFelixJaasConfigurationSpiPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixJaasConfigurationSpiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixJaasConfigurationSpiPropertiesBuilder</returns>
        public OrgApacheFelixJaasConfigurationSpiPropertiesBuilder With()
        {
            return Builder()
                .JaasDefaultRealmName(JaasDefaultRealmName)
                .JaasConfigProviderName(JaasConfigProviderName)
                .JaasGlobalConfigPolicy(JaasGlobalConfigPolicy);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixJaasConfigurationSpiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixJaasConfigurationSpiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixJaasConfigurationSpiProperties</param>
        /// <param name="right">Compared (OrgApacheFelixJaasConfigurationSpiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixJaasConfigurationSpiProperties left, OrgApacheFelixJaasConfigurationSpiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixJaasConfigurationSpiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixJaasConfigurationSpiProperties</param>
        /// <param name="right">Compared (OrgApacheFelixJaasConfigurationSpiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixJaasConfigurationSpiProperties left, OrgApacheFelixJaasConfigurationSpiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixJaasConfigurationSpiProperties.
        /// </summary>
        public sealed class OrgApacheFelixJaasConfigurationSpiPropertiesBuilder
        {
            private ConfigNodePropertyString _JaasDefaultRealmName;
            private ConfigNodePropertyString _JaasConfigProviderName;
            private ConfigNodePropertyDropDown _JaasGlobalConfigPolicy;

            internal OrgApacheFelixJaasConfigurationSpiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationSpiProperties.JaasDefaultRealmName property.
            /// </summary>
            /// <param name="value">JaasDefaultRealmName</param>
            public OrgApacheFelixJaasConfigurationSpiPropertiesBuilder JaasDefaultRealmName(ConfigNodePropertyString value)
            {
                _JaasDefaultRealmName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationSpiProperties.JaasConfigProviderName property.
            /// </summary>
            /// <param name="value">JaasConfigProviderName</param>
            public OrgApacheFelixJaasConfigurationSpiPropertiesBuilder JaasConfigProviderName(ConfigNodePropertyString value)
            {
                _JaasConfigProviderName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixJaasConfigurationSpiProperties.JaasGlobalConfigPolicy property.
            /// </summary>
            /// <param name="value">JaasGlobalConfigPolicy</param>
            public OrgApacheFelixJaasConfigurationSpiPropertiesBuilder JaasGlobalConfigPolicy(ConfigNodePropertyDropDown value)
            {
                _JaasGlobalConfigPolicy = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixJaasConfigurationSpiProperties.
            /// </summary>
            /// <returns>OrgApacheFelixJaasConfigurationSpiProperties</returns>
            public OrgApacheFelixJaasConfigurationSpiProperties Build()
            {
                Validate();
                return new OrgApacheFelixJaasConfigurationSpiProperties(
                    JaasDefaultRealmName: _JaasDefaultRealmName,
                    JaasConfigProviderName: _JaasConfigProviderName,
                    JaasGlobalConfigPolicy: _JaasGlobalConfigPolicy
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}