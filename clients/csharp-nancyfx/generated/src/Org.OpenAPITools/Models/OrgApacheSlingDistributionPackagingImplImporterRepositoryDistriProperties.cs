using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties:  IEquatable<OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// ServiceName
        /// </summary>
        public ConfigNodePropertyString ServiceName { get; private set; }

        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// PrivilegeName
        /// </summary>
        public ConfigNodePropertyString PrivilegeName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties()
        {
        }

        private OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties(ConfigNodePropertyString Name, ConfigNodePropertyString ServiceName, ConfigNodePropertyString Path, ConfigNodePropertyString PrivilegeName)
        {
            
            this.Name = Name;
            
            this.ServiceName = ServiceName;
            
            this.Path = Path;
            
            this.PrivilegeName = PrivilegeName;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .ServiceName(ServiceName)
                .Path(Path)
                .PrivilegeName(PrivilegeName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties left, OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties left, OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyString _PrivilegeName;

            internal OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.PrivilegeName property.
            /// </summary>
            /// <param name="value">PrivilegeName</param>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesBuilder PrivilegeName(ConfigNodePropertyString value)
            {
                _PrivilegeName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties</returns>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties(
                    Name: _Name,
                    ServiceName: _ServiceName,
                    Path: _Path,
                    PrivilegeName: _PrivilegeName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}