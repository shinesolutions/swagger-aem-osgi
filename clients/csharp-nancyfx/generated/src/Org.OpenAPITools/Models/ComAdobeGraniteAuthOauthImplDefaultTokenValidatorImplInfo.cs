using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo:  IEquatable<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo>
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
        public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo()
        {
        }

        private ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo left, ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo left, ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties _Properties;

            internal ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoBuilder Properties(ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo</returns>
            public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo(
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