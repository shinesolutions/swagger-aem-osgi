using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo
    /// </summary>
    public sealed class ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo:  IEquatable<ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo>
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
        public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo()
        {
        }

        private ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo(string Pid, string Title, string Description, ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder</returns>
        public static ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder Builder()
        {
            return new ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder</returns>
        public ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo left, ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo left, ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.
        /// </summary>
        public sealed class ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder Properties(ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo</returns>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo Build()
            {
                Validate();
                return new ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo(
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