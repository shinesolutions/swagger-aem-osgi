using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo:  IEquatable<OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo()
        {
        }

        private OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo left, OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo left, OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties _Properties;

            internal OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoBuilder Properties(OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo</returns>
            public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}