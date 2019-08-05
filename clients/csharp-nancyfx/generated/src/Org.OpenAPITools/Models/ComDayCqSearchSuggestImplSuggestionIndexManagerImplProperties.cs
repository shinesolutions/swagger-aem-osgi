using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties
    /// </summary>
    public sealed class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties:  IEquatable<ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties>
    { 
        /// <summary>
        /// PathBuilderTarget
        /// </summary>
        public ConfigNodePropertyString PathBuilderTarget { get; private set; }

        /// <summary>
        /// SuggestBasepath
        /// </summary>
        public ConfigNodePropertyString SuggestBasepath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties()
        {
        }

        private ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(ConfigNodePropertyString PathBuilderTarget, ConfigNodePropertyString SuggestBasepath)
        {
            
            this.PathBuilderTarget = PathBuilderTarget;
            
            this.SuggestBasepath = SuggestBasepath;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder</returns>
        public static ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder</returns>
        public ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder With()
        {
            return Builder()
                .PathBuilderTarget(PathBuilderTarget)
                .SuggestBasepath(SuggestBasepath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties left, ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties left, ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _PathBuilderTarget;
            private ConfigNodePropertyString _SuggestBasepath;

            internal ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.PathBuilderTarget property.
            /// </summary>
            /// <param name="value">PathBuilderTarget</param>
            public ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder PathBuilderTarget(ConfigNodePropertyString value)
            {
                _PathBuilderTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.SuggestBasepath property.
            /// </summary>
            /// <param name="value">SuggestBasepath</param>
            public ComDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesBuilder SuggestBasepath(ConfigNodePropertyString value)
            {
                _SuggestBasepath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties</returns>
            public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(
                    PathBuilderTarget: _PathBuilderTarget,
                    SuggestBasepath: _SuggestBasepath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}