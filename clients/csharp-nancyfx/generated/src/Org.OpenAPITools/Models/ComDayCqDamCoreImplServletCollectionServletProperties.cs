using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletCollectionServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletCollectionServletProperties:  IEquatable<ComDayCqDamCoreImplServletCollectionServletProperties>
    { 
        /// <summary>
        /// CqDamBatchCollectionProperties
        /// </summary>
        public ConfigNodePropertyArray CqDamBatchCollectionProperties { get; private set; }

        /// <summary>
        /// CqDamBatchCollectionMaxcollections
        /// </summary>
        public ConfigNodePropertyInteger CqDamBatchCollectionMaxcollections { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletCollectionServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletCollectionServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletCollectionServletProperties(ConfigNodePropertyArray CqDamBatchCollectionProperties, ConfigNodePropertyInteger CqDamBatchCollectionMaxcollections)
        {
            
            this.CqDamBatchCollectionProperties = CqDamBatchCollectionProperties;
            
            this.CqDamBatchCollectionMaxcollections = CqDamBatchCollectionMaxcollections;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletCollectionServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder With()
        {
            return Builder()
                .CqDamBatchCollectionProperties(CqDamBatchCollectionProperties)
                .CqDamBatchCollectionMaxcollections(CqDamBatchCollectionMaxcollections);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletCollectionServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletCollectionServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCollectionServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCollectionServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletCollectionServletProperties left, ComDayCqDamCoreImplServletCollectionServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletCollectionServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCollectionServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCollectionServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletCollectionServletProperties left, ComDayCqDamCoreImplServletCollectionServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletCollectionServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqDamBatchCollectionProperties;
            private ConfigNodePropertyInteger _CqDamBatchCollectionMaxcollections;

            internal ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionServletProperties.CqDamBatchCollectionProperties property.
            /// </summary>
            /// <param name="value">CqDamBatchCollectionProperties</param>
            public ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder CqDamBatchCollectionProperties(ConfigNodePropertyArray value)
            {
                _CqDamBatchCollectionProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionServletProperties.CqDamBatchCollectionMaxcollections property.
            /// </summary>
            /// <param name="value">CqDamBatchCollectionMaxcollections</param>
            public ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder CqDamBatchCollectionMaxcollections(ConfigNodePropertyInteger value)
            {
                _CqDamBatchCollectionMaxcollections = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletCollectionServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletCollectionServletProperties</returns>
            public ComDayCqDamCoreImplServletCollectionServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletCollectionServletProperties(
                    CqDamBatchCollectionProperties: _CqDamBatchCollectionProperties,
                    CqDamBatchCollectionMaxcollections: _CqDamBatchCollectionMaxcollections
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}