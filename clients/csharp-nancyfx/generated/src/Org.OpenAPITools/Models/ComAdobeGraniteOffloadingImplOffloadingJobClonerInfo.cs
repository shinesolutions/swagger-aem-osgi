using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo
    /// </summary>
    public sealed class ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo:  IEquatable<ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo>
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
        public ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo()
        {
        }

        private ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo(string Pid, string Title, string Description, ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder</returns>
        public static ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder Builder()
        {
            return new ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder</returns>
        public ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo left, ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo left, ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder Properties(ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteOffloadingImplOffloadingJobClonerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo</returns>
            public ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo(
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