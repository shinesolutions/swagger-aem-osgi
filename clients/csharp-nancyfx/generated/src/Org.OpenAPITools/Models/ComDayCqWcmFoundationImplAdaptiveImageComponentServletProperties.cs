using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties:  IEquatable<ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties>
    { 
        /// <summary>
        /// AdaptSupportedWidths
        /// </summary>
        public ConfigNodePropertyArray AdaptSupportedWidths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties()
        {
        }

        private ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties(ConfigNodePropertyArray AdaptSupportedWidths)
        {
            
            this.AdaptSupportedWidths = AdaptSupportedWidths;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder</returns>
        public ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder With()
        {
            return Builder()
                .AdaptSupportedWidths(AdaptSupportedWidths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties left, ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties left, ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _AdaptSupportedWidths;

            internal ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.AdaptSupportedWidths property.
            /// </summary>
            /// <param name="value">AdaptSupportedWidths</param>
            public ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder AdaptSupportedWidths(ConfigNodePropertyArray value)
            {
                _AdaptSupportedWidths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties</returns>
            public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties(
                    AdaptSupportedWidths: _AdaptSupportedWidths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}