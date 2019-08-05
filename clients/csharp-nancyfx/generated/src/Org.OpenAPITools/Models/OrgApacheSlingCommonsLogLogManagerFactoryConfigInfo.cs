using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo
    /// </summary>
    public sealed class OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo:  IEquatable<OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo>
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
        public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo()
        {
        }

        private OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo(string Pid, string Title, string Description, OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder</returns>
        public static OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder Builder()
        {
            return new OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder</returns>
        public OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo left, OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo left, OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.
        /// </summary>
        public sealed class OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties _Properties;

            internal OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoBuilder Properties(OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo</returns>
            public OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo Build()
            {
                Validate();
                return new OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo(
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