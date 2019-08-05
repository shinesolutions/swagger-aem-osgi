using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplAssetStaticImageHandlerInfo
    /// </summary>
    public sealed class ComAdobeCqCommerceImplAssetStaticImageHandlerInfo:  IEquatable<ComAdobeCqCommerceImplAssetStaticImageHandlerInfo>
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
        public ComAdobeCqCommerceImplAssetStaticImageHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplAssetStaticImageHandlerInfo()
        {
        }

        private ComAdobeCqCommerceImplAssetStaticImageHandlerInfo(string Pid, string Title, string Description, ComAdobeCqCommerceImplAssetStaticImageHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder</returns>
        public static ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder Builder()
        {
            return new ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder</returns>
        public ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeCqCommerceImplAssetStaticImageHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetStaticImageHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetStaticImageHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplAssetStaticImageHandlerInfo left, ComAdobeCqCommerceImplAssetStaticImageHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetStaticImageHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetStaticImageHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplAssetStaticImageHandlerInfo left, ComAdobeCqCommerceImplAssetStaticImageHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCommerceImplAssetStaticImageHandlerProperties _Properties;

            internal ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCommerceImplAssetStaticImageHandlerInfoBuilder Properties(ComAdobeCqCommerceImplAssetStaticImageHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplAssetStaticImageHandlerInfo</returns>
            public ComAdobeCqCommerceImplAssetStaticImageHandlerInfo Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplAssetStaticImageHandlerInfo(
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