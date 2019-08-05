using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo
    /// </summary>
    public sealed class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo:  IEquatable<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo>
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
        public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo()
        {
        }

        private ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo(string Pid, string Title, string Description, ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder</returns>
        public static ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder Builder()
        {
            return new ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder</returns>
        public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo left, ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo left, ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.
        /// </summary>
        public sealed class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder Properties(ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo</returns>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo Build()
            {
                Validate();
                return new ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo(
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