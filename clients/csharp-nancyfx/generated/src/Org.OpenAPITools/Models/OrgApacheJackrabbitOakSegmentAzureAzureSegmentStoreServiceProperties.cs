using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties:  IEquatable<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties>
    { 
        /// <summary>
        /// AccountName
        /// </summary>
        public ConfigNodePropertyString AccountName { get; private set; }

        /// <summary>
        /// ContainerName
        /// </summary>
        public ConfigNodePropertyString ContainerName { get; private set; }

        /// <summary>
        /// AccessKey
        /// </summary>
        public ConfigNodePropertyString AccessKey { get; private set; }

        /// <summary>
        /// RootPath
        /// </summary>
        public ConfigNodePropertyString RootPath { get; private set; }

        /// <summary>
        /// ConnectionURL
        /// </summary>
        public ConfigNodePropertyString ConnectionURL { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties()
        {
        }

        private OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(ConfigNodePropertyString AccountName, ConfigNodePropertyString ContainerName, ConfigNodePropertyString AccessKey, ConfigNodePropertyString RootPath, ConfigNodePropertyString ConnectionURL)
        {
            
            this.AccountName = AccountName;
            
            this.ContainerName = ContainerName;
            
            this.AccessKey = AccessKey;
            
            this.RootPath = RootPath;
            
            this.ConnectionURL = ConnectionURL;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder With()
        {
            return Builder()
                .AccountName(AccountName)
                .ContainerName(ContainerName)
                .AccessKey(AccessKey)
                .RootPath(RootPath)
                .ConnectionURL(ConnectionURL);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties left, OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties left, OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder
        {
            private ConfigNodePropertyString _AccountName;
            private ConfigNodePropertyString _ContainerName;
            private ConfigNodePropertyString _AccessKey;
            private ConfigNodePropertyString _RootPath;
            private ConfigNodePropertyString _ConnectionURL;

            internal OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.AccountName property.
            /// </summary>
            /// <param name="value">AccountName</param>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder AccountName(ConfigNodePropertyString value)
            {
                _AccountName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.ContainerName property.
            /// </summary>
            /// <param name="value">ContainerName</param>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder ContainerName(ConfigNodePropertyString value)
            {
                _ContainerName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.AccessKey property.
            /// </summary>
            /// <param name="value">AccessKey</param>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder AccessKey(ConfigNodePropertyString value)
            {
                _AccessKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.RootPath property.
            /// </summary>
            /// <param name="value">RootPath</param>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder RootPath(ConfigNodePropertyString value)
            {
                _RootPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.ConnectionURL property.
            /// </summary>
            /// <param name="value">ConnectionURL</param>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder ConnectionURL(ConfigNodePropertyString value)
            {
                _ConnectionURL = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties</returns>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(
                    AccountName: _AccountName,
                    ContainerName: _ContainerName,
                    AccessKey: _AccessKey,
                    RootPath: _RootPath,
                    ConnectionURL: _ConnectionURL
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}