using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties:  IEquatable<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties>
    { 
        /// <summary>
        /// XmphandlerCqFormats
        /// </summary>
        public ConfigNodePropertyArray XmphandlerCqFormats { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties()
        {
        }

        private ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties(ConfigNodePropertyArray XmphandlerCqFormats)
        {
            
            this.XmphandlerCqFormats = XmphandlerCqFormats;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder</returns>
        public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder With()
        {
            return Builder()
                .XmphandlerCqFormats(XmphandlerCqFormats);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties left, ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties left, ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _XmphandlerCqFormats;

            internal ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.XmphandlerCqFormats property.
            /// </summary>
            /// <param name="value">XmphandlerCqFormats</param>
            public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder XmphandlerCqFormats(ConfigNodePropertyArray value)
            {
                _XmphandlerCqFormats = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties</returns>
            public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties(
                    XmphandlerCqFormats: _XmphandlerCqFormats
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}