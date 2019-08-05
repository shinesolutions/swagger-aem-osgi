using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo:  IEquatable<ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo>
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
        public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo()
        {
        }

        private ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo(string Pid, string Title, string Description, ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder</returns>
        public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo left, ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo left, ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties _Properties;

            internal ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoBuilder Properties(ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo</returns>
            public ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo(
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