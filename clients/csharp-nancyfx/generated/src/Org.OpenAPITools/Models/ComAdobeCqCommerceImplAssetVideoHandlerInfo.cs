using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplAssetVideoHandlerInfo
    /// </summary>
    public sealed class ComAdobeCqCommerceImplAssetVideoHandlerInfo:  IEquatable<ComAdobeCqCommerceImplAssetVideoHandlerInfo>
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
        public ComAdobeCqCommerceImplAssetVideoHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommerceImplAssetVideoHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplAssetVideoHandlerInfo()
        {
        }

        private ComAdobeCqCommerceImplAssetVideoHandlerInfo(string Pid, string Title, string Description, ComAdobeCqCommerceImplAssetVideoHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplAssetVideoHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder</returns>
        public static ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder Builder()
        {
            return new ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder</returns>
        public ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeCqCommerceImplAssetVideoHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplAssetVideoHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetVideoHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetVideoHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplAssetVideoHandlerInfo left, ComAdobeCqCommerceImplAssetVideoHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplAssetVideoHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetVideoHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetVideoHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplAssetVideoHandlerInfo left, ComAdobeCqCommerceImplAssetVideoHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplAssetVideoHandlerInfo.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCommerceImplAssetVideoHandlerProperties _Properties;

            internal ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetVideoHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetVideoHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetVideoHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetVideoHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCommerceImplAssetVideoHandlerInfoBuilder Properties(ComAdobeCqCommerceImplAssetVideoHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplAssetVideoHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplAssetVideoHandlerInfo</returns>
            public ComAdobeCqCommerceImplAssetVideoHandlerInfo Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplAssetVideoHandlerInfo(
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