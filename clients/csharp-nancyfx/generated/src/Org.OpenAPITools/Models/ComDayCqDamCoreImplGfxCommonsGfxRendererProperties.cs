using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplGfxCommonsGfxRendererProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties:  IEquatable<ComDayCqDamCoreImplGfxCommonsGfxRendererProperties>
    { 
        /// <summary>
        /// SkipBufferedcache
        /// </summary>
        public ConfigNodePropertyBoolean SkipBufferedcache { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplGfxCommonsGfxRendererProperties()
        {
        }

        private ComDayCqDamCoreImplGfxCommonsGfxRendererProperties(ConfigNodePropertyBoolean SkipBufferedcache)
        {
            
            this.SkipBufferedcache = SkipBufferedcache;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder</returns>
        public ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder With()
        {
            return Builder()
                .SkipBufferedcache(SkipBufferedcache);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplGfxCommonsGfxRendererProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties left, ComDayCqDamCoreImplGfxCommonsGfxRendererProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties left, ComDayCqDamCoreImplGfxCommonsGfxRendererProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _SkipBufferedcache;

            internal ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.SkipBufferedcache property.
            /// </summary>
            /// <param name="value">SkipBufferedcache</param>
            public ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder SkipBufferedcache(ConfigNodePropertyBoolean value)
            {
                _SkipBufferedcache = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplGfxCommonsGfxRendererProperties</returns>
            public ComDayCqDamCoreImplGfxCommonsGfxRendererProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplGfxCommonsGfxRendererProperties(
                    SkipBufferedcache: _SkipBufferedcache
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}