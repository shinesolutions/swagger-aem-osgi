using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo
    /// </summary>
    public sealed class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo:  IEquatable<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo>
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
        public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo()
        {
        }

        private ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo(string Pid, string Title, string Description, ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder</returns>
        public static ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder Builder()
        {
            return new ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder</returns>
        public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder With()
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

        public bool Equals(ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo left, ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo left, ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties _Properties;

            internal ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoBuilder Properties(ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo</returns>
            public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo(
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