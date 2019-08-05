using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo
    /// </summary>
    public sealed class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo:  IEquatable<ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo>
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
        public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo()
        {
        }

        private ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo(string Pid, string Title, string Description, ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder</returns>
        public static ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder Builder()
        {
            return new ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder</returns>
        public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo left, ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo left, ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder Properties(ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo</returns>
            public ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo(
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