using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties>
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
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern, ConfigNodePropertyString ComponentResourceType)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
            this.ComponentResourceType = ComponentResourceType;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;
            private ConfigNodePropertyString _ComponentResourceType;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.ComponentResourceType property.
            /// </summary>
            /// <param name="value">ComponentResourceType</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesBuilder ComponentResourceType(ConfigNodePropertyString value)
            {
                _ComponentResourceType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties(
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