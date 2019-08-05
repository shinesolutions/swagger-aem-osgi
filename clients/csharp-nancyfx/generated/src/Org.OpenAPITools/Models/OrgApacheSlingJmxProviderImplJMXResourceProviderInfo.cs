using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJmxProviderImplJMXResourceProviderInfo
    /// </summary>
    public sealed class OrgApacheSlingJmxProviderImplJMXResourceProviderInfo:  IEquatable<OrgApacheSlingJmxProviderImplJMXResourceProviderInfo>
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
        public OrgApacheSlingJmxProviderImplJMXResourceProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJmxProviderImplJMXResourceProviderInfo()
        {
        }

        private OrgApacheSlingJmxProviderImplJMXResourceProviderInfo(string Pid, string Title, string Description, OrgApacheSlingJmxProviderImplJMXResourceProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder</returns>
        public static OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder Builder()
        {
            return new OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder</returns>
        public OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJmxProviderImplJMXResourceProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJmxProviderImplJMXResourceProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJmxProviderImplJMXResourceProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJmxProviderImplJMXResourceProviderInfo left, OrgApacheSlingJmxProviderImplJMXResourceProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJmxProviderImplJMXResourceProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJmxProviderImplJMXResourceProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJmxProviderImplJMXResourceProviderInfo left, OrgApacheSlingJmxProviderImplJMXResourceProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.
        /// </summary>
        public sealed class OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJmxProviderImplJMXResourceProviderProperties _Properties;

            internal OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJmxProviderImplJMXResourceProviderInfoBuilder Properties(OrgApacheSlingJmxProviderImplJMXResourceProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJmxProviderImplJMXResourceProviderInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJmxProviderImplJMXResourceProviderInfo</returns>
            public OrgApacheSlingJmxProviderImplJMXResourceProviderInfo Build()
            {
                Validate();
                return new OrgApacheSlingJmxProviderImplJMXResourceProviderInfo(
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