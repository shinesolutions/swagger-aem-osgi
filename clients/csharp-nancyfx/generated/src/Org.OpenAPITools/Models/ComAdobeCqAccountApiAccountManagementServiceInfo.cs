using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAccountApiAccountManagementServiceInfo
    /// </summary>
    public sealed class ComAdobeCqAccountApiAccountManagementServiceInfo:  IEquatable<ComAdobeCqAccountApiAccountManagementServiceInfo>
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
        public ComAdobeCqAccountApiAccountManagementServiceProperties Properties { get; private set; }

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
        /// Use ComAdobeCqAccountApiAccountManagementServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAccountApiAccountManagementServiceInfo()
        {
        }

        private ComAdobeCqAccountApiAccountManagementServiceInfo(string Pid, string Title, string Description, ComAdobeCqAccountApiAccountManagementServiceProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
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
        /// Returns builder of ComAdobeCqAccountApiAccountManagementServiceInfo.
        /// </summary>
        /// <returns>ComAdobeCqAccountApiAccountManagementServiceInfoBuilder</returns>
        public static ComAdobeCqAccountApiAccountManagementServiceInfoBuilder Builder()
        {
            return new ComAdobeCqAccountApiAccountManagementServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAccountApiAccountManagementServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAccountApiAccountManagementServiceInfoBuilder</returns>
        public ComAdobeCqAccountApiAccountManagementServiceInfoBuilder With()
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

        public bool Equals(ComAdobeCqAccountApiAccountManagementServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAccountApiAccountManagementServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAccountApiAccountManagementServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqAccountApiAccountManagementServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAccountApiAccountManagementServiceInfo left, ComAdobeCqAccountApiAccountManagementServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAccountApiAccountManagementServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAccountApiAccountManagementServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqAccountApiAccountManagementServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAccountApiAccountManagementServiceInfo left, ComAdobeCqAccountApiAccountManagementServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAccountApiAccountManagementServiceInfo.
        /// </summary>
        public sealed class ComAdobeCqAccountApiAccountManagementServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqAccountApiAccountManagementServiceProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeCqAccountApiAccountManagementServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqAccountApiAccountManagementServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqAccountApiAccountManagementServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqAccountApiAccountManagementServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqAccountApiAccountManagementServiceInfoBuilder Properties(ComAdobeCqAccountApiAccountManagementServiceProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public ComAdobeCqAccountApiAccountManagementServiceInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeCqAccountApiAccountManagementServiceInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeCqAccountApiAccountManagementServiceInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAccountApiAccountManagementServiceInfo.
            /// </summary>
            /// <returns>ComAdobeCqAccountApiAccountManagementServiceInfo</returns>
            public ComAdobeCqAccountApiAccountManagementServiceInfo Build()
            {
                Validate();
                return new ComAdobeCqAccountApiAccountManagementServiceInfo(
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