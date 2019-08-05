using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerStandardPdfPdfHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamHandlerStandardPdfPdfHandlerProperties:  IEquatable<ComDayCqDamHandlerStandardPdfPdfHandlerProperties>
    { 
        /// <summary>
        /// RasterAnnotation
        /// </summary>
        public ConfigNodePropertyBoolean RasterAnnotation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerStandardPdfPdfHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerStandardPdfPdfHandlerProperties()
        {
        }

        private ComDayCqDamHandlerStandardPdfPdfHandlerProperties(ConfigNodePropertyBoolean RasterAnnotation)
        {
            
            this.RasterAnnotation = RasterAnnotation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerStandardPdfPdfHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder</returns>
        public static ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder</returns>
        public ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder With()
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

        public bool Equals(ComDayCqDamHandlerStandardPdfPdfHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerStandardPdfPdfHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPdfPdfHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPdfPdfHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerStandardPdfPdfHandlerProperties left, ComDayCqDamHandlerStandardPdfPdfHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerStandardPdfPdfHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPdfPdfHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPdfPdfHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerStandardPdfPdfHandlerProperties left, ComDayCqDamHandlerStandardPdfPdfHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerStandardPdfPdfHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _RasterAnnotation;

            internal ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPdfPdfHandlerProperties.RasterAnnotation property.
            /// </summary>
            /// <param name="value">RasterAnnotation</param>
            public ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder RasterAnnotation(ConfigNodePropertyBoolean value)
            {
                _RasterAnnotation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerStandardPdfPdfHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamHandlerStandardPdfPdfHandlerProperties</returns>
            public ComDayCqDamHandlerStandardPdfPdfHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamHandlerStandardPdfPdfHandlerProperties(
                    RasterAnnotation: _RasterAnnotation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}