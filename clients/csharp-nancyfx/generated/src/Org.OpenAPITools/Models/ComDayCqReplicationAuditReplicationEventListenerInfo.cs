using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationAuditReplicationEventListenerInfo
    /// </summary>
    public sealed class ComDayCqReplicationAuditReplicationEventListenerInfo:  IEquatable<ComDayCqReplicationAuditReplicationEventListenerInfo>
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
        public ComDayCqReplicationAuditReplicationEventListenerProperties Properties { get; private set; }

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
        /// Use ComDayCqReplicationAuditReplicationEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationAuditReplicationEventListenerInfo()
        {
        }

        private ComDayCqReplicationAuditReplicationEventListenerInfo(string Pid, string Title, string Description, ComDayCqReplicationAuditReplicationEventListenerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationAuditReplicationEventListenerInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationAuditReplicationEventListenerInfoBuilder</returns>
        public static ComDayCqReplicationAuditReplicationEventListenerInfoBuilder Builder()
        {
            return new ComDayCqReplicationAuditReplicationEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationAuditReplicationEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationAuditReplicationEventListenerInfoBuilder</returns>
        public ComDayCqReplicationAuditReplicationEventListenerInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationAuditReplicationEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationAuditReplicationEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationAuditReplicationEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationAuditReplicationEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationAuditReplicationEventListenerInfo left, ComDayCqReplicationAuditReplicationEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationAuditReplicationEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationAuditReplicationEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationAuditReplicationEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationAuditReplicationEventListenerInfo left, ComDayCqReplicationAuditReplicationEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationAuditReplicationEventListenerInfo.
        /// </summary>
        public sealed class ComDayCqReplicationAuditReplicationEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationAuditReplicationEventListenerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqReplicationAuditReplicationEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationAuditReplicationEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationAuditReplicationEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationAuditReplicationEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationAuditReplicationEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationAuditReplicationEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationAuditReplicationEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationAuditReplicationEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationAuditReplicationEventListenerInfoBuilder Properties(ComDayCqReplicationAuditReplicationEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationAuditReplicationEventListenerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqReplicationAuditReplicationEventListenerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationAuditReplicationEventListenerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqReplicationAuditReplicationEventListenerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationAuditReplicationEventListenerInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationAuditReplicationEventListenerInfo</returns>
            public ComDayCqReplicationAuditReplicationEventListenerInfo Build()
            {
                Validate();
                return new ComDayCqReplicationAuditReplicationEventListenerInfo(
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