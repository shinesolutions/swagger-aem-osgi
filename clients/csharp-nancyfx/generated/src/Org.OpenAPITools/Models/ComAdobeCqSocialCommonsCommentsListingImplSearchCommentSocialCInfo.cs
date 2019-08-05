using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo:  IEquatable<ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo>
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
        public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo()
        {
        }

        private ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder</returns>
        public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo left, ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo left, ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties _Properties;

            internal ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoBuilder Properties(ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo</returns>
            public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo(
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