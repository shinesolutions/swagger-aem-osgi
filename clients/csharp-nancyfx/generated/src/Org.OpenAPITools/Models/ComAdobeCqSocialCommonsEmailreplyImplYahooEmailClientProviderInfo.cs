using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo(
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