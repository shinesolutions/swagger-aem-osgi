using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo
    /// </summary>
    public sealed class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo:  IEquatable<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo>
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
        public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties Properties { get; private set; }

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
        /// Use ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo()
        {
        }

        private ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo(string Pid, string Title, string Description, ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
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
        /// Returns builder of ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder</returns>
        public static ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder Builder()
        {
            return new ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder</returns>
        public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder With()
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

        public bool Equals(ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo left, ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo left, ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.
        /// </summary>
        public sealed class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder Properties(ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo.
            /// </summary>
            /// <returns>ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo</returns>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo Build()
            {
                Validate();
                return new ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo(
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