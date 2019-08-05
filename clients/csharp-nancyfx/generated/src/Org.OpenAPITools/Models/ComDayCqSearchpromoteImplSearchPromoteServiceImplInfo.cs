using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo
    /// </summary>
    public sealed class ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo:  IEquatable<ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo>
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
        public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties Properties { get; private set; }

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
        /// Use ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo()
        {
        }

        private ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo(string Pid, string Title, string Description, ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder</returns>
        public static ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder Builder()
        {
            return new ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder</returns>
        public ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo left, ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo left, ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder Properties(ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo</returns>
            public ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo(
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