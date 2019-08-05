using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo
    /// </summary>
    public sealed class ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo:  IEquatable<ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo>
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
        public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties Properties { get; private set; }

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
        /// Use ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo()
        {
        }

        private ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo(string Pid, string Title, string Description, ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder</returns>
        public static ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder Builder()
        {
            return new ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder</returns>
        public ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo left, ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo left, ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.
        /// </summary>
        public sealed class ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder Properties(ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo</returns>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo Build()
            {
                Validate();
                return new ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo(
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