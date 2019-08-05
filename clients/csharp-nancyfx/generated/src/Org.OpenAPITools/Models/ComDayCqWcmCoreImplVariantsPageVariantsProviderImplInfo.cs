using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo:  IEquatable<ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo>
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
        public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo()
        {
        }

        private ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder</returns>
        public static ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder</returns>
        public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo left, ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo left, ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder Properties(ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo</returns>
            public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo(
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