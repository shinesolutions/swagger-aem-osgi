using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo
    /// </summary>
    public sealed class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo:  IEquatable<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo>
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
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo()
        {
        }

        private ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo(string Pid, string Title, string Description, ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder</returns>
        public static ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder Builder()
        {
            return new ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder</returns>
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo left, ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo left, ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties _Properties;

            internal ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoBuilder Properties(ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo</returns>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo(
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