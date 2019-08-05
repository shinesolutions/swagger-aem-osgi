using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo(
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