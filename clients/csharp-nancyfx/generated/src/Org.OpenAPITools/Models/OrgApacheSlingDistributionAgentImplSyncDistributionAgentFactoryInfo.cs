using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo:  IEquatable<OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo>
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
        public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo()
        {
        }

        private OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder</returns>
        public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo left, OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo left, OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties _Properties;

            internal OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoBuilder Properties(OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo</returns>
            public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo(
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