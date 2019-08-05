using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo:  IEquatable<ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo>
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
        public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties Properties { get; private set; }

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
        /// Use ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo()
        {
        }

        private ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo(string Pid, string Title, string Description, ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
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
        /// Returns builder of ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder</returns>
        public static ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder</returns>
        public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo left, ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo left, ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder Properties(ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo</returns>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo(
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