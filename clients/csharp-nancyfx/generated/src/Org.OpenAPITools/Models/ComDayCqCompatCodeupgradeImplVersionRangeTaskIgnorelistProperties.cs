using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties
    /// </summary>
    public sealed class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties:  IEquatable<ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties>
    { 
        /// <summary>
        /// EffectiveBundleListPath
        /// </summary>
        public ConfigNodePropertyString EffectiveBundleListPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties()
        {
        }

        private ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(ConfigNodePropertyString EffectiveBundleListPath)
        {
            
            this.EffectiveBundleListPath = EffectiveBundleListPath;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder</returns>
        public static ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder Builder()
        {
            return new ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder</returns>
        public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder With()
        {
            return Builder()
                .EffectiveBundleListPath(EffectiveBundleListPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties left, ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties left, ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.
        /// </summary>
        public sealed class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder
        {
            private ConfigNodePropertyString _EffectiveBundleListPath;

            internal ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.EffectiveBundleListPath property.
            /// </summary>
            /// <param name="value">EffectiveBundleListPath</param>
            public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesBuilder EffectiveBundleListPath(ConfigNodePropertyString value)
            {
                _EffectiveBundleListPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.
            /// </summary>
            /// <returns>ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties</returns>
            public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties Build()
            {
                Validate();
                return new ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(
                    EffectiveBundleListPath: _EffectiveBundleListPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}