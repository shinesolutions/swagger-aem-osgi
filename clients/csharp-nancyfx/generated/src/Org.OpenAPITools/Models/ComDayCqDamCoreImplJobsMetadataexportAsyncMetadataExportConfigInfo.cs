using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo:  IEquatable<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo>
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
        public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo()
        {
        }

        private ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder</returns>
        public static ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder</returns>
        public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo left, ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo left, ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties _Properties;

            internal ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoBuilder Properties(ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo</returns>
            public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo(
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