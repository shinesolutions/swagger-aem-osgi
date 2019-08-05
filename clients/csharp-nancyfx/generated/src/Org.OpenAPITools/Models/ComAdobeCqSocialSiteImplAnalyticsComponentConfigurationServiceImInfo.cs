using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo
    /// </summary>
    public sealed class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo:  IEquatable<ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo>
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
        public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo()
        {
        }

        private ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo(string Pid, string Title, string Description, ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder</returns>
        public static ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder Builder()
        {
            return new ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder</returns>
        public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo left, ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo left, ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties _Properties;

            internal ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoBuilder Properties(ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo</returns>
            public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo(
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