using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo:  IEquatable<ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo>
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
        public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo()
        {
        }

        private ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder</returns>
        public static ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder</returns>
        public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo left, ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo left, ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties _Properties;

            internal ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoBuilder Properties(ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo</returns>
            public ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo(
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