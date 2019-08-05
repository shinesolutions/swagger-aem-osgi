using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties>
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
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern, ConfigNodePropertyString ComponentResourceType)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
            this.ComponentResourceType = ComponentResourceType;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;
            private ConfigNodePropertyString _ComponentResourceType;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.ComponentResourceType property.
            /// </summary>
            /// <param name="value">ComponentResourceType</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesBuilder ComponentResourceType(ConfigNodePropertyString value)
            {
                _ComponentResourceType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties(
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