using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo(
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