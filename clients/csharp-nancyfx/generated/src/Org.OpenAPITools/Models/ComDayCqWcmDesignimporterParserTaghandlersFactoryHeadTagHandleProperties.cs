using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties>
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
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties(
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