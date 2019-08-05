using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo:  IEquatable<OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo>
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
        public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo()
        {
        }

        private OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder</returns>
        public static OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder</returns>
        public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo left, OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo left, OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties _Properties;

            internal OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoBuilder Properties(OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo</returns>
            public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo(
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