using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties
    /// </summary>
    public sealed class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties:  IEquatable<ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties>
    { 
        /// <summary>
        /// IgnorePath
        /// </summary>
        public ConfigNodePropertyBoolean IgnorePath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties()
        {
        }

        private ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties(ConfigNodePropertyBoolean IgnorePath)
        {
            
            this.IgnorePath = IgnorePath;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.
        /// </summary>
        /// <returns>ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder</returns>
        public static ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder Builder()
        {
            return new ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder</returns>
        public ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder With()
        {
            return Builder()
                .IgnorePath(IgnorePath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties</param>
        /// <param name="right">Compared (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties left, ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties</param>
        /// <param name="right">Compared (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties left, ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.
        /// </summary>
        public sealed class ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _IgnorePath;

            internal ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.IgnorePath property.
            /// </summary>
            /// <param name="value">IgnorePath</param>
            public ComDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesBuilder IgnorePath(ConfigNodePropertyBoolean value)
            {
                _IgnorePath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.
            /// </summary>
            /// <returns>ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties</returns>
            public ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties Build()
            {
                Validate();
                return new ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties(
                    IgnorePath: _IgnorePath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}