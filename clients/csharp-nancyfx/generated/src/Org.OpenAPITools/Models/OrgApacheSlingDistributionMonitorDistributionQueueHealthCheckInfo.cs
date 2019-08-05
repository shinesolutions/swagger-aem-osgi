using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo:  IEquatable<OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo>
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
        public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo()
        {
        }

        private OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder</returns>
        public static OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder</returns>
        public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo left, OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo left, OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties _Properties;

            internal OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoBuilder Properties(OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo</returns>
            public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo(
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