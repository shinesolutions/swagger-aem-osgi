using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryImplCommitStatsConfigInfo
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryImplCommitStatsConfigInfo:  IEquatable<ComAdobeGraniteRepositoryImplCommitStatsConfigInfo>
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
        public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryImplCommitStatsConfigInfo()
        {
        }

        private ComAdobeGraniteRepositoryImplCommitStatsConfigInfo(string Pid, string Title, string Description, ComAdobeGraniteRepositoryImplCommitStatsConfigProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder</returns>
        public static ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder</returns>
        public ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryImplCommitStatsConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryImplCommitStatsConfigInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryImplCommitStatsConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryImplCommitStatsConfigInfo left, ComAdobeGraniteRepositoryImplCommitStatsConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryImplCommitStatsConfigInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryImplCommitStatsConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryImplCommitStatsConfigInfo left, ComAdobeGraniteRepositoryImplCommitStatsConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRepositoryImplCommitStatsConfigProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder Properties(ComAdobeGraniteRepositoryImplCommitStatsConfigProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryImplCommitStatsConfigInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryImplCommitStatsConfigInfo</returns>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryImplCommitStatsConfigInfo(
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