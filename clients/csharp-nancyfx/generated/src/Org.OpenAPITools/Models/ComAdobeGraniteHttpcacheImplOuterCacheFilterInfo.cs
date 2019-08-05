using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo
    /// </summary>
    public sealed class ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo:  IEquatable<ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo>
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
        public ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo()
        {
        }

        private ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo(string Pid, string Title, string Description, ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder</returns>
        public static ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder Builder()
        {
            return new ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder</returns>
        public ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo left, ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo left, ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.
        /// </summary>
        public sealed class ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties _Properties;

            internal ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoBuilder Properties(ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo</returns>
            public ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo Build()
            {
                Validate();
                return new ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo(
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