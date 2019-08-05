using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo
    /// </summary>
    public sealed class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo:  IEquatable<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo>
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
        public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo()
        {
        }

        private ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo(string Pid, string Title, string Description, ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder</returns>
        public static ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder Builder()
        {
            return new ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder</returns>
        public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo left, ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo left, ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties _Properties;

            internal ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoBuilder Properties(ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo</returns>
            public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo(
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