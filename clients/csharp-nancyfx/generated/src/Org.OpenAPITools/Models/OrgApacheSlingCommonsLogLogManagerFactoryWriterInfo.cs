using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo
    /// </summary>
    public sealed class OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo:  IEquatable<OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo>
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
        public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo()
        {
        }

        private OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo(string Pid, string Title, string Description, OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder</returns>
        public static OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder Builder()
        {
            return new OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder</returns>
        public OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo left, OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo left, OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        /// </summary>
        public sealed class OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties _Properties;

            internal OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoBuilder Properties(OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo</returns>
            public OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo Build()
            {
                Validate();
                return new OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo(
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