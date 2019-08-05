using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheHttpProxyconfiguratorInfo
    /// </summary>
    public sealed class OrgApacheHttpProxyconfiguratorInfo:  IEquatable<OrgApacheHttpProxyconfiguratorInfo>
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
        public OrgApacheHttpProxyconfiguratorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheHttpProxyconfiguratorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheHttpProxyconfiguratorInfo()
        {
        }

        private OrgApacheHttpProxyconfiguratorInfo(string Pid, string Title, string Description, OrgApacheHttpProxyconfiguratorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheHttpProxyconfiguratorInfo.
        /// </summary>
        /// <returns>OrgApacheHttpProxyconfiguratorInfoBuilder</returns>
        public static OrgApacheHttpProxyconfiguratorInfoBuilder Builder()
        {
            return new OrgApacheHttpProxyconfiguratorInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheHttpProxyconfiguratorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheHttpProxyconfiguratorInfoBuilder</returns>
        public OrgApacheHttpProxyconfiguratorInfoBuilder With()
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

        public bool Equals(OrgApacheHttpProxyconfiguratorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheHttpProxyconfiguratorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheHttpProxyconfiguratorInfo</param>
        /// <param name="right">Compared (OrgApacheHttpProxyconfiguratorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheHttpProxyconfiguratorInfo left, OrgApacheHttpProxyconfiguratorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheHttpProxyconfiguratorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheHttpProxyconfiguratorInfo</param>
        /// <param name="right">Compared (OrgApacheHttpProxyconfiguratorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheHttpProxyconfiguratorInfo left, OrgApacheHttpProxyconfiguratorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheHttpProxyconfiguratorInfo.
        /// </summary>
        public sealed class OrgApacheHttpProxyconfiguratorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheHttpProxyconfiguratorProperties _Properties;

            internal OrgApacheHttpProxyconfiguratorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheHttpProxyconfiguratorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheHttpProxyconfiguratorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheHttpProxyconfiguratorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheHttpProxyconfiguratorInfoBuilder Properties(OrgApacheHttpProxyconfiguratorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheHttpProxyconfiguratorInfo.
            /// </summary>
            /// <returns>OrgApacheHttpProxyconfiguratorInfo</returns>
            public OrgApacheHttpProxyconfiguratorInfo Build()
            {
                Validate();
                return new OrgApacheHttpProxyconfiguratorInfo(
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