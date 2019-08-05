using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties
    /// </summary>
    public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties:  IEquatable<ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties>
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
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties()
        {
        }

        private ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder</returns>
        public static ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder Builder()
        {
            return new ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder</returns>
        public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .Tagpattern(Tagpattern);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties left, ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties left, ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties.
        /// </summary>
        public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;

            internal ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties.
            /// </summary>
            /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties</returns>
            public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties Build()
            {
                Validate();
                return new ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties(
                    ServiceRanking: _ServiceRanking,
                    Tagpattern: _Tagpattern
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}