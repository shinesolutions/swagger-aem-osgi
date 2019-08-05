using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo>
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
        public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo left, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo left, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties _Properties;

            internal ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoBuilder Properties(ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo(
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