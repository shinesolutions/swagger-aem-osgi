using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingResourcemergerPickerOverridingInfo
    /// </summary>
    public sealed class OrgApacheSlingResourcemergerPickerOverridingInfo:  IEquatable<OrgApacheSlingResourcemergerPickerOverridingInfo>
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
        public OrgApacheSlingResourcemergerPickerOverridingProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingResourcemergerPickerOverridingInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingResourcemergerPickerOverridingInfo()
        {
        }

        private OrgApacheSlingResourcemergerPickerOverridingInfo(string Pid, string Title, string Description, OrgApacheSlingResourcemergerPickerOverridingProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
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
        /// Returns builder of OrgApacheSlingResourcemergerPickerOverridingInfo.
        /// </summary>
        /// <returns>OrgApacheSlingResourcemergerPickerOverridingInfoBuilder</returns>
        public static OrgApacheSlingResourcemergerPickerOverridingInfoBuilder Builder()
        {
            return new OrgApacheSlingResourcemergerPickerOverridingInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingResourcemergerPickerOverridingInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingResourcemergerPickerOverridingInfoBuilder</returns>
        public OrgApacheSlingResourcemergerPickerOverridingInfoBuilder With()
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

        public bool Equals(OrgApacheSlingResourcemergerPickerOverridingInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingResourcemergerPickerOverridingInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourcemergerPickerOverridingInfo</param>
        /// <param name="right">Compared (OrgApacheSlingResourcemergerPickerOverridingInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingResourcemergerPickerOverridingInfo left, OrgApacheSlingResourcemergerPickerOverridingInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingResourcemergerPickerOverridingInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourcemergerPickerOverridingInfo</param>
        /// <param name="right">Compared (OrgApacheSlingResourcemergerPickerOverridingInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingResourcemergerPickerOverridingInfo left, OrgApacheSlingResourcemergerPickerOverridingInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingResourcemergerPickerOverridingInfo.
        /// </summary>
        public sealed class OrgApacheSlingResourcemergerPickerOverridingInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingResourcemergerPickerOverridingProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingResourcemergerPickerOverridingInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerPickerOverridingInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingResourcemergerPickerOverridingInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerPickerOverridingInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingResourcemergerPickerOverridingInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerPickerOverridingInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingResourcemergerPickerOverridingInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerPickerOverridingInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingResourcemergerPickerOverridingInfoBuilder Properties(OrgApacheSlingResourcemergerPickerOverridingProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerPickerOverridingInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public OrgApacheSlingResourcemergerPickerOverridingInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerPickerOverridingInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingResourcemergerPickerOverridingInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerPickerOverridingInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingResourcemergerPickerOverridingInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingResourcemergerPickerOverridingInfo.
            /// </summary>
            /// <returns>OrgApacheSlingResourcemergerPickerOverridingInfo</returns>
            public OrgApacheSlingResourcemergerPickerOverridingInfo Build()
            {
                Validate();
                return new OrgApacheSlingResourcemergerPickerOverridingInfo(
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