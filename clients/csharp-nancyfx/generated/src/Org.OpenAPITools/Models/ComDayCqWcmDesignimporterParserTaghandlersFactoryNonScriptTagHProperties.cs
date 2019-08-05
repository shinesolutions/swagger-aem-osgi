using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties:  IEquatable<ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties>
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
        /// Use ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties()
        {
        }

        private ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString Tagpattern)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.Tagpattern = Tagpattern;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder With()
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

        public bool Equals(ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties left, ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _Tagpattern;

            internal ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.Tagpattern property.
            /// </summary>
            /// <param name="value">Tagpattern</param>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesBuilder Tagpattern(ConfigNodePropertyString value)
            {
                _Tagpattern = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties</returns>
            public ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties(
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