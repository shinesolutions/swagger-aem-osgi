using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo:  IEquatable<ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo>
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
        public ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo()
        {
        }

        private ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder</returns>
        public static ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder</returns>
        public ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo left, ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo left, ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties _Properties;

            internal ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoBuilder Properties(ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo</returns>
            public ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo(
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