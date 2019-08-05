using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmNotificationImplNotificationManagerImplInfo
    /// </summary>
    public sealed class ComDayCqWcmNotificationImplNotificationManagerImplInfo:  IEquatable<ComDayCqWcmNotificationImplNotificationManagerImplInfo>
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
        public ComDayCqWcmNotificationImplNotificationManagerImplProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmNotificationImplNotificationManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmNotificationImplNotificationManagerImplInfo()
        {
        }

        private ComDayCqWcmNotificationImplNotificationManagerImplInfo(string Pid, string Title, string Description, ComDayCqWcmNotificationImplNotificationManagerImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmNotificationImplNotificationManagerImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder</returns>
        public static ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder Builder()
        {
            return new ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder</returns>
        public ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmNotificationImplNotificationManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmNotificationImplNotificationManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmNotificationImplNotificationManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmNotificationImplNotificationManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmNotificationImplNotificationManagerImplInfo left, ComDayCqWcmNotificationImplNotificationManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmNotificationImplNotificationManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmNotificationImplNotificationManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmNotificationImplNotificationManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmNotificationImplNotificationManagerImplInfo left, ComDayCqWcmNotificationImplNotificationManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmNotificationImplNotificationManagerImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmNotificationImplNotificationManagerImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationImplNotificationManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationImplNotificationManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationImplNotificationManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationImplNotificationManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder Properties(ComDayCqWcmNotificationImplNotificationManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationImplNotificationManagerImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationImplNotificationManagerImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmNotificationImplNotificationManagerImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmNotificationImplNotificationManagerImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmNotificationImplNotificationManagerImplInfo</returns>
            public ComDayCqWcmNotificationImplNotificationManagerImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmNotificationImplNotificationManagerImplInfo(
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