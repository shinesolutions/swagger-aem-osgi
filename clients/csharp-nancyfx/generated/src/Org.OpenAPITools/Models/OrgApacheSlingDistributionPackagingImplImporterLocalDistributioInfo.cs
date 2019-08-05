using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo:  IEquatable<OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo>
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
        public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo()
        {
        }

        private OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo left, OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo left, OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties _Properties;

            internal OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoBuilder Properties(OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo</returns>
            public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo(
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