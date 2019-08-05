using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
    /// </summary>
    public sealed class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties:  IEquatable<ComAdobeGraniteHttpcacheFileFileCacheStoreProperties>
    { 
        /// <summary>
        /// ComAdobeGraniteHttpcacheFileDocumentRoot
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteHttpcacheFileDocumentRoot { get; private set; }

        /// <summary>
        /// ComAdobeGraniteHttpcacheFileIncludeHost
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteHttpcacheFileIncludeHost { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties()
        {
        }

        private ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(ConfigNodePropertyString ComAdobeGraniteHttpcacheFileDocumentRoot, ConfigNodePropertyString ComAdobeGraniteHttpcacheFileIncludeHost)
        {
            
            this.ComAdobeGraniteHttpcacheFileDocumentRoot = ComAdobeGraniteHttpcacheFileDocumentRoot;
            
            this.ComAdobeGraniteHttpcacheFileIncludeHost = ComAdobeGraniteHttpcacheFileIncludeHost;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder</returns>
        public static ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder</returns>
        public ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder With()
        {
            return Builder()
                .ComAdobeGraniteHttpcacheFileDocumentRoot(ComAdobeGraniteHttpcacheFileDocumentRoot)
                .ComAdobeGraniteHttpcacheFileIncludeHost(ComAdobeGraniteHttpcacheFileIncludeHost);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteHttpcacheFileFileCacheStoreProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties left, ComAdobeGraniteHttpcacheFileFileCacheStoreProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties left, ComAdobeGraniteHttpcacheFileFileCacheStoreProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.
        /// </summary>
        public sealed class ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder
        {
            private ConfigNodePropertyString _ComAdobeGraniteHttpcacheFileDocumentRoot;
            private ConfigNodePropertyString _ComAdobeGraniteHttpcacheFileIncludeHost;

            internal ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.ComAdobeGraniteHttpcacheFileDocumentRoot property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteHttpcacheFileDocumentRoot</param>
            public ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder ComAdobeGraniteHttpcacheFileDocumentRoot(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteHttpcacheFileDocumentRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.ComAdobeGraniteHttpcacheFileIncludeHost property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteHttpcacheFileIncludeHost</param>
            public ComAdobeGraniteHttpcacheFileFileCacheStorePropertiesBuilder ComAdobeGraniteHttpcacheFileIncludeHost(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteHttpcacheFileIncludeHost = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteHttpcacheFileFileCacheStoreProperties</returns>
            public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties Build()
            {
                Validate();
                return new ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(
                    ComAdobeGraniteHttpcacheFileDocumentRoot: _ComAdobeGraniteHttpcacheFileDocumentRoot,
                    ComAdobeGraniteHttpcacheFileIncludeHost: _ComAdobeGraniteHttpcacheFileIncludeHost
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}