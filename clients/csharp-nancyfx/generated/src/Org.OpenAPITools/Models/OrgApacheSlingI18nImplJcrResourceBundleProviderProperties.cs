using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingI18nImplJcrResourceBundleProviderProperties
    /// </summary>
    public sealed class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties:  IEquatable<OrgApacheSlingI18nImplJcrResourceBundleProviderProperties>
    { 
        /// <summary>
        /// LocaleDefault
        /// </summary>
        public ConfigNodePropertyString LocaleDefault { get; private set; }

        /// <summary>
        /// PreloadBundles
        /// </summary>
        public ConfigNodePropertyBoolean PreloadBundles { get; private set; }

        /// <summary>
        /// InvalidationDelay
        /// </summary>
        public ConfigNodePropertyInteger InvalidationDelay { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties()
        {
        }

        private OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(ConfigNodePropertyString LocaleDefault, ConfigNodePropertyBoolean PreloadBundles, ConfigNodePropertyInteger InvalidationDelay)
        {
            
            this.LocaleDefault = LocaleDefault;
            
            this.PreloadBundles = PreloadBundles;
            
            this.InvalidationDelay = InvalidationDelay;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.
        /// </summary>
        /// <returns>OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder</returns>
        public static OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder Builder()
        {
            return new OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder</returns>
        public OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder With()
        {
            return Builder()
                .LocaleDefault(LocaleDefault)
                .PreloadBundles(PreloadBundles)
                .InvalidationDelay(InvalidationDelay);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties left, OrgApacheSlingI18nImplJcrResourceBundleProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties left, OrgApacheSlingI18nImplJcrResourceBundleProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.
        /// </summary>
        public sealed class OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder
        {
            private ConfigNodePropertyString _LocaleDefault;
            private ConfigNodePropertyBoolean _PreloadBundles;
            private ConfigNodePropertyInteger _InvalidationDelay;

            internal OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.LocaleDefault property.
            /// </summary>
            /// <param name="value">LocaleDefault</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder LocaleDefault(ConfigNodePropertyString value)
            {
                _LocaleDefault = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.PreloadBundles property.
            /// </summary>
            /// <param name="value">PreloadBundles</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder PreloadBundles(ConfigNodePropertyBoolean value)
            {
                _PreloadBundles = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.InvalidationDelay property.
            /// </summary>
            /// <param name="value">InvalidationDelay</param>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderPropertiesBuilder InvalidationDelay(ConfigNodePropertyInteger value)
            {
                _InvalidationDelay = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.
            /// </summary>
            /// <returns>OrgApacheSlingI18nImplJcrResourceBundleProviderProperties</returns>
            public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties Build()
            {
                Validate();
                return new OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(
                    LocaleDefault: _LocaleDefault,
                    PreloadBundles: _PreloadBundles,
                    InvalidationDelay: _InvalidationDelay
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}