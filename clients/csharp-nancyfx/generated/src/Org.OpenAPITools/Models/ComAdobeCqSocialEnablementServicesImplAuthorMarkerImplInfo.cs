using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo:  IEquatable<ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo>
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
        public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties Properties { get; private set; }

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
        /// Use ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo()
        {
        }

        private ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder</returns>
        public static ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder</returns>
        public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo left, ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo left, ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder Properties(ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo</returns>
            public ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo(
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