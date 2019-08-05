using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletAssetDownloadServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletAssetDownloadServletInfo:  IEquatable<ComDayCqDamCoreImplServletAssetDownloadServletInfo>
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
        public ComDayCqDamCoreImplServletAssetDownloadServletProperties Properties { get; private set; }

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
        /// Use ComDayCqDamCoreImplServletAssetDownloadServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletAssetDownloadServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletAssetDownloadServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletAssetDownloadServletProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletAssetDownloadServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletAssetDownloadServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletAssetDownloadServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetDownloadServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetDownloadServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletAssetDownloadServletInfo left, ComDayCqDamCoreImplServletAssetDownloadServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletAssetDownloadServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetDownloadServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetDownloadServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletAssetDownloadServletInfo left, ComDayCqDamCoreImplServletAssetDownloadServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletAssetDownloadServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletAssetDownloadServletProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetDownloadServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetDownloadServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetDownloadServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetDownloadServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder Properties(ComDayCqDamCoreImplServletAssetDownloadServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetDownloadServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetDownloadServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqDamCoreImplServletAssetDownloadServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletAssetDownloadServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletAssetDownloadServletInfo</returns>
            public ComDayCqDamCoreImplServletAssetDownloadServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletAssetDownloadServletInfo(
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