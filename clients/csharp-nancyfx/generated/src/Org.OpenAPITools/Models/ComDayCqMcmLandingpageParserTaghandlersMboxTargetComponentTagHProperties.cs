using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
    /// </summary>
    public sealed class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties:  IEquatable<ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties>
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
        /// Use ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties()
        {
        }

        private ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern, ConfigNodePropertyString ComponentResourceType)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
            this.ComponentResourceType = ComponentResourceType;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder</returns>
        public static ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder Builder()
        {
            return new ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder</returns>
        public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder With()
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

        public bool Equals(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties left, ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties left, ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.
        /// </summary>
        public sealed class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;
            private ConfigNodePropertyString _ComponentResourceType;

            internal ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.ComponentResourceType property.
            /// </summary>
            /// <param name="value">ComponentResourceType</param>
            public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesBuilder ComponentResourceType(ConfigNodePropertyString value)
            {
                _ComponentResourceType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.
            /// </summary>
            /// <returns>ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties</returns>
            public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties Build()
            {
                Validate();
                return new ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties(
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