using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSecurityACLSetupInfo
    /// </summary>
    public sealed class ComDayCqSecurityACLSetupInfo:  IEquatable<ComDayCqSecurityACLSetupInfo>
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
        public ComDayCqSecurityACLSetupProperties Properties { get; private set; }

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
        /// Use ComDayCqSecurityACLSetupInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSecurityACLSetupInfo()
        {
        }

        private ComDayCqSecurityACLSetupInfo(string Pid, string Title, string Description, ComDayCqSecurityACLSetupProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSecurityACLSetupInfo.
        /// </summary>
        /// <returns>ComDayCqSecurityACLSetupInfoBuilder</returns>
        public static ComDayCqSecurityACLSetupInfoBuilder Builder()
        {
            return new ComDayCqSecurityACLSetupInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSecurityACLSetupInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSecurityACLSetupInfoBuilder</returns>
        public ComDayCqSecurityACLSetupInfoBuilder With()
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

        public bool Equals(ComDayCqSecurityACLSetupInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSecurityACLSetupInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSecurityACLSetupInfo</param>
        /// <param name="right">Compared (ComDayCqSecurityACLSetupInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSecurityACLSetupInfo left, ComDayCqSecurityACLSetupInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSecurityACLSetupInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSecurityACLSetupInfo</param>
        /// <param name="right">Compared (ComDayCqSecurityACLSetupInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSecurityACLSetupInfo left, ComDayCqSecurityACLSetupInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSecurityACLSetupInfo.
        /// </summary>
        public sealed class ComDayCqSecurityACLSetupInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqSecurityACLSetupProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqSecurityACLSetupInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSecurityACLSetupInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqSecurityACLSetupInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSecurityACLSetupInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqSecurityACLSetupInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSecurityACLSetupInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqSecurityACLSetupInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSecurityACLSetupInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqSecurityACLSetupInfoBuilder Properties(ComDayCqSecurityACLSetupProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSecurityACLSetupInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqSecurityACLSetupInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSecurityACLSetupInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqSecurityACLSetupInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSecurityACLSetupInfo.
            /// </summary>
            /// <returns>ComDayCqSecurityACLSetupInfo</returns>
            public ComDayCqSecurityACLSetupInfo Build()
            {
                Validate();
                return new ComDayCqSecurityACLSetupInfo(
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