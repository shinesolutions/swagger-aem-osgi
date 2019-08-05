using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo:  IEquatable<OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo>
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
        public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo()
        {
        }

        private OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder</returns>
        public static OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder</returns>
        public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo left, OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo left, OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties _Properties;

            internal OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfoBuilder Properties(OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo</returns>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo(
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