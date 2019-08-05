using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo:  IEquatable<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo>
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
        public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo()
        {
        }

        private ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo(string Pid, string Title, string Description, ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder</returns>
        public static ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder</returns>
        public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo left, ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo left, ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder Properties(ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo</returns>
            public ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo(
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