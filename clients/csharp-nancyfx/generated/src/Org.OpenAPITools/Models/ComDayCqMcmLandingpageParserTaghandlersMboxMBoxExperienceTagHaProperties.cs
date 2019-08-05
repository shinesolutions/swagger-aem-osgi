using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties
    /// </summary>
    public sealed class ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties:  IEquatable<ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties>
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
        /// Use ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties()
        {
        }

        private ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder</returns>
        public static ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder Builder()
        {
            return new ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder</returns>
        public ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder With()
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

        public bool Equals(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties left, ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties left, ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.
        /// </summary>
        public sealed class ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;

            internal ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.
            /// </summary>
            /// <returns>ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties</returns>
            public ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties Build()
            {
                Validate();
                return new ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties(
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