using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo:  IEquatable<ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo>
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
        public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo()
        {
        }

        private ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo(string Pid, string Title, string Description, ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder</returns>
        public static ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder</returns>
        public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo left, ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo left, ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder Properties(ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo</returns>
            public ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo(
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