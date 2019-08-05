using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo:  IEquatable<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo>
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
        public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo()
        {
        }

        private ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder</returns>
        public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo left, ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo left, ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties _Properties;

            internal ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoBuilder Properties(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo</returns>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo(
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