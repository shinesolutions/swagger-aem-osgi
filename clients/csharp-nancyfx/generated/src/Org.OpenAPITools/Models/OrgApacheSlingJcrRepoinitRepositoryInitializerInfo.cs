using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrRepoinitRepositoryInitializerInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrRepoinitRepositoryInitializerInfo:  IEquatable<OrgApacheSlingJcrRepoinitRepositoryInitializerInfo>
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
        public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrRepoinitRepositoryInitializerInfo()
        {
        }

        private OrgApacheSlingJcrRepoinitRepositoryInitializerInfo(string Pid, string Title, string Description, OrgApacheSlingJcrRepoinitRepositoryInitializerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder</returns>
        public static OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder</returns>
        public OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrRepoinitRepositoryInitializerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrRepoinitRepositoryInitializerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrRepoinitRepositoryInitializerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrRepoinitRepositoryInitializerInfo left, OrgApacheSlingJcrRepoinitRepositoryInitializerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrRepoinitRepositoryInitializerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrRepoinitRepositoryInitializerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrRepoinitRepositoryInitializerInfo left, OrgApacheSlingJcrRepoinitRepositoryInitializerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrRepoinitRepositoryInitializerProperties _Properties;

            internal OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrRepoinitRepositoryInitializerInfoBuilder Properties(OrgApacheSlingJcrRepoinitRepositoryInitializerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrRepoinitRepositoryInitializerInfo</returns>
            public OrgApacheSlingJcrRepoinitRepositoryInitializerInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrRepoinitRepositoryInitializerInfo(
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