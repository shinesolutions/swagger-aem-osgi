using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo:  IEquatable<OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo>
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
        public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo left, OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo left, OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties _Properties;

            internal OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoBuilder Properties(OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo</returns>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}