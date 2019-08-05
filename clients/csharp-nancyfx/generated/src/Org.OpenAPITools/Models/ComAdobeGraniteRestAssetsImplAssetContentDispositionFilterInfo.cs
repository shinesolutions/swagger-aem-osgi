using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo
    /// </summary>
    public sealed class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo:  IEquatable<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo>
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
        public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo()
        {
        }

        private ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo(string Pid, string Title, string Description, ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder</returns>
        public static ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder Builder()
        {
            return new ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder</returns>
        public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo left, ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo left, ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties _Properties;

            internal ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoBuilder Properties(ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo</returns>
            public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo(
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