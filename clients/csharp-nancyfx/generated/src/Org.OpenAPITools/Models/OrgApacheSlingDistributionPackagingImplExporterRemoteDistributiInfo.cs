using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo:  IEquatable<OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo>
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
        public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo()
        {
        }

        private OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo left, OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo left, OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties _Properties;

            internal OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoBuilder Properties(OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo</returns>
            public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo(
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