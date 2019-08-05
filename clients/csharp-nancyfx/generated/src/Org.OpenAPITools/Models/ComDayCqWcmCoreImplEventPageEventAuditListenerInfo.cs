using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplEventPageEventAuditListenerInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplEventPageEventAuditListenerInfo:  IEquatable<ComDayCqWcmCoreImplEventPageEventAuditListenerInfo>
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
        public ComDayCqWcmCoreImplEventPageEventAuditListenerProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplEventPageEventAuditListenerInfo()
        {
        }

        private ComDayCqWcmCoreImplEventPageEventAuditListenerInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplEventPageEventAuditListenerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder</returns>
        public static ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder</returns>
        public ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplEventPageEventAuditListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventPageEventAuditListenerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventPageEventAuditListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplEventPageEventAuditListenerInfo left, ComDayCqWcmCoreImplEventPageEventAuditListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventPageEventAuditListenerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventPageEventAuditListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplEventPageEventAuditListenerInfo left, ComDayCqWcmCoreImplEventPageEventAuditListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplEventPageEventAuditListenerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder Properties(ComDayCqWcmCoreImplEventPageEventAuditListenerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmCoreImplEventPageEventAuditListenerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplEventPageEventAuditListenerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplEventPageEventAuditListenerInfo</returns>
            public ComDayCqWcmCoreImplEventPageEventAuditListenerInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplEventPageEventAuditListenerInfo(
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