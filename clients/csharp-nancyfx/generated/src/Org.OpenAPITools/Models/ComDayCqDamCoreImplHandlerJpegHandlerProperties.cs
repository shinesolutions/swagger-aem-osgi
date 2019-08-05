using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplHandlerJpegHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplHandlerJpegHandlerProperties:  IEquatable<ComDayCqDamCoreImplHandlerJpegHandlerProperties>
    { 
        /// <summary>
        /// CqDamEnableExtMetaExtraction
        /// </summary>
        public ConfigNodePropertyBoolean CqDamEnableExtMetaExtraction { get; private set; }

        /// <summary>
        /// LargeFileThreshold
        /// </summary>
        public ConfigNodePropertyInteger LargeFileThreshold { get; private set; }

        /// <summary>
        /// LargeCommentThreshold
        /// </summary>
        public ConfigNodePropertyInteger LargeCommentThreshold { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplHandlerJpegHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplHandlerJpegHandlerProperties()
        {
        }

        private ComDayCqDamCoreImplHandlerJpegHandlerProperties(ConfigNodePropertyBoolean CqDamEnableExtMetaExtraction, ConfigNodePropertyInteger LargeFileThreshold, ConfigNodePropertyInteger LargeCommentThreshold)
        {
            
            this.CqDamEnableExtMetaExtraction = CqDamEnableExtMetaExtraction;
            
            this.LargeFileThreshold = LargeFileThreshold;
            
            this.LargeCommentThreshold = LargeCommentThreshold;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplHandlerJpegHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder</returns>
        public ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder With()
        {
            return Builder()
                .CqDamEnableExtMetaExtraction(CqDamEnableExtMetaExtraction)
                .LargeFileThreshold(LargeFileThreshold)
                .LargeCommentThreshold(LargeCommentThreshold);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplHandlerJpegHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplHandlerJpegHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerJpegHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerJpegHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplHandlerJpegHandlerProperties left, ComDayCqDamCoreImplHandlerJpegHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplHandlerJpegHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerJpegHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerJpegHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplHandlerJpegHandlerProperties left, ComDayCqDamCoreImplHandlerJpegHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplHandlerJpegHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamEnableExtMetaExtraction;
            private ConfigNodePropertyInteger _LargeFileThreshold;
            private ConfigNodePropertyInteger _LargeCommentThreshold;

            internal ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerJpegHandlerProperties.CqDamEnableExtMetaExtraction property.
            /// </summary>
            /// <param name="value">CqDamEnableExtMetaExtraction</param>
            public ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder CqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean value)
            {
                _CqDamEnableExtMetaExtraction = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerJpegHandlerProperties.LargeFileThreshold property.
            /// </summary>
            /// <param name="value">LargeFileThreshold</param>
            public ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder LargeFileThreshold(ConfigNodePropertyInteger value)
            {
                _LargeFileThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerJpegHandlerProperties.LargeCommentThreshold property.
            /// </summary>
            /// <param name="value">LargeCommentThreshold</param>
            public ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder LargeCommentThreshold(ConfigNodePropertyInteger value)
            {
                _LargeCommentThreshold = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplHandlerJpegHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplHandlerJpegHandlerProperties</returns>
            public ComDayCqDamCoreImplHandlerJpegHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplHandlerJpegHandlerProperties(
                    CqDamEnableExtMetaExtraction: _CqDamEnableExtMetaExtraction,
                    LargeFileThreshold: _LargeFileThreshold,
                    LargeCommentThreshold: _LargeCommentThreshold
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}