using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo:  IEquatable<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo>
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
        public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties Properties { get; private set; }

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
        /// Use ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo()
        {
        }

        private ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder</returns>
        public static ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder</returns>
        public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
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

        public bool Equals(ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo left, ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo left, ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder Properties(ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo</returns>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
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