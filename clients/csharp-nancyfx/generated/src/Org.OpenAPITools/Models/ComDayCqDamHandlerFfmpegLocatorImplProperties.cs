using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerFfmpegLocatorImplProperties
    /// </summary>
    public sealed class ComDayCqDamHandlerFfmpegLocatorImplProperties:  IEquatable<ComDayCqDamHandlerFfmpegLocatorImplProperties>
    { 
        /// <summary>
        /// ExecutableSearchpath
        /// </summary>
        public ConfigNodePropertyArray ExecutableSearchpath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerFfmpegLocatorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerFfmpegLocatorImplProperties()
        {
        }

        private ComDayCqDamHandlerFfmpegLocatorImplProperties(ConfigNodePropertyArray ExecutableSearchpath)
        {
            
            this.ExecutableSearchpath = ExecutableSearchpath;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerFfmpegLocatorImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder</returns>
        public static ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder</returns>
        public ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder With()
        {
            return Builder()
                .ExecutableSearchpath(ExecutableSearchpath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamHandlerFfmpegLocatorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerFfmpegLocatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerFfmpegLocatorImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerFfmpegLocatorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerFfmpegLocatorImplProperties left, ComDayCqDamHandlerFfmpegLocatorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerFfmpegLocatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerFfmpegLocatorImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerFfmpegLocatorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerFfmpegLocatorImplProperties left, ComDayCqDamHandlerFfmpegLocatorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerFfmpegLocatorImplProperties.
        /// </summary>
        public sealed class ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ExecutableSearchpath;

            internal ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerFfmpegLocatorImplProperties.ExecutableSearchpath property.
            /// </summary>
            /// <param name="value">ExecutableSearchpath</param>
            public ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder ExecutableSearchpath(ConfigNodePropertyArray value)
            {
                _ExecutableSearchpath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerFfmpegLocatorImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamHandlerFfmpegLocatorImplProperties</returns>
            public ComDayCqDamHandlerFfmpegLocatorImplProperties Build()
            {
                Validate();
                return new ComDayCqDamHandlerFfmpegLocatorImplProperties(
                    ExecutableSearchpath: _ExecutableSearchpath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}