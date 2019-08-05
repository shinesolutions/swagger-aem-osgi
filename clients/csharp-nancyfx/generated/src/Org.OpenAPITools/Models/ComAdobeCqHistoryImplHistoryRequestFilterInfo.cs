using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqHistoryImplHistoryRequestFilterInfo
    /// </summary>
    public sealed class ComAdobeCqHistoryImplHistoryRequestFilterInfo:  IEquatable<ComAdobeCqHistoryImplHistoryRequestFilterInfo>
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
        public ComAdobeCqHistoryImplHistoryRequestFilterProperties Properties { get; private set; }

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
        /// Use ComAdobeCqHistoryImplHistoryRequestFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqHistoryImplHistoryRequestFilterInfo()
        {
        }

        private ComAdobeCqHistoryImplHistoryRequestFilterInfo(string Pid, string Title, string Description, ComAdobeCqHistoryImplHistoryRequestFilterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqHistoryImplHistoryRequestFilterInfo.
        /// </summary>
        /// <returns>ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder</returns>
        public static ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder Builder()
        {
            return new ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder</returns>
        public ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder With()
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

        public bool Equals(ComAdobeCqHistoryImplHistoryRequestFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqHistoryImplHistoryRequestFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHistoryImplHistoryRequestFilterInfo</param>
        /// <param name="right">Compared (ComAdobeCqHistoryImplHistoryRequestFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqHistoryImplHistoryRequestFilterInfo left, ComAdobeCqHistoryImplHistoryRequestFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqHistoryImplHistoryRequestFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHistoryImplHistoryRequestFilterInfo</param>
        /// <param name="right">Compared (ComAdobeCqHistoryImplHistoryRequestFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqHistoryImplHistoryRequestFilterInfo left, ComAdobeCqHistoryImplHistoryRequestFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqHistoryImplHistoryRequestFilterInfo.
        /// </summary>
        public sealed class ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqHistoryImplHistoryRequestFilterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryRequestFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryRequestFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryRequestFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryRequestFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder Properties(ComAdobeCqHistoryImplHistoryRequestFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryRequestFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryRequestFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeCqHistoryImplHistoryRequestFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqHistoryImplHistoryRequestFilterInfo.
            /// </summary>
            /// <returns>ComAdobeCqHistoryImplHistoryRequestFilterInfo</returns>
            public ComAdobeCqHistoryImplHistoryRequestFilterInfo Build()
            {
                Validate();
                return new ComAdobeCqHistoryImplHistoryRequestFilterInfo(
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