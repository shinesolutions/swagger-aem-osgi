using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
    /// </summary>
    public sealed class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties:  IEquatable<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties>
    { 
        /// <summary>
        /// CqCommerceCataloggeneratorBucketsize
        /// </summary>
        public ConfigNodePropertyInteger CqCommerceCataloggeneratorBucketsize { get; private set; }

        /// <summary>
        /// CqCommerceCataloggeneratorBucketname
        /// </summary>
        public ConfigNodePropertyString CqCommerceCataloggeneratorBucketname { get; private set; }

        /// <summary>
        /// CqCommerceCataloggeneratorExcludedtemplateproperties
        /// </summary>
        public ConfigNodePropertyArray CqCommerceCataloggeneratorExcludedtemplateproperties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties()
        {
        }

        private ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(ConfigNodePropertyInteger CqCommerceCataloggeneratorBucketsize, ConfigNodePropertyString CqCommerceCataloggeneratorBucketname, ConfigNodePropertyArray CqCommerceCataloggeneratorExcludedtemplateproperties)
        {
            
            this.CqCommerceCataloggeneratorBucketsize = CqCommerceCataloggeneratorBucketsize;
            
            this.CqCommerceCataloggeneratorBucketname = CqCommerceCataloggeneratorBucketname;
            
            this.CqCommerceCataloggeneratorExcludedtemplateproperties = CqCommerceCataloggeneratorExcludedtemplateproperties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder</returns>
        public static ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder</returns>
        public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder With()
        {
            return Builder()
                .CqCommerceCataloggeneratorBucketsize(CqCommerceCataloggeneratorBucketsize)
                .CqCommerceCataloggeneratorBucketname(CqCommerceCataloggeneratorBucketname)
                .CqCommerceCataloggeneratorExcludedtemplateproperties(CqCommerceCataloggeneratorExcludedtemplateproperties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties left, ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties left, ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.
        /// </summary>
        public sealed class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqCommerceCataloggeneratorBucketsize;
            private ConfigNodePropertyString _CqCommerceCataloggeneratorBucketname;
            private ConfigNodePropertyArray _CqCommerceCataloggeneratorExcludedtemplateproperties;

            internal ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.CqCommerceCataloggeneratorBucketsize property.
            /// </summary>
            /// <param name="value">CqCommerceCataloggeneratorBucketsize</param>
            public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder CqCommerceCataloggeneratorBucketsize(ConfigNodePropertyInteger value)
            {
                _CqCommerceCataloggeneratorBucketsize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.CqCommerceCataloggeneratorBucketname property.
            /// </summary>
            /// <param name="value">CqCommerceCataloggeneratorBucketname</param>
            public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder CqCommerceCataloggeneratorBucketname(ConfigNodePropertyString value)
            {
                _CqCommerceCataloggeneratorBucketname = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.CqCommerceCataloggeneratorExcludedtemplateproperties property.
            /// </summary>
            /// <param name="value">CqCommerceCataloggeneratorExcludedtemplateproperties</param>
            public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder CqCommerceCataloggeneratorExcludedtemplateproperties(ConfigNodePropertyArray value)
            {
                _CqCommerceCataloggeneratorExcludedtemplateproperties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties</returns>
            public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties Build()
            {
                Validate();
                return new ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(
                    CqCommerceCataloggeneratorBucketsize: _CqCommerceCataloggeneratorBucketsize,
                    CqCommerceCataloggeneratorBucketname: _CqCommerceCataloggeneratorBucketname,
                    CqCommerceCataloggeneratorExcludedtemplateproperties: _CqCommerceCataloggeneratorExcludedtemplateproperties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}