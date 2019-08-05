using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties:  IEquatable<OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// PackageBuilderTarget
        /// </summary>
        public ConfigNodePropertyString PackageBuilderTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties()
        {
        }

        private OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties(ConfigNodePropertyString Name, ConfigNodePropertyString PackageBuilderTarget)
        {
            
            this.Name = Name;
            
            this.PackageBuilderTarget = PackageBuilderTarget;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .PackageBuilderTarget(PackageBuilderTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties left, OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties left, OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _PackageBuilderTarget;

            internal OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.PackageBuilderTarget property.
            /// </summary>
            /// <param name="value">PackageBuilderTarget</param>
            public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesBuilder PackageBuilderTarget(ConfigNodePropertyString value)
            {
                _PackageBuilderTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties</returns>
            public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties(
                    Name: _Name,
                    PackageBuilderTarget: _PackageBuilderTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}