using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplScriptableHealthCheckInfo
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplScriptableHealthCheckInfo:  IEquatable<OrgApacheSlingHcCoreImplScriptableHealthCheckInfo>
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
        public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplScriptableHealthCheckInfo()
        {
        }

        private OrgApacheSlingHcCoreImplScriptableHealthCheckInfo(string Pid, string Title, string Description, OrgApacheSlingHcCoreImplScriptableHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder</returns>
        public static OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder</returns>
        public OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder With()
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

        public bool Equals(OrgApacheSlingHcCoreImplScriptableHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplScriptableHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplScriptableHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplScriptableHealthCheckInfo left, OrgApacheSlingHcCoreImplScriptableHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplScriptableHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplScriptableHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplScriptableHealthCheckInfo left, OrgApacheSlingHcCoreImplScriptableHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingHcCoreImplScriptableHealthCheckProperties _Properties;

            internal OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckInfoBuilder Properties(OrgApacheSlingHcCoreImplScriptableHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplScriptableHealthCheckInfo.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplScriptableHealthCheckInfo</returns>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckInfo Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplScriptableHealthCheckInfo(
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