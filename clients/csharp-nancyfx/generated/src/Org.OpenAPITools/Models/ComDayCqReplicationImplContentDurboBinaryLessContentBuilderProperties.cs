using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties
    /// </summary>
    public sealed class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties:  IEquatable<ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties>
    { 
        /// <summary>
        /// BinaryThreshold
        /// </summary>
        public ConfigNodePropertyInteger BinaryThreshold { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties()
        {
        }

        private ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties(ConfigNodePropertyInteger BinaryThreshold)
        {
            
            this.BinaryThreshold = BinaryThreshold;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder</returns>
        public static ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder</returns>
        public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder With()
        {
            return Builder()
                .BinaryThreshold(BinaryThreshold);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties left, ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties left, ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.
        /// </summary>
        public sealed class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder
        {
            private ConfigNodePropertyInteger _BinaryThreshold;

            internal ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.BinaryThreshold property.
            /// </summary>
            /// <param name="value">BinaryThreshold</param>
            public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder BinaryThreshold(ConfigNodePropertyInteger value)
            {
                _BinaryThreshold = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties</returns>
            public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties Build()
            {
                Validate();
                return new ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties(
                    BinaryThreshold: _BinaryThreshold
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}