using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo:  IEquatable<OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo>
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
        public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo()
        {
        }

        private OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo left, OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo left, OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties _Properties;

            internal OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoBuilder Properties(OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo</returns>
            public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo(
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