using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo
    /// </summary>
    public sealed class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo:  IEquatable<ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo>
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
        public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo()
        {
        }

        private ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo(string Pid, string Title, string Description, ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder</returns>
        public static ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder Builder()
        {
            return new ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder</returns>
        public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo left, ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo left, ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties _Properties;

            internal ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoBuilder Properties(ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo</returns>
            public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo(
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