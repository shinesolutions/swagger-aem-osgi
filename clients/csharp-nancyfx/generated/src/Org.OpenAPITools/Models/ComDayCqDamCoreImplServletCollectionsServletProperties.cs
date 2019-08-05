using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletCollectionsServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletCollectionsServletProperties:  IEquatable<ComDayCqDamCoreImplServletCollectionsServletProperties>
    { 
        /// <summary>
        /// CqDamBatchCollectionsProperties
        /// </summary>
        public ConfigNodePropertyArray CqDamBatchCollectionsProperties { get; private set; }

        /// <summary>
        /// CqDamBatchCollectionsLimit
        /// </summary>
        public ConfigNodePropertyInteger CqDamBatchCollectionsLimit { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletCollectionsServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletCollectionsServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletCollectionsServletProperties(ConfigNodePropertyArray CqDamBatchCollectionsProperties, ConfigNodePropertyInteger CqDamBatchCollectionsLimit)
        {
            
            this.CqDamBatchCollectionsProperties = CqDamBatchCollectionsProperties;
            
            this.CqDamBatchCollectionsLimit = CqDamBatchCollectionsLimit;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletCollectionsServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder With()
        {
            return Builder()
                .CqDamBatchCollectionsProperties(CqDamBatchCollectionsProperties)
                .CqDamBatchCollectionsLimit(CqDamBatchCollectionsLimit);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletCollectionsServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletCollectionsServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCollectionsServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCollectionsServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletCollectionsServletProperties left, ComDayCqDamCoreImplServletCollectionsServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletCollectionsServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCollectionsServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCollectionsServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletCollectionsServletProperties left, ComDayCqDamCoreImplServletCollectionsServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletCollectionsServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqDamBatchCollectionsProperties;
            private ConfigNodePropertyInteger _CqDamBatchCollectionsLimit;

            internal ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionsServletProperties.CqDamBatchCollectionsProperties property.
            /// </summary>
            /// <param name="value">CqDamBatchCollectionsProperties</param>
            public ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder CqDamBatchCollectionsProperties(ConfigNodePropertyArray value)
            {
                _CqDamBatchCollectionsProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionsServletProperties.CqDamBatchCollectionsLimit property.
            /// </summary>
            /// <param name="value">CqDamBatchCollectionsLimit</param>
            public ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder CqDamBatchCollectionsLimit(ConfigNodePropertyInteger value)
            {
                _CqDamBatchCollectionsLimit = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletCollectionsServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletCollectionsServletProperties</returns>
            public ComDayCqDamCoreImplServletCollectionsServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletCollectionsServletProperties(
                    CqDamBatchCollectionsProperties: _CqDamBatchCollectionsProperties,
                    CqDamBatchCollectionsLimit: _CqDamBatchCollectionsLimit
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}