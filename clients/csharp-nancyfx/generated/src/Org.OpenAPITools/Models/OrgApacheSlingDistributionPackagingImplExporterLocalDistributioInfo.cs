using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo:  IEquatable<OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo>
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
        public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo()
        {
        }

        private OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo left, OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo left, OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties _Properties;

            internal OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoBuilder Properties(OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo</returns>
            public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo(
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