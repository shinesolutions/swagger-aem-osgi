using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDatasourceDataSourceFactoryInfo
    /// </summary>
    public sealed class OrgApacheSlingDatasourceDataSourceFactoryInfo:  IEquatable<OrgApacheSlingDatasourceDataSourceFactoryInfo>
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
        public OrgApacheSlingDatasourceDataSourceFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDatasourceDataSourceFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDatasourceDataSourceFactoryInfo()
        {
        }

        private OrgApacheSlingDatasourceDataSourceFactoryInfo(string Pid, string Title, string Description, OrgApacheSlingDatasourceDataSourceFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDatasourceDataSourceFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder</returns>
        public static OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder Builder()
        {
            return new OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder</returns>
        public OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDatasourceDataSourceFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDatasourceDataSourceFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDatasourceDataSourceFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDatasourceDataSourceFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDatasourceDataSourceFactoryInfo left, OrgApacheSlingDatasourceDataSourceFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDatasourceDataSourceFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDatasourceDataSourceFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDatasourceDataSourceFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDatasourceDataSourceFactoryInfo left, OrgApacheSlingDatasourceDataSourceFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDatasourceDataSourceFactoryInfo.
        /// </summary>
        public sealed class OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDatasourceDataSourceFactoryProperties _Properties;

            internal OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceDataSourceFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDatasourceDataSourceFactoryInfoBuilder Properties(OrgApacheSlingDatasourceDataSourceFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDatasourceDataSourceFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDatasourceDataSourceFactoryInfo</returns>
            public OrgApacheSlingDatasourceDataSourceFactoryInfo Build()
            {
                Validate();
                return new OrgApacheSlingDatasourceDataSourceFactoryInfo(
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