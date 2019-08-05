using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo left, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo left, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo(
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