using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteInfocollectorInfoCollectorProperties
    /// </summary>
    public sealed class ComAdobeGraniteInfocollectorInfoCollectorProperties:  IEquatable<ComAdobeGraniteInfocollectorInfoCollectorProperties>
    { 
        /// <summary>
        /// GraniteInfocollectorIncludeThreadDumps
        /// </summary>
        public ConfigNodePropertyBoolean GraniteInfocollectorIncludeThreadDumps { get; private set; }

        /// <summary>
        /// GraniteInfocollectorIncludeHeapDump
        /// </summary>
        public ConfigNodePropertyBoolean GraniteInfocollectorIncludeHeapDump { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteInfocollectorInfoCollectorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteInfocollectorInfoCollectorProperties()
        {
        }

        private ComAdobeGraniteInfocollectorInfoCollectorProperties(ConfigNodePropertyBoolean GraniteInfocollectorIncludeThreadDumps, ConfigNodePropertyBoolean GraniteInfocollectorIncludeHeapDump)
        {
            
            this.GraniteInfocollectorIncludeThreadDumps = GraniteInfocollectorIncludeThreadDumps;
            
            this.GraniteInfocollectorIncludeHeapDump = GraniteInfocollectorIncludeHeapDump;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteInfocollectorInfoCollectorProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder</returns>
        public static ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder</returns>
        public ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder With()
        {
            return Builder()
                .GraniteInfocollectorIncludeThreadDumps(GraniteInfocollectorIncludeThreadDumps)
                .GraniteInfocollectorIncludeHeapDump(GraniteInfocollectorIncludeHeapDump);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteInfocollectorInfoCollectorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteInfocollectorInfoCollectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteInfocollectorInfoCollectorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteInfocollectorInfoCollectorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteInfocollectorInfoCollectorProperties left, ComAdobeGraniteInfocollectorInfoCollectorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteInfocollectorInfoCollectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteInfocollectorInfoCollectorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteInfocollectorInfoCollectorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteInfocollectorInfoCollectorProperties left, ComAdobeGraniteInfocollectorInfoCollectorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteInfocollectorInfoCollectorProperties.
        /// </summary>
        public sealed class ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _GraniteInfocollectorIncludeThreadDumps;
            private ConfigNodePropertyBoolean _GraniteInfocollectorIncludeHeapDump;

            internal ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteInfocollectorInfoCollectorProperties.GraniteInfocollectorIncludeThreadDumps property.
            /// </summary>
            /// <param name="value">GraniteInfocollectorIncludeThreadDumps</param>
            public ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder GraniteInfocollectorIncludeThreadDumps(ConfigNodePropertyBoolean value)
            {
                _GraniteInfocollectorIncludeThreadDumps = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteInfocollectorInfoCollectorProperties.GraniteInfocollectorIncludeHeapDump property.
            /// </summary>
            /// <param name="value">GraniteInfocollectorIncludeHeapDump</param>
            public ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder GraniteInfocollectorIncludeHeapDump(ConfigNodePropertyBoolean value)
            {
                _GraniteInfocollectorIncludeHeapDump = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteInfocollectorInfoCollectorProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteInfocollectorInfoCollectorProperties</returns>
            public ComAdobeGraniteInfocollectorInfoCollectorProperties Build()
            {
                Validate();
                return new ComAdobeGraniteInfocollectorInfoCollectorProperties(
                    GraniteInfocollectorIncludeThreadDumps: _GraniteInfocollectorIncludeThreadDumps,
                    GraniteInfocollectorIncludeHeapDump: _GraniteInfocollectorIncludeHeapDump
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}