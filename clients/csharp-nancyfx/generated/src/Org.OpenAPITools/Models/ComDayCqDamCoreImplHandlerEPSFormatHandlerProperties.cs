using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties:  IEquatable<ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties>
    { 
        /// <summary>
        /// Mimetype
        /// </summary>
        public ConfigNodePropertyString Mimetype { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties()
        {
        }

        private ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties(ConfigNodePropertyString Mimetype)
        {
            
            this.Mimetype = Mimetype;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder</returns>
        public ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder With()
        {
            return Builder()
                .Mimetype(Mimetype);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties left, ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties left, ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _Mimetype;

            internal ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.Mimetype property.
            /// </summary>
            /// <param name="value">Mimetype</param>
            public ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder Mimetype(ConfigNodePropertyString value)
            {
                _Mimetype = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties</returns>
            public ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties(
                    Mimetype: _Mimetype
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}