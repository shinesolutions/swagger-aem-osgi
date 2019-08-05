using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo
    /// </summary>
    public sealed class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo:  IEquatable<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo>
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
        public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo()
        {
        }

        private ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo(string Pid, string Title, string Description, ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder</returns>
        public static ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder Builder()
        {
            return new ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder</returns>
        public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo left, ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo left, ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.
        /// </summary>
        public sealed class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder Properties(ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo</returns>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo Build()
            {
                Validate();
                return new ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo(
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