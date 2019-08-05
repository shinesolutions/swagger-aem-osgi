using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo
    /// </summary>
    public sealed class ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo:  IEquatable<ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo>
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
        public ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo()
        {
        }

        private ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo(string Pid, string Title, string Description, ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder</returns>
        public static ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder Builder()
        {
            return new ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder</returns>
        public ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo left, ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo left, ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties _Properties;

            internal ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoBuilder Properties(ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo</returns>
            public ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo(
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