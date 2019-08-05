using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties:  IEquatable<ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties>
    { 
        /// <summary>
        /// PageInfoProviderPropertyRegexDefault
        /// </summary>
        public ConfigNodePropertyString PageInfoProviderPropertyRegexDefault { get; private set; }

        /// <summary>
        /// PageInfoProviderPropertyName
        /// </summary>
        public ConfigNodePropertyString PageInfoProviderPropertyName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties()
        {
        }

        private ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties(ConfigNodePropertyString PageInfoProviderPropertyRegexDefault, ConfigNodePropertyString PageInfoProviderPropertyName)
        {
            
            this.PageInfoProviderPropertyRegexDefault = PageInfoProviderPropertyRegexDefault;
            
            this.PageInfoProviderPropertyName = PageInfoProviderPropertyName;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder With()
        {
            return Builder()
                .PageInfoProviderPropertyRegexDefault(PageInfoProviderPropertyRegexDefault)
                .PageInfoProviderPropertyName(PageInfoProviderPropertyName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties left, ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties left, ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder
        {
            private ConfigNodePropertyString _PageInfoProviderPropertyRegexDefault;
            private ConfigNodePropertyString _PageInfoProviderPropertyName;

            internal ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.PageInfoProviderPropertyRegexDefault property.
            /// </summary>
            /// <param name="value">PageInfoProviderPropertyRegexDefault</param>
            public ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder PageInfoProviderPropertyRegexDefault(ConfigNodePropertyString value)
            {
                _PageInfoProviderPropertyRegexDefault = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.PageInfoProviderPropertyName property.
            /// </summary>
            /// <param name="value">PageInfoProviderPropertyName</param>
            public ComDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesBuilder PageInfoProviderPropertyName(ConfigNodePropertyString value)
            {
                _PageInfoProviderPropertyName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties</returns>
            public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties(
                    PageInfoProviderPropertyRegexDefault: _PageInfoProviderPropertyRegexDefault,
                    PageInfoProviderPropertyName: _PageInfoProviderPropertyName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}