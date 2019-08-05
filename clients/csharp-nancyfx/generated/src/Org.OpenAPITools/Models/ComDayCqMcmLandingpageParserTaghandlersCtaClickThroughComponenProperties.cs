using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties
    /// </summary>
    public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties:  IEquatable<ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// Tagpattern
        /// </summary>
        public ConfigNodePropertyString Tagpattern { get; private set; }

        /// <summary>
        /// ComponentResourceType
        /// </summary>
        public ConfigNodePropertyString ComponentResourceType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties()
        {
        }

        private ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern, ConfigNodePropertyString ComponentResourceType)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
            this.ComponentResourceType = ComponentResourceType;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder</returns>
        public static ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder Builder()
        {
            return new ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder</returns>
        public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .Tagpattern(Tagpattern)
                .ComponentResourceType(ComponentResourceType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties left, ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties left, ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.
        /// </summary>
        public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;
            private ConfigNodePropertyString _ComponentResourceType;

            internal ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.ComponentResourceType property.
            /// </summary>
            /// <param name="value">ComponentResourceType</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesBuilder ComponentResourceType(ConfigNodePropertyString value)
            {
                _ComponentResourceType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.
            /// </summary>
            /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties</returns>
            public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties Build()
            {
                Validate();
                return new ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties(
                    ServiceRanking: _ServiceRanking,
                    Tagpattern: _Tagpattern,
                    ComponentResourceType: _ComponentResourceType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}