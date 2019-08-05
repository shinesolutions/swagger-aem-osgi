using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties
    /// </summary>
    public sealed class ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties:  IEquatable<ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties>
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
        /// Use ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties()
        {
        }

        private ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder</returns>
        public static ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder</returns>
        public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder With()
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

        public bool Equals(ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties left, ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties left, ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.
        /// </summary>
        public sealed class ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;

            internal ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties</returns>
            public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties Build()
            {
                Validate();
                return new ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties(
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