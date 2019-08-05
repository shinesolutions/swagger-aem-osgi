using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties
    /// </summary>
    public sealed class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties:  IEquatable<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties>
    { 
        /// <summary>
        /// BatchCommitSize
        /// </summary>
        public ConfigNodePropertyInteger BatchCommitSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties()
        {
        }

        private ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(ConfigNodePropertyInteger BatchCommitSize)
        {
            
            this.BatchCommitSize = BatchCommitSize;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder</returns>
        public static ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder</returns>
        public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder With()
        {
            return Builder()
                .BatchCommitSize(BatchCommitSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties left, ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties left, ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.
        /// </summary>
        public sealed class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _BatchCommitSize;

            internal ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.BatchCommitSize property.
            /// </summary>
            /// <param name="value">BatchCommitSize</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder BatchCommitSize(ConfigNodePropertyInteger value)
            {
                _BatchCommitSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties</returns>
            public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties Build()
            {
                Validate();
                return new ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(
                    BatchCommitSize: _BatchCommitSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}