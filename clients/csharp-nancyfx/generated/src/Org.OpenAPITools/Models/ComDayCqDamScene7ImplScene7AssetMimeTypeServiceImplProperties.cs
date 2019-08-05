using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties:  IEquatable<ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties>
    { 
        /// <summary>
        /// CqDamScene7AssetmimetypeserviceMapping
        /// </summary>
        public ConfigNodePropertyArray CqDamScene7AssetmimetypeserviceMapping { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties()
        {
        }

        private ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties(ConfigNodePropertyArray CqDamScene7AssetmimetypeserviceMapping)
        {
            
            this.CqDamScene7AssetmimetypeserviceMapping = CqDamScene7AssetmimetypeserviceMapping;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder</returns>
        public static ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder</returns>
        public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder With()
        {
            return Builder()
                .CqDamScene7AssetmimetypeserviceMapping(CqDamScene7AssetmimetypeserviceMapping);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties left, ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties left, ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqDamScene7AssetmimetypeserviceMapping;

            internal ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.CqDamScene7AssetmimetypeserviceMapping property.
            /// </summary>
            /// <param name="value">CqDamScene7AssetmimetypeserviceMapping</param>
            public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder CqDamScene7AssetmimetypeserviceMapping(ConfigNodePropertyArray value)
            {
                _CqDamScene7AssetmimetypeserviceMapping = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties</returns>
            public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties(
                    CqDamScene7AssetmimetypeserviceMapping: _CqDamScene7AssetmimetypeserviceMapping
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}