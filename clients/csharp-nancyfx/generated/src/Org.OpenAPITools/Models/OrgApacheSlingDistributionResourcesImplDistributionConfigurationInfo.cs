using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo:  IEquatable<OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo>
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
        public OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo()
        {
        }

        private OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder</returns>
        public static OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder</returns>
        public OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo left, OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo left, OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties _Properties;

            internal OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfoBuilder Properties(OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo</returns>
            public OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo(
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