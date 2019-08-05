using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplCompositeHealthCheckInfo
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplCompositeHealthCheckInfo:  IEquatable<OrgApacheSlingHcCoreImplCompositeHealthCheckInfo>
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
        public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplCompositeHealthCheckInfo()
        {
        }

        private OrgApacheSlingHcCoreImplCompositeHealthCheckInfo(string Pid, string Title, string Description, OrgApacheSlingHcCoreImplCompositeHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder</returns>
        public static OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder</returns>
        public OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder With()
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

        public bool Equals(OrgApacheSlingHcCoreImplCompositeHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplCompositeHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplCompositeHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplCompositeHealthCheckInfo left, OrgApacheSlingHcCoreImplCompositeHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplCompositeHealthCheckInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplCompositeHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplCompositeHealthCheckInfo left, OrgApacheSlingHcCoreImplCompositeHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingHcCoreImplCompositeHealthCheckProperties _Properties;

            internal OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckInfoBuilder Properties(OrgApacheSlingHcCoreImplCompositeHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplCompositeHealthCheckInfo.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplCompositeHealthCheckInfo</returns>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckInfo Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplCompositeHealthCheckInfo(
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