using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties:  IEquatable<OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties>
    { 
        /// <summary>
        /// ProviderRoots
        /// </summary>
        public ConfigNodePropertyString ProviderRoots { get; private set; }

        /// <summary>
        /// Kind
        /// </summary>
        public ConfigNodePropertyString Kind { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties()
        {
        }

        private OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties(ConfigNodePropertyString ProviderRoots, ConfigNodePropertyString Kind)
        {
            
            this.ProviderRoots = ProviderRoots;
            
            this.Kind = Kind;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder</returns>
        public OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder With()
        {
            return Builder()
                .ProviderRoots(ProviderRoots)
                .Kind(Kind);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties left, OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties left, OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder
        {
            private ConfigNodePropertyString _ProviderRoots;
            private ConfigNodePropertyString _Kind;

            internal OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.ProviderRoots property.
            /// </summary>
            /// <param name="value">ProviderRoots</param>
            public OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder ProviderRoots(ConfigNodePropertyString value)
            {
                _ProviderRoots = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.Kind property.
            /// </summary>
            /// <param name="value">Kind</param>
            public OrgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesBuilder Kind(ConfigNodePropertyString value)
            {
                _Kind = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties</returns>
            public OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties(
                    ProviderRoots: _ProviderRoots,
                    Kind: _Kind
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}