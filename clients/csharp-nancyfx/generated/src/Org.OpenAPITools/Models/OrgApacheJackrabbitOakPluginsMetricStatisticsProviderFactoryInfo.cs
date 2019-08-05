using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo:  IEquatable<OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo>
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
        public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo left, OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo left, OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties _Properties;

            internal OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoBuilder Properties(OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo</returns>
            public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo(
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