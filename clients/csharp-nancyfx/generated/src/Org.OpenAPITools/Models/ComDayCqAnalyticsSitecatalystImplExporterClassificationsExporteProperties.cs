using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties:  IEquatable<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties>
    { 
        /// <summary>
        /// AllowedPaths
        /// </summary>
        public ConfigNodePropertyArray AllowedPaths { get; private set; }

        /// <summary>
        /// CqAnalyticsSaintExporterPagesize
        /// </summary>
        public ConfigNodePropertyInteger CqAnalyticsSaintExporterPagesize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties()
        {
        }

        private ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(ConfigNodePropertyArray AllowedPaths, ConfigNodePropertyInteger CqAnalyticsSaintExporterPagesize)
        {
            
            this.AllowedPaths = AllowedPaths;
            
            this.CqAnalyticsSaintExporterPagesize = CqAnalyticsSaintExporterPagesize;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder</returns>
        public static ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder</returns>
        public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder With()
        {
            return Builder()
                .AllowedPaths(AllowedPaths)
                .CqAnalyticsSaintExporterPagesize(CqAnalyticsSaintExporterPagesize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties left, ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties left, ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder
        {
            private ConfigNodePropertyArray _AllowedPaths;
            private ConfigNodePropertyInteger _CqAnalyticsSaintExporterPagesize;

            internal ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.AllowedPaths property.
            /// </summary>
            /// <param name="value">AllowedPaths</param>
            public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder AllowedPaths(ConfigNodePropertyArray value)
            {
                _AllowedPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.CqAnalyticsSaintExporterPagesize property.
            /// </summary>
            /// <param name="value">CqAnalyticsSaintExporterPagesize</param>
            public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder CqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger value)
            {
                _CqAnalyticsSaintExporterPagesize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties</returns>
            public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(
                    AllowedPaths: _AllowedPaths,
                    CqAnalyticsSaintExporterPagesize: _CqAnalyticsSaintExporterPagesize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}