using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo:  IEquatable<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo>
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
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo()
        {
        }

        private ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder</returns>
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo left, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo left, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties _Properties;

            internal ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoBuilder Properties(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo</returns>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo(
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