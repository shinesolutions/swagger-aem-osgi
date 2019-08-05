using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties:  IEquatable<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties>
    { 
        /// <summary>
        /// ContentReferenceConfigResourceTypes
        /// </summary>
        public ConfigNodePropertyArray ContentReferenceConfigResourceTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties()
        {
        }

        private ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties(ConfigNodePropertyArray ContentReferenceConfigResourceTypes)
        {
            
            this.ContentReferenceConfigResourceTypes = ContentReferenceConfigResourceTypes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder With()
        {
            return Builder()
                .ContentReferenceConfigResourceTypes(ContentReferenceConfigResourceTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties left, ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties left, ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder
        {
            private ConfigNodePropertyArray _ContentReferenceConfigResourceTypes;

            internal ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.ContentReferenceConfigResourceTypes property.
            /// </summary>
            /// <param name="value">ContentReferenceConfigResourceTypes</param>
            public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder ContentReferenceConfigResourceTypes(ConfigNodePropertyArray value)
            {
                _ContentReferenceConfigResourceTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties</returns>
            public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties(
                    ContentReferenceConfigResourceTypes: _ContentReferenceConfigResourceTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}