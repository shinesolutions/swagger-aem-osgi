using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo
    /// </summary>
    public sealed class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo:  IEquatable<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo>
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
        public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo()
        {
        }

        private ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo(string Pid, string Title, string Description, ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.
        /// </summary>
        /// <returns>ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder</returns>
        public static ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder Builder()
        {
            return new ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder</returns>
        public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder With()
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

        public bool Equals(ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo</param>
        /// <param name="right">Compared (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo left, ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo</param>
        /// <param name="right">Compared (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo left, ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.
        /// </summary>
        public sealed class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties _Properties;

            internal ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoBuilder Properties(ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.
            /// </summary>
            /// <returns>ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo</returns>
            public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo Build()
            {
                Validate();
                return new ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo(
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