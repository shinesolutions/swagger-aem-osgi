using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletGuidLookupFilterInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletGuidLookupFilterInfo:  IEquatable<ComDayCqDamCoreImplServletGuidLookupFilterInfo>
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
        public ComDayCqDamCoreImplServletGuidLookupFilterProperties Properties { get; private set; }

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
        /// Use ComDayCqDamCoreImplServletGuidLookupFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletGuidLookupFilterInfo()
        {
        }

        private ComDayCqDamCoreImplServletGuidLookupFilterInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletGuidLookupFilterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletGuidLookupFilterInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder</returns>
        public ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletGuidLookupFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletGuidLookupFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletGuidLookupFilterInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletGuidLookupFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletGuidLookupFilterInfo left, ComDayCqDamCoreImplServletGuidLookupFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletGuidLookupFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletGuidLookupFilterInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletGuidLookupFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletGuidLookupFilterInfo left, ComDayCqDamCoreImplServletGuidLookupFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletGuidLookupFilterInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletGuidLookupFilterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletGuidLookupFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletGuidLookupFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletGuidLookupFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletGuidLookupFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder Properties(ComDayCqDamCoreImplServletGuidLookupFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletGuidLookupFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletGuidLookupFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqDamCoreImplServletGuidLookupFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletGuidLookupFilterInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletGuidLookupFilterInfo</returns>
            public ComDayCqDamCoreImplServletGuidLookupFilterInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletGuidLookupFilterInfo(
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