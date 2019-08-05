using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo
    /// </summary>
    public sealed class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo:  IEquatable<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo>
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
        public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo()
        {
        }

        private ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo(string Pid, string Title, string Description, ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder</returns>
        public static ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder Builder()
        {
            return new ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder</returns>
        public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder With()
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

        public bool Equals(ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo left, ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo left, ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties _Properties;

            internal ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoBuilder Properties(ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo</returns>
            public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo(
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