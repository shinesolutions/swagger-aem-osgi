using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties:  IEquatable<ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties>
    { 
        /// <summary>
        /// CqDamImageCacheMaxMemory
        /// </summary>
        public ConfigNodePropertyInteger CqDamImageCacheMaxMemory { get; private set; }

        /// <summary>
        /// CqDamImageCacheMaxAge
        /// </summary>
        public ConfigNodePropertyInteger CqDamImageCacheMaxAge { get; private set; }

        /// <summary>
        /// CqDamImageCacheMaxDimension
        /// </summary>
        public ConfigNodePropertyString CqDamImageCacheMaxDimension { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties()
        {
        }

        private ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(ConfigNodePropertyInteger CqDamImageCacheMaxMemory, ConfigNodePropertyInteger CqDamImageCacheMaxAge, ConfigNodePropertyString CqDamImageCacheMaxDimension)
        {
            
            this.CqDamImageCacheMaxMemory = CqDamImageCacheMaxMemory;
            
            this.CqDamImageCacheMaxAge = CqDamImageCacheMaxAge;
            
            this.CqDamImageCacheMaxDimension = CqDamImageCacheMaxDimension;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder</returns>
        public static ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder</returns>
        public ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder With()
        {
            return Builder()
                .CqDamImageCacheMaxMemory(CqDamImageCacheMaxMemory)
                .CqDamImageCacheMaxAge(CqDamImageCacheMaxAge)
                .CqDamImageCacheMaxDimension(CqDamImageCacheMaxDimension);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties left, ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties left, ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqDamImageCacheMaxMemory;
            private ConfigNodePropertyInteger _CqDamImageCacheMaxAge;
            private ConfigNodePropertyString _CqDamImageCacheMaxDimension;

            internal ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.CqDamImageCacheMaxMemory property.
            /// </summary>
            /// <param name="value">CqDamImageCacheMaxMemory</param>
            public ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder CqDamImageCacheMaxMemory(ConfigNodePropertyInteger value)
            {
                _CqDamImageCacheMaxMemory = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.CqDamImageCacheMaxAge property.
            /// </summary>
            /// <param name="value">CqDamImageCacheMaxAge</param>
            public ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder CqDamImageCacheMaxAge(ConfigNodePropertyInteger value)
            {
                _CqDamImageCacheMaxAge = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.CqDamImageCacheMaxDimension property.
            /// </summary>
            /// <param name="value">CqDamImageCacheMaxDimension</param>
            public ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder CqDamImageCacheMaxDimension(ConfigNodePropertyString value)
            {
                _CqDamImageCacheMaxDimension = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties</returns>
            public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(
                    CqDamImageCacheMaxMemory: _CqDamImageCacheMaxMemory,
                    CqDamImageCacheMaxAge: _CqDamImageCacheMaxAge,
                    CqDamImageCacheMaxDimension: _CqDamImageCacheMaxDimension
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}