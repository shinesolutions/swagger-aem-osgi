using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerStandardPsPostScriptHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties:  IEquatable<ComDayCqDamHandlerStandardPsPostScriptHandlerProperties>
    { 
        /// <summary>
        /// RasterAnnotation
        /// </summary>
        public ConfigNodePropertyBoolean RasterAnnotation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerStandardPsPostScriptHandlerProperties()
        {
        }

        private ComDayCqDamHandlerStandardPsPostScriptHandlerProperties(ConfigNodePropertyBoolean RasterAnnotation)
        {
            
            this.RasterAnnotation = RasterAnnotation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder</returns>
        public static ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder</returns>
        public ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder With()
        {
            return Builder()
                .RasterAnnotation(RasterAnnotation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamHandlerStandardPsPostScriptHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties left, ComDayCqDamHandlerStandardPsPostScriptHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties left, ComDayCqDamHandlerStandardPsPostScriptHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _RasterAnnotation;

            internal ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.RasterAnnotation property.
            /// </summary>
            /// <param name="value">RasterAnnotation</param>
            public ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder RasterAnnotation(ConfigNodePropertyBoolean value)
            {
                _RasterAnnotation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamHandlerStandardPsPostScriptHandlerProperties</returns>
            public ComDayCqDamHandlerStandardPsPostScriptHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamHandlerStandardPsPostScriptHandlerProperties(
                    RasterAnnotation: _RasterAnnotation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}