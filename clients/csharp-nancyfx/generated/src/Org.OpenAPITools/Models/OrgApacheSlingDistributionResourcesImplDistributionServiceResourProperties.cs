using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties:  IEquatable<OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties>
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
        /// Use OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties()
        {
        }

        private OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties(ConfigNodePropertyString ProviderRoots, ConfigNodePropertyString Kind)
        {
            
            this.ProviderRoots = ProviderRoots;
            
            this.Kind = Kind;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder</returns>
        public OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties left, OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties left, OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder
        {
            private ConfigNodePropertyString _ProviderRoots;
            private ConfigNodePropertyString _Kind;

            internal OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.ProviderRoots property.
            /// </summary>
            /// <param name="value">ProviderRoots</param>
            public OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder ProviderRoots(ConfigNodePropertyString value)
            {
                _ProviderRoots = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.Kind property.
            /// </summary>
            /// <param name="value">Kind</param>
            public OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder Kind(ConfigNodePropertyString value)
            {
                _Kind = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties</returns>
            public OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties(
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