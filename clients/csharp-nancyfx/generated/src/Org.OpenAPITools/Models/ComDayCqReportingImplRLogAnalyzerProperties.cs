using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReportingImplRLogAnalyzerProperties
    /// </summary>
    public sealed class ComDayCqReportingImplRLogAnalyzerProperties:  IEquatable<ComDayCqReportingImplRLogAnalyzerProperties>
    { 
        /// <summary>
        /// RequestLogOutput
        /// </summary>
        public ConfigNodePropertyString RequestLogOutput { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReportingImplRLogAnalyzerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReportingImplRLogAnalyzerProperties()
        {
        }

        private ComDayCqReportingImplRLogAnalyzerProperties(ConfigNodePropertyString RequestLogOutput)
        {
            
            this.RequestLogOutput = RequestLogOutput;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReportingImplRLogAnalyzerProperties.
        /// </summary>
        /// <returns>ComDayCqReportingImplRLogAnalyzerPropertiesBuilder</returns>
        public static ComDayCqReportingImplRLogAnalyzerPropertiesBuilder Builder()
        {
            return new ComDayCqReportingImplRLogAnalyzerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReportingImplRLogAnalyzerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReportingImplRLogAnalyzerPropertiesBuilder</returns>
        public ComDayCqReportingImplRLogAnalyzerPropertiesBuilder With()
        {
            return Builder()
                .RequestLogOutput(RequestLogOutput);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReportingImplRLogAnalyzerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReportingImplRLogAnalyzerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplRLogAnalyzerProperties</param>
        /// <param name="right">Compared (ComDayCqReportingImplRLogAnalyzerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReportingImplRLogAnalyzerProperties left, ComDayCqReportingImplRLogAnalyzerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReportingImplRLogAnalyzerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplRLogAnalyzerProperties</param>
        /// <param name="right">Compared (ComDayCqReportingImplRLogAnalyzerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReportingImplRLogAnalyzerProperties left, ComDayCqReportingImplRLogAnalyzerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReportingImplRLogAnalyzerProperties.
        /// </summary>
        public sealed class ComDayCqReportingImplRLogAnalyzerPropertiesBuilder
        {
            private ConfigNodePropertyString _RequestLogOutput;

            internal ComDayCqReportingImplRLogAnalyzerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplRLogAnalyzerProperties.RequestLogOutput property.
            /// </summary>
            /// <param name="value">RequestLogOutput</param>
            public ComDayCqReportingImplRLogAnalyzerPropertiesBuilder RequestLogOutput(ConfigNodePropertyString value)
            {
                _RequestLogOutput = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReportingImplRLogAnalyzerProperties.
            /// </summary>
            /// <returns>ComDayCqReportingImplRLogAnalyzerProperties</returns>
            public ComDayCqReportingImplRLogAnalyzerProperties Build()
            {
                Validate();
                return new ComDayCqReportingImplRLogAnalyzerProperties(
                    RequestLogOutput: _RequestLogOutput
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}