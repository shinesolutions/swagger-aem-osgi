using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo:  IEquatable<ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo>
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
        public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo()
        {
        }

        private ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder</returns>
        public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo left, ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo left, ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties _Properties;

            internal ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoBuilder Properties(ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo</returns>
            public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo(
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