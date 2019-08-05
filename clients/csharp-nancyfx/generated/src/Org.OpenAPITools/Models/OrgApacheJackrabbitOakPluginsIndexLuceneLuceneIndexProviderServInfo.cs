using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo:  IEquatable<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo>
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
        public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
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
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo left, OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo left, OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder Properties(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo</returns>
            public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo(
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