using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqHistoryImplHistoryServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqHistoryImplHistoryServiceImplInfo:  IEquatable<ComAdobeCqHistoryImplHistoryServiceImplInfo>
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
        public ComAdobeCqHistoryImplHistoryServiceImplProperties Properties { get; private set; }

        /// <summary>
        /// AdditionalProperties
        /// </summary>
        public string AdditionalProperties { get; private set; }

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
        /// Use ComAdobeCqHistoryImplHistoryServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqHistoryImplHistoryServiceImplInfo()
        {
        }

        private ComAdobeCqHistoryImplHistoryServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqHistoryImplHistoryServiceImplProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.AdditionalProperties = AdditionalProperties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqHistoryImplHistoryServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder</returns>
        public static ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder</returns>
        public ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .AdditionalProperties(AdditionalProperties)
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

        public bool Equals(ComAdobeCqHistoryImplHistoryServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqHistoryImplHistoryServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHistoryImplHistoryServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqHistoryImplHistoryServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqHistoryImplHistoryServiceImplInfo left, ComAdobeCqHistoryImplHistoryServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqHistoryImplHistoryServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHistoryImplHistoryServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqHistoryImplHistoryServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqHistoryImplHistoryServiceImplInfo left, ComAdobeCqHistoryImplHistoryServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqHistoryImplHistoryServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqHistoryImplHistoryServiceImplProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder Properties(ComAdobeCqHistoryImplHistoryServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryServiceImplInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryServiceImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHistoryImplHistoryServiceImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeCqHistoryImplHistoryServiceImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqHistoryImplHistoryServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqHistoryImplHistoryServiceImplInfo</returns>
            public ComAdobeCqHistoryImplHistoryServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqHistoryImplHistoryServiceImplInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    AdditionalProperties: _AdditionalProperties,
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