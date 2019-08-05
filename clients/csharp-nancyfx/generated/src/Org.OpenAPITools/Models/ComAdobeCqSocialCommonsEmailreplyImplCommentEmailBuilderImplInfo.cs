using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo left, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo left, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo(
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