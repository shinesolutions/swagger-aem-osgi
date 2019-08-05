using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplLanguageManagerImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplLanguageManagerImplProperties:  IEquatable<ComDayCqWcmCoreImplLanguageManagerImplProperties>
    { 
        /// <summary>
        /// LangmgrListPath
        /// </summary>
        public ConfigNodePropertyString LangmgrListPath { get; private set; }

        /// <summary>
        /// LangmgrCountryDefault
        /// </summary>
        public ConfigNodePropertyArray LangmgrCountryDefault { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplLanguageManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplLanguageManagerImplProperties()
        {
        }

        private ComDayCqWcmCoreImplLanguageManagerImplProperties(ConfigNodePropertyString LangmgrListPath, ConfigNodePropertyArray LangmgrCountryDefault)
        {
            
            this.LangmgrListPath = LangmgrListPath;
            
            this.LangmgrCountryDefault = LangmgrCountryDefault;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplLanguageManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder With()
        {
            return Builder()
                .LangmgrListPath(LangmgrListPath)
                .LangmgrCountryDefault(LangmgrCountryDefault);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplLanguageManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplLanguageManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplLanguageManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplLanguageManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplLanguageManagerImplProperties left, ComDayCqWcmCoreImplLanguageManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplLanguageManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplLanguageManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplLanguageManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplLanguageManagerImplProperties left, ComDayCqWcmCoreImplLanguageManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplLanguageManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _LangmgrListPath;
            private ConfigNodePropertyArray _LangmgrCountryDefault;

            internal ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLanguageManagerImplProperties.LangmgrListPath property.
            /// </summary>
            /// <param name="value">LangmgrListPath</param>
            public ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder LangmgrListPath(ConfigNodePropertyString value)
            {
                _LangmgrListPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLanguageManagerImplProperties.LangmgrCountryDefault property.
            /// </summary>
            /// <param name="value">LangmgrCountryDefault</param>
            public ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder LangmgrCountryDefault(ConfigNodePropertyArray value)
            {
                _LangmgrCountryDefault = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplLanguageManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplLanguageManagerImplProperties</returns>
            public ComDayCqWcmCoreImplLanguageManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplLanguageManagerImplProperties(
                    LangmgrListPath: _LangmgrListPath,
                    LangmgrCountryDefault: _LangmgrCountryDefault
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}