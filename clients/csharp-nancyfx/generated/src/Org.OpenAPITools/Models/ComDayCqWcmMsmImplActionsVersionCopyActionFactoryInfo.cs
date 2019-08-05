using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo:  IEquatable<ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo>
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
        public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo()
        {
        }

        private ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo(string Pid, string Title, string Description, ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder</returns>
        public static ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder</returns>
        public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo left, ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo left, ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder Properties(ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo</returns>
            public ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo(
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