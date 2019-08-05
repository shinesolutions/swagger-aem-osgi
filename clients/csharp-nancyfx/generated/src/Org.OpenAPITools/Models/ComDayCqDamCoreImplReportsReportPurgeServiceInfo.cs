using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplReportsReportPurgeServiceInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplReportsReportPurgeServiceInfo:  IEquatable<ComDayCqDamCoreImplReportsReportPurgeServiceInfo>
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
        public ComDayCqDamCoreImplReportsReportPurgeServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplReportsReportPurgeServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplReportsReportPurgeServiceInfo()
        {
        }

        private ComDayCqDamCoreImplReportsReportPurgeServiceInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplReportsReportPurgeServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplReportsReportPurgeServiceInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder</returns>
        public static ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder</returns>
        public ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplReportsReportPurgeServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplReportsReportPurgeServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplReportsReportPurgeServiceInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplReportsReportPurgeServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplReportsReportPurgeServiceInfo left, ComDayCqDamCoreImplReportsReportPurgeServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplReportsReportPurgeServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplReportsReportPurgeServiceInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplReportsReportPurgeServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplReportsReportPurgeServiceInfo left, ComDayCqDamCoreImplReportsReportPurgeServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplReportsReportPurgeServiceInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplReportsReportPurgeServiceProperties _Properties;

            internal ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportPurgeServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportPurgeServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportPurgeServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportPurgeServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplReportsReportPurgeServiceInfoBuilder Properties(ComDayCqDamCoreImplReportsReportPurgeServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplReportsReportPurgeServiceInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplReportsReportPurgeServiceInfo</returns>
            public ComDayCqDamCoreImplReportsReportPurgeServiceInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplReportsReportPurgeServiceInfo(
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