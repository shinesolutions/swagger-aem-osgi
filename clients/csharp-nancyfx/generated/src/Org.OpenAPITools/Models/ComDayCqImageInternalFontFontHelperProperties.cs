using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqImageInternalFontFontHelperProperties
    /// </summary>
    public sealed class ComDayCqImageInternalFontFontHelperProperties:  IEquatable<ComDayCqImageInternalFontFontHelperProperties>
    { 
        /// <summary>
        /// Fontpath
        /// </summary>
        public ConfigNodePropertyArray Fontpath { get; private set; }

        /// <summary>
        /// OversamplingFactor
        /// </summary>
        public ConfigNodePropertyInteger OversamplingFactor { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqImageInternalFontFontHelperProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqImageInternalFontFontHelperProperties()
        {
        }

        private ComDayCqImageInternalFontFontHelperProperties(ConfigNodePropertyArray Fontpath, ConfigNodePropertyInteger OversamplingFactor)
        {
            
            this.Fontpath = Fontpath;
            
            this.OversamplingFactor = OversamplingFactor;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqImageInternalFontFontHelperProperties.
        /// </summary>
        /// <returns>ComDayCqImageInternalFontFontHelperPropertiesBuilder</returns>
        public static ComDayCqImageInternalFontFontHelperPropertiesBuilder Builder()
        {
            return new ComDayCqImageInternalFontFontHelperPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqImageInternalFontFontHelperPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqImageInternalFontFontHelperPropertiesBuilder</returns>
        public ComDayCqImageInternalFontFontHelperPropertiesBuilder With()
        {
            return Builder()
                .Fontpath(Fontpath)
                .OversamplingFactor(OversamplingFactor);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqImageInternalFontFontHelperProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqImageInternalFontFontHelperProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqImageInternalFontFontHelperProperties</param>
        /// <param name="right">Compared (ComDayCqImageInternalFontFontHelperProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqImageInternalFontFontHelperProperties left, ComDayCqImageInternalFontFontHelperProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqImageInternalFontFontHelperProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqImageInternalFontFontHelperProperties</param>
        /// <param name="right">Compared (ComDayCqImageInternalFontFontHelperProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqImageInternalFontFontHelperProperties left, ComDayCqImageInternalFontFontHelperProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqImageInternalFontFontHelperProperties.
        /// </summary>
        public sealed class ComDayCqImageInternalFontFontHelperPropertiesBuilder
        {
            private ConfigNodePropertyArray _Fontpath;
            private ConfigNodePropertyInteger _OversamplingFactor;

            internal ComDayCqImageInternalFontFontHelperPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqImageInternalFontFontHelperProperties.Fontpath property.
            /// </summary>
            /// <param name="value">Fontpath</param>
            public ComDayCqImageInternalFontFontHelperPropertiesBuilder Fontpath(ConfigNodePropertyArray value)
            {
                _Fontpath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqImageInternalFontFontHelperProperties.OversamplingFactor property.
            /// </summary>
            /// <param name="value">OversamplingFactor</param>
            public ComDayCqImageInternalFontFontHelperPropertiesBuilder OversamplingFactor(ConfigNodePropertyInteger value)
            {
                _OversamplingFactor = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqImageInternalFontFontHelperProperties.
            /// </summary>
            /// <returns>ComDayCqImageInternalFontFontHelperProperties</returns>
            public ComDayCqImageInternalFontFontHelperProperties Build()
            {
                Validate();
                return new ComDayCqImageInternalFontFontHelperProperties(
                    Fontpath: _Fontpath,
                    OversamplingFactor: _OversamplingFactor
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}