using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties
    /// </summary>
    public sealed class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties:  IEquatable<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties>
    { 
        /// <summary>
        /// CqDamS7damDynamicmediaconfigeventlistenerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqDamS7damDynamicmediaconfigeventlistenerEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties()
        {
        }

        private ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(ConfigNodePropertyBoolean CqDamS7damDynamicmediaconfigeventlistenerEnabled)
        {
            
            this.CqDamS7damDynamicmediaconfigeventlistenerEnabled = CqDamS7damDynamicmediaconfigeventlistenerEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder</returns>
        public static ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder Builder()
        {
            return new ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder</returns>
        public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder With()
        {
            return Builder()
                .CqDamS7damDynamicmediaconfigeventlistenerEnabled(CqDamS7damDynamicmediaconfigeventlistenerEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties left, ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties left, ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamS7damDynamicmediaconfigeventlistenerEnabled;

            internal ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.CqDamS7damDynamicmediaconfigeventlistenerEnabled property.
            /// </summary>
            /// <param name="value">CqDamS7damDynamicmediaconfigeventlistenerEnabled</param>
            public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesBuilder CqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean value)
            {
                _CqDamS7damDynamicmediaconfigeventlistenerEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties</returns>
            public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(
                    CqDamS7damDynamicmediaconfigeventlistenerEnabled: _CqDamS7damDynamicmediaconfigeventlistenerEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}