using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties>
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
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern, ConfigNodePropertyString ComponentResourceType)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
            this.ComponentResourceType = ComponentResourceType;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;
            private ConfigNodePropertyString _ComponentResourceType;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.ComponentResourceType property.
            /// </summary>
            /// <param name="value">ComponentResourceType</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesBuilder ComponentResourceType(ConfigNodePropertyString value)
            {
                _ComponentResourceType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties(
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