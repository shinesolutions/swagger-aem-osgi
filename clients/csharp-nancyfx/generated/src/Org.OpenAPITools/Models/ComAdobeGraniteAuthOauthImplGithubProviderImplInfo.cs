using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplGithubProviderImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplGithubProviderImplInfo:  IEquatable<ComAdobeGraniteAuthOauthImplGithubProviderImplInfo>
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
        public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplGithubProviderImplInfo()
        {
        }

        private ComAdobeGraniteAuthOauthImplGithubProviderImplInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthImplGithubProviderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplGithubProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplGithubProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplGithubProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplGithubProviderImplInfo left, ComAdobeGraniteAuthOauthImplGithubProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplGithubProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplGithubProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplGithubProviderImplInfo left, ComAdobeGraniteAuthOauthImplGithubProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthImplGithubProviderImplProperties _Properties;

            internal ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplInfoBuilder Properties(ComAdobeGraniteAuthOauthImplGithubProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplGithubProviderImplInfo</returns>
            public ComAdobeGraniteAuthOauthImplGithubProviderImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplGithubProviderImplInfo(
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