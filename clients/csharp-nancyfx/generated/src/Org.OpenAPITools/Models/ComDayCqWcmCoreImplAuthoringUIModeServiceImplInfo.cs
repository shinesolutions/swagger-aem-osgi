using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo:  IEquatable<ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo>
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
        public ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo()
        {
        }

        private ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
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
        /// Returns builder of ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder</returns>
        public static ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder</returns>
        public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo left, ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo left, ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder Properties(ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo</returns>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo(
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