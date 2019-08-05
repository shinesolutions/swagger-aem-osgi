using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo:  IEquatable<OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo>
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
        public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo()
        {
        }

        private OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder</returns>
        public static OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder</returns>
        public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo left, OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo left, OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties _Properties;

            internal OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoBuilder Properties(OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo</returns>
            public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo(
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