using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingCoreImplScriptCacheImplProperties
    /// </summary>
    public sealed class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties:  IEquatable<OrgApacheSlingScriptingCoreImplScriptCacheImplProperties>
    { 
        /// <summary>
        /// OrgApacheSlingScriptingCacheSize
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheSlingScriptingCacheSize { get; private set; }

        /// <summary>
        /// OrgApacheSlingScriptingCacheAdditionalExtensions
        /// </summary>
        public ConfigNodePropertyArray OrgApacheSlingScriptingCacheAdditionalExtensions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties()
        {
        }

        private OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(ConfigNodePropertyInteger OrgApacheSlingScriptingCacheSize, ConfigNodePropertyArray OrgApacheSlingScriptingCacheAdditionalExtensions)
        {
            
            this.OrgApacheSlingScriptingCacheSize = OrgApacheSlingScriptingCacheSize;
            
            this.OrgApacheSlingScriptingCacheAdditionalExtensions = OrgApacheSlingScriptingCacheAdditionalExtensions;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder</returns>
        public static OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder</returns>
        public OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheSlingScriptingCacheSize(OrgApacheSlingScriptingCacheSize)
                .OrgApacheSlingScriptingCacheAdditionalExtensions(OrgApacheSlingScriptingCacheAdditionalExtensions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingScriptingCoreImplScriptCacheImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties left, OrgApacheSlingScriptingCoreImplScriptCacheImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties left, OrgApacheSlingScriptingCoreImplScriptCacheImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _OrgApacheSlingScriptingCacheSize;
            private ConfigNodePropertyArray _OrgApacheSlingScriptingCacheAdditionalExtensions;

            internal OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.OrgApacheSlingScriptingCacheSize property.
            /// </summary>
            /// <param name="value">OrgApacheSlingScriptingCacheSize</param>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder OrgApacheSlingScriptingCacheSize(ConfigNodePropertyInteger value)
            {
                _OrgApacheSlingScriptingCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.OrgApacheSlingScriptingCacheAdditionalExtensions property.
            /// </summary>
            /// <param name="value">OrgApacheSlingScriptingCacheAdditionalExtensions</param>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder OrgApacheSlingScriptingCacheAdditionalExtensions(ConfigNodePropertyArray value)
            {
                _OrgApacheSlingScriptingCacheAdditionalExtensions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingCoreImplScriptCacheImplProperties</returns>
            public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(
                    OrgApacheSlingScriptingCacheSize: _OrgApacheSlingScriptingCacheSize,
                    OrgApacheSlingScriptingCacheAdditionalExtensions: _OrgApacheSlingScriptingCacheAdditionalExtensions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}