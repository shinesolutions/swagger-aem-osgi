using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo
    /// </summary>
    public sealed class ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo:  IEquatable<ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo>
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
        public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties Properties { get; private set; }

        /// <summary>
        /// AdditionalProperties
        /// </summary>
        public string AdditionalProperties { get; private set; }

        /// <summary>
        /// BundleLocation
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// ServiceLocation
        /// </summary>
        public string ServiceLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo()
        {
        }

        private ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo(string Pid, string Title, string Description, ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.AdditionalProperties = AdditionalProperties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder</returns>
        public static ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder Builder()
        {
            return new ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder</returns>
        public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .AdditionalProperties(AdditionalProperties)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo left, ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo left, ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.
        /// </summary>
        public sealed class ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder Properties(ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo</returns>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo Build()
            {
                Validate();
                return new ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    AdditionalProperties: _AdditionalProperties,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}