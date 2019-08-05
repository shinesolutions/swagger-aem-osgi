using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties:  IEquatable<OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties>
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
        /// Use OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties()
        {
        }

        private OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties(ConfigNodePropertyString Name, ConfigNodePropertyString PackageBuilderTarget)
        {
            
            this.Name = Name;
            
            this.PackageBuilderTarget = PackageBuilderTarget;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties left, OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties left, OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _PackageBuilderTarget;

            internal OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.PackageBuilderTarget property.
            /// </summary>
            /// <param name="value">PackageBuilderTarget</param>
            public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesBuilder PackageBuilderTarget(ConfigNodePropertyString value)
            {
                _PackageBuilderTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties</returns>
            public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties(
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