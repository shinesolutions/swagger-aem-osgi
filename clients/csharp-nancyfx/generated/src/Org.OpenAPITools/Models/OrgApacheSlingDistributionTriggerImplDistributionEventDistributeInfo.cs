using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo:  IEquatable<OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo>
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
        public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo()
        {
        }

        private OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo left, OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo left, OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties _Properties;

            internal OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoBuilder Properties(OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo</returns>
            public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo(
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