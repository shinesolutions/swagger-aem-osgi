using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplReportsReportExportServiceInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplReportsReportExportServiceInfo:  IEquatable<ComDayCqDamCoreImplReportsReportExportServiceInfo>
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
        public ComDayCqDamCoreImplReportsReportExportServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplReportsReportExportServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplReportsReportExportServiceInfo()
        {
        }

        private ComDayCqDamCoreImplReportsReportExportServiceInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplReportsReportExportServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplReportsReportExportServiceInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder</returns>
        public static ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder</returns>
        public ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplReportsReportExportServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplReportsReportExportServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplReportsReportExportServiceInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplReportsReportExportServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplReportsReportExportServiceInfo left, ComDayCqDamCoreImplReportsReportExportServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplReportsReportExportServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplReportsReportExportServiceInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplReportsReportExportServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplReportsReportExportServiceInfo left, ComDayCqDamCoreImplReportsReportExportServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplReportsReportExportServiceInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplReportsReportExportServiceProperties _Properties;

            internal ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportExportServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportExportServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportExportServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportExportServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplReportsReportExportServiceInfoBuilder Properties(ComDayCqDamCoreImplReportsReportExportServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplReportsReportExportServiceInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplReportsReportExportServiceInfo</returns>
            public ComDayCqDamCoreImplReportsReportExportServiceInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplReportsReportExportServiceInfo(
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