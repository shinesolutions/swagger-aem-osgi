using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo
    /// </summary>
    public sealed class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo:  IEquatable<ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo>
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
        public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo()
        {
        }

        private ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo(string Pid, string Title, string Description, ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder</returns>
        public static ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder Builder()
        {
            return new ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder</returns>
        public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo left, ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo left, ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder Properties(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo</returns>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo(
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