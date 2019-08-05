using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingI18nImplJcrResourceBundleProviderInfo
    /// </summary>
    public sealed class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo:  IEquatable<OrgApacheSlingI18nImplJcrResourceBundleProviderInfo>
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
        public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo()
        {
        }

        private OrgApacheSlingI18nImplJcrResourceBundleProviderInfo(string Pid, string Title, string Description, OrgApacheSlingI18nImplJcrResourceBundleProviderProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
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
        /// Returns builder of OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.
        /// </summary>
        /// <returns>OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder</returns>
        public static OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder Builder()
        {
            return new OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder</returns>
        public OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder With()
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

        public bool Equals(OrgApacheSlingI18nImplJcrResourceBundleProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingI18nImplJcrResourceBundleProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingI18nImplJcrResourceBundleProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingI18nImplJcrResourceBundleProviderInfo left, OrgApacheSlingI18nImplJcrResourceBundleProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingI18nImplJcrResourceBundleProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingI18nImplJcrResourceBundleProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingI18nImplJcrResourceBundleProviderInfo left, OrgApacheSlingI18nImplJcrResourceBundleProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.
        /// </summary>
        public sealed class OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingI18nImplJcrResourceBundleProviderProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder Properties(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.
            /// </summary>
            /// <returns>OrgApacheSlingI18nImplJcrResourceBundleProviderInfo</returns>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo Build()
            {
                Validate();
                return new OrgApacheSlingI18nImplJcrResourceBundleProviderInfo(
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