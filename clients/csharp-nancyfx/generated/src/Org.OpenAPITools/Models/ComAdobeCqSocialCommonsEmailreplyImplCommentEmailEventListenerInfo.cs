using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo left, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo left, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo(
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