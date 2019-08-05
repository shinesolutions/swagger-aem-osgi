using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsThumbnailServletInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsThumbnailServletInfo:  IEquatable<ComDayCqWcmCoreImplServletsThumbnailServletInfo>
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
        public ComDayCqWcmCoreImplServletsThumbnailServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsThumbnailServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsThumbnailServletInfo()
        {
        }

        private ComDayCqWcmCoreImplServletsThumbnailServletInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplServletsThumbnailServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsThumbnailServletInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder</returns>
        public static ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder</returns>
        public ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplServletsThumbnailServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsThumbnailServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsThumbnailServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsThumbnailServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsThumbnailServletInfo left, ComDayCqWcmCoreImplServletsThumbnailServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsThumbnailServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsThumbnailServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsThumbnailServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsThumbnailServletInfo left, ComDayCqWcmCoreImplServletsThumbnailServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsThumbnailServletInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplServletsThumbnailServletProperties _Properties;

            internal ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsThumbnailServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsThumbnailServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsThumbnailServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsThumbnailServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplServletsThumbnailServletInfoBuilder Properties(ComDayCqWcmCoreImplServletsThumbnailServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsThumbnailServletInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsThumbnailServletInfo</returns>
            public ComDayCqWcmCoreImplServletsThumbnailServletInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsThumbnailServletInfo(
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