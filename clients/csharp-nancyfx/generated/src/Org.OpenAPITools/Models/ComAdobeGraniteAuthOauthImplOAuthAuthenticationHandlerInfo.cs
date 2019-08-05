using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo:  IEquatable<ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo>
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
        public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo()
        {
        }

        private ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo left, ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo left, ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties _Properties;

            internal ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoBuilder Properties(ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo</returns>
            public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo(
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