using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo
    /// </summary>
    public sealed class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo:  IEquatable<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo>
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
        public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties Properties { get; private set; }

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
        /// Use ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo()
        {
        }

        private ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo(string Pid, string Title, string Description, ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder</returns>
        public static ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder Builder()
        {
            return new ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder</returns>
        public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder With()
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

        public bool Equals(ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo left, ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo left, ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.
        /// </summary>
        public sealed class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder Properties(ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.
            /// </summary>
            /// <returns>ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo</returns>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo Build()
            {
                Validate();
                return new ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo(
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