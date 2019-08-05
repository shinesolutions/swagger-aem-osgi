using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo
    /// </summary>
    public sealed class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo:  IEquatable<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo>
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
        public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo()
        {
        }

        private ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo(string Pid, string Title, string Description, ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder</returns>
        public static ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder Builder()
        {
            return new ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder</returns>
        public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo left, ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo left, ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties _Properties;

            internal ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoBuilder Properties(ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo</returns>
            public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo(
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