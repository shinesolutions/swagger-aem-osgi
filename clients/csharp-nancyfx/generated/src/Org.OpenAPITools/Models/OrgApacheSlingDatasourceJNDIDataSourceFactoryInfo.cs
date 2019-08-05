using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo
    /// </summary>
    public sealed class OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo:  IEquatable<OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo>
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
        public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo()
        {
        }

        private OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo(string Pid, string Title, string Description, OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder</returns>
        public static OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder Builder()
        {
            return new OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder</returns>
        public OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo left, OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo left, OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        /// </summary>
        public sealed class OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties _Properties;

            internal OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoBuilder Properties(OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo</returns>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo Build()
            {
                Validate();
                return new OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo(
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