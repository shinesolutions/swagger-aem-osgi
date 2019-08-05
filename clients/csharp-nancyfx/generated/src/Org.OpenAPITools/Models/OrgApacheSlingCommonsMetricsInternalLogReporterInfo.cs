using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsMetricsInternalLogReporterInfo
    /// </summary>
    public sealed class OrgApacheSlingCommonsMetricsInternalLogReporterInfo:  IEquatable<OrgApacheSlingCommonsMetricsInternalLogReporterInfo>
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
        public OrgApacheSlingCommonsMetricsInternalLogReporterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsMetricsInternalLogReporterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsMetricsInternalLogReporterInfo()
        {
        }

        private OrgApacheSlingCommonsMetricsInternalLogReporterInfo(string Pid, string Title, string Description, OrgApacheSlingCommonsMetricsInternalLogReporterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsMetricsInternalLogReporterInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder</returns>
        public static OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder Builder()
        {
            return new OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder</returns>
        public OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCommonsMetricsInternalLogReporterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsMetricsInternalLogReporterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMetricsInternalLogReporterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMetricsInternalLogReporterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsMetricsInternalLogReporterInfo left, OrgApacheSlingCommonsMetricsInternalLogReporterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsMetricsInternalLogReporterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMetricsInternalLogReporterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMetricsInternalLogReporterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsMetricsInternalLogReporterInfo left, OrgApacheSlingCommonsMetricsInternalLogReporterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsMetricsInternalLogReporterInfo.
        /// </summary>
        public sealed class OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCommonsMetricsInternalLogReporterProperties _Properties;

            internal OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsInternalLogReporterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCommonsMetricsInternalLogReporterInfoBuilder Properties(OrgApacheSlingCommonsMetricsInternalLogReporterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsMetricsInternalLogReporterInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsMetricsInternalLogReporterInfo</returns>
            public OrgApacheSlingCommonsMetricsInternalLogReporterInfo Build()
            {
                Validate();
                return new OrgApacheSlingCommonsMetricsInternalLogReporterInfo(
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