using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo:  IEquatable<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo>
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
        public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo()
        {
        }

        private ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder</returns>
        public static ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder</returns>
        public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo left, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo left, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties _Properties;

            internal ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoBuilder Properties(ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo</returns>
            public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo(
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