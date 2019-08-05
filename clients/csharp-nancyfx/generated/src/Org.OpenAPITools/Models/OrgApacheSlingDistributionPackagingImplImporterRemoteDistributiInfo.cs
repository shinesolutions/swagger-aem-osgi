using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo:  IEquatable<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo>
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
        public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo()
        {
        }

        private OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo left, OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo left, OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties _Properties;

            internal OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoBuilder Properties(OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo</returns>
            public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo(
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