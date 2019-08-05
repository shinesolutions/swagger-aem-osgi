using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties:  IEquatable<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Endpoints
        /// </summary>
        public ConfigNodePropertyArray Endpoints { get; private set; }

        /// <summary>
        /// TransportSecretProviderTarget
        /// </summary>
        public ConfigNodePropertyString TransportSecretProviderTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties()
        {
        }

        private OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(ConfigNodePropertyString Name, ConfigNodePropertyArray Endpoints, ConfigNodePropertyString TransportSecretProviderTarget)
        {
            
            this.Name = Name;
            
            this.Endpoints = Endpoints;
            
            this.TransportSecretProviderTarget = TransportSecretProviderTarget;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Endpoints(Endpoints)
                .TransportSecretProviderTarget(TransportSecretProviderTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties left, OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties left, OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyArray _Endpoints;
            private ConfigNodePropertyString _TransportSecretProviderTarget;

            internal OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.Endpoints property.
            /// </summary>
            /// <param name="value">Endpoints</param>
            public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder Endpoints(ConfigNodePropertyArray value)
            {
                _Endpoints = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.TransportSecretProviderTarget property.
            /// </summary>
            /// <param name="value">TransportSecretProviderTarget</param>
            public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesBuilder TransportSecretProviderTarget(ConfigNodePropertyString value)
            {
                _TransportSecretProviderTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties</returns>
            public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(
                    Name: _Name,
                    Endpoints: _Endpoints,
                    TransportSecretProviderTarget: _TransportSecretProviderTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}