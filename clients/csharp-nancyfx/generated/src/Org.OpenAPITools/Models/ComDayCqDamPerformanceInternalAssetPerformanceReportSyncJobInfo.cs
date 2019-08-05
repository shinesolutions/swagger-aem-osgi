using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo
    /// </summary>
    public sealed class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo:  IEquatable<ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo>
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
        public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo()
        {
        }

        private ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo(string Pid, string Title, string Description, ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.
        /// </summary>
        /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder</returns>
        public static ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder Builder()
        {
            return new ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder</returns>
        public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder With()
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

        public bool Equals(ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo</param>
        /// <param name="right">Compared (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo left, ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo</param>
        /// <param name="right">Compared (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo left, ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.
        /// </summary>
        public sealed class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties _Properties;

            internal ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoBuilder Properties(ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo.
            /// </summary>
            /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo</returns>
            public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo Build()
            {
                Validate();
                return new ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo(
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