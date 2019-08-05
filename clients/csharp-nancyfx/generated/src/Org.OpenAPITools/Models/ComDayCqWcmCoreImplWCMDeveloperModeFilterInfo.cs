using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo:  IEquatable<ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo>
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
        public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo()
        {
        }

        private ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
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
        /// Returns builder of ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder</returns>
        public static ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder</returns>
        public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo left, ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo left, ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder Properties(ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo</returns>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo(
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