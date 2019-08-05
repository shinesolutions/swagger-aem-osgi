using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo:  IEquatable<OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo>
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
        public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo()
        {
        }

        private OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo(string Pid, string Title, string Description, OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder</returns>
        public static OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder</returns>
        public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder With()
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

        public bool Equals(OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo left, OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo left, OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties _Properties;

            internal OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoBuilder Properties(OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo</returns>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo(
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