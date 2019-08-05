using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo:  IEquatable<OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo>
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
        public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo()
        {
        }

        private OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder</returns>
        public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo left, OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo left, OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties _Properties;

            internal OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoBuilder Properties(OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo</returns>
            public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo(
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