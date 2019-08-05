using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo:  IEquatable<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo>
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
        public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo()
        {
        }

        private OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo(string Pid, string Title, string Description, OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder</returns>
        public static OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder</returns>
        public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder With()
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

        public bool Equals(OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo left, OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo left, OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties _Properties;

            internal OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoBuilder Properties(OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo</returns>
            public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo(
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