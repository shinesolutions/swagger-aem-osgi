using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCommonsUtilImplAssetCacheImplProperties
    /// </summary>
    public sealed class ComDayCqDamCommonsUtilImplAssetCacheImplProperties:  IEquatable<ComDayCqDamCommonsUtilImplAssetCacheImplProperties>
    { 
        /// <summary>
        /// LargeFileMin
        /// </summary>
        public ConfigNodePropertyInteger LargeFileMin { get; private set; }

        /// <summary>
        /// CacheApply
        /// </summary>
        public ConfigNodePropertyBoolean CacheApply { get; private set; }

        /// <summary>
        /// MimeTypes
        /// </summary>
        public ConfigNodePropertyArray MimeTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCommonsUtilImplAssetCacheImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCommonsUtilImplAssetCacheImplProperties()
        {
        }

        private ComDayCqDamCommonsUtilImplAssetCacheImplProperties(ConfigNodePropertyInteger LargeFileMin, ConfigNodePropertyBoolean CacheApply, ConfigNodePropertyArray MimeTypes)
        {
            
            this.LargeFileMin = LargeFileMin;
            
            this.CacheApply = CacheApply;
            
            this.MimeTypes = MimeTypes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCommonsUtilImplAssetCacheImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder</returns>
        public static ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder</returns>
        public ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder With()
        {
            return Builder()
                .LargeFileMin(LargeFileMin)
                .CacheApply(CacheApply)
                .MimeTypes(MimeTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCommonsUtilImplAssetCacheImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCommonsUtilImplAssetCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsUtilImplAssetCacheImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCommonsUtilImplAssetCacheImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCommonsUtilImplAssetCacheImplProperties left, ComDayCqDamCommonsUtilImplAssetCacheImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCommonsUtilImplAssetCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsUtilImplAssetCacheImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCommonsUtilImplAssetCacheImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCommonsUtilImplAssetCacheImplProperties left, ComDayCqDamCommonsUtilImplAssetCacheImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCommonsUtilImplAssetCacheImplProperties.
        /// </summary>
        public sealed class ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _LargeFileMin;
            private ConfigNodePropertyBoolean _CacheApply;
            private ConfigNodePropertyArray _MimeTypes;

            internal ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsUtilImplAssetCacheImplProperties.LargeFileMin property.
            /// </summary>
            /// <param name="value">LargeFileMin</param>
            public ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder LargeFileMin(ConfigNodePropertyInteger value)
            {
                _LargeFileMin = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsUtilImplAssetCacheImplProperties.CacheApply property.
            /// </summary>
            /// <param name="value">CacheApply</param>
            public ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder CacheApply(ConfigNodePropertyBoolean value)
            {
                _CacheApply = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsUtilImplAssetCacheImplProperties.MimeTypes property.
            /// </summary>
            /// <param name="value">MimeTypes</param>
            public ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder MimeTypes(ConfigNodePropertyArray value)
            {
                _MimeTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCommonsUtilImplAssetCacheImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamCommonsUtilImplAssetCacheImplProperties</returns>
            public ComDayCqDamCommonsUtilImplAssetCacheImplProperties Build()
            {
                Validate();
                return new ComDayCqDamCommonsUtilImplAssetCacheImplProperties(
                    LargeFileMin: _LargeFileMin,
                    CacheApply: _CacheApply,
                    MimeTypes: _MimeTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}