using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo:  IEquatable<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo>
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
        public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo()
        {
        }

        private OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder</returns>
        public static OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder</returns>
        public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo left, OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo left, OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties _Properties;

            internal OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoBuilder Properties(OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo</returns>
            public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo(
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