using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo
    /// </summary>
    public sealed class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo:  IEquatable<ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo>
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
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo()
        {
        }

        private ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo(string Pid, string Title, string Description, ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder</returns>
        public static ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder Builder()
        {
            return new ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder</returns>
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo left, ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo left, ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties _Properties;

            internal ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoBuilder Properties(ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo</returns>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo(
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