using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo
    /// </summary>
    public sealed class OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo:  IEquatable<OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo>
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
        public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo()
        {
        }

        private OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo(string Pid, string Title, string Description, OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder</returns>
        public static OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder Builder()
        {
            return new OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder</returns>
        public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo left, OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo left, OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.
        /// </summary>
        public sealed class OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties _Properties;

            internal OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoBuilder Properties(OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo</returns>
            public OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo Build()
            {
                Validate();
                return new OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo(
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