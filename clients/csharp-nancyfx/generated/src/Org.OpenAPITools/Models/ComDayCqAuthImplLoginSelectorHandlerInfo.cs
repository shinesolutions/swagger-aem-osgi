using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAuthImplLoginSelectorHandlerInfo
    /// </summary>
    public sealed class ComDayCqAuthImplLoginSelectorHandlerInfo:  IEquatable<ComDayCqAuthImplLoginSelectorHandlerInfo>
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
        public ComDayCqAuthImplLoginSelectorHandlerProperties Properties { get; private set; }

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
        /// Use ComDayCqAuthImplLoginSelectorHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAuthImplLoginSelectorHandlerInfo()
        {
        }

        private ComDayCqAuthImplLoginSelectorHandlerInfo(string Pid, string Title, string Description, ComDayCqAuthImplLoginSelectorHandlerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAuthImplLoginSelectorHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqAuthImplLoginSelectorHandlerInfoBuilder</returns>
        public static ComDayCqAuthImplLoginSelectorHandlerInfoBuilder Builder()
        {
            return new ComDayCqAuthImplLoginSelectorHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAuthImplLoginSelectorHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAuthImplLoginSelectorHandlerInfoBuilder</returns>
        public ComDayCqAuthImplLoginSelectorHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqAuthImplLoginSelectorHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAuthImplLoginSelectorHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAuthImplLoginSelectorHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqAuthImplLoginSelectorHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAuthImplLoginSelectorHandlerInfo left, ComDayCqAuthImplLoginSelectorHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAuthImplLoginSelectorHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAuthImplLoginSelectorHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqAuthImplLoginSelectorHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAuthImplLoginSelectorHandlerInfo left, ComDayCqAuthImplLoginSelectorHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAuthImplLoginSelectorHandlerInfo.
        /// </summary>
        public sealed class ComDayCqAuthImplLoginSelectorHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAuthImplLoginSelectorHandlerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqAuthImplLoginSelectorHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAuthImplLoginSelectorHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAuthImplLoginSelectorHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAuthImplLoginSelectorHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAuthImplLoginSelectorHandlerInfoBuilder Properties(ComDayCqAuthImplLoginSelectorHandlerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqAuthImplLoginSelectorHandlerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplLoginSelectorHandlerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqAuthImplLoginSelectorHandlerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAuthImplLoginSelectorHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqAuthImplLoginSelectorHandlerInfo</returns>
            public ComDayCqAuthImplLoginSelectorHandlerInfo Build()
            {
                Validate();
                return new ComDayCqAuthImplLoginSelectorHandlerInfo(
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