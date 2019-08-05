using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteHttpcacheFileFileCacheStoreInfo
    /// </summary>
    public sealed class ComAdobeGraniteHttpcacheFileFileCacheStoreInfo:  IEquatable<ComAdobeGraniteHttpcacheFileFileCacheStoreInfo>
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
        public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteHttpcacheFileFileCacheStoreInfo()
        {
        }

        private ComAdobeGraniteHttpcacheFileFileCacheStoreInfo(string Pid, string Title, string Description, ComAdobeGraniteHttpcacheFileFileCacheStoreProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder</returns>
        public static ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder Builder()
        {
            return new ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder</returns>
        public ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteHttpcacheFileFileCacheStoreInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteHttpcacheFileFileCacheStoreInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteHttpcacheFileFileCacheStoreInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteHttpcacheFileFileCacheStoreInfo left, ComAdobeGraniteHttpcacheFileFileCacheStoreInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteHttpcacheFileFileCacheStoreInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteHttpcacheFileFileCacheStoreInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteHttpcacheFileFileCacheStoreInfo left, ComAdobeGraniteHttpcacheFileFileCacheStoreInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.
        /// </summary>
        public sealed class ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteHttpcacheFileFileCacheStoreProperties _Properties;

            internal ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteHttpcacheFileFileCacheStoreInfoBuilder Properties(ComAdobeGraniteHttpcacheFileFileCacheStoreProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteHttpcacheFileFileCacheStoreInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteHttpcacheFileFileCacheStoreInfo</returns>
            public ComAdobeGraniteHttpcacheFileFileCacheStoreInfo Build()
            {
                Validate();
                return new ComAdobeGraniteHttpcacheFileFileCacheStoreInfo(
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