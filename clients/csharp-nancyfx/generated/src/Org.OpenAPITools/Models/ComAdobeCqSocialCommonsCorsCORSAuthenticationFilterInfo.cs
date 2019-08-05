using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo:  IEquatable<ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo>
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
        public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo()
        {
        }

        private ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder</returns>
        public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo left, ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo left, ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties _Properties;

            internal ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoBuilder Properties(ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo</returns>
            public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo(
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