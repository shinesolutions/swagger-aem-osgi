using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo left, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo left, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo(
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