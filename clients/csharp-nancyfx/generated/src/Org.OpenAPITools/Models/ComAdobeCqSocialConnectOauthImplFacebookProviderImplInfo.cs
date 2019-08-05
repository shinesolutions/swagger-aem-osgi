using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo:  IEquatable<ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo>
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
        public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo()
        {
        }

        private ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder</returns>
        public static ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder</returns>
        public ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo left, ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo left, ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties _Properties;

            internal ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoBuilder Properties(ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo</returns>
            public ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo(
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