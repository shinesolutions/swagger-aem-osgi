using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo:  IEquatable<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo>
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
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo()
        {
        }

        private ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder</returns>
        public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo left, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo left, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties _Properties;

            internal ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoBuilder Properties(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo</returns>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo(
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