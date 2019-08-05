using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties:  IEquatable<ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties>
    { 
        /// <summary>
        /// Mimetype
        /// </summary>
        public ConfigNodePropertyArray Mimetype { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties()
        {
        }

        private ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties(ConfigNodePropertyArray Mimetype)
        {
            
            this.Mimetype = Mimetype;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder</returns>
        public ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties left, ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties left, ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _Mimetype;

            internal ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.Mimetype property.
            /// </summary>
            /// <param name="value">Mimetype</param>
            public ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder Mimetype(ConfigNodePropertyArray value)
            {
                _Mimetype = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties</returns>
            public ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties(
                    Mimetype: _Mimetype
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}