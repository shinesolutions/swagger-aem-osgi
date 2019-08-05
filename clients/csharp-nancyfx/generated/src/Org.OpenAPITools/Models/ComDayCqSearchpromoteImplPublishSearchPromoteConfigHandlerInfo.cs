using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo
    /// </summary>
    public sealed class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo:  IEquatable<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo>
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
        public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties Properties { get; private set; }

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
        /// Use ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo()
        {
        }

        private ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo(string Pid, string Title, string Description, ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder</returns>
        public static ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder Builder()
        {
            return new ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder</returns>
        public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo left, ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo left, ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.
        /// </summary>
        public sealed class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder Properties(ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo</returns>
            public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo Build()
            {
                Validate();
                return new ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo(
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