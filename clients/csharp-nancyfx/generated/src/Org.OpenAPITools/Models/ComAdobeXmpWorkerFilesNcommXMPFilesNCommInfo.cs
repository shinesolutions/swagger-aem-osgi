using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo
    /// </summary>
    public sealed class ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo:  IEquatable<ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo>
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
        public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties Properties { get; private set; }

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
        /// Use ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo()
        {
        }

        private ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo(string Pid, string Title, string Description, ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.
        /// </summary>
        /// <returns>ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder</returns>
        public static ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder Builder()
        {
            return new ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder</returns>
        public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder With()
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

        public bool Equals(ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo</param>
        /// <param name="right">Compared (ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo left, ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo</param>
        /// <param name="right">Compared (ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo left, ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.
        /// </summary>
        public sealed class ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder Properties(ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo.
            /// </summary>
            /// <returns>ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo</returns>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo Build()
            {
                Validate();
                return new ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo(
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