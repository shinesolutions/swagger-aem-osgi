using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo:  IEquatable<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo>
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
        public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo()
        {
        }

        private ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder</returns>
        public static ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder</returns>
        public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo left, ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo left, ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties _Properties;

            internal ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoBuilder Properties(ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo</returns>
            public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo(
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