using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo:  IEquatable<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo>
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
        public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo()
        {
        }

        private OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder</returns>
        public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo left, OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo left, OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties _Properties;

            internal OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoBuilder Properties(OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo</returns>
            public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo(
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