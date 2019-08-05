using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo left, ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo(
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