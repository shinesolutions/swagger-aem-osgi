using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo
    /// </summary>
    public sealed class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo:  IEquatable<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo>
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
        public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo()
        {
        }

        private ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo(string Pid, string Title, string Description, ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder</returns>
        public static ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder Builder()
        {
            return new ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder</returns>
        public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo left, ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo left, ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.
        /// </summary>
        public sealed class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder Properties(ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo</returns>
            public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo Build()
            {
                Validate();
                return new ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo(
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