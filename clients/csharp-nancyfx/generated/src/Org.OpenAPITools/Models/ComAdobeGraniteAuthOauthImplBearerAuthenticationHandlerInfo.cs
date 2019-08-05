using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo:  IEquatable<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo>
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
        public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo()
        {
        }

        private ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo left, ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo left, ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties _Properties;

            internal ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoBuilder Properties(ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo</returns>
            public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo(
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