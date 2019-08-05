using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCommonsHandlerStandardImageHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamCommonsHandlerStandardImageHandlerProperties:  IEquatable<ComDayCqDamCommonsHandlerStandardImageHandlerProperties>
    { 
        /// <summary>
        /// LargeFileThreshold
        /// </summary>
        public ConfigNodePropertyInteger LargeFileThreshold { get; private set; }

        /// <summary>
        /// LargeCommentThreshold
        /// </summary>
        public ConfigNodePropertyInteger LargeCommentThreshold { get; private set; }

        /// <summary>
        /// CqDamEnableExtMetaExtraction
        /// </summary>
        public ConfigNodePropertyBoolean CqDamEnableExtMetaExtraction { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCommonsHandlerStandardImageHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCommonsHandlerStandardImageHandlerProperties()
        {
        }

        private ComDayCqDamCommonsHandlerStandardImageHandlerProperties(ConfigNodePropertyInteger LargeFileThreshold, ConfigNodePropertyInteger LargeCommentThreshold, ConfigNodePropertyBoolean CqDamEnableExtMetaExtraction)
        {
            
            this.LargeFileThreshold = LargeFileThreshold;
            
            this.LargeCommentThreshold = LargeCommentThreshold;
            
            this.CqDamEnableExtMetaExtraction = CqDamEnableExtMetaExtraction;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCommonsHandlerStandardImageHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder</returns>
        public static ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder</returns>
        public ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder With()
        {
            return Builder()
                .LargeFileThreshold(LargeFileThreshold)
                .LargeCommentThreshold(LargeCommentThreshold)
                .CqDamEnableExtMetaExtraction(CqDamEnableExtMetaExtraction);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCommonsHandlerStandardImageHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCommonsHandlerStandardImageHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsHandlerStandardImageHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCommonsHandlerStandardImageHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCommonsHandlerStandardImageHandlerProperties left, ComDayCqDamCommonsHandlerStandardImageHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCommonsHandlerStandardImageHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsHandlerStandardImageHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCommonsHandlerStandardImageHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCommonsHandlerStandardImageHandlerProperties left, ComDayCqDamCommonsHandlerStandardImageHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCommonsHandlerStandardImageHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder
        {
            private ConfigNodePropertyInteger _LargeFileThreshold;
            private ConfigNodePropertyInteger _LargeCommentThreshold;
            private ConfigNodePropertyBoolean _CqDamEnableExtMetaExtraction;

            internal ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsHandlerStandardImageHandlerProperties.LargeFileThreshold property.
            /// </summary>
            /// <param name="value">LargeFileThreshold</param>
            public ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder LargeFileThreshold(ConfigNodePropertyInteger value)
            {
                _LargeFileThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsHandlerStandardImageHandlerProperties.LargeCommentThreshold property.
            /// </summary>
            /// <param name="value">LargeCommentThreshold</param>
            public ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder LargeCommentThreshold(ConfigNodePropertyInteger value)
            {
                _LargeCommentThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsHandlerStandardImageHandlerProperties.CqDamEnableExtMetaExtraction property.
            /// </summary>
            /// <param name="value">CqDamEnableExtMetaExtraction</param>
            public ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder CqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean value)
            {
                _CqDamEnableExtMetaExtraction = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCommonsHandlerStandardImageHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamCommonsHandlerStandardImageHandlerProperties</returns>
            public ComDayCqDamCommonsHandlerStandardImageHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamCommonsHandlerStandardImageHandlerProperties(
                    LargeFileThreshold: _LargeFileThreshold,
                    LargeCommentThreshold: _LargeCommentThreshold,
                    CqDamEnableExtMetaExtraction: _CqDamEnableExtMetaExtraction
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}