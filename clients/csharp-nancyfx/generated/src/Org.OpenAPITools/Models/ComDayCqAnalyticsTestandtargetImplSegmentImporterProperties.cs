using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties:  IEquatable<ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties>
    { 
        /// <summary>
        /// CqAnalyticsTestandtargetSegmentimporterEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqAnalyticsTestandtargetSegmentimporterEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties(ConfigNodePropertyBoolean CqAnalyticsTestandtargetSegmentimporterEnabled)
        {
            
            this.CqAnalyticsTestandtargetSegmentimporterEnabled = CqAnalyticsTestandtargetSegmentimporterEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder With()
        {
            return Builder()
                .CqAnalyticsTestandtargetSegmentimporterEnabled(CqAnalyticsTestandtargetSegmentimporterEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties left, ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties left, ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqAnalyticsTestandtargetSegmentimporterEnabled;

            internal ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.CqAnalyticsTestandtargetSegmentimporterEnabled property.
            /// </summary>
            /// <param name="value">CqAnalyticsTestandtargetSegmentimporterEnabled</param>
            public ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder CqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean value)
            {
                _CqAnalyticsTestandtargetSegmentimporterEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties</returns>
            public ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties(
                    CqAnalyticsTestandtargetSegmentimporterEnabled: _CqAnalyticsTestandtargetSegmentimporterEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}