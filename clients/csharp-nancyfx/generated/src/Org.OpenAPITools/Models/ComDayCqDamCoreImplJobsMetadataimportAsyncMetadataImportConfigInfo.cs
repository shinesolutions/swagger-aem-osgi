using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo:  IEquatable<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo>
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
        public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo()
        {
        }

        private ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder</returns>
        public static ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder</returns>
        public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo left, ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo left, ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties _Properties;

            internal ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoBuilder Properties(ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo</returns>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo(
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