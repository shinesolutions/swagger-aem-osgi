using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo(
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