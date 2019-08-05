using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties
    /// </summary>
    public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties:  IEquatable<ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties>
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
        /// Use ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties()
        {
        }

        private ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern, ConfigNodePropertyString ComponentResourceType)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
            this.ComponentResourceType = ComponentResourceType;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder</returns>
        public static ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder Builder()
        {
            return new ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder</returns>
        public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder With()
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

        public bool Equals(ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties left, ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties left, ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.
        /// </summary>
        public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;
            private ConfigNodePropertyString _ComponentResourceType;

            internal ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.ComponentResourceType property.
            /// </summary>
            /// <param name="value">ComponentResourceType</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesBuilder ComponentResourceType(ConfigNodePropertyString value)
            {
                _ComponentResourceType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.
            /// </summary>
            /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties</returns>
            public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties Build()
            {
                Validate();
                return new ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties(
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