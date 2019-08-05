using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqCommonsImplExternalizerImplInfo
    /// </summary>
    public sealed class ComDayCqCommonsImplExternalizerImplInfo:  IEquatable<ComDayCqCommonsImplExternalizerImplInfo>
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
        public ComDayCqCommonsImplExternalizerImplProperties Properties { get; private set; }

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
        /// Use ComDayCqCommonsImplExternalizerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqCommonsImplExternalizerImplInfo()
        {
        }

        private ComDayCqCommonsImplExternalizerImplInfo(string Pid, string Title, string Description, ComDayCqCommonsImplExternalizerImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqCommonsImplExternalizerImplInfo.
        /// </summary>
        /// <returns>ComDayCqCommonsImplExternalizerImplInfoBuilder</returns>
        public static ComDayCqCommonsImplExternalizerImplInfoBuilder Builder()
        {
            return new ComDayCqCommonsImplExternalizerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqCommonsImplExternalizerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqCommonsImplExternalizerImplInfoBuilder</returns>
        public ComDayCqCommonsImplExternalizerImplInfoBuilder With()
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

        public bool Equals(ComDayCqCommonsImplExternalizerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqCommonsImplExternalizerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCommonsImplExternalizerImplInfo</param>
        /// <param name="right">Compared (ComDayCqCommonsImplExternalizerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqCommonsImplExternalizerImplInfo left, ComDayCqCommonsImplExternalizerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqCommonsImplExternalizerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCommonsImplExternalizerImplInfo</param>
        /// <param name="right">Compared (ComDayCqCommonsImplExternalizerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqCommonsImplExternalizerImplInfo left, ComDayCqCommonsImplExternalizerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqCommonsImplExternalizerImplInfo.
        /// </summary>
        public sealed class ComDayCqCommonsImplExternalizerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqCommonsImplExternalizerImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqCommonsImplExternalizerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqCommonsImplExternalizerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqCommonsImplExternalizerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqCommonsImplExternalizerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqCommonsImplExternalizerImplInfoBuilder Properties(ComDayCqCommonsImplExternalizerImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqCommonsImplExternalizerImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqCommonsImplExternalizerImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqCommonsImplExternalizerImplInfo.
            /// </summary>
            /// <returns>ComDayCqCommonsImplExternalizerImplInfo</returns>
            public ComDayCqCommonsImplExternalizerImplInfo Build()
            {
                Validate();
                return new ComDayCqCommonsImplExternalizerImplInfo(
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