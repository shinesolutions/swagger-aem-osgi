using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo:  IEquatable<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo>
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
        public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo()
        {
        }

        private OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder</returns>
        public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo left, OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo left, OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties _Properties;

            internal OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoBuilder Properties(OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo</returns>
            public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo(
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