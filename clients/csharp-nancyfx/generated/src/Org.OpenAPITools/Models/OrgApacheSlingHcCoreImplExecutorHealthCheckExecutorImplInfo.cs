using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo:  IEquatable<OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo>
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
        public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo()
        {
        }

        private OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo(string Pid, string Title, string Description, OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder</returns>
        public static OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder</returns>
        public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder With()
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

        public bool Equals(OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo left, OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo left, OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties _Properties;

            internal OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoBuilder Properties(OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo</returns>
            public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo(
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