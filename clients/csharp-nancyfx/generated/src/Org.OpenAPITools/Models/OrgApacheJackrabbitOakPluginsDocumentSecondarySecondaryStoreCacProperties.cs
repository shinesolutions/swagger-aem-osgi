using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties:  IEquatable<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties>
    { 
        /// <summary>
        /// IncludedPaths
        /// </summary>
        public ConfigNodePropertyArray IncludedPaths { get; private set; }

        /// <summary>
        /// EnableAsyncObserver
        /// </summary>
        public ConfigNodePropertyBoolean EnableAsyncObserver { get; private set; }

        /// <summary>
        /// ObserverQueueSize
        /// </summary>
        public ConfigNodePropertyInteger ObserverQueueSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(ConfigNodePropertyArray IncludedPaths, ConfigNodePropertyBoolean EnableAsyncObserver, ConfigNodePropertyInteger ObserverQueueSize)
        {
            
            this.IncludedPaths = IncludedPaths;
            
            this.EnableAsyncObserver = EnableAsyncObserver;
            
            this.ObserverQueueSize = ObserverQueueSize;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder With()
        {
            return Builder()
                .IncludedPaths(IncludedPaths)
                .EnableAsyncObserver(EnableAsyncObserver)
                .ObserverQueueSize(ObserverQueueSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties left, OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties left, OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder
        {
            private ConfigNodePropertyArray _IncludedPaths;
            private ConfigNodePropertyBoolean _EnableAsyncObserver;
            private ConfigNodePropertyInteger _ObserverQueueSize;

            internal OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.IncludedPaths property.
            /// </summary>
            /// <param name="value">IncludedPaths</param>
            public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder IncludedPaths(ConfigNodePropertyArray value)
            {
                _IncludedPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.EnableAsyncObserver property.
            /// </summary>
            /// <param name="value">EnableAsyncObserver</param>
            public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder EnableAsyncObserver(ConfigNodePropertyBoolean value)
            {
                _EnableAsyncObserver = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.ObserverQueueSize property.
            /// </summary>
            /// <param name="value">ObserverQueueSize</param>
            public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder ObserverQueueSize(ConfigNodePropertyInteger value)
            {
                _ObserverQueueSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties</returns>
            public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(
                    IncludedPaths: _IncludedPaths,
                    EnableAsyncObserver: _EnableAsyncObserver,
                    ObserverQueueSize: _ObserverQueueSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}