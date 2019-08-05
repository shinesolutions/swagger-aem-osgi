using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties:  IEquatable<OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties>
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
        /// PullItems
        /// </summary>
        public ConfigNodePropertyInteger PullItems { get; private set; }

        /// <summary>
        /// PackageBuilderTarget
        /// </summary>
        public ConfigNodePropertyString PackageBuilderTarget { get; private set; }

        /// <summary>
        /// TransportSecretProviderTarget
        /// </summary>
        public ConfigNodePropertyString TransportSecretProviderTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties()
        {
        }

        private OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(ConfigNodePropertyString Name, ConfigNodePropertyArray Endpoints, ConfigNodePropertyInteger PullItems, ConfigNodePropertyString PackageBuilderTarget, ConfigNodePropertyString TransportSecretProviderTarget)
        {
            
            this.Name = Name;
            
            this.Endpoints = Endpoints;
            
            this.PullItems = PullItems;
            
            this.PackageBuilderTarget = PackageBuilderTarget;
            
            this.TransportSecretProviderTarget = TransportSecretProviderTarget;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Endpoints(Endpoints)
                .PullItems(PullItems)
                .PackageBuilderTarget(PackageBuilderTarget)
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

        public bool Equals(OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties left, OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties left, OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyArray _Endpoints;
            private ConfigNodePropertyInteger _PullItems;
            private ConfigNodePropertyString _PackageBuilderTarget;
            private ConfigNodePropertyString _TransportSecretProviderTarget;

            internal OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.Endpoints property.
            /// </summary>
            /// <param name="value">Endpoints</param>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder Endpoints(ConfigNodePropertyArray value)
            {
                _Endpoints = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.PullItems property.
            /// </summary>
            /// <param name="value">PullItems</param>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder PullItems(ConfigNodePropertyInteger value)
            {
                _PullItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.PackageBuilderTarget property.
            /// </summary>
            /// <param name="value">PackageBuilderTarget</param>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder PackageBuilderTarget(ConfigNodePropertyString value)
            {
                _PackageBuilderTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.TransportSecretProviderTarget property.
            /// </summary>
            /// <param name="value">TransportSecretProviderTarget</param>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesBuilder TransportSecretProviderTarget(ConfigNodePropertyString value)
            {
                _TransportSecretProviderTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties</returns>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(
                    Name: _Name,
                    Endpoints: _Endpoints,
                    PullItems: _PullItems,
                    PackageBuilderTarget: _PackageBuilderTarget,
                    TransportSecretProviderTarget: _TransportSecretProviderTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}