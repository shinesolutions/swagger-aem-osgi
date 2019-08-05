using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties:  IEquatable<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties>
    { 
        /// <summary>
        /// CqAnalyticsAdapterfactoryContextstores
        /// </summary>
        public ConfigNodePropertyArray CqAnalyticsAdapterfactoryContextstores { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties()
        {
        }

        private ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties(ConfigNodePropertyArray CqAnalyticsAdapterfactoryContextstores)
        {
            
            this.CqAnalyticsAdapterfactoryContextstores = CqAnalyticsAdapterfactoryContextstores;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder</returns>
        public static ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder</returns>
        public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder With()
        {
            return Builder()
                .CqAnalyticsAdapterfactoryContextstores(CqAnalyticsAdapterfactoryContextstores);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties left, ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties left, ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqAnalyticsAdapterfactoryContextstores;

            internal ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.CqAnalyticsAdapterfactoryContextstores property.
            /// </summary>
            /// <param name="value">CqAnalyticsAdapterfactoryContextstores</param>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesBuilder CqAnalyticsAdapterfactoryContextstores(ConfigNodePropertyArray value)
            {
                _CqAnalyticsAdapterfactoryContextstores = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties</returns>
            public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties(
                    CqAnalyticsAdapterfactoryContextstores: _CqAnalyticsAdapterfactoryContextstores
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}