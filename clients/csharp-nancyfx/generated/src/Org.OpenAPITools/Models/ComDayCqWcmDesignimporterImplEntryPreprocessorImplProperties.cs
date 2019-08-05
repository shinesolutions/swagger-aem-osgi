using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties:  IEquatable<ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties>
    { 
        /// <summary>
        /// SearchPattern
        /// </summary>
        public ConfigNodePropertyString SearchPattern { get; private set; }

        /// <summary>
        /// ReplacePattern
        /// </summary>
        public ConfigNodePropertyString ReplacePattern { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties()
        {
        }

        private ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(ConfigNodePropertyString SearchPattern, ConfigNodePropertyString ReplacePattern)
        {
            
            this.SearchPattern = SearchPattern;
            
            this.ReplacePattern = ReplacePattern;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder With()
        {
            return Builder()
                .SearchPattern(SearchPattern)
                .ReplacePattern(ReplacePattern);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties left, ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties left, ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder
        {
            private ConfigNodePropertyString _SearchPattern;
            private ConfigNodePropertyString _ReplacePattern;

            internal ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.SearchPattern property.
            /// </summary>
            /// <param name="value">SearchPattern</param>
            public ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder SearchPattern(ConfigNodePropertyString value)
            {
                _SearchPattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.ReplacePattern property.
            /// </summary>
            /// <param name="value">ReplacePattern</param>
            public ComDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesBuilder ReplacePattern(ConfigNodePropertyString value)
            {
                _ReplacePattern = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties</returns>
            public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(
                    SearchPattern: _SearchPattern,
                    ReplacePattern: _ReplacePattern
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}