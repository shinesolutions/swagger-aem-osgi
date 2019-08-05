using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo:  IEquatable<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo>
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
        public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo()
        {
        }

        private OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder</returns>
        public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo left, OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo left, OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties _Properties;

            internal OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoBuilder Properties(OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo</returns>
            public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo(
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