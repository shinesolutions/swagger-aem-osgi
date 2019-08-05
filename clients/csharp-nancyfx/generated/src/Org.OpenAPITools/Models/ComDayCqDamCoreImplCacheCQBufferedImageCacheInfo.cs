using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo:  IEquatable<ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo>
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
        public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo()
        {
        }

        private ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder</returns>
        public static ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder</returns>
        public ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo left, ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo left, ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties _Properties;

            internal ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplCacheCQBufferedImageCacheInfoBuilder Properties(ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo</returns>
            public ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo(
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